public class test {

    static void pattern(int n){
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if((i==n-j+1)||i==j){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=4;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    static void PrefixSum(int[] arr){
        int[] prefix=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i]=sum;
            
        }
        int subSum=0;
        int MAX=Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==0){
                    subSum=prefix[j];
                }
                else{
                    subSum=prefix[j]-prefix[i-1];
                }
                if(subSum>MAX){
                    MAX=subSum;
                }
            }
        }
        System.out.println(MAX);
    }

    static void Kadane(int[] arr){
        int curSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                flag=1;
                break;
            }
            if(arr[i]>MaxSum){
                MaxSum=arr[i];
            }

        }
        if(flag==1){
            for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum<0){
                curSum=0;
            }
            if(curSum>MaxSum){
                MaxSum=curSum;
            }
        }
        }
        
        System.out.println(MaxSum);
    }

static void water(int arr[]){
    //left max
    int leftMax[]=new int[arr.length];
    leftMax[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        leftMax[i]=Math.max(arr[i], leftMax[i-1]);
    }
    //right max
    int rightMax[]=new int[arr.length];
    rightMax[arr.length-1]=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
        rightMax[i]=Math.max(arr[i], rightMax[i+1]);
    }
    int waterLev=0;
    int vol=0;
    for(int i=0;i<arr.length;i++){
        waterLev=Math.min(leftMax[i],rightMax[i])-arr[i];
        vol+=waterLev;
    }
    System.out.println(vol);
}



    public static void main(String[] args) {
         int arr[]={4,2,0,6,3,2,5};
         water(arr);      
    }
}
