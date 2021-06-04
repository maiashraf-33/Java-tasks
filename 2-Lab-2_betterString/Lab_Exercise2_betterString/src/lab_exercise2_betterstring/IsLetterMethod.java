package lab_exercise2_betterstring;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//import java.util.function.Supplier;


public class IsLetterMethod {
  
    public static void main(String [] args){
       String str = "Hello2 frommain";
       boolean bool = check(str, (s) -> IsLetterMethod.isnumber(s));
       System.out.println(bool);
   }
   
    public static boolean check(String s, Predicate<String> p){
       return (p.test(s));}
        
    public static boolean isnumber(String s){
      s = s.replaceAll("\\s+","");
      for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i)) == false){
                return false;}
        }
        return true; 
    }
}


