import java.util.*;
public class EX4 {
    public static int findMax(int n){
        int product=1;
        int temp2=0;
        int sum=0;
        int i=0;
        int max=0;
        if(n<=0){
           return -1;}
       else{
         int temp=n;
         while (n>0){
             temp=n%10;
             if (!(i==0)){
                 product=temp*temp2;
                 sum=temp+temp2;
             }
             if(product>max){
                 max=product;
             }
             if(sum>max){
                 sum=max;
             }
             temp2=temp;
             n/=10;
             i++;


         }return max;






       }

    }
    public static void main(String[] args){
        System.out.println(findMax(891));
    }
}
