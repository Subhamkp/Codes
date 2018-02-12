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

int a[105][105];

const int mod = 1e9 + 7;
const ll inf = 1LL << 62;

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int n,r,x,y;
    cin>>n>>r;
    int cost[n+1];
    for (int i = 1; i <=n; ++i)
    {
    	cin>>cost[i];
    }

    for (int i = 0; i < r; ++i)
    {
    	cin>>x>>y;
    	a[x][y]=1;
    	a[y][x]=1;
    }

    int m=10000009;
    for (int i = 1; i <=n; ++i)
    {
    	for (int j = i+1; j <=n; ++j)
    	{
    		for (int k = j+1; k <=n; ++k)
    		{
    			if(i==j||j==k||k==i)continue;

    			if(a[i][j]&&a[j][k]&&a[k][i])
    				m=min(m,cost[i]+cost[j]+cost[k]);
    		}
    	}
    }
    // cout<<m;
    if(m<10000009)
    	cout<<m;
    else cout<<-1;
return 0;
}
