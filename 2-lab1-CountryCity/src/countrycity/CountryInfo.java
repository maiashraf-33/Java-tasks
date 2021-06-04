package countrycity;


public class CountryInfo {
    public String countryCode;
    public String countryName;

    public CountryInfo(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country Code=" + countryCode + ", Country Name=" + countryName;
    }
    
    
}
