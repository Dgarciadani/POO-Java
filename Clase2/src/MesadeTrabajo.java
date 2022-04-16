import java.util.Scanner;

public class MesadeTrabajo {
    private static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }
//METODO 1
    public static void esPrimo(int n) {
        int acumulador = 0;
        for (int i = 2; i <= n; i++) {
            boolean resultado = esDivisible(n, i);
            if (resultado) {
                acumulador++;
            }
        }
        if (acumulador == 1) {
            System.out.println("El numero ingresado es primo");

        } else {
            System.out.println("El numero ingresado NO es primo");
        }
    }
//METODO 2
    public static boolean esPrimA(int n) {
        boolean serPrimo = false;
        for (int i = 2; i < n; i++) {
            if (esDivisible(n, i)) {
                serPrimo = false;
                break;
            } else {
                serPrimo = true;
            }

        }
        return serPrimo;
    }

    public static void main(String[] args) {
        int ingreso;
        boolean x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero a probar");
        ingreso = scanner.nextInt();
        x = esPrimA(ingreso);
        System.out.println(x);
    }
}

