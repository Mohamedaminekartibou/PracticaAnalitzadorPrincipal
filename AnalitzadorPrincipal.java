
import java.io.*;

public class AnalitzadorPrincipal {

    public static void main(String[] args) throws Exception {

        String classpath = System.getProperty("java.class.path");
  
        ProcessBuilder pbError = new ProcessBuilder("java", "-cp", classpath, "FiltreLog");
        pbError.redirectError(new File("errors_filtre.log"));

        Process fill = pbError.start();
        
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fill.getOutputStream())); 
        
        out.flush();
        out.close();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(fill.getInputStream())); 
        
         fill.waitFor();


        pbError.redirectError(new File("errors_filtre.log"));
        
    }
    
}
