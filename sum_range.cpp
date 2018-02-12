/**
 * In this code we have a very large array called arr, and very large set of operations
 * Operation #1: Increment the elements within range [i, j] with value val
 * Operation #2: Get max element within range [i, j]
 * Build tree: build_tree(1, 0, N-1)
 * Update tree: update_tree(1, 0, N-1, i, j, value)
 * Query tree: query_tree(1, 0, N-1, i, j)
 */

#include<bits/stdc++.h>
using namespace std;

#define MAX (1+(1<<6)) // Why? :D
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
 * Increment elements having index idx with value value
 */
void update_tree_single(int node, int a, int b, int idx, int value) {
    
	if(a > idx || b < idx) // Current segment is not within range [i, j]
		return;
    
  	if(a == b) { // Leaf node
    		tree[node] += value;
    		return;
	}

    int mid=(a+b)/2;
	if(a<= idx and idx <= mid){
	        // If idx is in the left child, recurse on the left child
	        update_tree_single(2*node+1, a , mid, idx, value);
	    }
	else{
	        // if idx is in the right child, recurse on the right child
	        update_tree_single(2*node+2, mid+1, b , idx, value);
	    }

	tree[node] = tree[node*2+1]+tree[node*2+2]; // Updating root with sum ofvalue
}


/**
 * Increment elements within range [i, j] with value value
 */
void update_tree(int node, int a, int b, int i, int j, int value) {
    
	if(a > b || a > j || b < i) // Current segment is not within range [i, j]
		return;
    
  	if(a == b) { // Leaf node
    		tree[node] += value;
    		return;
	}
     
    int mid=(a+b)/2;
	update_tree(node*2+1, a, mid, i, j, value); // Updating left child
	update_tree(node*2+2, 1+mid, b, i, j, value); // Updating right child

	tree[node] = tree[node*2+1]+tree[node*2+2]; // Updating root with sum of value
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
	int n;
    cin>>n;
    
	for(int i = 0; i < n; i++)
	{
		arr.push_back(i);
	}
	build_tree(0, 0, n-1);

	// update_tree(0, 0, n-1, 0, 6, 5); // Increment range [0, 6] by 5
	// update_tree(0, 0, n-1, 7, 10, 12); // Incremenet range [7, 10] by 12
	// update_tree(0, 0, n-1, 10, N-1, 100); // Increment range [10, N-1] by 100
    // update_tree_single(0, 0, n-1, 1, 100);
	cout <<query_tree(0, 0, n-1, 0, 5) << endl; // Get sum of  element in range [0, N-1]
	
	return 0;
}