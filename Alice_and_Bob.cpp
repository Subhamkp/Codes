#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647
ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,x;
    cin>>n;
    ll q=min;
    ll g=0;
    for (int i = 0; i <n ; ++i)
    {
    	cin>>x;
    	if(x>q)
    		q=x;
        g=gcd(g,x);
    }
    cout<<g;
    ll p=q/g-n;

    if(p%2==1)
    	cout<<"Alice";
    else
    	cout<<"Bob";

    //cout<<g;
return 0;
}
//D:\Coding Practice