import java.util.Scanner;

class checkPrime {

    boolean checkPrimefunc(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                
                return false;
            }
        }
        
        return true;
    }
}

class PrimeWord {
    public static void main(String args[]) {
        String input;
        boolean isPrime = false;
        int i, len, wordCount = 1, j;
        checkPrime obj = new checkPrime();
        System.out.println("Enter the string: ");
        Scanner scanvar=new Scanner(System.in);
        input=scanvar.nextLine();
        scanvar.close();
        len=input.length();
        if(len==0){
            return;
        }
        for(i=0;i<len;i++){
            if(input.charAt(i)==' ' && i!=len-1 && input.charAt(i+1)!=' '){
                wordCount++;
                isPrime=obj.checkPrimefunc(wordCount);
                if(isPrime){
                    for(j=i+1;j<len;j++){
                        if(input.charAt(j)==' ')
                        {
                            break;
                        }
                        System.out.print(input.charAt(j));
                }
                System.out.println();
                }
                
        
            }
        }

    }
}