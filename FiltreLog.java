import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

public class FiltreLog {

    public static void main(String[] args) throws Exception {
            
        BufferedReader br = new BufferedReader(new FileReader("System.in"));

        String linea;

        linea = br.readLine();

        int comptError = 0;

        if (linea.contains("ERROR")) {
            comptError++;
        }


            
    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    
}
