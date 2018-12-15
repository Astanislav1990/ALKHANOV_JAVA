class ATM { 
	public static void main (String[] args) { 
		int sum = 15867; 
		int bill1 = 5000; 
		int bill2 = 2000; 
		int bill3 = 1000; 
		int bill4 = 500; 
		int bill5 = 200; 
		int bill6 = 100; 
		int bill7 = 10; 
		int x = sum / bill1; 
		int y = sum % bill1; 
		int z = y / bill2; 
		int a = y / bill3; 
		int b = y / bill4; 
		int c = y % bill4; 
		int d = c / bill5; 
		int e = c % bill5; 
		int f = e / bill6; 
		int g = e % bill6; 

		System.out.println(bill1 + " - " + x); 
		System.out.println(bill2 + " - " + z); 
		System.out.println(bill3 + " - " + a); 
		System.out.println(bill4 + " - " + b); 
		System.out.println(bill5 + " - " + d); 
		System.out.println(bill6 + " - " + f); 
	} 
}
