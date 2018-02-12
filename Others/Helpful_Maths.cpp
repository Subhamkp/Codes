// #include<bits/stdc++.h>

// using namespace std;

// #define pb push_back
// #define all(x) x.begin(),x.end()
// #define ll long long int
// #define vi vector<long long int>
// #define mx INT_MAX   //2147483647
// #define mn INT_MIN  //-2147483647


// int main(){
//     ios_base::sync_with_stdio(false);cin.tie(0);
//     string s;
//     vi v;
//     cin>>s;
//     for (int i = 0; i < s.size(); ++i)
//     {
//     	if(s[i]!='+')
//     		v.pb(s[i]-48);
//     }
//     sort(all(v));
//     vi::iterator it;
//     for(it=v.begin();it!=v.end();it++){
//     	if(it!=v.end()-1)
//     	   cout<<*it<<"+";
//     	else cout<<*it;
//     }
// return 0;
// }

#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define rtr(c,i) for(typeof((c).rbegin() i = (c).rbegin(); i != (c).rend(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) 
#define cpresent(c,x) (find(all(c),x) != (c).end()) 
#define mx INT_MAX   //2147483647
#define mn INT_MIN  //-2147483647
      
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    set<int> v;int x;
    for (int i = 0; i < 5; ++i)
    {
    	cin>>x;
    	v.insert(x);
    }
    rtr(v,it)
    {
    	cout<<*it<<" ";
    }
return 0;
}