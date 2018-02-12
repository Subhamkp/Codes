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
    ll n;
    cin>>n;
    ll a[n];
    cin>>a[0];
    ll g=a[0];
    ll m=a[0];
    for (ll i = 1; i < n; ++i)
    {
    	cin>>a[i];
    	m=max(a[i],m);
    	g=__gcd(a[i],g);
    }
    ll round=(m/g)-n;
    // cout<<round;

    if(round%2==1)
    	cout<<"Alice";
    else cout<<"Bob";
return 0;
}
