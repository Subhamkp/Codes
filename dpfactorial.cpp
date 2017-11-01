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
    vi v(100000);
    v[0]=v[1]=1;
    for (int i = 2; i <= 100000; ++i)
    {
    	v[i]=(v[i-1]*i+mod)%mod;
    }

return 0;
}
//D:\Coding Practice