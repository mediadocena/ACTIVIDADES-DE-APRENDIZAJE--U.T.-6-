package Actividad_1;

public class Factoriales {
int arrayf [] = new int[20];
private int i;
private int n;

	
	Factoriales() {

	}
	
	public void buildArray() {
		System.out.println("Secuencia Inicial:");
		for (i=0;i<20;i++) {
			arrayf[i] = (int) (Math.random()*11);
			System.out.println(arrayf[i]);
		}
		
	}
	public void seeArray() {
		for(i=19;i>0;i--) {
			n = arrayf[i];
			do {
			n = n*(n-1);
			n--;
			}while(n>1);
			arrayf[i] = n;
		}
	}
	
	public void Imprimir() {
		System.out.println("Secuencia final:");
		for (i=0;i<20;i++) {
		System.out.println(arrayf[i]);
		}
	}
}