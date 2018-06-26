import java.util.Scanner;

class Input{
    public static void main(String[] args){
        //accepting int value

        Scanner scanvar=new Scanner(System.in);
        System.out.println("Enter some number:");
        int user_input_number=scanvar.nextInt();
        System.out.print("Entered no is:");
        System.out.println(user_input_number);
        
        //accepting double value

        Scanner scanvar2=new Scanner(System.in);
        System.out.println("Enter double value:");
        double user_input_double=scanvar2.nextDouble();
        System.out.print("Entered no is:");
        System.out.println(user_input_double);

        //ACCEPTING STRING 

        Scanner scanvar3=new Scanner(System.in);
        System.out.println("Enter string:");
        String user_input_string=scanvar3.nextLine();
        System.out.print("Entered string is: ");
        System.out.println(user_input_string);


    }

}
