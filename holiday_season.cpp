#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,c=0,i,j,t=0;
   	cin>>n;
    string s;
    cin>>s;
    if(n<4)
    	{cout<<"0";return 0;}
    else{

    	ll a=0;
    	for(a=0;a<n-3;a++)
    	{
    		t=a;
    		while(t<n-1){
    		for (i = t+1; i <n; ++i)
    		{
    			if(s[a]==s[i])break;
    		}
    		t=i;
    		//cout<<a<<" "<<t<<"\n";
    		if(t>=n)continue;

    		for (i = a+1; i <t; ++i)
    		{
    			for (j = t+1; j <n; ++j)
    			{
    				if(s[i]==s[j])c++;
    				//cout<<s[i]<<" "<<s[j]<<c<<"\n";
    			}
    		}
    	 }
      }
    }
    cout<<c;
return 0;
}