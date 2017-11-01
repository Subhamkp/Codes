#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define inf 0x3f3f3f3f
#define mem(a,x) memset(a,x,sizeof(a))
      
int vis[10009]; // containing level
void bfs(int n,int m)
{
    queue<int> q;
    q.push(n);
    vis[n]=0;
    while(!q.empty())
    {
        int now=q.front();
        q.pop();
        int tmp=now-1;
        if(tmp>0 && vis[tmp]==inf)
        {
            vis[tmp]=vis[now]+1;
            if(tmp==m)return;
            q.push(tmp);

        }
        tmp=now*2;
        if(tmp>0 && vis[tmp]==inf)
        {
            vis[tmp]=vis[now]+1;
            if(tmp==m)return;
            q.push(tmp);
        }

    }
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n,m;
    cin>>n>>m;
	mem(vis,inf);    
	bfs(n,m);
    cout<<vis[m];

return 0;
}