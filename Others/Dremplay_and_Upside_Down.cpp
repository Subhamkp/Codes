#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647


int countreplace(string s,int n)
{
  int i,j,c=0;
  i=0;j=n-1;
  while(i<j)
  {
    if(s[i]!=s[j])c++;
    i++;j--;
  }
  return c;
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    string s;
    cin>>s;
    int l=s.length(),i,j,p,mn,n;
    i=0;j=l/2;
    mn=INT_MAX;
    n=l;
    while(i<j)
    {
        p=countreplace(s,n);

        s.insert(s.end()-i,s[i]);
        
        //cout<<p<<" "<<n-l<<"\n";   
        if(mn>p+n-l)mn=p+n-l;

        n=n+1;
        i++;
    }

    //cout<<s;
    cout<<mn;
return 0;
}