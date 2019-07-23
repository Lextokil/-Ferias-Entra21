package Arrays;

public class Exercicio46 {

	public static void main(String[] args) {
		Double[] array = {10.0, 5.6, 4.5, 9.8};
		Double maior = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		System.out.println(maior);

	}

}
