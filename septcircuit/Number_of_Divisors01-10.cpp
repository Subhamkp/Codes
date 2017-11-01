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
#define mod 1000000007
ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}

ll modexp(ll x,ll n,ll M)
{
    ll result=1;
    while(n>0)
    {
        if(n % 2 ==1)
            result=(result * x)%M;
        x=(x*x)%M;
        n=n/2;
    }
    return result;
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,sum=1;
    cin>>n;
    vi v(n);

    for (int i = 0; i < n; ++i)
    {
    	cin>>v[i];
    	sum=(sum*((v[i]+1)%mod))%mod;
    }

    ll inverse=modexp(2,mod-2,mod);

    ll pow=(sum*inverse)%mod;

    // cout<<pow<<"\n";

    sum=1;

    if(pow&1==0)
    {
    	for (int i = 0; i < n; ++i)
    	{
    		sum=(sum*((v[i]*pow)%mod+2)%mod)%mod;
    	}
    }
    else{
    	for (int i = 0; i < n; ++i)
    	{
    		sum=(sum*((v[i]*pow)%mod+1)%mod)%mod;
    	}
    }
    cout<<sum;
return 0;
}


