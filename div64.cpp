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
    string str;
    cin>>str;

    int c=0;
    for (int i = 0; i < str.length(); ++i)
    {
    	if(str[i]=='1')
    	{
    		for (int j = i+1; j <str.length(); ++j)
    		{
    			if(str[j]=='0')c++;
    			if(c==6){cout<<"yes";return 0;}
    		}
    		if(c<6){cout<<"no";return 0;}
    	}
    }
    if(c<6){cout<<"no";return 0;}
return 0;
}
