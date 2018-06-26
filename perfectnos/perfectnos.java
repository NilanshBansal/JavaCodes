class abc{
    
        void abcd(int i,int j,int n,int sum){
            for(i=1;i<=n;i++)
        {   sum=0;
            for(j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
        }
}

class Perfect{
    public static void main(String[] args){
        
        int i=0,j=0,n=100,sum=0;
         abc ob=new abc();
        ob.abcd(i,j,n,sum);
        /*for(i=1;i<=n;i++)
        {   sum=0;
            for(j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }*/
       
    }
}