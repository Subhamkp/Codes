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
    int d,t,i,free,x;
    cin>>d>>t;
    for (i = 1; i <=d; ++i)
    {
    	cin>>x;
    	free=86400-x;
    	t=t-free;
    	if(t<=0)break;
    }
    cout<<i;
return 0;
}
