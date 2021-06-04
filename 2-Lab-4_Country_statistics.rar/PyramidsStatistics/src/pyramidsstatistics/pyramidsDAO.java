package pyramidsstatistics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;


public class pyramidsDAO {
    ArrayList<pyramidsInfo> pyramidinfo;
    
    public pyramidsDAO(String f) throws IOException{
        pyramidinfo = new ArrayList<>();
        
        File file = new File(f);
        ArrayList<String> lines;
        lines = (ArrayList<String>)Files.readAllLines(file.toPath());
        
        lines.remove(0);
        
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
            pyramidsInfo pi = new pyramidsInfo(row[0], row[2], row[4], Double.parseDouble(row[7]));
            pyramidinfo.add(pi);
       }
     }
    public ArrayList<pyramidsInfo> getAllInfo(){
        return pyramidinfo;
    }
// -------------------Compute average Function----------------------
    
     public Double avg(){     
//        List<Double> l = (List<Double>) getAllHeights(pyramidinfo, s -> s.getHeight());
          Double d = pyramidinfo.stream().mapToDouble(w -> w.getHeight()).filter(s -> s!=0.0).average().getAsDouble();
          System.out.println(d);
          return d;
    }
    

//----------------------quartiles-------------------
    public String median(){
        
//        double [] ds = pyramidinfo.stream().mapToDouble(pyramidsInfo::getHeight).sorted().toArray();
        double [] ds = pyramidinfo.stream().mapToDouble(pyramidsInfo::getHeight).sorted().filter(s -> s!=0.0).toArray();
        for(double i : ds){
        System.out.println(i);
        }
        int floored = (int) (ds.length/2);
        Double q2;
        if(ds.length %2 == 0){
             q2 = (ds[floored] + ds[floored-1])/2;
        }
        else{
            q2 = ds[floored];   
        }
        Double q1 = ds[(int)(0.25*ds.length)];
        Double q3 = ds[(int)(0.75*ds.length)];        
        return "Q1: "+q1+" Q2: "+q2+" Q3: "+q3+" IQR: "+(q3-q1);
    }
    
    
}
