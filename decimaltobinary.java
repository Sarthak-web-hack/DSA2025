class decimaltobinary{
    public void binary(int deci)
    {
        int pow=0;
        int binaryno=0;
        while(deci>0)
        {
         int rem=deci%2;
         binaryno=binaryno+(rem*(int)Math.pow(10,pow));
         pow++;
         deci=deci/2;
         
        }
        System.out.println("bianry of given number  "+binaryno);
    }
    public static void main(String[] args) {
        decimaltobinary d1=new decimaltobinary();
        d1.binary(10);
    }
}