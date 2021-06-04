package lab_exercise2_betterstring;

import java.util.function.BiPredicate;


public class Lab_Exercise2_betterString {

  
    public static void main(String[] args) {
        String s1 = "Hello here is maii";
        String s2 = "I'm mai";
        
//        String  myBetterString1 =betterString(s1, s2, (str1, str2)-> str1.length() %2 == 0 ? true:false);

        
        String  myBetterString =betterString(s1, s2, (str1, str2)-> str1.length() %2 == 0 ? true:false);
        System.out.println(myBetterString);
        
        
        
    }
    
    public static String betterString(String str1, String str2, BiPredicate<String, String> pp ){
       if(pp.test(str1, str2))
           return str1;
       else
           return str2;
    }
    
}

