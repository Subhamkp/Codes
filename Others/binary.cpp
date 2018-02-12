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
    ll a,b,c,d,k,p,mid,l,q,r,ans,t;
    cin>>t;
    while(t--)
    {
    cin>>a>>b>>c>>d>>k;
    
    l=0;
    r=(cbrt(k/a)+1);


    while(l<=r)
    {
    	    mid=(l+r)/2;
    		// cout<<mid<<" "<<l<<" "<<r<<"\n";
    		p= a*mid*mid*mid + b*mid*mid + c*mid + d;
    		q= a*(mid+1)*(mid+1)*(mid+1) + b*(mid+1)*(mid+1) + c*(mid+1) + d;
    		
    		if(p<=k&&q>k)break;

    		if(p<=k)
    			{l=mid+1;}
    		else r=mid-1;

    }
    cout<<mid<<endl;
    }

return 0;
}
