package model;

import java.util.Random;
import java.util.Scanner;

			
//GENERAR UN NUMERO ALEATORIO ENTRE 0 Y 100, DESPUES PREGUNTAR AL USUARIO QUE INTENTE ACERTAR CUAL ES
			// CUANDO LO ACIERTE MOSTRAR EL NUMERO DE INTENTOS QUE SE DEMORO EN HACERLO

			//SECOND VERSION COMMIT TEST

public class NumeroAleatorio {

	public static void main(String[] args) {				
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100);
		int numeroEscogido = 0;
		int i = 0;
		
		while(numeroAleatorio != numeroEscogido) {
			
			System.out.println("Escoge un numero entre 0 y 100");
			System.out.println("Si le atinas te diremos cuantos intentos de tomo hacerlo");
			System.out.println(numeroAleatorio);
			numeroEscogido = sc.nextInt();
			
			
			
			if(numeroEscogido==numeroAleatorio) {
				System.out.println("¡FELICIDADES LE ATINASTE AL NUMERO! "+numeroAleatorio);
				System.out.println("te tomo "+i+" intentos");
			}
			
			else if(numeroEscogido<0) {
				System.out.println("Digita un numero mayor a 0");
			}
			else if(numeroEscogido>100) {
				System.out.println("Digita un numero menor a 100");
			}
			else {
				i+=1;
				System.out.println("Sigue intentando, llevas "+i+" intentos");
			}
		
			
		}

	}

}
