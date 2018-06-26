import java.util.*;
class hashClass {
    public static void main(String args[]) {
        HashSet<String>name=new HashSet<String>();
        name.add("jack");
        name.add("jones");
        name.add("michael");
        name.add("tom");

        Iterator<String>itr=name.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}