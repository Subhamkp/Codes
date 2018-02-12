#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define mx INT_MAX   //2147483647
#define mn INT_MIN  //-2147483647

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,k;
    cin>>n>>k;

    vi x(n);
    vi y(n);
    vi v(n);
    for (int i = 0; i < n; ++i)
    {
    	cin>>x[i];
    }
    for (int i = 0; i < n; ++i)
    {
    	cin>>y[i];
    }

    for (int i = 0; i < n; ++i)
    {
    	v[i]=x[i]*x[i]+y[i]*y[i];
    }
    sort(all(v));

    ll a=sqrtl(v[k-1]);
    ll m=a*a;
    if(m<v[k-1])
        cout<<a+1;
    else
        cout<<a;
return 0;
}