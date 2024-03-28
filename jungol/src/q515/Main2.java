package q515;

public class Main2 {

	public static void main(String[] args) {
		A a = new A();
		a.print1();

	}

}

class A {
	private double a = 80.5;
	private double b = 22.34;
	private double c = a + b;

	public void print1() {
		System.out.printf("%10.2f%10.2f%10.2f", a, b, c);
	}
}
