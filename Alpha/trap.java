public class trap {
    static int trapped(int height[]){
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int Volume=0;
        int WaterLevel;
        for(int i=0;i<height.length;i++){
            
                WaterLevel=(Math.min(rightMax[i],leftMax[i]));System.out.println(" Water level"+WaterLevel);
                Volume+=WaterLevel-height[i];
            
        }
        return Volume;
    }
    
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped(height));
        System.out.println("");
    }
}
