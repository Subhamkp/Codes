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

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll f[100005];
    f[0]=1;
    f[1]=1;
    for (ll i = 2; i <100005; ++i)
    {
    	f[i]=(f[i-1]+f[i-2])%mod;
    }
    ll n;
  	cin>>n;
    cout<<f[n-1];
return 0;
}
