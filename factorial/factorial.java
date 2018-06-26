import java.util.Scanner;
class findfact{
    int returnfact(int m){
        int fact=1;
        while(m>0){
            fact*=m;
            m--;
        }

        return fact;
    }
}


class factorial{
    public static void main(String args[]){
        Scanner scanvar=new Scanner(System.in);
        System.out.println("enter number: ");
        int m=scanvar.nextInt();
        scanvar.close();
        findfact obj=new findfact();
        int output=obj.returnfact(m);
        System.out.println("Factorial is: " + output);
    }
}