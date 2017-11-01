
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
    ll t,n,x,sum;
    cin>>t;

    while(t--)
    {

    	cin>>n;
    	sum=0;
    	for (int i = 0; i < n; ++i)
    	{
    		cin>>x;
    		if(x%2==0)
    		{
    			while(x%2==0)
    			{
    				sum+=1;
    				x=x/2;
    			}
    		}
    		//cout<<sum;
    	}
    	
    	if(sum%2==0)
    		{
    			cout<<"Alan\n";
    		}
    		else
    		{
    			cout<<"Charlie\n";
    		}
    }
return 0;
}