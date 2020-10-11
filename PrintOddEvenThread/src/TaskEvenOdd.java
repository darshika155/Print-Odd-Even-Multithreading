
public class TaskEvenOdd implements Runnable {
	
	private int max;
    private Printer print;
    private boolean isEvenNumber;
 
    // standard constructors
 
    public TaskEvenOdd(Printer print2, int i, boolean b) {
		// TODO Auto-generated constructor stub
    	this.print = print2;
    	this.max = i;
    	this.isEvenNumber = b;
	}

	@Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }

}
