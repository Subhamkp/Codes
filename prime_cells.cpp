#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    map<int,int>prime;
    int m[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 ,167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,293,
    307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503};

    for (int i = 0; i <=95; ++i)
    {
    	prime[m[i]]=1;
    }
    int n;
    cin>>n;

    int a[n+2][n+2];
    for (int i = 0; i < n+2; ++i)
    {
    	for (int j = 0; j <n+2; ++j)
    	{
    		if(i==0||i==n+1||j==0||j==n+1){a[i][j]=0;continue;}
    		cin>>a[i][j];
    	}
    }
    int c=0,x;
    for (int i = 1; i < n+1; ++i)
    {
    	for (int j = 1; j <n+1; ++j)
    	{
    		x=a[i][j-1]+a[i][j+1]+a[i-1][j]+a[i+1][j];
    		if(prime[x])
    			c++;
    	}
    }
    cout<<c;
return 0;
}
//D:\Coding Practice