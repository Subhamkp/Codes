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
    ll n,p,x,i;
    cin>>n>>p;
    for (i = 0; i < n; ++i)
    {
    	cin>>x;
    	p=p-x;
    	if(p<=0)
    		break;
    }
    cout<<i+1;
return 0;
}


