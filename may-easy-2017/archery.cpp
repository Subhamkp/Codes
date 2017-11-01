#include<bits/stdc++.h>
using namespace std;

#define ft first
#define sd second
#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define vii vector<pair<long long int,long long int> >
#define mp make_pair

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
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n,x,ans;
    cin>>t;
    while(t--) {
    	ans=1;
        cin>>n;
        for (int i = 0; i < n; ++i)
        {
        	cin>>x;
        	ans=lcm(ans,x);
        	//or use accumulate(v.begin(),v.end(),1,lcm);
        }
        cout<<ans<<"\n";
    }
return 0;
}


