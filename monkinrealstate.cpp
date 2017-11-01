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

vector<int>v[100005];
int visited[100005]={0};
int c;
void dfs(int n)
{
    for(int j=0;j<v[n].size();j++){
        if(visited[v[n][j]]==0){
               visited[v[n][j]]=1;
               dfs(v[n][j]);
               c++;
        }
    }
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n,x,y,res;
    cin>>t;
    while(t--)
    {
    	cin>>n;c=0;res=0;

    	for (ll i = 0; i<100005; ++i)
    	{
    		v[i].clear();
    	}

    	memset(visited, 0, sizeof(visited));

    	for (int i = 0; i < n; ++i)
    	{
    		cin>>x>>y;
    		v[x].pb(y);
    		v[y].pb(x);
    	}
    	
    	for (ll i = 0; i <100005; ++i)
    	{
    		if(visited[i]==0)
    			{
    				dfs(i);
    				res+=c;
    				c=0;
    			}
    		
    	}
    	cout<<res<<endl;
    }
return 0;
}
