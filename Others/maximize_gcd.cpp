#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define mx INT_MAX   //2147483647
#define mn INT_MIN  //-2147483647

ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n;

    cin>>n;
     vector<int>v(n);
    for (int i = 0; i < n; ++i)
    {
    	cin>>v[i];
    }

    int i,g=0,h=v[n-1];
    for (i = n-1; i >=0 ; i--)
    {
    	g=gcd(g,v[i]);

        if(g<h)break;
    }
    cout<<i+1;
    
return 0;
}