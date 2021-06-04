package countrycity;

public class CityInfo1 {
    private String id;
    private String countryCode;
    private String name;
    private String continent;
    private long SurfaceArea;
    private long population;

    public CityInfo1(String id, String countryCode, String name, String continent, long SurfaceArea, long population) {
        this.id = id;
        this.countryCode = countryCode;
        this.name = name;
        this.continent = continent;
        this.SurfaceArea = SurfaceArea;
        this.population = population;
    }

 

    public String getId() {
        return this.id;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getName() {
        return this.name;
    }

    public String getContinent() {
        return this.continent;
    }

    public long getSurfaceArea() {
        return this.SurfaceArea;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(long SurfaceArea) {
        this.SurfaceArea = SurfaceArea;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "ID: "+this.id+", Country Code: "+this.countryCode+", Name: "+this.name+", continent: "+this.continent+", Surface Area: "+this.SurfaceArea+", population: "+this.population; 
    }
}
