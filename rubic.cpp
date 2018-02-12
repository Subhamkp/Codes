#include<bits/stdc++.h>
using namespace std;

#define ft first
#define sd second
#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define mp make_pair
#define tr(it, a) for(__typeof(a.begin()) it = a.begin();it != a.end(); ++it)

typedef vector<ll> vi;
typedef pair<ll, ll> pii;
typedef vector<pii> vii;


const int mod = 1e9 + 7;
const ll inf = 1LL << 62;

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int a[25];
    for (int i = 1; i <=24; ++i)
    {
    	cin>>a[i];
    }
    int flag=0,c=0;
    if((a[1]==a[2]&&a[2]==a[3]&&a[3]==a[4])&&(a[9]==a[10]&&a[10]==a[11]&&a[11]==a[12]))
    {
    	c++;
    	if(a[5]==a[6]&&a[6]==a[19]&&a[19]==a[20])
    	{
    		if(a[17]==a[18]&&a[18]==a[23]&&a[23]==a[24])
    		{
    			if(a[15]==a[16]&&a[16]==a[21]&&a[21]==a[22])
    			{
    				if(a[13]==a[14]&&a[14]==a[7]&&a[7]==a[8])
    				{
    					flag=1;
    				}
    			}
    		}
    	}
    	if(a[5]==a[6]&&a[6]==a[15]&&a[15]==a[16]){
    		if(a[17]==a[18]&&a[18]==a[7]&&a[7]==a[8])
    		{
    			if(a[19]==a[20]&&a[20]==a[21]&&a[21]==a[22])
    			{
    				if(a[13]==a[14]&&a[14]==a[23]&&a[23]==a[24])
    				{
    					flag=1;
    				}
    			}
    		}
    	}
    }
    if((a[13]==a[14]&&a[14]==a[15]&&a[15]==a[16])&&(a[17]==a[18]&&a[18]==a[19]&&a[19]==a[20]))
    	{c++;
			if(a[22]==a[2]&&a[2]==a[24]&&a[24]==a[4])
			{
				if(a[1]==a[6]&&a[6]==a[3]&&a[3]==a[8])
				{
					if(a[5]==a[10]&&a[10]==a[7]&&a[7]==a[12])
					{
						if(a[9]==a[21]&&a[21]==a[11]&&a[11]==a[23])
						{
							flag=1;
						}
					}
				}
			}
			if(a[11]==a[8]&&a[8]==a[6]&&a[6]==a[9])
			{
				if(a[7]==a[4]&&a[4]==a[5]&&a[5]==a[2])
				{
					if(a[3]==a[23]&&a[23]==a[1]&&a[1]==a[21])
					{
						if(a[24]==a[12]&&a[12]==a[22]&&a[22]==a[10])
						{
							flag=1;
						}
					}
				}
			}
    	}
    if((a[5]==a[6]&&a[6]==a[7]&&a[7]==a[8])&&(a[21]==a[22]&&a[22]==a[23]&&a[23]==a[24]))
    {
    	c++;
		if(a[1]==a[2]&&a[2]==a[14]&&a[14]==a[16])
		{
			if(a[11]==a[12]&&a[12]==a[17]&&a[17]==a[19])
			{
				if(a[18]==a[20]&&a[20]==a[3]&&a[3]==a[4])
				{
					if(a[13]==a[15]&&a[15]==a[9]&&a[9]==a[10])
					{
						flag=1;
					}
				}
			}
		}
		if(a[18]==a[20]&&a[20]==a[9]&&a[9]==a[10])
			{
				if(a[11]==a[12]&&a[12]==a[14]&&a[14]==a[16])
				{
					if(a[1]==a[2]&&a[2]==a[17]&&a[17]==a[19])
					{
						if(a[13]==a[15]&&a[15]==a[3]&&a[3]==a[4])
    					{
    						flag=1;
    					}
					}
				}
			}
	
    }

    if(flag==1)
    	cout<<"YES";
    else cout<<"NO";

return 0;
}
