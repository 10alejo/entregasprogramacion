package tareaexcepciones;

import java.util.Scanner;



public class Test {
    static String tpalabros[] = {"caca", "culo", "pedo", "pis"};

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        
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
        } while (!fin);

        sc.close();
    }

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
