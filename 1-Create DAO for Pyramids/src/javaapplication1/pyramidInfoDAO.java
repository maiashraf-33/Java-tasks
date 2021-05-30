package javaapplication1;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;

public class pyramidInfoDAO {
    
    ArrayList<pyramidInfo> pyramidInfo;
    
    public pyramidInfoDAO(String file) throws FileNotFoundException, IOException{
        
        this.pyramidInfo = new ArrayList<pyramidInfo>();
        File pyramidFile = new File(file);
        ArrayList<String> lines = new ArrayList<String>();
        lines = (ArrayList<String>) Files.readAllLines(pyramidFile.toPath());
        
//        FileReader fr = new FileReader(pyramidFile);
//        BufferedReader br = new BufferedReader(fr);
//        String line;  
//        while((line = br.readLine()) != null){
//            System.out.println(line);
//        }
//        
        for(int i=0; i< lines.size(); i++){
            String line = lines.get(i);
            String [] row = line.split(",");
            for(int j = 0 ; j< row.length; j++){
                if(!"".equals(row[j])){
                    row[j] = row[j].trim();
                }
                else{
                    row[j] = "0";
                }
               
            }
            pyramidInfo pinfo; 
            pinfo = new pyramidInfo(row[0], row[2], row[4], row[7]);
            pyramidInfo.add(pinfo);
        }
    
    }
    public void pyramidData(){
        for(int row=0; row<pyramidInfo.size(); row++){
            pyramidInfo datapoint = pyramidInfo.get(row);
            System.out.print(datapoint.getPharaoh());
            System.out.print(datapoint.getmodernName());
            System.out.print(datapoint.getSite());
            System.out.println(datapoint.getHeight());
        }
    }
    
//        int i = 0; i<pyramidInfo.size(); i++   
}
