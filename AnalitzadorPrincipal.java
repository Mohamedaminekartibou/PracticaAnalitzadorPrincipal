
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

public class AnalitzadorPrincipal {

    public static void main(String[] args) throws Exception {

        String classpath = System.getProperty("java.class.path");
  
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "FiltreLog");

        Process fill = pb.start();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fill.getOutputStream())); 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(fill.getInputStream()));        
        
    }
    
}
