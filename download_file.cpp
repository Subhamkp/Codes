#include <bits/stdc++.h>
#define max 1000010
using namespace std;
int ar[max]={0};
int ds=0,de=0,sum =0,min_len =max;

void fun(int s){
    int temp =0,curr_sum =0,start=0,end=0;
    
    while(end < max){
        while(curr_sum < s && end < max){
            curr_sum += ar[end];
            end++;

        }
        while(curr_sum >= s && start < max){
            temp = end-start;
            if(temp < min_len){
                min_len= temp;
                sum = curr_sum;
                ds = start;
                de = end;
            }
            else if(temp == min_len && curr_sum > sum){
                ds = start;
                de = end;
                sum = curr_sum;
            }
            curr_sum -= ar[start];
            start++;
        }
    }
 }
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
    int n,s,t,speed,pre=0;
    cin>>n>>s;
    for(int i=0;i<n;i++){
        cin>>t>>speed;
        
        ar[t]+=speed;
        ar[t]-=pre;
        pre = speed;
    }
    for(int i=1;i<max;i++) ar[i]+=ar[i-1];
    
    fun(s);
    int num1 = (ar[ds]-sum+s)+(min_len-1)*ar[ds];
    int num2 = (ar[de-1]-sum+s)+(min_len-1)*ar[de-1];

    cout<<ds<<" "<<de<<" "<<sum<<" "<<min_len<<endl;
    
    if((double)num1/ar[ds] < (double)num2/ar[de-1]){
        int g = __gcd(num1,ar[ds]);
        cout<<num1/g<<"/"<<ar[ds]/g;
    }
    else{
        int g = __gcd(num2,ar[de-1]);
        cout<<num2/g<<"/"<<ar[de-1]/g;
    }
    return 0;
}