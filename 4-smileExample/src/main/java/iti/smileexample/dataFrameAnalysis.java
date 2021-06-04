package iti.smileexample;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.commons.csv.CSVFormat;
import smile.classification.RandomForest;
import smile.data.DataFrame;
import smile.data.formula.Formula;
import smile.data.measure.NominalScale;
import smile.data.vector.IntVector;
import smile.io.Read;


public class dataFrameAnalysis {
    
    private String path;

    public dataFrameAnalysis() {
        
    }
    
    public DataFrame loadTrainData(String path) throws IOException, URISyntaxException{
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        DataFrame df = Read.csv (path, format);
        df = df.select ("Name", "Pclass", "Age", "Sex", "Survived");
        
        return df;
    }
    
    public DataFrame loadTestData(String path) throws IOException, URISyntaxException{
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        DataFrame df = Read.csv (path, format);
        df = df.select ("Name", "Pclass", "Age", "Sex");
        
        return df;
    }
    
    public DataFrame encoding(DataFrame df, String col, String newColName){
        String[] values = df.stringVector (col).distinct ().toArray (new String[]{});
        int[] pclassValues = df.stringVector (col).factorize (new NominalScale (values)).toIntArray ();
        IntVector newCol = IntVector.of(newColName, pclassValues);
        
        return df.merge(newCol).drop(col);
   }
    public RandomForest train(DataFrame df, String lable){
        RandomForest model = RandomForest.fit(Formula.lhs(lable), df);
        System.out.println("Important Features");
        System.out.println(Arrays.toString(model.importance()));
        System.out.println("Confusion Matrix");
        System.out.println(model.metrics ());
        return model;
    }
    public void test(DataFrame df, RandomForest model){
        int [][] modelTest = model.test(df);
        for(int i=0; i<modelTest.length; i++){
            System.out.println(modelTest[i]);
//            System.out.println(model.predict(df));
            
        }
    }
    
}
