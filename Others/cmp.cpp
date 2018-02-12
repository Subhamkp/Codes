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

bool cmp(pair<int,pair<int,int> >p1,pair<int,pair<int,int> >p2){
    
    if(p1.ft==p2.ft)
     {
     	if(p1.sd.ft==p2.sd.ft)
     	{
     		return  p1.sd.sd>p2.sd.sd;
     	}
     	return p1.sd.ft>p2.sd.ft;
     }
     return p1.ft>p2.ft;
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    vector<pair<int,pair<int,int> > >v;
    vector<pair<int,pair<int,int> > >::iterator it;
    int x,y,z,n;
    cin>>n;


    for (int i = 0; i < n; ++i)
    {
    	cin>>x>>y>>z;
    	v.pb(mp(x,mp(y,z)));
    }
    
    sort(all(v));

    // v[0].ft

    for(it=v.begin();it!=v.end();it++) 
    {
    	cout<<it->first<<" "<<it->second.first<<" "<<it->second.sd<<endl;
    }

return 0;
}
