class bubblesort
{
    public void sort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        bubblesort b1=new bubblesort();
        int arr[]={5,6,7,4,2,1,3};
        b1.sort(arr);
        b1.printarray(arr);
    }
}