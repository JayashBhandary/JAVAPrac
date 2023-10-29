import java.util.*;

public class LinkedlistExample {
    public static void main(String args[]){
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("Rahul");
        a1.add("Rajat");
        a1.add("Rachit");

        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
