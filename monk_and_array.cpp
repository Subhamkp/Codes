#include<bits/stdc++.h>
using namespace std;
typedef long int ll;
int main()
{
	ios::sync_with_stdio(false);
	ll n, m;
	cin >> n >> m;
	ll i, j;
	ll a[n][m];
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < m; j++)
			cin >> a[i][j];
	}
	vector<ll>S;
	vector<ll>::iterator it;
	for (i = 0; i < m; i++)
		S.push_back(a[0][i]);
	bool fl = 0; // false
	ll ans = INT_MAX;
	//cout<<ans;
	sort(S.begin(), S.end());
	for (i = 1; i < n; i++)
	{
		for (j = 0; j < m; j++)
		{
			it = upper_bound(S.begin(), S.end(), a[i][j]);
			if (it == S.end())
			{
				it--;
				ll temp = abs(a[i][j] - (*it));
				ans = min(ans, temp);
			}
			else
			{
				ll temp = abs(a[i][j] - (*it));
				ans = min(ans, temp);
				if (it != S.begin())
				{
					it--;
					temp = abs(a[i][j] - (*it));
					ans = min(ans, temp);
				}
			}
			if (ans == 0)
			{
				fl = 1;
				break;
			}
		}
		if (fl)
			break;
		S.clear();
		for (j = 0; j < m; j++)
			S.push_back(a[i][j]);
		sort(S.begin(), S.end());
	}
	if (fl)
		cout << "0\n";
	else
		cout << ans << "\n";
	return 0;
}