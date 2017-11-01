#include<bits/stdc++.h>
using namespace std;

#define N (1+(1<<6)) 
#define inf 0x7fffffff

/**
 * Build and init tree
 */
void build_tree(int node, int a, int b,int tree[],int arr[]) {
    if(a > b) return; // Out of range
  	
  	if(a == b) { // Leaf node
    		tree[node] = arr[a]; // Init value
	}
	else{
		int mid=(a+b)/2;
		build_tree(node*2+1, a, mid,tree,arr); // Init left child
		build_tree(node*2+2, 1+mid, b,tree,arr); // Init right child
		tree[node] = min(tree[node*2+1], tree[node*2+2]); // Init root value
	}
}


/**
 * Increment elements having index idx with value value
 */
void update_tree_single(int node, int a, int b, int idx, int value,int tree[]) {
    
	if(a > idx || b < idx) // Current segment is not within range [i, j]
		return;
    
  	if(a == b) { // Leaf node
    		tree[node] = value;
    		return;
	}

    int mid=(a+b)/2;
	if(a<= idx and idx <= mid){
	        // If idx is in the left child, recurse on the left child
	        update_tree_single(2*node+1, a , mid, idx, value,tree);
	    }
	else{
	        // if idx is in the right child, recurse on the right child
	        update_tree_single(2*node+2, mid+1, b , idx, value,tree);
	    }

	tree[node] = min(tree[node*2+1], tree[node*2+1]); // Updating root with min value
}


/**
 * Query tree to get min element value within range [i, j]
 */
int query_tree(int node, int a, int b, int i, int j,int tree[]) {
	
	if(a > b || a > j || b < i) return inf; // Out of range

	if(a >= i && b <= j) // Current segment[a,b] is totally within range [i, j]
		return tree[node];

    int mid=(a+b)/2;
	int q1 = query_tree(node*2+1, a, mid, i, j,tree); // Query left child
	int q2 = query_tree(node*2+2, 1+mid, b, i, j,tree); // Query right child

	int res = min(q1, q2); // Return final result
	
	return res;
}

int main() {
	int tree[2000005],arr[100005];
	int n,q,l,r,x;
    cin>>n>>q;
	for(int i = 0; i <n; i++)
	{
		cin>>arr[i];
	}

	build_tree(0,0,n-1,tree,arr);

	char c;
	while(q--)
	{
	    cin>>c>>l>>r;

	    if(c=='q')
	    {
	    	// cout<<"hello";
	        cout<<query_tree(0, 0, n-1, l-1,r-1,tree)<<"\n";
	    }
	    if(c=='u'){// update l index with r
	        update_tree_single(0, 0, n-1, l-1,r,tree);
	    }
	}
	return 0;
}