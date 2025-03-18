package ejercicioexceptiones;

/**
 * 
 * @author Alejandro Martín 
 * @version 1
 */
import java.util.Scanner;



public class Test {
    static String tpalabros[] = {"caca", "culo", "pedo", "pis"};

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        
        /**
         * Bucle de oraciones hasta que el usuario escriba . 
         * Y tambien determina si la palabra prohibida esta en la oracion
         * @param oraciones introducidas por el usuario
         */ 
        boolean fin = false;
        do {
            try {
                String mensaje = leerLineaOK(sc);
                if (mensaje.equals(".")) {
                    System.out.println("Fin de programa.");
                    fin = true;
                } else {
                    System.out.println("OK");
                }
            } catch (BurradasNOException e) {
                System.out.println(e.getMessage());
            }
        } while (fin != true);

        sc.close();
    }
    /**
     * Se encarga de sacar la exception si esta la palabra 
     * @param la exception que hemos creado
     */ 
    public static String leerLineaOK(Scanner sc) throws BurradasNOException {
        String cadena = sc.nextLine();
        for (String palabra : tpalabros) {
            if (cadena.toLowerCase().contains(palabra)) {
                throw new BurradasNOException(palabra);
            }
        }
        return cadena;
    }
}
