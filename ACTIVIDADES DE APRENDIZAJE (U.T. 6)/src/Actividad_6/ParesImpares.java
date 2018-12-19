package Actividad_6;

public class ParesImpares {

	public static void main(String[] args) {
		int[] array = new int[100];
		int[] par = new int[100];
		int[] impar=new int[100];
		int contpar=0;
		int contimp=0;
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) (Math.random() *1001);
			if(array[i]%2==0) {
				par[contpar]=array[i];
				contpar++;
			}
			if(array[i]%2!=0) {
				impar[contimp]=array[i];
				contimp++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(par[i]==0) {
			
			}else {
			System.out.println("Pares:"+par[i]);
			}
			if(par[i]==0) {
				
			}else {
			System.out.println("Impares:"+impar[i]);
			}
		}
	
		

	}

}
