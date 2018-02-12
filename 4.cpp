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
    int t;cin>>t;
    int n;
    while(t--){
    	cin>>n;
    	long long int ar[n];
    	for(int i=0;i<n;i++) cin>>ar[i];

    	long long int count =0;
    	for(int i=0;i<n;i++){
    		long long int sum=0,prod=1;

    		for(int j=i;j<n;j++){
    			sum += ar[j];
    			prod *= ar[j];

    			if(sum==prod) count++;
    		}
    	}
    	cout<<count<<endl;
    }
return 0;
}
