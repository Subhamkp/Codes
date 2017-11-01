#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define all(x) x.begin(),x.end()

const int MAX = 1e6 + 5;
int id[MAX];
int size[MAX]; // global variable initialize as 0 for local use memset()

void initialize(int n)
{
    for(int i = 1;i <n;++i) // node start from 1 
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
    int n,m,x, y,t;
    cin>>t;
    while(t--)
    {
            cin>>n>>m;

        int a[m],b[m];
        char c[m][2];
        initialize(n);


        for (int i = 0; i < m; ++i)
        {
            cin>>a[i]>>c[i]>>b[i];
            if(c[i][0]== '=')
            {
                union1(a[i],b[i]);
            }

        }
        
        int flag=1;
        for (int i = 0; i < m; ++i)
        {
            if(c[i][0]== '!')
            {
                if(findset(a[i])==findset(b[i]))
                    {flag=0;break;}
            }
            
        }
        if(flag==0)
        {
            cout<<"NO\n";

        }
        else
            cout<<"YES\n";
    }

    return 0;
}