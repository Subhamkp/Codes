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

bool isPrime[10000000+1];

void sieve(int N) {
    
    for(int i = 0; i <= 10000000;++i) {
        isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    for(int i = 2; i * i <= 10000000; ++i) {
         if(isPrime[i] == true) {
             // Mark all the multiples of i as composite numbers
             for(int j = i * i; j <= 10000000 ;j += i)
                 isPrime[j] = false;
        }
    }
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    sieve(10000000);
    int t,x=0;
    int max=0,c=0;
    string s;
    cin>>t;

    while(t--)
    {
    	c=0;max=0;x=0;
    	cin>>s;
    	int l=s.length();
    	for (int i = 0; i <l; ++i)
    	{
    		if(isdigit(s[i]))
    		{
    			x=(x*10)+int(s[i]-48);
    		}
    		else{
    			if(isPrime[x])
    			{
    				c++;
    				if(x>max)max=x;
    			}
    			x=0;
    		}
    	}
    	if(isPrime[x])
    			{
    				c++;
    				if(x>max)max=x;
    			}
    	if(c)
    		cout<<c<<" "<<max<<"\n";
    	else
    		cout<<c<<" "<<"-1\n";
    }


return 0;
}
