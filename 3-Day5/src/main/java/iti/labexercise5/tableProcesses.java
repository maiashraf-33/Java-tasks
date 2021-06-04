package iti.labexercise5;

import java.io.IOException;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.Table;


public class tableProcesses {
    
    String path;
    
    public tableProcesses(String p){
        this.path = p;
    }
    
    public DataFrame<Object> getDataFrame() throws IOException{
        DataFrame<Object> df = DataFrame.readCsv(this.path);
        return df;
    }
    
    public Table getTable() throws IOException{
        Table t = Table.read().csv(this.path);
        return t;
   }
    
    public DataFrame<Object> dataExp_usingJoinery() throws IOException{
        DataFrame<Object> dfo = this.getDataFrame();
        return dfo.describe();
//        return dfo.retain(e, e1, e3).describe();
        
    }
    
    public Table  dataExp_usingTablesaw()throws IOException{
            Table t = this.getTable();
            return t.summary();
    }
    
    
}
