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

map<ll,ll> m;

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,x;
    cin>>n;

    for (int i = 0; i < n; ++i)
    {
    	cin>>x;

    	for (int j=1; j<=sqrt(x); j++)
    	{
        	if (x%j==0)
        	{
            	if (x/j == j)
                 {
                 	m[j]++;
                 } 
            
	            else
	            {
	                  m[x/j]++;
	                  m[j]++;
	            }
	        }
        }
    }

    ll q;
    cin>>q;
    while(q--)
    {
    	cin>>x;
    	cout<<m[x]<<"\n";
    }

return 0;
}


