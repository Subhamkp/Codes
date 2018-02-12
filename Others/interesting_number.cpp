#include<bits/stdc++.h>
using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define mx INT_MAX   //2147483647
#define mn INT_MIN  //-2147483647

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    
    ll p,l,r,z,x;
    cin>>p>>l>>r>>z;

    int arr[z]={0};
    
    for (int i = 0; i < z; ++i)
    {
    	cin>>x;
    	arr[x]=1;
    }

    ll rem=l%p;
    ll mul=l+rem;

    ll c=0,a,sum;
    while(mul<=r)
    {
    	a=mul;sum=0;
    	while(a!=0)
    	{
    		sum=sum+(a%10);
    		a=a/10;
    	}

    	if(arr[sum]==1)c++;
    	
    	mul=mul+p;
    }
    cout<<c;
return 0;
}