package javaapplication1;

public class pyramidInfo {
    public String pharaoh;
    public String modernName;
    public String site;
    public String height;
    
    public pyramidInfo(String pharaoh, String Modern_name, String site, String height){
        this.pharaoh = pharaoh;
        this.modernName = Modern_name;
        this.site = site;
        this.height = height;
    }
    
    public void setPharaoh(String pharaoh){
        this.pharaoh = pharaoh;
    }
    public String getPharaoh(){
        return this.pharaoh;
    }
    public void setmodernName(String modernName){
       this.modernName = modernName;
    }
    public String getmodernName(){
        return this.modernName;
    }
    public void setSite(String site){
        this.site = site;
    }
    public String getSite(){
        return this.site;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getHeight(){
        return this.height;
    }
}
