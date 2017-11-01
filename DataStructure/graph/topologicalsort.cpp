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

stack<ll>s;
vector<ll>adj[100000];
bool visited[100000];

void topologicalsort(ll v)
{
	visited[v]=true;
	for (int i = 0; i <adj[v].size(); ++i)
	{
		if(visited[adj[v][i]]==false)
			topologicalsort(adj[v][i]);
	}
	s.push(v);
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    
    ll n,x,y;
    cin>>n;

    for (int i = 0; i < n; ++i)
    {
    	cin>>x>>y; // Add y to x’s list. x->y
    	adj[x].pb(y);
    }

    for (ll i = 0; i <n; i++) //vertices stsrt from 0
      if (visited[i] == false)
        topologicalsort(i);

     // Print contents of stack
    while (s.empty() == false)
    {
        cout << s.top() << " ";
        s.pop();
    }

return 0;
}
