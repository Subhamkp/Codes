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
    string s;
    char c;
    ll n,q,k,l,r,a;
    cin>>n>>q;
    cin>>s;

    while(q--)
    {
    	cin>>a;
    	if(a==1)
    	{
    		cin>>l>>c;
    		s[--l]=c;
    	}
    	else{

    		k=1;
    		cin>>l>>r;
    		r--;l--;
    		while(l<=r){
    			if(s[l++]!=s[r--])
    			{
    				k=0;
    				break;
    			}
    		}

    		if(k==1)
    		{
    			cout<<"YES"<<"\n";
    		}
    		else{
    			cout<<"NO"<<"\n";
    		}

    	}
    }
return 0;
}


