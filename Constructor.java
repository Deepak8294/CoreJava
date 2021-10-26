public class Constructor {
	int y, z;
	//creating a parameterized constructor  
	Constructor(int a, int b) {
		int y = a;
		int z = b;
		System.out.println("subtraction two number");
		System.out.println(y - z);
	}
	public static void main(String[] args) {
		//creating objects and passing values 
		Constructor r = new Constructor(30, 10);
	}
}
