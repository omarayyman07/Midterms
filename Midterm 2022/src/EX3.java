public class EX3 {
    public static String expandingWord(String n){
      String nstring="";
      String nstring2="";
        for(int i=0;i<n.length();i++){
          nstring+=n.charAt(i);
          for(int k=0;k<=i;k++){
              nstring2+=nstring;
          }
          nstring="";
      }
    return nstring2;
    }
    public static void main(String[] args){
       System.out.println(expandingWord("Hello World"));
    }
}
