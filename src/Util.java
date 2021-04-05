
public class Util {
	
	

	
	public static int[] ordenaBubbleSort(int[] array) {
		
		for (int j=1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					
					// troca os elementos de posição no vetor
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					
				}

			}
		}
		
		return array;
	}
	
	public static void imprimeVetor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
