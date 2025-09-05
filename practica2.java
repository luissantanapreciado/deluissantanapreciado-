package practica2yavatpoA;
import java.util.Scanner;

public class practica2 {
	    
	    public static void main(String[] args) {
	        
	        Scanner captura = new Scanner(System.in);
	        double x1, y1, x2, y2, x3, y3, AB, BC, CA;
	        
	        System.out.println("Ingrese las coordenadas x, y del punto A: ");
	        System.out.print("x1: ");
	        x1 = captura.nextDouble();
	        System.out.print("y1: ");
	        y1 = captura.nextDouble();
	        
	        System.out.println("Ingrese las coordenadas x, y del punto B: ");
	        System.out.print("x2: ");
	        x2 = captura.nextDouble();
	        System.out.print("y2: ");
	        y2 = captura.nextDouble();
	        
	        System.out.println("Ingrese las coordenadas x, y del punto C: ");
	        System.out.print("x3: ");
	        x3 = captura.nextDouble();
	        System.out.print("y3: ");
	        y3 = captura.nextDouble();
	        
	        AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	        BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));        
	        CA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
	        
	        System.out.println("Lado AB: " + AB);
	        System.out.println("Lado BC: " + BC);
	        System.out.println("Lado CA: " + CA);
	        
	        if (AB == BC && BC == CA) {
	            System.out.println("Tu triangulo es: Equilatero");
	        } else if (AB == BC || BC == CA || CA == AB) {
	            System.out.println("Tu triangulo es: Isosceles");
	        } else {
	            System.out.println("Tu triangulo es: Escaleno");
	        }
	        
	    }
	}
}
