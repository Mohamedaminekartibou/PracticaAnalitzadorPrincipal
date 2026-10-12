import java.io.*;



public class FiltreLog {

    public static void main(String[] args) throws Exception {
          
        
        String paraula = "ERROR";

        if (args.length > 0) {
            paraula = args[0];
        }


        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String linea;

        linea = br.readLine();
        boolean textBuit = true;
        int comptError = 0;



        while (linea != null) {
            
           if (!linea.trim().isEmpty()) {
                textBuit = false;
            }

            if (linea.contains(paraula)) {
                comptError++;
            }
        }
        

       



        if (textBuit) {
            System.err.println("Error: Text buit");
            System.exit(1);
        }

        System.out.println("Num errors: " + comptError);        
        System.exit(0);
        

            
   
    }

    
}
