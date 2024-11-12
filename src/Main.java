import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AlcanceH prueba1 = new AlcanceH();

        System.out.println("Ingrese la velocidad inicial del objeto: ");
        double velocidadInicial = scanner.nextDouble();
        System.out.println("Ingrese el angulo del objeto: ");
        double angulo = scanner.nextDouble();

        System.out.println(prueba1.VelocidadInicialX(velocidadInicial, angulo));
        System.out.println(prueba1.VelocidadInicialY(velocidadInicial, angulo));
        System.out.println(prueba1.TiempoDeVuelo());
        System.out.println(prueba1.AlcanceHorizontal());


    }
}