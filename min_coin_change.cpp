#include<bits/stdc++.h>
using namespace std;
#define ll long long int
const ll inf = 1LL << 57;

ll table[inf];

int minCoins(int coins[], ll m, ll V)
{
	

	// Base case (If given value V is 0)
	table[0] = 0;

	// Initialize all table values as Infinite
	for (ll i=1; i<=inf; i++)
		table[i] = INT_MAX;

	// Compute minimum coins required for all
	// values from 1 to V
	for (ll i=1; i<inf; i++)
	{
		// Go through all coins smaller than i
		for (int j=0; j<m; j++)
		if (coins[j] <= i)
		{
			ll sub_res = table[i-coins[j]];
			if (sub_res != INT_MAX && sub_res + 1 < table[i])
				table[i] = sub_res + 1;
		}
	}
	return table[V];
}

// Driver program to test above function
int main()
{
	int coins[] = {1,4,5};
	int m =3;
	ll c=minCoins(coins,m,1000000000);
	int t,x;
	cin>>t;
	while(t--)
	{
	    cin>>x;
	    cout<<minCoins(coins,m,x)<<"\n";
	}
	return 0;
}
