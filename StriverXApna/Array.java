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
    static void UnionOf2SortedArrays(){
        ArrayList<Integer> list=new ArrayList<>();
        int arr1[]={1,2,4,6,7,8,9,10};
        int arr2[]={1,3,4,5,7,8,11};
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;   
            }
            else{
                if(!list.contains(arr2[j])){
                    list.add(arr2[j]);
                }
                j++;
            }
            
        }
        while(j<arr2.length){
            if(!list.contains(arr2[j])){
                list.add(arr2[j]);
            }
            
            j++;
        }
        while(i<arr1.length){
            if(!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
            i++;
        }
        System.out.println(list);
    }
    static void Intersection2SortedArrays(){
        int a[]={1,2,2,3,3,4,5,6,7,8};
        int b[]={2,3,3,5,6,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(list);
    }
    static void sort012(){
        int[] arr={0,1,1,0,1,2,1,2,0,0,0,2,2,0,1};
        int mid=0,low=0,high=arr.length-1;
        int temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
               temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
    }
}