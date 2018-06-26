import java.util.ArrayList;
class myArrayClass{
    public static void main(String args[]){
        ArrayList<Integer> myList=new ArrayList<Integer>(5); //5 is the initial length
         System.out.println("SIZE: " + myList.size());
        
       
        myList.add(5);
        myList.add(7);
        
         System.out.println("SIZE: " + myList.size());
        
        for(Integer element:myList)
        {
            System.out.println(element);
        }
        System.out.println("SIZE: " + myList.size());
       
        

    }
}