import java.util.*;
public class Array{
    static void rotateArray(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

    }
    static void secMax(){
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
    static void leftRightRotation(){
        int arr[]={1,2,3,4,5,6};
        int k=2;
        
        // Left Rotation
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k, arr.length-1);
        rotateArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        //Right Rotation
        rotateArray(arr,0, arr.length-1);
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
    }
}