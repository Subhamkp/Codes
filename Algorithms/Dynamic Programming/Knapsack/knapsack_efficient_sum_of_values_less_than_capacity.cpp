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

vl dp(50005,inf);
vl val(1003),wt(1003);

ll solve(ll n,ll W, ll V){  
    dp[0]=0;
    for(ll i=0;i<n;i++)
        for(int j=V; j>=val[i]; j--) 
            dp[j] = min(dp[j] , wt[i] + dp[j-val[i]]);
    for(ll i=V;i>=0;i--){
        if(dp[i]<=W) return i;
    }
}

// Here, W is large but sum of value is low.  so,we check if the greater value
// that cam be accomplished stating wt_sum<=W
// for(int j=V; j>=val[i]; j--) makes it efficient 

int32_t main(){
    fast_io();

    ll n,W,vl_sum=0,wt_sum=0;
    cin>>n>>W;
    rep(i,n) cin>>val[i],vl_sum+=val[i]; 
    rep(i,n) cin>>wt[i],wt_sum+=wt[i];
    
    if(wt_sum<=W) cout<<vl_sum<<endl;
    else cout<<solve(n,W,vl_sum);

    return 0;
}