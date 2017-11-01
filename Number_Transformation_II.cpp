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
    ll n,a,b,p,x;
    cin>>n;
    vi v(n);
    for (int i = 0; i < n; ++i)
    {
    	cin>>v[i];
    }
    cin>>a>>b;
    ll c=0;
    while(a>=b+1)
    {
    	p=min;
    	for (int i = 0; i < n; ++i)
    	{
    		x=a%v[i];
    		if(x>p)
    			p=x;
    	}
    	if(p<1)p=1;
    	a=a-p;
    	c++;
    }
    cout<<c;
return 0;
}
//D:\Coding Practice