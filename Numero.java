import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numero {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int reverse = 0;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(bufEntrada.readLine());

        while (numero != 0) {
            reverse = reverse * 10;
            reverse = reverse + numero % 10;
            numero = numero / 10;
        }
        System.out.println("El numero al reves es: " + reverse);
    }

}
