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

int c;
vi adj[100005];
bool visited[100005];

void dfs(int v)
{
	visited[v]=1;
	c++;
	for (int i = 0; i <adj[v].size(); ++i)
	{
		if(!visited[adj[v][i]])
			dfs(adj[v][i]);
	}
}	
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
	int n,m,s,x,y;
	cin>>n>>m;
	for (int i = 0; i <m; ++i)
    {
    	cin>>x>>y;
    	adj[x].pb(y);
    	adj[y].pb(x);
    }
    cin>>s;
    dfs(s);
    // cout<<c;
    cout<<n-c;    
return 0;
}
