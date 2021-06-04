package iti.smileexample;

import java.io.IOException;
import java.net.URISyntaxException;
import smile.classification.RandomForest;
import smile.data.DataFrame;
import smile.data.formula.Formula;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
      dataFrameAnalysis obj = new dataFrameAnalysis();
      DataFrame trainDF = obj.loadTrainData("src/main/resources/data/titanic_train.csv");
      System.out.println(trainDF);
      DataFrame newDF = obj.encoding(trainDF, "Pclass", "Class");
      System.out.println(newDF);
      newDF = obj.encoding(newDF, "Sex", "Gender");
      System.out.println(newDF);
      newDF = newDF.drop("Name");
      newDF = newDF.omitNullRows();
      System.out.println(newDF);
      // fit model with showing Important Features and Matrix
      RandomForest myModel = obj.train(newDF, "Survived");
      // testing the model 
      
      DataFrame testDF = obj.loadTestData("src/main/resources/data/titanic_test.csv");
      testDF = obj.encoding(trainDF, "Pclass", "Class");
      testDF = obj.encoding(testDF, "Sex", "Gender");
      testDF = testDF.drop("Name").omitNullRows().drop("Survived");
      
     
      obj.test(testDF, myModel);
    }   
}
