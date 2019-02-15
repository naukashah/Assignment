package Assignment;
//write a class BasicCalculator.java to provide basic mathematical operation like addition, substraction, 
//multiplication and devision for two numbers. 
//write a client to use above class and call its operations.
public class BasicCalculator {
	public void add(int x, int y) {
		int sum = x +y;
		System.out.println("Sum is: " + sum);
	}
	public void substract(int x, int y) {
		int sub = x - y;
		System.out.println("Substraction is: " + sub);
	}
	public void multiply(int x, int y) {
		int mul = x *y;
		System.out.println("Multiplication is: " + mul);
	}
	public void devide(int x, int y) {
		int dev = x /y;
		System.out.println("Devision is: " + dev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BasicCalculator b = new BasicCalculator();
	b.add(15, 21);
	b.substract(15, 12);
	b.multiply(15, 10);
	b.devide(10, 5);
	}

}
