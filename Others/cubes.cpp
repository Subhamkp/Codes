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
    int n;
    cin>>n;

    int i,j,a[7],b[7],c[7];
    int m[10],x;
    memset(m,0,sizeof(m));
    if(n==1)
    {	
    	for (i = 0; i <6; ++i)
    	{
    		cin>>x;
    		m[x]=1;;
    	}
    	for (i = 1; i <=9; ++i)
    	{
    		if(m[i]!=1)break;
    	}
    	cout<<i-1;
    }
    if(n==2)
    {
    	int mark[100]={0};
    	for (i = 0; i <6; ++i) {cin>>a[i];mark[a[i]]=1;}
    	for (i = 0; i <6; ++i) {cin>>b[i];mark[b[i]]=1;}
    	

		for (i = 0; i <6; ++i){
			for (j = 0; j <6; ++j){
				int x = a[i]*10+b[j];
				int y = b[j]*10+a[i];

				mark[x]=1;
				mark[y]=1;
			}
		}
		i=1;
		while(mark[i] > 0) i++;
		cout<<i-1;

    }
    if(n==3){
    	int mark[1000]={0};
    		for (i = 0; i <6; ++i) cin>>a[i];
			for (i = 0; i <6; ++i) cin>>b[i];
    		for (i = 0; i <6; ++i) cin>>c[i];

    		for (i = 0; i <6; ++i) mark[a[i]]=1;
    		for (i = 0; i <6; ++i) mark[b[i]]=1;
    		for (i = 0; i <6; ++i) mark[c[i]]=1;

    		for (i = 0; i <6; ++i){
					for (j = 0; j <6; ++j){
						int x = a[i]*10+b[j];
						int y = b[j]*10+a[i];

						mark[x]=1;
						mark[y]=1;
					}
			}
			for (i = 0; i <6; ++i){
						for (j = 0; j <6; ++j){
							int x = a[i]*10+c[j];
							int y = c[j]*10+a[i];

							mark[x]=1;
							mark[y]=1;
						}
			}
			for (i = 0; i <6; ++i){
						for (j = 0; j <6; ++j){
							int x = c[i]*10+b[j];
							int y = b[j]*10+c[i];

							mark[x]=1;
							mark[y]=1;
						}
			}
			for(i=0;i<6;i++){
				for(j=0;j<6;j++){
					for(int k=0;k<6;k++){
						int q=100*a[i]+10*b[j]+c[k];
						int q1=100*a[i]+10*c[k]+b[j];
						int q2=100*b[j]+10*a[i]+c[k];
						int q3=100*b[j]+10*c[k]+a[i];
						int q4=100*c[k]+10*b[j]+a[i];
						int q5=100*c[k]+10*a[i]+b[j];
						mark[q]=1;
						mark[q1]=1;
						mark[q2]=1;
						mark[q3]=1;
						mark[q4]=1;
						mark[q5]=1;
					}
				}
			}
			i=1;
			while(mark[i] > 0) i++;
			cout<<i-1;
    }

return 0;
}
