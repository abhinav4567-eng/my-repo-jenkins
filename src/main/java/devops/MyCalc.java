package devops;

public class MyCalc {
	
	public int sum(int a, int b) {
		return a+b;	
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
    
	public int mul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		
	MyCalc ob = new MyCalc();
	System.out.println("Sum is "+ob.sum(20, 10));
	System.out.println("Sub is "+ob.sub(20, 10));
	System.out.println("Mul is "+ob.mul(20, 10));		
		

	}

}