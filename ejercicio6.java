  import java.util.Scanner;

public class ejercicio6{
    public static void main(String[] args) {
        double s, n, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la longitud de uno de los lados del poligono en metros: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextDouble();
        
        System.out.print("Digite la cantidad de lados del poligono: ");
        n = teclado.nextDouble();
        
        resultado = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/n));
        System.out.print("El área del poligono regular es: " +  String.format("%.2f", resultado) + " metros cuadrados");
        
    }
}