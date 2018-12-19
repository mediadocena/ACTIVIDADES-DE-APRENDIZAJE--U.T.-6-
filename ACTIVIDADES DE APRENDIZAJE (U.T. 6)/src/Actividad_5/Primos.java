package Actividad_5;

public class Primos {

	public static void main(String[] args) {
		int[] array = new int []{2,2,3,4,5,6,7,8,9,10};
		
		int conoprimo=0;
		
		
		for (int i = 0; i < array.length; i++) {
			conoprimo=0;
			for(int j = 1;j<=110;j++) {
				
				if(array[i]%j==0) {
					conoprimo++;
				}
				
			}
			if(conoprimo<=2) {
				System.out.println(array[i]);
			}
	}
	}

}
