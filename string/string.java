import java.util.Scanner;

class myString{
    public static void main(String[] args){
        Scanner scanVar=new Scanner(System.in);
        System.out.println("Enter some string:");

        String stringVar=scanVar.nextLine();
        int length=stringVar.length();
        System.out.println("length is : " + length);
        System.out.println("lowercase is : " + stringVar.toLowerCase());
        System.out.println("uppercase is : " + stringVar.toUpperCase());
        
        //replacing character
        String stringVar2="Helloe World";
        System.out.println("String 2 is: " + stringVar2);
        System.out.println("Replaced string  is: " + stringVar2.replace('e','a'));
        


    }


}