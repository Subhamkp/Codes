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
ll a[100005];
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll t,n;
    for (ll i = 0; i <100005; ++i)
    {
    	a[i]=i*i;
    }
    // for (int i = 0; i < 100; ++i)
    // {
    // 	cout<<a[i]<<" ";
    // }
    // cout<<endl;


    cin>>t;
    while(t--)
    {
    	cin>>n;
    	ll l=upper_bound(a,a+100005,n)-a;
    	l--;

    	ll count = 0;
    	while(l>0)
    	{	
    		ll diff = n-a[l];
    		if(diff > 700) break; 
    		count += (diff);
    		l--;
    	}
    	if(l >= 0) count += l*700;
    	cout<<count<<endl;
    }
return 0;
}
