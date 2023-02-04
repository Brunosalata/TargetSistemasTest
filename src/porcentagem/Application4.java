package porcentagem;

public class Application4 {

	static double sp = 67836.43;
	static double rj = 36678.66;
	static double mg = 29229.88;
	static double es = 27165.48;
	static double outros = 19849.53;
	static double total = sp + rj + mg + es + outros;
	
	public static void main(String[] args) {
		
		System.out.println("Lista do percentual de cada estado:");
		System.out.printf("São Paulo: %.2f%n", percentage(sp));
		System.out.printf("Rio de Janeiro: %.2f%n", percentage(rj));
		System.out.printf("Minas Gerais: %.2f%n", percentage(mg));
		System.out.printf("Espírito Santo: %.2f%n", percentage(es));
		System.out.printf("Outros: %.2f%n", percentage(outros));
	}

	public static double percentage(double e) {
		double percentage = (e / total) * 100;
		return percentage; 
	}
}