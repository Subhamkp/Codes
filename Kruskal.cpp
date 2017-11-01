#include<bits/stdc++.h>

using namespace std;
const int MAX = 1e6 + 5;
int id[MAX], n,m;
vector<pair<long long, pair<int, int> > >edges;

void initialize(int n)
{
    for(int i = 0;i <n;++i)
        id[i] = i;
}

int findset(int x)
{
    while(id[x] != x)
    {
        id[x] = id[id[x]];
        x = id[x];
    }
    return x;
}

void union1(int x, int y) // don't set union as function name as union is keyword 
{
    int p = findset(x);
    int q = findset(y);
    id[p] = id[q];
}

long long kruskal(vector<pair<long long, pair<int, int> > >edges)
{
    int x, y;
    long long cost, minimumCost = 0;
    for(int i = 0;i <edges.size();++i)
    {
        x = edges[i].second.first;
        y = edges[i].second.second;
        cost = edges[i].first;
        // Check if the selected edge is creating a cycle or not
        if(findset(x) != findset(y))
        {
            minimumCost += cost;
            union1(x, y);
        }    
    }
    return minimumCost;
}

int main()
{
    int x, y;
    long long w, cost, minimumCost;
    cin >> n>>m;
    initialize(n);
    for(int i = 0;i <m;++i)
    {
        cin >> x >> y >> w;
        edges.push_back(make_pair(w, make_pair(x, y)));
    }
    // Sort the edges in the ascending order
    sort(edges.begin(),edges.end());
    minimumCost = kruskal(edges);
    cout << minimumCost << endl;
    return 0;
}
