package reverse;

public class Application5 {

	public static void main(String[] args) {
		String stg = "string reverse";
		char vect[] = stg.toCharArray();
		int startVectPosition = 0;
		int finalVectPosition = vect.length - 1;
		char aux;

		System.out.println("Original sentence: " + stg);

		while (finalVectPosition > startVectPosition) {
			aux = vect[startVectPosition];
			vect[startVectPosition] = vect[finalVectPosition];
			vect[finalVectPosition] = aux;
			startVectPosition++;
			finalVectPosition--;
		}

		String gts = new String(vect);
		System.out.println("Reverse sentence: " + gts);
	}
}
