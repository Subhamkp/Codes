#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define mx INT_MAX   //2147483647
#define mn INT_MIN  //-2147483647
      
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n;
    cin>>n;
    vi v(n);
    for (int i = 0; i < n; ++i)
    {
   			cin>>v[i];
    }
    sort(v.begin(),v.end());
    
    int taxi=0;
    int i=v.size()-1;
    int k=0;
    while(k!= i){
        if(v[i]+ v[k]<=4){
            v[i]+=v[k];
            k++;
        }
        else{
            i--;
            taxi++;
        }
    }
    cout<<taxi+1;
return 0;
}