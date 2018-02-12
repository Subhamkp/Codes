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
    ll n,q,p,w;
    cin>>n>>q;

    ll a[n];
    for (ll i = 0; i <n; ++i)
    {
        cin>>a[i];      
    }

    while(q--)
    {
        cin>>p>>w;

        ll c=0;
        ll dn=w+a[p-1];
        ll up=a[p-1];

        ll o=a[p-1];
        ll an=a[p-1];
        while((dn>=up) && p<n)
        {
            c++;
            o=o&a[p];
            dn=w+o;

            an=an|a[p];
            up=an;

            p++;
        }

        cout<<c<<endl;
    }
    

return 0;
}
