class trapingrainwater
{
    public  int  trappedwater(int height[])
    { int n=height.length;
        //left max boundry-array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]); 
        }
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }

        //calulate right max boundry
        //loop
        int trapedwater=0;
        for(int i=0;i<n;i++)
        {
           int waterlevel=Math.min(leftmax[i],rightmax[i]);
           trapedwater+=waterlevel-height[i];
        }
        return trapedwater;
        //waterlevel=min(leftmax boundry,rightmax boundry)
        //trapped water =waterlevel-height[i]

    }
    public static void main(String []args)
    {
        int height[]={4,2,0,6,3,2,5};
        trapingrainwater t1=new trapingrainwater();
        System.out.print(t1.trappedwater(height));
    }
} 