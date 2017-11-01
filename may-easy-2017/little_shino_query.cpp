// #include<bits/stdc++.h>
// using namespace std;

// #define ft first
// #define sd second
// #define pb push_back
// #define all(x) x.begin(),x.end()
// #define ll long long int
// #define vi vector<long long int>
// #define vii vector<pair<long long int,long long int> >
// #define mp make_pair

// const int mod = 1e9 + 7;
// const ll INF = 1LL << 62;

// ll power(ll x,ll y){
//   ll t=1;
//   while(y>0){
//     if(y&1) y-=1,t=t*x%mod;
//     else y/=2,x=x*x%mod;
//   }
//   return t;
// }
// ll inv(ll q){ll t;t=power(q,mod-2);return t;}
// ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}
// ll lcm(ll a,ll b){return (a*(b / gcd(a, b))); }

// bool cmp(const pair<string,int>&p1,const pair<string,int>&p2)
// {
//   if(p1.ft<p2.ft)
//     return true;

//   return false;
// }
// int main(){
//     ios_base::sync_with_stdio(false);cin.tie(0);
//     ll n,q,l,h;
//     cin>>n>>q;
//     string str;
//     set<pair<string,int> >v;
//     for (int i = 0; i < n; ++i)
//     {
//       cin>>str;
//       v.insert(mp(str,i));
//     }
//     // sort(all(v),cmp);

    
//     while(q--)
//     {
//       cin>>str;
//       int k=0;
//       for (std::set<pair<string,int>>::iterator i = v.begin(); i != v.end(); ++i)
//       {
//             if((i->ft).find(str)!=-1)
//               {l=i->sd;k=1;break;}
//       }
//       if(k==1)
//       {
//         for (std::set<pair<string,int>>::reverse_iterator i = v.rbegin(); i != v.rend(); ++i)
//         {
//             if((i->ft).find(str)!=-1)
//               {h=i->sd;break;}
//         }
//       }
//       else{
//         l=h=-1;
//       }

//       cout<<l<<" "<<h<<"\n";
//     }
    
// return 0;
// }


