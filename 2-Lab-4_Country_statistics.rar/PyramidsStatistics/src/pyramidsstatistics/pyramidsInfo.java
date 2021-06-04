/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsstatistics;

/**
 *
 * @author ht
 */
public class pyramidsInfo {
    public String pharaoh;
    public String modernName;
    public String site;
    public double height;
    
    public pyramidsInfo(String pharaoh, String Modern_name, String site, double height){
        this.pharaoh = pharaoh;
        this.modernName = Modern_name;
        this.site = site;
        this.height = height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getModernName() {
        return modernName;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "pyramidsInfo{" + "pharaoh=" + pharaoh + ", modernName=" + modernName + ", site=" + site + ", height=" + height + '}'+"\n";
    }
    
    
    
}
