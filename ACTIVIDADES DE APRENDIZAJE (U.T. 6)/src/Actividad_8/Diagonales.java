package Actividad_8;

public class Diagonales {

	public static void main(String[] args) {
		int [][] array=new int [3][3];
		
		for(int i =0;i<array.length;i++) {
			for (int j = 0; j < array.length; j++) {
				
			
			array[i][j]= (int)(Math.random()*101);
		
		}
		}
		System.out.println(array[0][0]+" "+array[0][1]+" "+array[0][2]);
		System.out.println(array[1][0]+" "+array[1][1]+" "+array[1][2]);
		System.out.println(array[2][0]+" "+array[2][1]+" "+array[2][2]);
		System.out.println("Diagonal:"+array[0][0]+" "+array[1][1]+" "+array[2][2]);
		
	}

}
