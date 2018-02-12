#include<bits/stdc++.h>
using namespace std;

int main(){
	int t,n; cin>>t;
	while(t--){
		cin>>n;
		int ar[101]={0},x;
		for(int i=0;i<n;i++){
			cin>>x;
			ar[x]++;
		}
		int ans;
		for(int i=0;i<=100;i++){
			if(ar[i] == 1){ans=i;break;}
		}
		cout<<ans<<endl;

	}

	return 0;
}