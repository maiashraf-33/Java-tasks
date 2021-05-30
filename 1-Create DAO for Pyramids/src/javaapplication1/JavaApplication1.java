package javaapplication1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        pyramidInfoDAO pid = new pyramidInfoDAO("F:\\ITI\\Course1_Java\\____Offline____\\Day2\\Session03_Assignments\\pyramids.csv");
        pid.pyramidData();
        
          }
    }
    

