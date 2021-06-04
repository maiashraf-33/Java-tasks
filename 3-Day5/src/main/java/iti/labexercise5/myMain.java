package iti.labexercise5;

import java.io.IOException;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;


public class myMain {
    
    public static void main(String[] args) throws IOException {

        tableProcesses t = new tableProcesses("src\\main\\resources\\data\\titanic.csv");
        
        System.out.println("--------------Represent the data as Data Frame from joinery -------------");
        DataFrame<Object> df = t.getDataFrame();
        System.out.println(df);
        System.out.println("-------------------Summary of the Data Frame-----------------------");
//        System.out.println(df.types());
        DataFrame<Object> summ = t.dataExp_usingJoinery();
        System.out.println(summ);
        System.out.println("---------------Rapresent the data as Table from tablesaw---------------");
        Table tt = t.getTable();
        System.out.println(tt);
        System.out.println("-----------------------Statistics on Table-----------------------------");
        Table summary = t.dataExp_usingTablesaw();
        System.out.println(summary);
        
//-------------------------Create & Join data fram using joinery--------------------------------
DataFrame<Object> df1 = DataFrame.readCsv("src\\main\\resources\\data\\df1.csv");
DataFrame<Object> df2 = DataFrame.readCsv("src\\main\\resources\\data\\df2.csv");

DataFrame<Object> newdf = df1.join(df2);
System.out.println(newdf);

//-------------------------Create & Join data fram using tablesaw-------------------------------
Table t1 = Table.read().csv("src\\main\\resources\\data\\df1.csv");
Table t2 = Table.read().csv("src\\main\\resources\\data\\df1.csv");

int [] at1 = {12,13,14,15,12,13,14,15};
DoubleColumn col = DoubleColumn.create("Street", at1);
t1.addColumns(col);
System.out.println(t1);

    }   
    
}
