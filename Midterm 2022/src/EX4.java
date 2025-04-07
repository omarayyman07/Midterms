import java.util.*;
public class EX4{
public static void main(String[] args){
    System.out.println("Welcome to Wordle!");
    String pos="";
    int trials=0;
    String nstring="";
    boolean z=false;
    Random rand=new Random();
    int x=97+rand.nextInt(122-97+1);
    while (!z){
    for(int i=0;i<3;i++){
        nstring+=(char)x;
        x=97+rand.nextInt(122-97+1);
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your guess");
    String word=sc.next();
    if(word.equals("quit")){
        System.out.println("You Lost! Correct string is "+""+nstring);
        break;
    }else{
        if(!(nstring.length()==word.length())){
           System.out.println("Invalid Guess!");
        }else{
            for(int k=0;k<nstring.length();k++){
                if(word.charAt(k)==nstring.charAt(k)){
                    pos+=nstring.charAt(k);
                }else{
                    pos+=" ";
                }

        }}
        System.out.println("Correct letters in correct positions are:" + pos);
        trials++;
if (word.equals(nstring)){
    System.out.println("Success! You got it in trial(s)" + trials );
    break;
}}}






}
}
