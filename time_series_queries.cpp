#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<long long int>
#define max INT_MAX   //2147483647
#define min INT_MIN  //-2147483647

int P;

bool cmp1(const pair<int,int> &p){
	return p.first>=P;
}
bool cmp2(const pair<int,int> &p){
	return p.second>=P;
}

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    int n,q,mx,l,fst,snd;
    vector< pair <int,int> > v;
    vector< pair<int,int> >::iterator it1;
    vector< pair<int,int> >::iterator it2;
    vector< pair<int,int> >::iterator it;
    
    cin>>n>>q;
    int arr[n],x;

    for (int i = 0; i < n; ++i)
    {
    	cin>>arr[i];
    }
    for (int i = 0; i < n; ++i)
    {
    	cin>>x;
    	v.push_back(make_pair(x,arr[i]));
    }

    // for (it1 = v.begin(); it1!=v.end();++it1)
    // {
    // 	cout<<it1->first<<" "<<it1->second<<"\n";
    // }

    while(q--)
    {
    	cin>>fst>>snd;
    	if(fst==1)
    	{
    		P=snd;
    		it1=v.begin();
		    it1=find_if(it1,v.end(),cmp1);
		    if(it1==v.end())cout<<"-1\n";
		    else
		    	cout<<it1->second<<"\n";
    	}
    	else{
    		P=snd;
		    it2=v.begin();
		    it2=find_if(it2,v.end(),cmp2);

		    mx=0;
		    for (it= it2; it!=v.end(); ++it)
		    {
		        l=it->first;
		    	mx=(l<mx)?mx:l;;
		    }
		    cout<<mx<<"\n";
		}
    }
  
return 0;
}

