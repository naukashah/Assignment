package Assignment;
import java.util.Scanner;

//write a program to a specified number of generate fibonacci series
//read the required count from the keyboard
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0, t1=0, t2 =1;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i= 0; i<=num; i++) {
			sum= t1 + t2;
			t1= t2;
			t2 = sum;
			System.out.print(t1 +" + ");
		}
		s.close();
	}

}
