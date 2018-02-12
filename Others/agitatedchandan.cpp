// we have to find the diameter of tree
/*we select any node at random and using bfs find the farthest node 
from the selected node which offcourse will be a leaf node lets call this farthest node A,
now we apply bfs to A and find the farthest node from A which again is a leaf node lets call it B 
so we got a distance from a leaf node A to another leaf node B that is maximum which gives the diameter of tree*/

#include<bits/stdc++.h>
using namespace std;

vector<pair<int,int> >v[1000005];
bool visited[1000005];
int dist[1000005];

int bfs(int s,int n)
{
    int a,w;

    memset(dist,-1,sizeof(dist));
    memset(visited,0,sizeof(visited));

    dist[s]=0;
    queue<int>q;
    visited[s]=true;
    q.push(s);

    while(!q.empty())
    {
      int nod=q.front();
      q.pop();
      for(int i=0;i<v[nod].size();i++)
      {
        a=v[nod][i].first;
        w=v[nod][i].second;

        if(visited[a]==false)
        {
         q.push(a);
         visited[a] = true;
         dist[a] = dist[nod]+w;
        }
      }
            
    }

    // for (int i = 0; i <n; ++i)
    // {
    //     cout<<dist[i]<<" ";
    // }
    // cout<<endl;
    int pos=max_element(dist+1,dist+n+1)-dist;
    return pos;
}

int main(){

    int w,t,m,n,x,y,z;
    cin>>t;
    while(t--){
    
        cin>>n;
        for(int i=0;i<n-1;i++)
        {
            cin>>x>>y>>w;
            v[x].push_back(make_pair(y,w));
            v[y].push_back(make_pair(x,w));
        }

        int a=bfs(1,n);
        // cout<<a<<"\n";
        int b=bfs(a,n);

        //cost
        if(dist[b]<100)cout<<0<<" ";
        else if (dist[b]>10000)cout<<10000<<" ";
        else if(dist[b]>1000)cout<<1000<<" ";
        else if(dist[b]>100)cout<<100<<" ";
        
        //distance
        cout<<dist[b]<<"\n";

        for (int i = 0; i <=n; ++i)
            v[i].clear();
    }
return 0;
}