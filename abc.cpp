#include <bits/stdc++.h>
using namespace std;

vector<int>v[100001];
// vector<int>v1[100001];
map<int,int>mm;
bool visited[100001];

void bfs(int s)
{
    
    queue<int>q;
    visited[s]=true;
    q.push(s);
    
    while(!q.empty())
    {
      int nod=q.front();
      q.pop();
      int l=v[nod].size();
      for(int i=0;i<l;i++)
      {
        if(visited[v[nod][i]]==false)
        {
         q.push(v[nod][i]);
         visited[v[nod][i]]=true;
        }
      }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    set<int>s;
    int t,m,n,x,y;
    cin>>t;
    while(t--)
    {
        s.clear();
        mm.clear(); 
        memset(v,0,sizeof(v));
        memset(visited,false,sizeof(visited));
        cin>>m>>n;
        int c[m+1];
        int d[m+1];
        for(int i=1;i<=m;i++){cin>>c[i];}
        for(int i=1;i<=m;i++){cin>>d[i];}
        for(int i=1;i<=m;i++){ mm[d[i]]=i;}

        for(int i=1;i<=m;i++)
        {
            if(mm[c[i]]!=mm[d[i]]){
            s.insert(mm[d[i]]);
            s.insert(mm[c[i]]);}
            else {
            visited[mm[c[i]]]=true;
            }
        }
        for(int i=0;i<n;i++)
        {
            cin>>x>>y;
            v[x].push_back(y);
            v[y].push_back(x);
        }
        int count=0,flag=0;
        for(int i=1;i<=m;i++){
            if(!visited[i])
          {
            bfs(i);
            for(auto it=s.begin();it!=s.end();it++)
            {
                if(visited[*it])
                {
                    count++;
                }
                else{break;}
                if(count==s.size()){
                flag=1;break;}
            }
            count=0;
          }

        }
        if(flag==0)
        cout<<"NO"<<endl;
        else if(flag==1)
        cout<<"YES"<<endl;
    }
    return 0;
}