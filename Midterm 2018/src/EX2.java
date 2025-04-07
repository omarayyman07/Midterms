public class EX2 {
    public static int getNumber(char c){
    switch(c){
        case 'A':
        case 'B':
        case 'C':
            return 2;
        case 'D':
        case 'E':
        case 'F':
            return 3;
        case 'G':
        case 'H':
        case 'I':
            return 4;
        case 'J':
        case 'K':
        case 'L':
            return 5;
        case 'M':
        case 'N':
        case 'O':
            return 6;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
            return 7;
        case 'T':
        case 'U':
        case 'V':
            return 8;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            return 9;
        case '+':
            return 0;
        default: return c;
    }
}
public static String translate(String s ){
        String nstring="";
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '-':
                    nstring+=s.charAt(i);break;
                default:
                    nstring+=getNumber(Character.toUpperCase(s.charAt(i)));break;            }




        }
return nstring;
}
public static void main(String[] args){
        System.out.println(translate("Hello-123"));
}}
