#include<bits/stdc++.h>
using namespace std;
#define ft first
#define sd second
#define pb push_back
#define all(x) x.begin(),x.end()

#define ll long long int
#define vi vector<long long int>
#define vii vector<pair<long long int,long long int> >
#define mp make_pair
ll gcd(ll a,ll b){return (b==0)?a:gcd(b, a%b);}

ll N=500;
vector<bool> isPrime(N+1);

void sieve(int N) {
    for(int i = 0; i <= N;++i) {
        isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    for(int i = 2; i * i <= N; ++i) {
         if(isPrime[i] == true) {
             // Mark all the multiples of i as composite numbers
             for(int j = i * i; j <= N ;j += i)
                 isPrime[j] = false;
        }
    }
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    sieve(500);
   int t,n,l,r;
   string s;
   cin>>t;
   while(t--)
   {
   		cin>>n;
   		cin>>s;
   		for (int i = 0; i < n; ++i)
   		{

   			int a=(int)s[i];

   				//pre boundary
   				if(a<65)
   					{s[i]='C';continue;}
   				if(a>122)
   					{s[i]='q';continue;}


   				l=a;
   				while(!isPrime[l]&&l>0)
   				{
   					l--;
   				}
   				// cout<<l<<" sss ";

   				r=a;
   				while(!isPrime[r]&&r<123)
   				{
   					r++;
   				}
   				// cout<<l<<" "<<r<<"\n";
   				if(a-l>r-a)
   				{

   					if((r>96&&r<123)||(r>64&&r<91))
   						s[i]=(char)r;
   					else if((l>96&&l<123)||(l>64&&l<91))
   					    s[i]=(char)l;	
   				}
   				else 
   				{ 
   					if((l>96&&l<123)||(l>64&&l<91))
   					    s[i]=(char)l;
   					else if((r>96&&r<123)||(r>64&&r<91))
   						s[i]=(char)r;
   				}
   	  }
   		cout<<s<<"\n";
   }
return 0;
}


