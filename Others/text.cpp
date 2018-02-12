#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define mp map<ll,ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define mem(a,x) memset(a,x,sizeof(a))
#define inf 0x3f3f3f3f 
      
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int i =0;
while(i<=3)
{
    int j=0;
    while(j <= i)
    {
        switch(j)
        {
            case 2:
                j = j * 2;
                break;

            case 3:
                j = j * 6;
                break;

            default:
                j++;
        }

        int k = 1;
        while(k < j)
        {
            k = k * 2;
            if(k > 3)
                continue;

            printf("%d ", k);
        }

        printf("%d ", j);
    }
    i++;
}
return 0;
}