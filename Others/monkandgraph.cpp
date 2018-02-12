#include <bits/stdc++.h>
using namespace std;

#define N 100005
vector<int> adjList[N];
int sum;

int DFS(int v, vector<bool> &discovered)
{
	discovered[v] = true;
	
	for (int u : adjList[v])
	{
		sum++;
		if (!discovered[u])
			DFS(u, discovered);
	}
}

int main()
{
	int x,y,l,n,m;
	cin>>n>>m;
	for (int i = 0; i <m; ++i)
	{
		cin>>x>>y;
		adjList[x].push_back(y);
		adjList[y].push_back(x);
	}
	vector<bool> discovered(N);

	sum=0;l=0;
	for (int i = 1; i < N; i++)
	{	if (discovered[i] == false)
			{
				DFS(i, discovered);
				l=max(sum/2,l);
				sum=0;
			}
	}
	cout<<l;
	return 0;
}
