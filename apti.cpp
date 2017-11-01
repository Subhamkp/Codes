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
ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n,p,sum,q,l;
    cin>>t;
    while(t--)
    {
    	cin>>n>>p;
    	vi a(n);
    	for (int i = 0; i < n; ++i)
    	{
    		cin>>a[i];
    	}
    	sum=a[0];
    	l=a[0];
    	for (int i = 0; i < n-1; ++i)
    	{
    		q=l-a[i+1];
    		if(q<0)
    			sum+=(-q);
    		else
    			l=q+a[i];

    	}


        cout<<(sum*p)<<"\n";
    }
return 0;
}


