package Actividad_9;

public class Contenido {

	public static void main(String[] args) {
		int[] arrayA =new int[3];
		int[] arrayB = new int[3];
		boolean cont = true;
		for (int i = 0; i < arrayB.length; i++) {
			arrayA[i]= (int)(Math.random()*4);
			System.out.print("A:"+arrayA[i]+" ");
			arrayB[i]= (int)(Math.random()*4);
			System.out.println("B:"+arrayB[i]+" ");
			
			if(arrayA[i]==arrayB[i]&&cont==true) {
				cont =true;
			}else {cont=false;}
		}
		System.out.println(cont);
		
	}

}
