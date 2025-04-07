import java.util.*;
public class EX2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter course name");
        String course=sc.next();
        System.out.println("Enter the no of students");
        int n=sc.nextInt();
        switch (course){
            case "Computer Science":
                System.out.println(n>35? "Can be offered": "Course will not be offered");break;
            case "Math":
                System.out.println(n>20? "Can be offered": "Course will not be offered");break;
            case "Physics":
                System.out.println(n>15? "Can be offered": "Course will not be offered");break;
            case "Data Science":
                System.out.println(n>50? "Can be offered": "Course will not be offered");break;
            default: System.out.println("Invalid course name");break;
        }
    }

}
