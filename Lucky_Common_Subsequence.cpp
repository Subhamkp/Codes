#include<bits/stdc++.h>
using namespace std;
 
string lcs(string X, string Y, int m, int n )
{
   int L[m+1][n+1];
 
   for (int i=0; i<=m; i++)
   {
     for (int j=0; j<=n; j++)
     {
       if (i == 0 || j == 0)
         L[i][j] = 0;
       else if (X[i-1] == Y[j-1])
         L[i][j] = L[i-1][j-1] + 1;
       else
         L[i][j] = max(L[i-1][j], L[i][j-1]);
     }
   }
 
   int index = L[m][n];
 
   char lcs[index+1];
   lcs[index] = '\0'; 
 
   int i = m, j = n;
   while (i > 0 && j > 0)
   {
      if (X[i-1] == Y[j-1])
      {
          lcs[index-1] = X[i-1]; 
          i--; j--; index--;     
      }
 
      else if (L[i-1][j] > L[i][j-1])
         i--;
      else
         j--;
   }

   return lcs;
}
 
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
              return i-j;  
            }  
            else {
                i++;j++;
            }
        }
        else if(j>0)j=F[j-1];
        else i++;
    }
    return -1;
}
int main()
{
  string s1,s2,s3;
  cin>>s1>>s2>>s3;
  int m =s1.length();
  int n =s2.length();
  
  string t=lcs(s1, s2, m, n);
 
  if(kmp(s3,t)!=-1)cout<<0;
  else
    cout<<t;

  return 0;
}