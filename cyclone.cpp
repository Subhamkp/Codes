#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define LOG2(X) ((unsigned) (8*sizeof (unsigned long long) - __builtin_clzll((X)) - 1))

int main()
{
	ll n,k;
	cin>>n>>k;
	ll arr[n];
    ll max_ele=0;

	for (ll i = 0; i < n; ++i)
	{
		cin>>arr[i];
		if (arr[i] > max_ele)
		   max_ele = arr[i];
	}

	ll m = (1 << (ll)(LOG2(max_ele) + 1) ) - 1;

	ll dp[n+1][m+1];

	for (ll i=0; i<=n; i++)
		for (ll j=0; j<=m; j++)
			dp[i][j] = 0;

	dp[0][0] = 1;

	
	for (int i=1; i<=n; i++)
		for (int j=0; j<=m; j++)
			dp[i][j] = dp[i-1][j] + dp[i-1][j^arr[i-1]];
	cout<<dp[n][k];
	return 0;
}
