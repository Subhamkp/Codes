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

void selectionsort(int a[],int n)
{
	for (int i = 0; i <=n-1; ++i)
	{
		int key=a[i];
		int min=i;
		for (int j = i+1; j <=n; ++j)
		{
			if(a[j]<key)
				min=j;
		}
		swap(a[i],a[min]);
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
    
    selectionsort(a,n-1);
    
    for (int i = 0; i <n; ++i)
    {
    	cout<<a[i]<<" ";
    }
return 0;
}
