#include<bits/stdc++.h>
using namespace std;

#define ft first
#define sd second
#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define mp make_pair
#define tr(it, a) for(__typeof(a.begin()) it = a.begin();it != a.end(); ++it)

typedef vector<ll> vi;
typedef pair<ll, ll> pii;
typedef vector<pii> vii;


const int mod = 1e9 + 7;
const ll inf = 1LL << 62;

int adj[21][21];
int n;

int dfs(int i,int j) //NxN matrix with 0 as not visited
{
	int count=0;
	if(i==n&&j==n)
		return 1;
	
	adj[i][j]=1;

	if(i-1>=1 && adj[i-1][j]==0)count=count+dfs(i-1,j);
	if(i+1<=n && adj[i+1][j]==0)count=count+dfs(i+1,j);
	if(j-1>=1 && adj[i][j-1]==0)count=count+dfs(i,j-1);
	if(j+1<=n && adj[i][j+1]==0)count=count+dfs(i,j+1);

	adj[i][j]=0;

	return count;
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int t,i,j;
    cin>>t;
    while(t--)
    {
    	cin>>n;
    	for (i = 1; i<=n; ++i)
    	{
    		for (j = 1; j <=n; ++j)
    		{
    			cin>>adj[i][j];
    		}
    	}
	    if(adj[1][1]==1 and adj[n][n]==1) // start and end both contain motion detecter  
	    {
	    	cout<<0<<endl;
	    }
	    else{
	    	cout<<dfs(1,1)<<endl;
	    } 
    }

return 0;
}
