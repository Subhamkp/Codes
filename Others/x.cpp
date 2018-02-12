#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int t,flag;
	cin>>t;
	while(t--){
	flag=0;	
	int a[3];
	int b[3];
	int c[3];
	
	for(int i=0;i<3;i++){cin>>a[i];}
	for(int i=0;i<3;i++){cin>>b[i];}
	for(int i=0;i<3;i++){cin>>c[i];}
	
if((a[0]==b[0] &&a[1]==b[1] && a[2]==b[2]) || (a[0]==c[0] && a[1]==c[1] && a[2]==c[2]) ||  (b[0]==c[0] && b[1]==c[1] && b[2]==c[2])) {cout<<"no"<<endl;flag=1;continue;}

if( (((a[0]>b[0]) && ((a[1]<b[1])||(a[2]<b[2]))) || (a[0]>c[0] && ((a[1]<c[1])||(a[2]<c[2]))))) {cout<<"no"<<endl;flag=1;continue;}
if( (((a[1]>b[1]) && ((a[2]<b[2])||(a[0]<b[0]))) || (a[1]>c[1] && ((a[2]<c[2])||(a[0]<c[0]))) )){cout<<"no"<<endl;flag=1;continue;}
if( (((a[2]>b[2]) && ((a[0]<b[0])||(a[1]<b[1]))) || (a[2]>c[2] && ((a[0]<c[0])||(a[1]<c[1]))) )){cout<<"no"<<endl;flag=1;continue;}

if( (((b[0]>c[0]) && ((b[1]<c[1])||(b[2]<c[2]))) || (b[0]>a[0] && ((b[1]<a[1])||(b[2]<a[2]))) )){cout<<"no"<<endl;flag=1;continue;}
if( (((b[1]>c[1]) && ((b[2]<c[2])||(b[0]<c[0]))) || (b[1]>a[1] && ((b[2]<a[2])||(b[0]<a[0]))) )){cout<<"no"<<endl;flag=1;continue;}
if( (((b[2]>c[2]) && ((b[0]<c[0])||(b[1]<c[1]))) || (b[2]>a[2] && ((b[0]<a[0])||(b[1]<a[1]))) )){cout<<"no"<<endl;flag=1;continue;}
cout<<"yes"<<endl;
}


return 0;
}
