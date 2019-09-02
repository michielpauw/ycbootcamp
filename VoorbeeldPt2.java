class VoorbeeldPt2 {
	public static void main(String... args) {
		Auto car = new Auto();
		car.rijden();
		
		new Cardealer().autoKopen().rijden();
		Cardealer vw = new Cardealer();
		Auto nieuweAuto = vw.autoKopen();
		nieuweAuto.rijden();
	}
}

class Auto {
	// Verschil 0-argumentenconstructor en default constructor:
	//  --> de default constructor verdwijnt, zodra je een handmatige constructor maakt.
	
	// BADLY NAMED METHOD! Maar mag wel!
	// Auto Auto() {
	// 	System.out.println("Er is een nieuwe auto gemaakt!");
	// 	return null;
	// }
	
	Auto() {
		// Elke constructor heeft super() als impliciet eerste statement.
		// super();
		System.out.println("Auto wordt nu wel gemaakt.");
	}
	
	Auto(String auto) {
		System.out.println(auto +  " wordt nu wel gemaakt.");
	}
	
	void rijden() {
		System.out.println("Rijden in Auto");
	}
}

class Cardealer {
	
	Auto autoKopen() {
		return new Auto();
	}
}