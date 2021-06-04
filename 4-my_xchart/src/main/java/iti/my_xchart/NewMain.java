
package iti.my_xchart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class NewMain {

  
    public static void main(String[] args) throws IOException {
        xchartOperations obj = new xchartOperations("src\\main\\resources\\titanic_csv.json");
        ArrayList<titanicPassenger> data = obj.getData();
        
        obj.classPieChart((ArrayList<titanicPassenger>) data);
        obj.agesBarChart(data);
        
    }
    
}
