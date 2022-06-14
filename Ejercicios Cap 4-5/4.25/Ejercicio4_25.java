// Ejercicio 4.25
public class Ejercicio25 {
    public static void main(String[] args) {
        int cuenta = 1;

        while (cuenta <= 10) {
            System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
            ++cuenta;
        }
    }
} // fin de la clase