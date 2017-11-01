#include<bits/stdc++.h>
using namespace std;

#define MAX (1+(1<<7)) 
#define inf 0x7fffffff

vector<int>arr;
int tree[MAX];

/**
 * Build and init tree
 */
void build_tree(int node, int a, int b) {
    if(a > b) return; // Out of range
  	
  	if(a == b) { // Leaf node
    		tree[node] = arr[a]; // Init value
		return;
	}
	int mid=(a+b)/2;
	build_tree(node*2+1, a, mid); // Init left child
	build_tree(node*2+2, 1+mid, b); // Init right child
	
	tree[node] = tree[node*2+1]+tree[node*2+2]; // Init root value
}

/**
 * Query tree to get sum of element value within range [i, j]
 */
int query_tree(int node, int a, int b, int i, int j) {
	
	if(a > b || a > j || b < i) return 0; // Out of range

	if(a >= i && b <= j) // Current segment[a,b] is totally within range [i, j]
		return tree[node];

    int mid=(a+b)/2;
	int q1 = query_tree(node*2+1, a, mid, i, j); // Query left child
	int q2 = query_tree(node*2+2, 1+mid, b, i, j); // Query right child

	int res = q1+q2; // Return final result
	
	return res;
}

int main() {
	int n,q,l,r,x;
    cin>>n>>q;
    
	for(int i = 0; i < n; i++)
	{
		cin>>x;
		arr.push_back(x);
	}
	build_tree(0, 0, n-1);

	while(q--)
	{
		cin>>l>>r;
		l--;r--;
		cout <<query_tree(0, 0, n-1, l, r)/(r-l+1) << endl;

	}
	return 0;
}