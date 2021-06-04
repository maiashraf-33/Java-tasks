
package pyramidsstatistics;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 *
 * @author ht
 */
public class PyramidsStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        pyramidsDAO pd = new pyramidsDAO("src\\pyramidsStatistics\\pyramids.csv");
        
//      to show all objects of pyramid
        pd.getAllInfo();
        
//      get the average
        pd.avg();
//      get all quartiles
        System.out.println(pd.median());
       
    
    
}
}