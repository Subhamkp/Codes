#include <bits/stdc++.h>
using namespace std;
 
int main()
{
   string s;
   cin>>s;
   int j=s.length();
   for(int i=0;i<j;i++){
       if(s[i]=='?'){
       if(s[i-1]=='a' || s[i+1]=='a')
       s[i]='b';
       else
       s[i]='a';
       }
   }
   cout<<s;
    return 0;
}