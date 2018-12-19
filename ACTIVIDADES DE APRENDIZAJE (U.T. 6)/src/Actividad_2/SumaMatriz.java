package Actividad_2;

public class SumaMatriz {

	public static void main(String[] args) {
		int [][] MatrizB= new int [3][3];
		int [][] MatrizA= new int [3][3];
		int suma=0;
		for (int i = 0; i < MatrizA.length; i++) {
			for (int j = 0; j < MatrizA.length; j++) {
				
				MatrizB[i][j]=(int) (Math.random()*5);
				System.out.print("Matriz1:"+MatrizB[i][j]+" ");
				MatrizA[i][j]=(int)(Math.random()*5);
				System.out.print("Matriz2:"+MatrizA[i][j]+" ");
				suma = suma+(MatrizB[i][j]+MatrizA[i][j]);
				System.out.println(" ");
			}
			
		}
		System.out.println("Suma:"+suma);
	}

}
