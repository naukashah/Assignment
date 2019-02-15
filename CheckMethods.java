package Assignment;
//write a java programs with following methods:
//public Boolean IsInteger(String str)
//public Boolean IsOddNumber(String str)
//public Boolean IsEvenNumber(String str)
//public Boolean IsPrimeNumber(String str)
public class CheckMethods {
	String str;
	public Boolean IsInteger(String str) {
		this.str = str;
		char c[] = str.toCharArray();
		for(int i=0; i< c.length; i++) {
			int num = c[i]-'0';
			if(num < 0 || num >=9) {
				System.out.println("Not Integer Value");
				return false;
			}
			else {
				System.out.println("Integer Value");
				return true;
			}
		}
		return true;
	}
	
	public Boolean IsOddNumber(String str) {
		this.str = str;
		int num = Integer.parseInt(str);
		if(num % 2 == 0) {
			System.out.println("Even Number");
			return true;
		}
		else {
			System.out.println("Odd Number");
		}
		return true;
	}
	
	public Boolean IsPrimeNumber(String str) {
		this.str= str;
		int num = Integer.parseInt(str);
		for(int i = 2; i< num/2; i++) {
			if(num % 2 == 0) {
				System.out.println("Not Prime Number");
			}
			else {
				System.out.println("Prime Number");
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckMethods c1 = new CheckMethods();
//		boolean result = c1.IsInteger("assf");
//		System.out.println("res= "+ result);
		c1.IsInteger("assf");
		c1.IsOddNumber("1");
		c1.IsPrimeNumber("7");
		
	}

}
