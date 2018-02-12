#include<bits/stdc++.h>
using namespace std;
# define INF 0x3f3f3f3f

typedef pair<int, int> iPair;

vector< pair<int, int> >adj[100000];
vector<int> dist(100000, INF);

void shortestPath(int src)
{
	priority_queue< iPair, vector <iPair> , greater<iPair> > pq;
	
	// distance must be first item in pair
	
	pq.push(make_pair(0, src));
	dist[src] = 0;

	while (!pq.empty())
	{
		int u = pq.top().second;
		pq.pop();

		
		vector< pair<int, int> >::iterator i;
		for (i = adj[u].begin(); i != adj[u].end(); ++i)
		{
			int v = (*i).first;
			int weight = (*i).second;

			if (dist[v] > dist[u] + weight)
			{
				dist[v] = dist[u] + weight;
				pq.push(make_pair(dist[v], v));
			}
		}
	}
}

int main()
{
	int n,x,y,w;
	cin>>n;
	for (int i = 0; i < n; ++i)
	{
		cin>>x>>y>>w;
		adj[x].push_back(make_pair(y,w));
		adj[y].push_back(make_pair(x,w));
	}

	shortestPath(0);
	return 0;
}
