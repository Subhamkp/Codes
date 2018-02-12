#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,p=0,q=0,r=0,k=0,c=0,i=0,j;
    cin>>n;
    vi v(n);
    for(i=0;i<n;i++){cin>>v[i];}
    i=0;
    while(i<n){
    	cout<<"hello";
    	while(v[p++]);
   			p=p-1;
   			i=p;
   		cout<<p;
   		if(v[p+1])
   		{
   			i++;
   			while(v[q++]);
   			q=q-1;
   			i+=q;
   		}
   		else i++;
   		cout<<q;
   		if(p+q>r)r=p+q;p=0;q=0;
    }
   	

    cout<<r;
    
    // for (int i = 0; i < n; ++i)
    // {
    // 	if(v[i]==1)
    // 		{p++;k++;}
    // 	else
    // 	{

    // 		if(v[i+1]==1)
    // 		{
    // 			for (j = i+1; j < n; j++)
    // 			{
    // 				//cout<<v[j-1];
    // 				if(v[j]==1)
    // 					q++;
    // 				else break;
    // 			}
    // 			i=j-1;
    // 		}
    // 	cout<<q<<"q\n";
    // 	if(p+q>r)
    // 		r=p+q;

    // 	p=0;q=0;
    // 	}

    	
    // }
    // if(p+q>r)
    // 		r=p+q;
    // //cout<<r<<"\n";

    // if(r<k)
    // 	cout<<r+1;
    // else 
    // 	cout<<r;
return 0;
}
//D:\Coding Practice