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
    
    long long int f[100001];
    f[0]=1;
    f[0]=1;f[1]=1;
	for (int i = 2; i<100001; ++i)
	{
		f[i]=(f[i-1]*i)%mod;
	}

    ll t,n,k,m,w,a,result;
    cin>>t;
    while(t--)
    {
    	a=0;
    	cin>>n>>k>>m>>w;
    	for (int i = k; i<=n; i++)
    	{
    		ll a1=(((f[m]*inv(f[m-i]))%mod)*inv(f[i]))%mod;
    		ll a2=(((f[w]*inv(f[w-n+i]))%mod)*inv(f[n-i]))%mod;
    		a=(a+(a1*a2)%mod)%mod;

    	}
    	cout<<a<<"\n";
    }
return 0;
}


