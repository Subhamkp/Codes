#include<bits/stdc++.h>
using namespace std;
int max(int a, int b);


int lcs( string X, string Y, int m, int n )
{
	int L[m+1][n+1];
	int i, j;

	for (i=0; i<=m; i++)
	{
		for (j=0; j<=n; j++)
		{
		if (i == 0 || j == 0)
			L[i][j] = 0;

		else if (X[i-1] == Y[j-1])
			L[i][j] = L[i-1][j-1] + 1;

		else
			L[i][j] = max(L[i-1][j], L[i][j-1]);
		}
	}

return L[m][n];
}

int max(int a, int b)
{
	return (a > b)? a : b;
}

int main()
{
	string p,q;
	cin>>p>>q;
    
    int cnt=0;
	int m = p.length();
	int n = q.length();

	cnt=lcs(p,q,m,n);
	
	while(1)
	{
		string a(p.begin(),p.end()-1);
		int w=lcs(a,p,a.length(),p.length());

		string b(p.begin()+1,p.end());
		int x=lcs(b,p,b.length(),p.length());

		string c(q.begin(),q.end()-1);
		int y=lcs(c,q,c.length(),q.length());

		string d(q.begin()+1,q.end());
		int z=lcs(d,q,d.length(),q.length());

		int m=max(w,max(x,max(y,z)));

		// cout<<a<<"\n"<<b<<"\n"<<c<<"\n"<<d<<"\n";
		if(m==0) break;

		if(w==m){
			p.erase(p.end()-1);
		}
		else if (x==m)
		{
			p.erase(p.begin());
		}
		else if (y==m)
		{
			q.erase(q.end()-1);
		}
		else if (z==m)
		{
			q.erase(q.begin());
		}
		
		cnt+=m;
	}
	
	cout<<cnt;

	// cout<<ans;

return 0;
}
