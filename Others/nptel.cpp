#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    vector<string>v;
    while(getline (cin,s))
    {
    	v.push_back(s);
    }
    int n=v.size();
    int m=n/2;
    for (int i = m; i <n;++i)
    {
    	cout<<v[i]<<endl;
    }
    for (int i = 0; i < m; ++i)
    {
    	cout<<v[i]<<endl;
    }
return 0;
}