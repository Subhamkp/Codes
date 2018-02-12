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

ll dd,d;

ll power(ll x,ll y){
  ll t=1;
  while(y>0){
    if(y&1) y-=1,t=t*x%mod;
    else y/=2,x=x*x%mod;
  }
  return t;
}
ll inverse(ll q){ll t;t=power(q,mod-2);return t;}

void fact(ll n)
{
	for(ll i=1;i<=2n;i++)
	{
		res=(res*i)%mod;
		if(i==n)d=res;
	}
	dd=res;
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,x;
    cin>>n;
    while(n--)
    {
    	cin>>x;
    	cout<<(((dd*power(inverse(d),2))%mod)*inverse(x+1))%mod;

    }
return 0;
}



// ll modExp(ll x,ll y, ll p){ ll res = 1; x = x % p; while (y > 0){ if (y & 1) res = (resx) % p; y = y>>1; x = (xx) % p;
// } return res; }

// ll binomialCoeff(ll n,ll k){ ll res = 1; if (k > n - k) k = n - k; for (ll i = 0; i < k; ++i){ res = (res(n - i))%MOD; res = (resmodExp(i + 1,MOD-2,MOD))%MOD; } return res; }

// ll catalan(unsigned int n) {

// ll c = binomialCoeff(2*n, n);
// return (c*modExp(n+1,MOD-2,MOD))%MOD;
// }

// int main(){ int t; cin>>t; while(t--){ ll n; cin>>n; cout << catalan(n) << "\n"; } return 0; }
