#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define mp map<ll,ll>
#define tr(c,i) for(typeof((c).begin()) i = (c).begin(); i != (c).end(); i++) // problen in c++11/14
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define mem(a,x) memset(a,x,sizeof(a))
#define inf 0x3f3f3f3f 
     
vector<int>v[500]; 
int visited[500]={0};

void bfs(int s)
{
	queue<int>q;
	q.push(s);
	while(!q.empty())
	{
		int curr=q.front();
		visited[curr]=1;
		cout<<curr<<" ";
		q.pop();	
		for (vector<int>::iterator i = v[curr].begin(); i !=v[curr].end(); ++i)
		{
			if(!visited[*i])
				q.push(*i);		
		}	
	}

}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    ll n;
    int x,y;
    cin>>n;
    for (int i = 0; i < n; ++i)
    {
    	cin>>x>>y;
    	v[x].pb(y);
    }
    bfs(1);
    
return 0;
}