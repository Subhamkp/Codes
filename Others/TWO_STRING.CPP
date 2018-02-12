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
    ll t,k;
    string a,b;
    cin>>t;
    while(t--)
    {
    	cin>>a>>b;
    	map<char,int>m;
    	for (int i = 0; i <a.length(); ++i)
    	{
    		m[a[i]]++;
    	}
    	for (int i = 0; i <b.length(); ++i)
    	{
    		m[b[i]]--;
    	}
    	k=-1;
    	for (auto it = m.begin();it!=m.end();it++)
    	{
    		if(it->second!=0)
    			{k=0;break;}
    		// cout<<it->first<<" "<<it->second<<"\n";
    	}
    	if (k)
    	{
    		cout<<"YES\n";
    	}
    	else
    		cout<<"NO\n";
    }
return 0;
}


