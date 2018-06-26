class fibonacci{
    public static void main(String args[]){
        int first=0,second=1,i,third=0;
        System.out.println(first);
        System.out.println(second);
        while(first + second<=100)
        {
            third=first + second;
            first=second;
            second=third;
            System.out.println(third);
        }
    }

}