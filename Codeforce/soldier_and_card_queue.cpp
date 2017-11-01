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
    
return 0;
}

// #include <iostream>
// #include <queue>
// using namespace std;

// int main()
// {
//     int n, t, c, k1, k2, f, s;
//     queue<int> first, second;
//     cin >> n >> k1;
//     for (int i = 0; i < k1; i++)
//     {
//         cin >> t;
//         first.push(t);
//     }
//     cin >> k2;
//     for (int i = 0; i < k2; i++)
//     {
//         cin >> t;
//         second.push(t);
//     }
//     while (c < 100000 and first.size() and second.size())
//     {
//         f = first.front();
//         first.pop();
//         s = second.front();
//         second.pop();
//         if (f > s)
//         {
//             first.push(s);
//             first.push(f);
//         }
//         else
//         {
//             second.push(f);
//             second.push(s);
//         }
//         c++;
//     }
//     if (second.empty()) cout << c << " 1" << endl;
//     else if (first.empty()) cout << c << " 2" << endl;
//     else cout << -1 << endl;
//     return 0;
// }