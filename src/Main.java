import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i > 5;i++){
            if (i == 4){
                System.out.println(i);
                i =+ 1;
            } else if (i==2) {
                System.out.println("hola");

            }
            else {
                System.out.println(1+2*4/6);
            }

            int[] numeros = new int[10];

            for (int a = 0;a<numeros.length-1;a++){
                numeros[a] = a;
            }
            System.out.println(Arrays.toString(numeros));
        }

        }
    }
