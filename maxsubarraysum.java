class maxsubarraysum{
    public void subarray(int num[])
    {int currsum=0;
    int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                currsum=0;
                for(int k=i;k<=j;k++)
                {
                   currsum+=num[k];
                }
                System.out.println("current sum="+currsum);
                if(maxsum<currsum)
                {
                    maxsum=currsum;
                }
               
            }
            
        }
        System.out.println("Maximum sum of subarray="+maxsum);
    }
    public static void main(String arg[])
    {
        maxsubarraysum r1 = new maxsubarraysum();
        int num[]={2,4,6,8,10};
        r1.subarray(num);
    }
}