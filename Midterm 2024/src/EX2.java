import java.util.*;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day,month and year respectively");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        switch(month){
            case 4:
                if(day>=30){
                    day=1;
                    month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                System.out.println(day+"/"+month+"/"+year);break;
            case 6:
                if(day>=30){
                    day=1;
                    month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                day+=1;
                System.out.println(day+"/"+month+"/"+year);break;
            case 9:
                if(day>=30){
                    day=1;
                    month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                System.out.println(day+"/"+month+"/"+year);break;
            case 11:
                if(day>=30){
                    day=1;
                    month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                System.out.println(day+"/"+month+"/"+year);break;
            case 2:
                if(day>=28){
                    day=1;
                    month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                System.out.println(day+"/"+month+"/"+year);break;
            default:
                if(day>=30){
                day=1;
                month+=1;
                }else{
                    day+=1;
                }
                if(month>=12){
                    month=1;
                    year+=1;}
                ;
                System.out.println(day+"/"+month+"/"+year);break;
        }












































































    }}
