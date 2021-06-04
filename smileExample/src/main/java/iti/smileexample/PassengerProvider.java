package iti.smileexample;

import org.apache.commons.csv.CSVFormat;
import smile.data.DataFrame;
import smile.io.Read;

import java.io.IOException;
import java.net.URISyntaxException;


public class PassengerProvider {
    private String path;

    public PassengerProvider(String path) {
        this.path = path;
    }
    
    public DataFrame readCSV() throws IOException, URISyntaxException{
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        DataFrame df = Read.csv (path, format);
        df = df.select ("Name", "Pclass", "Age", "Sex", "Survived");
        
        return df;
    }
    
    
}
