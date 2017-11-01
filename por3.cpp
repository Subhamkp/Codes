#include<bits/stdc++.h>
using namespace std;

#define ft first
#define sd second
#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define mp make_pair
#define tr(it, a) for(__typeof(a.begin()) it = a.begin();it != a.end(); ++it)

typedef vector<ll> vi;
typedef pair<ll, ll> pii;
typedef vector<pii> vii;


const int mod = 1e9 + 7;
const ll inf = 1LL << 62;

int main(){
    
    ios_base::sync_with_stdio(false);cin.tie(0);
    
    int n;
    cin>>n;
    
    int a[n],b[n];

   	for (int i=0;i<n;i++)
    {
        cin>>a[i];
        b[i] = a[i];
    }

    int dp[n];
    sort(b,b+n);

    dp[0] =abs(a[0] - b[0]);

    for (int i=1;i<n;i++)
    {
        dp[i] = min(dp[i-1],abs(a[0] - b[i]));
    }

    for (int i=0;i<n;i++)
    {
        cout<<dp[i]<<" ";
    }
    
    cout<<endl;

    int atul[n];

    for (int i=1;i<n;i++)
    {
       atul[0] = abs(a[i] - b[0]) + dp[0];

       for (int j= 1;j<n; j++)
       {
           atul[j] =min(atul[j-1],abs(a[i] - b[j])+dp[j]);
       }

       for (int k=0;k<n;k++)
       {
           cout<<atul[k]<<" ";
       }
       cout<<"\n";
       
       for (int j=0;j<n;j++)
       {
           dp[j] = atul[j];
       }
    }
    cout<<dp[n-1];
return 0;
}