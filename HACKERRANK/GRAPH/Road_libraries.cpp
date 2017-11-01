#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>

vector<ll>vec[100001];
bool visited[100001];
ll sum;

void dfs(int v)
{
	sum++;
	visited[v] = 1;

	for (int j = 0; j < vec[v].size(); j++) {
		if (visited[vec[v][j]] == 0) {
			dfs(vec[v][j]);
		}
	}
}

int main() {
	//ios_base::sync_with_stdio(false); cin.tie(0);
	ll n, m, x, y,a,b,ans,q,i;
	
	cin>>q;
	for(int j = 0;j<q; j++) {
		
		cin>>n>>m>>x>>y;

		memset(visited, 0, sizeof(visited));

		for (i = 1; i <= n; i++)
        {
            vec[i].clear();
        }

		for (i = 0; i< m; i++) {
			cin>>a>>b;
			vec[a].push_back(b);
			vec[b].push_back(a);
		}

		ans=0;
		for (i = 1; i <=n; i++) {
			if (visited[i]==0) {
				sum=0;
				dfs(i);
				
				ans += min(x + y*(sum - 1), x*sum);
			}
		}
		//cout<<"hello";
		cout<<ans;
		cout<<"\n";
	   
	}

	return 0;
}