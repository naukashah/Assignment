package Assignment;
import java.util.*;

public class GenerateNumbers {

	public static void main(String[] args) {
		//Generate 1000 numbers
		Random random = new Random();
		for(int i=0; i<10; i++) {
			double randomNum = random.nextInt();
			System.out.println("Random Numbers:" + i +  " : "+randomNum);
		}

		//Generate multiple of 5 and less than 1000
		for(int i =1; i<100; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
		
		//Generate odd numbers upto 1000
		for(int i=0; i<100; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}

	}

}
