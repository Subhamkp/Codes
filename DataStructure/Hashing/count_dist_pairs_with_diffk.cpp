//Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define mp map<ll,ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define mem(a,x) memset(a,x,sizeof(a))
#define inf 0x3f3f3f3f 
      
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,diff,t;
    cin>>t;
    while(t--){
    cin>>n;
    vi v(n);
    mp m;
    for (int i = 0; i < n; ++i)
    {
    	cin>>v[i];
    	m[v[i]]++;
    }
    cin>>diff;
    ll c=0;
    for (int i = 0; i < n; ++i)
    {
        if(diff!=0){
            if(v[i]-diff>=0 && m[v[i]-diff]>0)
    	       c++;
            if(v[i]+diff<INT_MAX && m[v[i]+diff]>0 )
                c++;
        }
        else
        { 
            if(m[v[i]]>1)
                c++;
        }

       m[v[i]]=0; // as if v[i]+diff or v[i]-diff comes m[] is 0;
         
    }
    cout<<c<<"\n";
    
        
    }
return 0;
}