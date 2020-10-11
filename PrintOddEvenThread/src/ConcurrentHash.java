import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
		    HashMap<String,String> premiumPhone = new HashMap<String,String>();
	        premiumPhone.put("Apple", "iPhone6");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S6");
	        
	        System.out.println("darshika"+ 5 * 2);
	        Iterator iterator = premiumPhone.keySet().iterator();
	        System.out.println(new Example().i);
	        Boolean b[]=new Boolean[10];
	        boolean b1[] = new boolean[10];

	        System.out.println(b[5]);
	        System.out.println(b1[5]);


	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        }
	       
//	        iterator = premiumPhone.keySet().iterator();
//	        
//	        while (iterator.hasNext())
//	        {
//	            System.out.println(premiumPhone.get(iterator.next()));
//	            premiumPhone.put("Sony", "Xperia Z");
//	        }
	}

}
class Example{

		int i=5;
		
		static {
			int i=10;
		}
}

