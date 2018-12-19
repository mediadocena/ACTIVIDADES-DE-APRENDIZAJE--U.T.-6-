package Actividad_4;

import Utiles.Salieri;

public class Secuencia {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		int par = 0;
		int impar=0;
		
		System.out.println("Introduzca 20 números:");
		int [] []arrayA = new int[4][5];
		for (int i = 3; i >= 0; i--) {
			for ( int j = 4; j >=0; j--) {
			arrayA[i][j] = ex.controlaentero();
			if(arrayA[i][j] %2==0) {
				par= arrayA[i][j]+par;
			}else if(arrayA[i][j]%2!=0) {
				if(arrayA[i][j]>impar) {
					impar = arrayA[i][j];
				}
			}
		}
	
	}
		System.out.println("Suma de los pares:"+par+" "+"Mayor de los impares:"+" "+impar);
	
			
	
 
	}

}
