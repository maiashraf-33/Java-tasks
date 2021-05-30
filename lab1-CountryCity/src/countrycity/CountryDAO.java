package countrycity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;


public class CountryDAO {
    ArrayList<CountryInfo> CountryInfo;
    ArrayList<String> lines;
    private final ArrayList<CityInfo1> CityList;
            
            
    public CountryDAO(String file, ArrayList<CityInfo1> CityList) throws FileNotFoundException ,IOException{
        this.CityList = CityList;
        this.CountryInfo = new ArrayList<>();
        File f = new File(file);
        lines = (ArrayList<String>) Files.readAllLines(f.toPath());
    }
    
    
    public ArrayList<CountryInfo> prossesCountry(){
        for(int j=1; j<lines.size(); j++){
            String [] row = lines.get(j).split(",");
            for(int i=0; i<row.length; i++){
               if(!"".equals(row[i]))
                   row[i] = row[i].trim();
               else
                   row[i] = "0";
            }
            CountryInfo ci = new CountryInfo(row[0],row[1]);
            CountryInfo.add(ci);
        }
        return CountryInfo;
        }
    
    public ArrayList<CityInfo1> listAllCities(){
        return CityList;
    }
    
    }