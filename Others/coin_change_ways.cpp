// can be more space optimized

// int count( int S[], int m, int n )
// {
//     // table[i] will be storing the number of solutions for
//     // value i. We need n+1 rows as the table is consturcted
//     // in bottom up manner using the base case (n = 0)
//     int table[n+1];
 
//     // Initialize all table values as 0
//     memset(table, 0, sizeof(table));
 
//     // Base case (If given value is 0)
//     table[0] = 1;
 
//     // Pick all coins one by one and update the table[] values
//     // after the index greater than or equal to the value of the
//     // picked coin
//     for(int i=0; i<m; i++)
//         for(int j=S[i]; j<=n; j++)
//             table[j] += table[j-S[i]];
 
//     return table[n];
// }

#include<bits/stdc++.h>
using namespace std;

int count( int S[], int m, int n )
{
	int i, j, x, y;
	
	int table[m+1][n+1];

	for (i=0; i<=m; i++)
		table[i][0] = 1;

	
	for (i=0; i<=n; i++)
		table[0][i] = 0;

	// Fill rest of the table enteries in bottom up manner 
	for (i = 1; i <=m; i++)
	{
		for (j = 1; j <=n; j++)
		{
		    
			if(j<S[i-1])
				table[i][j]=table[i-1][j];
			    
			else
			  {
			      table[i][j]=table[i-1][j]+table[i][j-S[i-1]];
			  }
		}
	}

	// for ( i = 0; i <=m; ++i)
	// {
	// 	for (j = 0; j <=n ; ++j)
	// 	{
	// 		cout<<table[i][j]<<" ";
	// 	}
	// 	cout<<"\n";
	// }
	return table[m][n];
}

// Driver program to test above function
int main()
{
	int arr[] = {1, 2, 3};
	int m = sizeof(arr)/sizeof(arr[0]);
	int n = 4;
	printf(" %d ", count(arr, m, n));
	return 0;
}
