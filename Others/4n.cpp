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

vector<int>vec[100005];
int visited[100005]={0};
int a[100005];
ll cost[100005];
vector<int> par[100001];
int dfs(int v)
{
	visited[v]=1;
	int l=vec[v].size();
	int c=0;
	c += a[v];

    for(int j=0;j<vec[v].size();j++){
        if(visited[vec[v][j]]==0){
               c+= dfs(vec[v][j]);
               par[vec[v][j]].push_back(v);
        }
    }
    cost[v] = c;
    return cost[v];
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
	ll n,q,x,y;
	cin>>n>>q;
	for (int i = 1; i <= n; ++i)
	{
		cin>>a[i];
	}

	for (int i = 0; i <n-1; ++i)
	{
		cin>>x>>y;
		vec[x].pb(y);
		vec[y].pb(x);
	}

	dfs(1);
	char ch;
	while(q--)
	{
		cin>>ch;
		if(ch=='Q')
		{
			cin>>x;
			cout<<cost[x]<<endl;
		}
		if(ch=='U'){
			cin>>x>>y;
			a[x]=y;
			memset(visited,0,sizeof(visited));
			memset(cost,0,sizeof(cost));
			dfs(1);
		}
	}
	for (int i = 0; i < n; ++i)
	{
		for (int j = 0;j <par[i].size();++j)
		{
			cout<<par[i][j]<<" ";
		}
		cout<<endl;
	}
return 0;
}
