
import java.io.*;

public class AnalitzadorPrincipal {

    public static void main(String[] args) throws Exception {

        String classpath = System.getProperty("java.class.path");
  
        ProcessBuilder pbError = new ProcessBuilder(
                "java", "-cp", classpath, "FiltreLog", "ERROR");

        ProcessBuilder pbWarning = new ProcessBuilder(
                "java", "-cp", classpath, "FiltreLog", "WARNING");

        pbError.redirectError(new File("errors_filtre.log"));

        Process pError = pbError.start();
        Process pWarning = pbWarning.start();

        
        
       BufferedWriter outError = new BufferedWriter(
                new OutputStreamWriter(pError.getOutputStream()));

        BufferedWriter outWarning = new BufferedWriter(
                new OutputStreamWriter(pWarning.getOutputStream()));
        
        







       BufferedReader inError = new BufferedReader(
                new InputStreamReader(pError.getInputStream()));

        BufferedReader inWarning = new BufferedReader(
                new InputStreamReader(pWarning.getInputStream()));
        
    }
    
}
