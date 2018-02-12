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
const ll INF = 1LL << 62;

ll power(ll x,ll y){
  ll t=1;
  while(y>0){
    if(y&1) y-=1,t=t*x%mod;
    else y/=2,x=x*x%mod;
  }
  return t;
}
ll inv(ll q){ll t;t=power(q,mod-2);return t;}
ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}
ll lcm(ll a,ll b){return (a*(b / gcd(a, b))); }

int main(){
    // ios_base::sync_with_stdio(false);cin.tie(0);
    cout<<"hello";
return 0;
}