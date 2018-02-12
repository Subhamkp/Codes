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

bool prime[1000000+1];
vi pr;
void seive()
{
	memset(prime,true,sizeof(prime));
	prime[1]=false;
	for (int p=2; p*p<=1000000; p++)
    {
        if (prime[p] == true)
        {
        	pr.push_back(p);
            for (int i=p*2; i<=1000000; i += p)
                prime[i] = false;
        }
    }
}

map<ll,ll>m;
ll divisor(ll n)
{
	vi::iterator l=upper_bound(all(pr),sqrt(n));

	for (vi::iterator i = pr.begin(); i != l; ++i)
	{
		while(n%(*i)==0)
		{
			n=n/(*i);
			m[*i]++;
		}
		if(n==1)break;
	}
	if(prime[n]) m[n]++;
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    seive();
    ll t,n;
    cin>>t;
    while(t--)
    {
    	cin>>n;
    	for (int i = 2; i <=n; ++i)
    	{
    		divisor(i);
    	}

    	ll ans=1;
	
		for (map<ll,ll>::iterator it=m.begin(); it!=m.end(); ++it)
	   	{
	   		ans=(ans*(it->sd+1))%mod;
	   	}
	   	cout<<ans<<endl;
	   	m.clear();
    }
    
return 0;
}
