package Arrays;

import java.util.Arrays;

public class Exercicio44 {

	public static void main(String[] args) {
		int[] ordenar = {1,2,3,4,5,6,56,345,76};
		
		Arrays.sort(ordenar);
		for (int i = 0; i < ordenar.length; i++) {
			System.out.println(ordenar[i]);
		}

	}

}
