import java.util.Scanner;
public class Quiz {
        public static void main(String[] args) {
            Scanner leer = new  Scanner (System.in);
            System.out.println("Ingrese un numero para saber si es un numero perfecto");
            int numero = leer.nextInt();
            int suma = 0;
           
        for (int i = 1; i < numero; i++) { 
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }

        System.out.print("Ingrese el inicio del rango: ");
        int inicio = leer.nextInt();
        System.out.print("Ingrese el fin del rango: ");
        int fin = leer.nextInt();

        
        for (int i = inicio; i <= fin; i++) {
            int sumaDivisores = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) sumaDivisores += j;
            }
            if (sumaDivisores == i) {
                System.out.println(i);
            }
            System.out.println("Números perfectos en el rango [" + inicio + ", " + fin + "]:");
            leer.close();
        }
    }
}
