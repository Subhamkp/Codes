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
    ll n,q,l,r,sum;
    cin>>n>>q;
    vi v(n);
    sum=0;
    vi m(n);

    for (int i = 0; i < n; ++i)
    {
    	cin>>v[i];
    	sum+=v[i];
    	m[i]=sum;
    }

    int avg;
    while(q--)
    {
    	 cin>>l>>r;
    	 if(l==r)
    	 	{cout<<v[--l]<<"\n";continue;}

    	 l--;r--;
	     avg=(m[r]-m[l]+v[l])/(r-l+1);
	     cout<<avg<<"\n";
    }
   
return 0;
}


