import java.util.Scanner;
public class Captura {
    public static String capturarString(String captura){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n"+ captura + ": ");
        return (scan.next());
    }
    public static int capturarEntero(String captura){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n"+ captura + ": ");
        return (scan.nextInt());
    }
    public static float capturarFloat(String captura){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n"+ captura + ": ");
        return (scan.nextFloat());
    }
}