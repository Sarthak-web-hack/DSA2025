class linersearch
{
    public static int liner( int number[],int key)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7,8,9};
        int key=9;
        int index=liner(number,key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("key at index"+index);
        }
    }
}