package mySearches.Equals;

public class MyApp {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		
		Pessoa p1 = new Pessoa("10000", "Leo");
		Pessoa p2 = new Pessoa("10000", "Leo");
		
		System.out.println(p1.equals(p2));

	}

}
