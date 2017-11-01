#include <bits/stdc++.h>
#define MOD 1000000007
using namespace std;
#define endl "\n"
#define ll long long int
void multi(long long int F[2][2], long long int M[2][2]);
void power(long long int F[2][2], long long int n);
 
int fib(ll n)
{
	ll F[2][2]  = {{1,1},{1,0}};
	if(n == 0)
		return 0;
	power(F, n-1);
 
	return F[0][0];
}
 
void multi(ll F[2][2], ll M[2][2])
{
	ll x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
 	ll y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
 	ll z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
    ll w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
 
	F[0][0] = (int)(x%MOD);
	F[0][1] = (int)(y%MOD);
	F[1][0] = (int)(z%MOD);
	F[1][1] = (int)(w%MOD);
}
 
void power(ll F[2][2],ll n)
{
	if(n == 0 || n == 1)
		return;
 
	ll M[2][2] = {{1,1}, {1,0}};
 
	power(F, n/2);
	multi(F, F);
 
	if( n%2 != 0)
		multi(F, M);
 
}
 
int main(void)
{
	ll t, n; cin >> t;
	while(t--)
	{
	    cin >> n;
	    cout << fib(n+2)%MOD << endl;
	}
 
	return 0;
}
 