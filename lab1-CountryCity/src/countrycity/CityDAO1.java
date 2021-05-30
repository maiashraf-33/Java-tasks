package countrycity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author ht
 */
public class CityDAO1 {
    ArrayList<CityInfo1> CityInfo;
    ArrayList<String> lines;
    
    public CityDAO1(String file)  throws FileNotFoundException, IOException{
           this.CityInfo = new ArrayList<>();
           File f = new File(file);
           lines = (ArrayList<String>)Files.readAllLines(f.toPath());
           
           ///////////////
    }
    public ArrayList<CityInfo1> process(){
        for(int i=1; i<lines.size(); i++){
              String [] row = lines.get(i).split(",");
              for(int j=0; j<row.length; j++){
                  if(!"".equals(row[j]))
                      row[j] = row[j].trim();
                  else
                      row[j] = "0";
              }
            CityInfo1 CI = new CityInfo1(row[0], row[1], row[2], row[3], parseLong(row[4]), parseLong(row[5]));    
//            System.out.println(CI);
            CityInfo.add(CI);
           }
    return CityInfo;
    }
}
