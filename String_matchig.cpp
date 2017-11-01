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
    string s;
    cin>>s;
    ll l=s.size();

    ll n,x,i; 
    

    cin>>n;
    
    vi v(n);

    for (i = 0; i < n; ++i)
    {
    	cin>>v[i];
    }

    ll c=0,ans=0;
    for (i = 0; i < l; ++i)
    {
    	if(m[s[i]-48])c++;
    	else{
    		map<int,int>m;
    	}
    }
    ans+=(c*(c+1)*.5);
    cout<<ans;
return 0;
}