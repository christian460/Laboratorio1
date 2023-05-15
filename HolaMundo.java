import java.util.Scanner;

public class HolaMundo{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("¡Hola Mundo!");
		System.out.println("Bienvenidos al curso");
		System.out.println("Ingrese su nombre:");
		String nom=sc.nextLine();
		System.out.println("Hola "+nom);
	}

}

