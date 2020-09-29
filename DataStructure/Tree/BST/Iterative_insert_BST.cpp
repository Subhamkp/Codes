// Iterative function to insert an key into BST

#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
	Node *left,*right;
};

Node* newnode(int key)
{
	Node* node=new Node();
	node->data=key;
	node->left=node->right=nullptr;
	return node; 
}

void inorder(Node* root)
{
	if(root==nullptr)
		return;
	inorder(root->left);
	cout<<root->data<<"\n";
	inorder(root->right);
}

void insertiterative(Node* &root,int key)
{
	Node*curr=root;
	Node* parent=nullptr;

	if(root==nullptr)
	{
		root=newnode(key);
		return;
	}

	while(curr!=nullptr)
	{
		parent=curr;
		if(key<curr->data)
			curr=curr->left;
		else
			curr=curr->right;
	}
	if(key<parent->data)
		parent->left=newnode(key);
	else
		parent->right=newnode(key);
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    Node* root = nullptr;
	int keys[] = { 15, 10, 20, 8, 12, 16, 25 };

	for (int key : keys)
		insertiterative(root, key);

	inorder(root);
return 0;
}


