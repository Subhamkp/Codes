#include <bits/stdc++.h>
using namespace std;

map<int,int>F;

void prefixtable(const string &p)
{
    int i=1,j=0;
    int m=p.length();
    while(i<m)
    {
        if(p[i]==p[j]){
            F[i]=j+1;
            i++;
            j++;
        }
        else if(j>0)j=F[j-1];
        else{
            F[i]=0;
            i++;
        }
    }
}

int kmp(const string &p,const string &t)
{
    int i=0,j=0,n,m,c=0;
    n=t.length();
    m=p.length();
    prefixtable(p);
    //cout<<n<<" "<<m;
    while(i<n){
        if(t[i]==p[j]){
            if(j==m-1)
            {
                j=0;c++;i-=(m-2);
            }
            else {
                i++;j++;
            }
        }
        else if(j>0)j=F[j-1];
        else i++;
    }
    return c;
}
int main()
{
    string p,t;
    cin>>p>>t;
    cout<<kmp(p,t);
    return 0;
}
