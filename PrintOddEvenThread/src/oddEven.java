
public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer print = new Printer();
	    Thread t1 = new Thread(new TaskEvenOdd(print, 20, false),"Odd");
	    Thread t2 = new Thread(new TaskEvenOdd(print, 20, true),"Even");
	    t1.start();
	    t2.start();

	}

}
