package Arrays;

public class Exercicio45 {

	public static void main(String[] args) {
		Double[] array = {10.0, 5.6, 4.5, 9.8};
		Double media = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			media += array[i];
		}
		media = media/array.length;
		
		System.out.println(media);
	}

}
