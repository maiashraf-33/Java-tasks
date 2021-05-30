package countrycity;

import java.io.IOException;
import java.util.ArrayList;


public class Main_CountryCity {

    public static void main(String[] args) throws IOException {
        
        CityDAO1 cd = new CityDAO1("src\\countrycity\\City.csv");
        ArrayList<CityInfo1> AllCities =  cd.process();
        
        
        CountryDAO cdao = new CountryDAO("src\\countrycity\\Country.csv", AllCities);
        ArrayList<CountryInfo> AllCountries = cdao.prossesCountry();
        
        
        CountryCityMapping mapp = new CountryCityMapping(AllCountries, AllCities);
        mapp.getList("22");
        System.out.println("\n");
        mapp.getList("33");
        System.out.println("\n");
        mapp.getList("11");
        
        System.out.println("\n");
        System.out.println("Maximum Population of Country "+mapp.maxPopulation("11"));
    }
    
}
