
public class AnalitzadorPrincipal {

    public static void main(String[] args) throws Exception {

        String classpath = System.getProperty("java.class.path");
  
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "FiltreLog");


        
    }
    
}
