import java.util.*;
class myIterator {
    public static void main(String args[]) {
        ArrayList<String>names=new ArrayList<String>();
        names.add("tom");
        names.add("jerry");
        names.add("mark");
        names.add("michael");

        ListIterator<String>itr=names.listIterator();
        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }
        
        System.out.println("");
        System.out.println("reversed: ");
        System.out.println("");
    
        
        while(itr.hasPrevious())
        {
           System.out.println(itr.previous());
        }
    }

}