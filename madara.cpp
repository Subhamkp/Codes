#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n,a,d,m,p=0,q=0,c=0;
    cin>>t;
    while(t--)
    {
    	p=0;q=0;c=0;
    	cin>>n>>a>>d>>m;
    	q=a;
    	while(p<n)
    	{
    		if(q<m)
    			{p=p+m;c++;}
    		else
    			{p=p+q;q=q-d;c++;}
    	}
    	cout<<c<<"\n";
    }
return 0;
}
