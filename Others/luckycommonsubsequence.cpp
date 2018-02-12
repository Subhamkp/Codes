#include<bits/stdc++.h>
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

void lcs(string X, string Y,string virus,int m, int n )
{
	int L[m+1][n+1];

	/* Following steps build L[m+1][n+1] in bottom up fashion. Note
		that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
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

	int index = L[m][n]; // length of lcs

	if(index==0){cout<<0;return;}

	char lcs[index+1];
	lcs[index] = '\0'; // Set the terminating character

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
	// cout << "LCS of " << X << " and " << Y << " is " << lcs;
	string t=lcs;
	if(kmp(virus,t)==0){
		cout<<t;
	}
	else cout<<0;
}

int main()
{
	string X;
	string Y;
	string virus;

	cin>>X>>Y>>virus;

	int m = X.length();
	int n = Y.length();
	
	lcs(X, Y,virus, m, n);
	return 0;
}
