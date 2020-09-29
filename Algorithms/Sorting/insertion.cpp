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

void insertionsort(int a[], int n)
{
	for (int i =1; i <=n; ++i)
	{
		int key=a[i];
		int j=i-1;
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			j=j-1;
		}

		a[j+1]=key;
	}
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    
    int n;
    cin>>n;

    int a[n];

    for (int i = 0; i <n; ++i)
    {
    	cin>>a[i];
    }
    
    insertionsort(a,n-1);
    
    for (int i = 0; i <n; ++i)
    {
    	cout<<a[i]<<" ";
    }
return 0;
}
