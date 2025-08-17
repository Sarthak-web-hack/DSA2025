class binarytodecimal{
    public void binary(int bibnum)
    {
        int pow=0;
        int decnum=0;
        while(bibnum>0)
        {
            int lastdigit=bibnum%10;
            decnum= decnum +(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bibnum=bibnum/10;
        }
        System.out.println("decimal of "+bibnum+"="+decnum);
    }
    public static void main(String[] args) {
        binarytodecimal b1=new binarytodecimal();
        b1.binary(10001);
    }
}