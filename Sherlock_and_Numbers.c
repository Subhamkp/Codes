#include <stdio.h>
     
    int main()
    {
        long int n,k,p,i;
        int t;
        scanf("%d",&t);
           while(t--){
               scanf("%ld %ld %ld",&n,&k,&p);
               long int ar[100010];
               for(i=0;i<k;i++) scanf("%ld",&ar[i]);
               if(n-k >= p){
                   for(i=0;i<k;i++){
                       if(ar[i] <= p) p+=1;
                       else break;
                   }
                   printf("%ld\n",p);
               }
               else printf("-1\n");
           }
        return 0;
    }