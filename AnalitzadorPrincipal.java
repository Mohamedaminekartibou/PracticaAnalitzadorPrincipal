
import java.io.*;

public class AnalitzadorPrincipal {

    public static void main(String[] args) throws Exception {

        String classpath = System.getProperty("java.class.path");

        String text = "INFO Inici\n"
        + "ERROR Fallada 1\n"
        + "WARNING Disc ple\n"
        + "ERROR Fallada 2\n"
        + "WARNING Temperatura\n"
        + "ERROR Fallada 3\n"
        + "WARNING Memoria\n";

  
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
        
        
        outError.write(text);
        outError.flush();
        outError.close();

        outWarning.write(text);
        outWarning.flush();
        outWarning.close();






       BufferedReader inError = new BufferedReader(
                new InputStreamReader(pError.getInputStream()));

        BufferedReader inWarning = new BufferedReader(
                new InputStreamReader(pWarning.getInputStream()));
        
    }
    
}
