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

int partition(int a[],int start, int end )
{
	int pivot=a[end];
	int pindex=start;
	for (int i = start; i <end; ++i)
	{
		if(a[i]<=pivot)
			{
				swap(a[i],a[pindex]);
				pindex++;
			}
	}
	swap(a[pindex],a[end]); // swap a[end],not variable pivot
	return pindex;
}

void quicksort(int a[],int start,int end)
{
	if(start>=end)return;

	int pivot=partition(a,start,end);
	quicksort(a,start,pivot-1);
	quicksort(a,pivot+1,end);
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
    quicksort(a,0,n-1);
    
    for (int i = 0; i <n; ++i)
    {
    	cout<<a[i]<<" ";
    }
return 0;
}
