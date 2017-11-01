#include <iostream>
using namespace std;

int main()
{
    int t,n,k;
    cin>>t;
    while(t--)
    {
        cin>>n>>k;

        int co=0;
        for (int j = 0; j <n; ++j)
        {
            char a[n];
            int c=0;

            for(int i=0;i<n;i++)
            {
                cin>>a[i];
                if(a[i]=='T')c++;
            }

            int l,r,p,q,once,lo,up;
            
            for(int i=0;i<n;i++)
            {   
                lo=-1;up=-1;once=0;
                if(a[i]=='P')
                {   
                    l=i-1;r=i+1;
                    while((l>=0&&i-l<=k)||(r<n&&r-i<=k))
                    {
                        if(c==0)break;

                        if(a[l]=='T'){lo=l;}
                        if(a[r]=='T'){if(once==0)up=r;}
                        l--;r++;
                    }
                    if(lo!=-1&&up!=-1)
                    {
                        a[lo]='0';c--;co++;   
                    }
                    else{
                        if(lo!=-1)
                            {a[lo]='0';c--;co++;}
                        if(up!=-1)
                            {a[up]='0';c--;co++;}
                    }

                }
            }
            cout<<co<<endl<<endl;
        }
        
        // cout<<co<<endl;
    }
    return 0;
}
