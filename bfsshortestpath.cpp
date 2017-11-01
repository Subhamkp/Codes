#include<bits/stdc++.h>
using namespace std;

vector<int>v[1000001];
bool visited[1000001];
int level[1000001];

     void bfs(int s)
      {
      	level[s]=0;
	queue<int>q;
	visited[s]=true;
	q.push(s);
	while(!q.empty())
	{
	  int nod=q.front();
	  q.pop();
	  for(int i=0;i<v[nod].size();i++)
	  {
	  	if(visited[v[nod][i]]==false)
	  	{
	  	 q.push(v[nod][i]);
	  	 visited[v[nod][i]]=true;
	  	 level[v[nod][i]]=level[nod]+1; 
	  	}
	  }
            }
      }

int main(){

	int t,m,n,x,y,z;
	cin>>t;
	while(t--){
	
	memset(level,-1,sizeof(level));
	memset(v,0,sizeof(v));
	memset(visited,0,sizeof(visited));
	
	cin>>m>>n;
	for(int i=0;i<n;i++)
	{
	   cin>>x>>y;
	   v[x].push_back(y);
	   v[y].push_back(x);
	}
	cin>>z;
	bfs(z);
	for(int i=1;i<=m;i++)
	{
	   if(i!=z)
	   {
	      if(level[i]==-1)
	      cout<<"-1"<<" ";
	      else
	      cout<<6*level[i]<<" ";
	   }
	}
	cout<<endl;
	}

return 0;
}