import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");
        System.out.println("###" instanceof String);
        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
         }

	}
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
           Object element = it.next();
           if(element instanceof String)//Hints: use instanceof operator
        	   break;
  		}
        return it;
        
     }

}
