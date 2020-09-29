#include<bits/stdc++.h>

using namespace std;

#define pb push_back
#define all(x) x.begin(),x.end()
#define ll long long int
#define vi vector<ll>
#define mp map<ll,ll>
#define tr(c,i) for(typeof((c).begin() i = (c).begin(); i != (c).end(); i++) 
#define present(c,x) ((c).find(x) != (c).end()) //set or map
#define cpresent(c,x) (find(all(c),x) != (c).end()) // vector
#define mem(a,x) memset(a,x,sizeof(a))
#define inf 0x3f3f3f3f 
    
int pr(char elem)
{
switch (elem)
 { 
 case '#':   return 0; 
 case '(':   return 1;
 case '+':  case '-':   return 2;
 case '*':  case '/':   return 3;
 case '^': return 4;
 }
 }

int main(){
    ios_base::sync_with_stdio(false);cin.tie(0);
    string infix,postfix;
    char ch;
    ll t;
    cin>>t;
    while(t--){
    cin>>infix;
    postfix="";
    stack<char>s;
	s.push('#');
    
    int i=0;
 	while ((ch = infix[i++]) != '\0')
	 {  
	 	if (ch == '(')
		 s.push(ch);
		 else if (isalnum(ch))
	          postfix+=ch;
         else if (ch == ')')
              {    
              	while (s.top()!= '(')
 		   			{ 
	 		   			postfix+=s.top();
	 		   			s.pop();
 		   			}
   	           
                   s.pop();
              }
         else{
                  while (pr(s.top()) >= pr(ch))
                   {
	                   	postfix+=s.top();
	                   	s.pop();
                   }

                   
                   s.push(ch);
             }
 	}
 while (s.top()!= '#')
 	{
 		postfix+=s.top();
 		s.pop();
 	}

  	cout<<postfix<<"\n";
    }
return 0;
}