import java.util.HashMap;
import java.util.*;

public class HashMapExample {
    public static void main(String[]args){
        Map<String, Integer> course = new HashMap<String, Integer>();
        
        course.put("Java Courses", new Integer(6));
        course.put("Cloud Courses", new Integer(7));
        course.put("Programming Courses", new Integer(5));
        course.put("Total Courses", course.size());

        Set<Map.Entry<String,Integer>> st = course.entrySet();
        for(Map.Entry<String,Integer>me:st){
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
            System.out.println();
        }

        String searchkey = "Java Courses";
        if(course.containsKey(searchkey)){
            System.out.println("found total " + course.get(searchkey) + " " + searchkey);
        }

    }
}
