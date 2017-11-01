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
    ll n,j,x,p=0,q,c=0;
    cin>>n;

    cin>>q;
    if(q==0)c++;
    for (int i = 1; i <=n; ++i)
    {
    	cin>>x;
    	if(x==0)
    	{
    		c++;
    	}
        else{
            p=x;
            j=i;
        }
    }
    // cout<<p<<endl;
    if(c==(n+1)){cout<<"0 0";return 0;}

    if(j%2==0)
    {
        if(p>0)cout<<1<<" "<<1;
        else if(p<0) cout<<-1<<" "<<-1;
        else{
            if(q<0)cout<<"-1 -1";
            else cout<<"1 1";
        }
    }
    else{
        if(p>0)cout<<1<<" "<<-1;
        else if(p<0) cout<<-1<<" "<<1;
        else{
            if(q<0)cout<<"-1 -1";
            else cout<<"1 1";
        }
    }
return 0;
}
