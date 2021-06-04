package iti.my_xchart;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;


public class xchartOperations {
    private String path;

    public xchartOperations(String path) {
        this.path = path;
    }
    
    public ArrayList<titanicPassenger> getData() throws FileNotFoundException, IOException{
        ArrayList<titanicPassenger> passengers = new ArrayList<>();
        InputStream file = new FileInputStream(path);
        ObjectMapper mapper = new ObjectMapper();
        
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        passengers = mapper.readValue(file,new TypeReference<List<titanicPassenger>> () {});
        
        return passengers;

    }
    
    public void classPieChart(ArrayList<titanicPassenger> passengers){
        Map<String, Long> classes= passengers.stream().collect(Collectors.groupingBy(titanicPassenger::getPclass, Collectors.counting()));
        
        PieChart chart = new PieChartBuilder().width(500).height(500).title("Class Counting").build();
        
        Color [] color = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
        chart.getStyler().setSeriesColors(color);
        chart.addSeries("Class 1", classes.get("1"));
        chart.addSeries("Class 2", classes.get("2"));
        chart.addSeries("Class 3", classes.get("3"));
        
        new SwingWrapper(chart).displayChart();
    }
    
    public void agesBarChart(ArrayList<titanicPassenger> passengers){
        List<Float> ages = passengers.stream().map(titanicPassenger::getAge).limit(10).collect(Collectors.toList());
        List<String> names = passengers.stream().map(titanicPassenger::getName).limit(10).collect(Collectors.toList());
//        Float [] age = new Float[ages.size()];
//        String [] name = new String[ages.size()];
//        age = ages.toArray(age);
//        name = names.toArray(name);
        
        CategoryChart chart = new CategoryChartBuilder().width(500).height(500).title("Ages vs names").build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setStacked(true);
        
        chart.addSeries("Ages & Names", names, ages);
        new SwingWrapper(chart).displayChart();
        
        
    
    }
}
