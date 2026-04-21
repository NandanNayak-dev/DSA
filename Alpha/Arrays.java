
import java.util.*;
public class Arrays {
    static int linearSearch(String marks[],String key){
        int i;
        for( i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
           
        }
         return -1;
    }
    static int Max(int arr[]){
    int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int Min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        return min;
    }
    static int binarySearch(int arr[],int high,int low,int key){
        while(low<=high){
            int mid=(high+low)/2;
            if(key==arr[mid]){
                return 1;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            if(key>arr[mid]){
                low=mid+1;
            }
            
        }
        return -1;
    }
    static void reverseArray(int arr[]){
        int temp,fin=0,lin=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[fin];
            arr[fin]=arr[lin];
            arr[lin]=temp;
            fin++;
            lin--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
    static void ArrayPairs(int arr[]){
        int totalPairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPairs++;
                }
            System.out.println();
            }
            System.out.println("Total number of pairs are: "+totalPairs);
        }
    static void subarrayDemo(int arr[]){
        
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        int subSum=0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                
                subSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.print("Sum is-->"+subSum);
               if(subSum>maxSum){
                    maxSum=subSum;
                }
                
                System.out.println();

            }
             
        }
        // System.out.println("Total->"+TotalSubArray);
        System.out.println("Maximum Sum-->"+maxSum);
        // System.out.println("Minimum Sum-->"+minSum);
    }
    static void prefixArrayRevision(int arr[]){
        int subArraySum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                subArraySum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(subArraySum);
            }
        }
    }
    static void kadanes(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>0){
                flag=1;
                break;
            }
            else{
                if(arr[i]>maxSum){
                    maxSum=arr[i];
                }
                continue;
            }
        }

        if(flag==1){
            for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum<0){
                curSum=0;
            }
            if(curSum>maxSum){
                maxSum=curSum;
            }
        }
        }
        System.out.println(maxSum);
    }
    static void firstTwoMax(){
         int arr[]={1,0,99,111,0,8,7,6,4};
    int max=Integer.MIN_VALUE;
    int secMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secMax=max;
            max=arr[i];
        }
        else if(arr[i]>secMax && arr[i]!=max){
            secMax=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(secMax);
    }
    public static void main(String[] args) {
       
    }
}
