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

vi vec[100005];
bool visited[100005];
int child[100005];
int depth[100005];

void dfs(int v,int _depth=0)
{
	visited[v]=1;
	child[v]=0;
	depth[v]=_depth;

	for (int i = 0; i <vec[v].size(); ++i)
	{
		if(!visited[vec[v][i]])
			{
				dfs(vec[v][i],_depth+1);
				child[v]+=child[vec[v][i]]+1;
				//for subtree size subsize[v]+=subsize[vec[v][i]]; set subsize[v]=1;
			}
	}
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int n,m,x,y;
    cin>>n>>m;
    for (int i = 0; i <m; ++i)
    {
    	cin>>x>>y;
    	vec[x].pb(y);
    	vec[y].pb(x);
    }
    dfs(1);

    for (int i = 1; i <=n; ++i)
    {
    	cout<<child[i]<<" ";
    }
    cout<<endl;
return 0;
}

// 10 7
// 1 2
// 2 3
// 2 4
// 3 5
// 4 7
// 4 9
// 9 10