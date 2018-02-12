#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n,mn,mx,i;
    cin>>t;
    while(t--)
    {
    	cin>>n;
    	vi v(n);
    	for (i = 0; i < n; ++i)
    	{
    		cin>>v[i];
    	}
    	sort(all(v));
    	
    	mx=0,mn=0;
    	
    	for(i=0;i<=n/2-1;i++)
    	{
    		mx=mx+abs(v[i]-v[n-1-i]);
    	}

    	for(i=0;i<n-1;i=i+2)
    	{
    		mn=mn+abs(v[i]-v[i+1]);
    	}
    	cout<<mn<<" "<<mx<<"\n";
    	v.clear();
    }
return 0;
}
//D:\Coding Practice