import java.util.Scanner;
class LeapYear{
    public static void main(String args[]){
        Scanner scanvar=new Scanner(System.in);
        int n=scanvar.nextInt();
        scanvar.close();

        if(n%100!=0)
        {
            if(n%4==0)
            {
                System.out.println("Leap year");
                return;
            }
            else{
                System.out.println("NOt a Leap year");
                return;
            }
        }
        else{
            if(n%400==0)
            {
                System.out.println(" Century Leap year");
                return;
            }
            else{
                System.out.println("Not a Leap year");
                return;
            }
        }
    }

}