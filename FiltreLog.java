import java.io.*;

public class FiltreLog {

    public static void main(String[] args) throws Exception {
            
        BufferedReader br = new BufferedReader(new FileReader("System.in"));

        String linea;

        linea = br.readLine();

        int comptError = 0;

        while (linea != null) {
            if (linea.contains("ERROR")) {
                comptError++;
            }
          
        }
        
        System.out.println("Número d'errors: " + comptError);

            
    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    
}
