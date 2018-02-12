#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define all(x) x.begin(),x.end()

const int MAX = 1e3 + 5;
int id[MAX];
int size[MAX]; // global variable initialize as 0 for local use memset()

void initialize(int n)
{
    for(int i = 1;i <n;++i) // node start from 0
     {   
         id[i] = i;
         size[i]=1;
     }
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
    
    if(p==q)
        return;
        
    if(size[p]>=size[q]){
        id[q]=p; //p is parent of q
        size[p]+=size[q];
    }
    else{
        id[p]=q; //q is parent of p
        size[q]+=size[p];
    }
    
}



int main()
{
    int n,m,q, y;
    cin >> n>>m;
    initialize(n+1);

    int mark[n+1]={0};
    for(int i = 0;i <m;++i)
    {
        vector<int>v;
        
        cin >> q >> y;
        mark[q]=1;
        mark[y]=1;
        union1(q,y);
    }

    if(m==0)
    {
        int c=0;
        for (int i = 1; i <=n; ++i)
        {
            cout<<i<<" ";
            c++;
            if(c==3){cout<<endl;c=0;}
        }
        return 0;
    }

    vector<int>v;
    int flag=1;

    for (int i = 1; i <=n; ++i)
    {
        if(id[i]==i&&size[i]>1)
                v.push_back(i);
        if(size[i]>3)flag=0;
    }

    // for (int i = 0; i <v.size(); ++i)
    // {
    //     cout<<v[i]<<" ";
    // }

    if(flag==0){
        cout<<-1;
        return 0;
    }
vector<vector<int> > ans;
    for (int i = 0; i <v.size(); ++i)
    {
        int c=0;
        vector<int> x;
        for (int j = 1; j <=n; ++j)
        {
            if(id[j]==v[i])
                {
                    x.push_back(j);c++;
                    mark[j]=1;
                }
        }
        if(c<3)
        {
            for (int j =1; j <=n; ++j)
            {
                if(mark[j]==0)
                    {
                        x.push_back(j);
                        mark[j]=1;
                        break;
                    }
            }
        }

        ans.push_back(x);
        //cout<<endl;
    }

    int c=0;
    vector<int> x;
    for (int i = 1; i <=n; ++i)
    {
        if(mark[i]==0){ x.push_back(i);c++;}
        if(c==3){//cout<<endl;
            ans.push_back(x);
            x.clear();
            c=0;}
    }
    bool f=true;
    for(int i=0;i<ans.size();i++){
        if(ans[i].size()!=3) f=false;
    }
    if(f){
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans[i].size();j++){
                cout<<ans[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    else cout<<-1;
    return 0;
}