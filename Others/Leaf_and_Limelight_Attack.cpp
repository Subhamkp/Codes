#include<bits/stdc++.h>
using namespace std;

#define ll long long int
#define vi vector<long long int>
#define vii vector<pair<long long int,long long int> >
#define pii pair<long long int,long long int>
#define mp make_pair
#define mod 1000000009 
map<ll,ll>Sum;
void SpiralSum(ll n)
{
	Sum[1]=1;Sum[0]=0;
    for(ll i=2;i<=n;i++){
        
        Sum[i]=(4*i*i%mod- 6*(i-1)+ Sum[i-2]+mod)%mod;
    }
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    SpiralSum(10000001);
    ll t,n;
    cin>>t;
    while(t--)
    {
    	cin>>n;
    	cout<<Sum[n]<<"\n";
    }
return 0;
}
