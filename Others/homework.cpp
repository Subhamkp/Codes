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

bool cmp(pair<ll,ll>p1,pair<ll,ll>p2){
    return p1.sd<p2.sd;
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    string s;
    cin>>s;
    int n;
    cin>>n;
    int l=s.length();

    if(l<n){cout<<0;return 0;}
    
    map<int,int>m;

    vector<pair<char,int> >v;
    
    for (int i = 0; i<l; ++i)
    {
    	m[s[i]]++;
    }

    int k=m.size();
    for (int i ='a' ; i<='z'; ++i)
    {
    	if(m[i]==0)continue;
    	v.push_back(mp(i,m[i]));
    }
    sort(all(v),cmp);

    map<char,int>p;
    int c=0;
    for (int i =0; i <k; ++i)
    {
		if(n>=v[i].sd)
		{
			p[v[i].ft]=1;
			n=n-v[i].sd;
			c+=v[i].sd;
		}
    }

    cout<<k-p.size()<<endl;

    for (int i = 0; i <l; ++i)
    {
    	if(p[s[i]]==0)cout<<s[i];
    }
return 0;
}
