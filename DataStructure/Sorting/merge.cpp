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

void merge(int arr[],int aux[],int low,int mid,int high)
{
    int ind=low;
    int i=low,j=mid+1;

    while(i<=mid && j<=high)
    {
        if(arr[i]<arr[j])
            aux[ind++]=arr[i++];
        else 
            aux[ind++]=arr[j++];
    }

    while(i<=mid)
        aux[ind++]=arr[i++];

    for (int i =low; i <=high; ++i)
        arr[i]=aux[i];

}

void mergesort(int arr[],int aux[],int low, int high)
{
    if(low==high)return;

    int mid=(low+high)>>1;

    mergesort(arr,aux,low,mid);
    mergesort(arr,aux,mid+1,high);

    merge(arr,aux,low,mid,high);
}


int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int n;
    cin>>n;

    int arr[n],aux[n];

    for (int i = 0; i <n; ++i)
    {
    	cin>>arr[i];
        aux[i]=arr[i];

    }
    
    mergesort(arr,aux,0,n-1);
    
    for (int i = 0; i <n; ++i)
    {
    	cout<<arr[i]<<" ";
    }
return 0;
}
