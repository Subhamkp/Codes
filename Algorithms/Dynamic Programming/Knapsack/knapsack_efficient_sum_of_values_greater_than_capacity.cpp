#include "bits/stdc++.h"
using namespace std;
 
#define ft       first
#define sd       second
#define pb       push_back
#define all(x)   x.begin(),x.end()
#define clr(a,b) memset((a),b,sizeof(a))
#define ll       long long int // [9,223,372,036,854,775,807 to -9.....808]
#define vl       vector<ll>
#define pll      pair<ll,ll>
#define vll      vector<pll>
#define lct      ll t;cin>>t;while(t--)
#define llin(a)  ll a; cin>>a;
#define srep(i,a,b) for(ll i=a;i<b;i++)
#define rep(i,n)    for(ll i=0;i<n;i++)
#define get_string(s)  getline(cin,s)
#define ps(x,y)       fixed<<setprecision(y)<<x
#define keep_unique(v) sort(v.begin(), v.end()); v.erase(unique(v.begin(), v.end()), v.end()); // keeps only unique elements in the vector v

const ll MOD = 1e9 + 7;
const ll inf = 1LL << 62;

void fast_io(){
    ios::sync_with_stdio(false);cin.tie(0);
    #ifndef ONLINE_JUDGE
        freopen ("in.txt","r",stdin);
        freopen ("out.txt","w",stdout);
    #endif
}

vl dp(2000005,0);
vl val(1003),wt(1003);

ll solve(ll n, ll W){  
    for(ll i=0;i<n;i++)
        for(int j=W; j>=wt[i]; j--) 
            dp[j] = max(dp[j] , val[i] + dp[j-wt[i]]);
    return dp[W];
}

int32_t main(){
    fast_io();

    ll n,W;
    cin>>n>>W;
    rep(i,n) cin>>val[i];
    rep(i,n) cin>>wt[i];
    
    cout<<solve(n,W);

    return 0;
}