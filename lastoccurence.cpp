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
    int n,m;
    cin>>n;
    int a[n];
    for (int i = 0; i < n; ++i)
    {
    	cin>>a[i];
    }

    cin>>m;

    int mid,l=0,r=n-1,ans=-1; 

    while(l<=r)
    {
    	mid=(l+r)>>1;
    	if(a[mid]==m)
    	{
    		ans=mid;
    		l=mid+1;
    	}
    	else if (a[mid]>m)
    	{
    		r=mid-1;
    	}
    	else if (a[mid]<m)
    	{
    		l=mid+1;
    	}
    }

    cout<<ans;
return 0;
}
