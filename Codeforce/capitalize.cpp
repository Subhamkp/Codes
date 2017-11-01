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
    string s;
    cin>>s;
    int l=s[0];
    if(l>=97&l<=122)
    	l=l-32;
    char c=char(l);
    s[0]=c;
    cout<<s;

return 0;
}