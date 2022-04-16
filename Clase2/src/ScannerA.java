import java.util.Scanner;
public class ScannerA {

    public static void main(String[] args) {
        Scanner scanner;
        scanner= new Scanner(System.in);
        int num1;
        int num2;
        float coeficiente;
        String nombre;
        char inicial;
        System.out.println("Ingrese el primero numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=scanner.nextInt();
        System.out.println("Ingrese el coeficiente");
        coeficiente=scanner.nextFloat();
        System.out.println("Ingrese el nombre");
        nombre=scanner.nextLine();
        //inicial=nombre.charAt(0);
        System.out.println("Los datos ingresado fueron"+
                nombre+
                num1+
                num2+
                coeficiente);



    }
}
