class Voorbeeld {
	
	public static void main(String[] args) {
		System.out.println("Hallo");
		System.out.println("Wereld!");
		
		int getal1; // Declaratie van een variabele van het type int
		
		getal1 = 9; // Initialisatie
		int getal2 = 14;
		int getal3, getal4;
		int getal5 = 7, getal6;
		
		// System.out.println(getal3); --> compiler error omdat getal3 niet geïnitialiseerd is
		
		// in een array krijgen alle entries een default waarde (0 bij int)
		
		// primitive types vs reference/object types
		// String (en Wrapper) zitten hier een beetje tussenin maar vallen onder reference types
		
		// Primitives:
		// Gehele getallen: byte, short, int, long
		// Kommagetallen: float, double
		// char
		// boolean: true, false
		
		Auto car = null;
		Auto auto = new Auto();
		
		// De signature van een method is: aantal, type en volgorde van de parameters
		// Parameter vs argument: geen synoniem.
		// Parameter is altijd de declaratie van een variabele bij de definitie van de method, argument is reeds gedeclareerd.

		Voorbeeld jojo = new Voorbeeld();
		jojo.uitproberen(4);
		
		System.out.println(optellen() * optellen());
	}
	
	// Als je aantal, type of volgorde van een method verschilt, kun je overloaden:
	static void uitproberen() {
		System.out.println("Hoppakee");
	}
	
	void uitproberen(int a) {
		System.out.println("Hoppakee");
	}
	
	void uitproberen(String a) {
		System.out.println("Hoppakee");
	}
	
	// Wanneer het return type van een method anders is dan void,
	// dan kun je de aanroep van de methode vervangen door datgene wat deze teruggeeft.
	
	static int optellen() {
		return 6;
	}
}

class Auto {
	
	// Access modifiers: private, protected, public, DEFAULT (impliciet)
	// Non-access modifiers: static, abstract, final
	
	protected static int carsAmount;
	String brand;
	
	static int getAmountOfCars() {
		return carsAmount;
	}
	
	String getBrand() {
		return this.brand;
	}
}