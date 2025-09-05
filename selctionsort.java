class selctionsort
{
    public void sort(int arr[]){
        for(int i=0;i<arr.length-2;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
    void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        selctionsort s1=new selctionsort();
        int ar[]={3,7,8,6,5,1,3,4};
        s1.sort(ar);
        s1.printarr(ar);
    }
}