// C++ program to check if a given tree is BST.
#include <bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to
left child and a pointer to right child */
struct Node
{
	int data;
	struct Node* left, *right;
};

// Returns true if given tree is BST.
bool isBST(struct Node* root)
{
	static struct Node *prev = NULL; 
	// The use of static variable can also be avoided by using reference to prev node as a parameter 
	
	// traverse the tree in inorder fashion and keep track of prev node
	if (root)
	{
		if (!isBST(root->left))
		return false;

		// Allows only distinct valued nodes 
		if (prev != NULL && root->data <= prev->data)
		return false;

		prev = root;

		return isBST(root->right);
	}

	return true;
}


/* Helper function that allocates a new node with the
given data and NULL left and right pointers. */
struct Node* newNode(int data)
{
	struct Node* node = new Node;
	node->data = data;
	node->left = node->right = NULL;
	return (node);
}

/* Driver program to test above functions*/
int main()
{
	struct Node *root = newNode(3);
	root->left	 = newNode(2);
	root->right	 = newNode(5);
	root->left->left = newNode(1);
	root->left->right = newNode(4);

	if (isBST(root))
		cout << "Is BST";
	else
		cout << "Not a BST";

	return 0;
}
