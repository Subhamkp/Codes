// #include<bits/stdc++.h>
// using namespace std;

// #define ft first
// #define sd second
// #define pb push_back
// #define all(x) x.begin(),x.end()
// #define ll long long int
// #define vi vector<long long int>
// #define vii vector<pair<long long int,long long int> >
// #define mp make_pair

// const int mod = 1e9 + 7;
// const ll INF = 1LL << 62;

// ll power(ll x,ll y){
//   ll t=1;
//   while(y>0){
//     if(y&1) y-=1,t=t*x%mod;
//     else y/=2,x=x*x%mod;
//   }
//   return t;
// }
// ll inv(ll q){ll t;t=power(q,mod-2);return t;}
// ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}
// ll lcm(ll a,ll b){return (a*(b / gcd(a, b))); }

// int main(){
//     ios_base::sync_with_stdio(false);cin.tie(0);
//     ll t,x,y,z,p,q,r,s,a,b,c,l,sum1,sum2,sum3;
//     cin>>t;
//     while(t--)
//     {
//     	cin>>x>>y>>z;
//     	cin>>p>>q>>r>>s;
//     	ll sum[3]={0};
//     	for (int i = 0; i <3; ++i)
//     	{  
//     		a=x;b=y;c=z;
    		
//     		if(i==0)
//     		{   
//     			if(a>b)
//     			{
//     				sum[0]+=b*p;
//     				a-=b;
//     				sum[0]+=(a+c)*s;
//     			}
//     			else{
//     				sum[0]+=a*p;
//     				b-=a;
//     				if(b>c)
//     				{
//     					sum[0]+=c*q;
//     					b-=c;
//     					sum[0]+=b*s;
//     				}
//     				else{
//     					sum[0]+=b*q;
//     					c-=b;
//     					sum[0]+=c*s;
//     				}
//     			}
//     		}

//     		if(i==1)
//     		{
//     			if(b<c)
//     			{
//     				sum[1]+=b*q;
//     				c-=b;
//     				sum[1]+=(a+c)*s;
//     			}
//     			else{
//     				sum[1]+=c*q;
//     				b-=a;
//     				if(a>b)
//     				{
//     					sum[1]+=b*p;
//     					a-=b;
//     					sum[1]+=a*s;
//     				}
//     				else{
//     					sum[1]+=a*p;
//     					b-=a;
//     					sum[1]+=b*s;
//     				}
//     			}
//     		}

//     		if(i==2)
//     		{
//     			l=min(min(x,y),z);
//     			sum3+=l*r;
//     			a-=l;b-=l;c-=l;
//     			if(a==0)
//     			{
//     				if(b>c)
//     				{
//     					sum[2]+=c*q;
//     					b-=c;
//     					sum[2]+=b*s;
//     				}
//     				else{
//     					sum[2]+=b*q;
//     					c-=b;
//     					sum[2]+=c*s;
//     				}
//     			}
//     			if(b==0)
//     			{
//     				sum[2]+=(a+c)*s;
//     			}
//     			if(c==0)
//     			{
//     				if(a>b)
//     				{
//     					sum[2]+=b*p;
//     					a-=b;
//     					sum[2]+=a*s;
//     				}
//     				else{
//     					sum[2]+=a*p;
//     					b-=a;
//     					sum[2]+=b*s;
//     				}
//     			}
//     		}
//     	}
//     	// cout<<sum1<<" "<<sum2<<" "<<sum3;
//     	cout<<max(max(sum[0],sum[1]),sum[2])<<"\n";

//     }
// return 0;
// }


