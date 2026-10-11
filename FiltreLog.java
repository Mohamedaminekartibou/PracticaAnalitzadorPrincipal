import java.io.*;



public class FiltreLog {

    public static void main(String[] args) throws Exception {
            
        BufferedReader br = new BufferedReader(new FileReader("System.in"));

        String linea;

        linea = br.readLine();


        boolean textBuit = true;

        int comptError = 0;

        while (linea != null) {
            if (linea.contains("ERROR")) {
                comptError++;
            }
          
        }
        

        if (textBuit) {
            System.err.println("Error: Text buit");
            System.exit(1);
        }




        System.out.println("Número d'errors: " + comptError);

            
   
    }

    
}
