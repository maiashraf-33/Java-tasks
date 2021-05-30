package countrycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class CountryCityMapping {
    ArrayList<CityInfo1> listOfCities;
    String co;
    String ci;
    Map<String, ArrayList<CityInfo1>> cityMapping;
    
    public CountryCityMapping(ArrayList<CountryInfo> countryList, ArrayList<CityInfo1> cityList){
        
        cityMapping = new HashMap<>();
        
        for(CountryInfo country: countryList){
            listOfCities = new ArrayList<>();
            co = country.getCountryCode();
            for(CityInfo1 city: cityList){
                ci = city.getCountryCode();
                if(co.equals(ci)){
                    listOfCities.add(city);
                }
                cityMapping.put(co, listOfCities);
            }
         
        }
//        System.out.println(cityMapping.get(co));
    }
    
    public void/*ArrayList<CityInfo1>*/ getList(String key){
        
        for(CityInfo1 i:cityMapping.get(key)){
            System.out.println(i);
        }
    }
    
    public Long maxPopulation(String key ){
        
        ArrayList<Long> population = new ArrayList<>();
        for(CityInfo1 i:cityMapping.get(key)){
              population.add(i.getPopulation());
        }
        return Collections.max(population);
    }
}
