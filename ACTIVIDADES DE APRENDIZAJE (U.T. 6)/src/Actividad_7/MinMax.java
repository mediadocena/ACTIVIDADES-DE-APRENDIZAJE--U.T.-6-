package Actividad_7;

public class MinMax {

	public static void main(String[] args) {
		int[][] MatrizA=new int[][] {{1,2,3,4},{10,20,30,40}};
		int[][] MatrizB=new int[][] {{5,6,7,8},{9,10,11,12}};
		int pos1menor=0,pos2menor=0,posmayor=0,posmayor2=0;
		int menor =10;
		int mayor =0;
		
		for (int i = 0; i < MatrizA.length; i++) {
			for (int j = 0; j < MatrizA.length; j++) {
				
				if(MatrizA[i][j]<menor) {
					pos1menor= i;
					pos2menor=j;
					menor=MatrizA[i][j];
				}
			}
			
		}
		for (int i = 0; i < MatrizB.length; i++) {
			for (int j = 0; j < MatrizB.length; j++) {
				if(MatrizB[i][j]>mayor) {
					posmayor =i;
					posmayor2 =j;
					mayor=MatrizB[i][j];
				}
			}
		}
		MatrizA[pos1menor][pos2menor]=mayor;
		MatrizB[posmayor][posmayor2]=menor;
		for (int i = 0; i < MatrizB.length; i++) {
			for (int j = 0; j < MatrizB.length; j++) {
				System.out.println("Matriz A:"+MatrizA[i][j]);
				System.out.println("Matriz B:"+MatrizB[i][j]);
			}
		}
	}

}
