/*
lower_bound is almost like doing a usual binary search, except:
If the element isn't found, you return your current place in the search, rather than returning some null value.
If the element is found, you search leftward until you find a non-matching element. Then you return a pointer/iterator to the first matching element.*/

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
    sort(a,a+n);

    cin>>m;

    int mid,l=0,r=n-1,ans=-1; 

    while(l<=r)   // lowerbound <=
    {
    	mid=(l+r)>>1;
    	if (m<=a[mid])
    	{
    		r=mid-1;
    		ans=mid;
    	}
    	else
    	{
    		l=mid+1;
    	}
    }

    // cout<<lower_bound(a,a+n,m)-a;
    if(ans==-1)cout<<n;
    else
        cout<<ans;    
return 0;
}
