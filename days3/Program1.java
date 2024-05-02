package days3;

public class Program1 {

	public static void main(String[] args) {

		try {
			int num=30/0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("final block excuted");
			
		}
		System.out.println("using exception method");
	}

}
