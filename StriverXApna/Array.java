import java.util.*;
public class Array{
    static void mostfrequentElement(){
        int arr[]={1,2,3,2,1,2,3,2,1,1,1,1,0,0,0,0,0,4,4,4,5};
        int maxi=arr[0];
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element:arr){
            if(!map.containsKey(element)){
                map.put(element, 1);
            }
            else{
                map.put(element,map.get(element)+1);
            }
            if(map.get(element)>max){
                max=map.get(element);
                maxi=element;
            }
        }
        System.out.println(map);
    }
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
    static void twoSum(){
    int arr[]={2,7,4,8,7,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        int target=12;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                System.out.println(i+" "+map.get(target-arr[i]));
                break;
            }
            else{
                map.put(arr[i], i);
            }
        }
    }
    static void majority(){
        int arr[]={7,7,5,7,5,1,1,7,7};
        int el=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }

            if(count==0&& i<arr.length-1){
                el=arr[i+1];
                count=0;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                count++;
            }
            
        }
        if(count>arr.length/2){
            System.out.println("Majority "+el);
        }
        else{
            System.out.println("No majority");
        }
    }
    static void EqualNegAndPosRearrange(){
        int arr[]={-1, -2, -3, 4, -4, 5, 6, 7};
        int res[]=new int[arr.length];
        int j=0;
        int k=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                res[j]=arr[i];
                j+=2;
            }
            else{
                res[k]=arr[i];
                k+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    static void UnequalNegAndPosRearrange(){
        int arr[]={1,2,-4,-5,3,6,6,7,8};
        ArrayList<Integer> posList=new ArrayList<>();
        ArrayList<Integer> negList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                posList.add(arr[i]);
            }
            else{
                negList.add(arr[i]);
            }
        }
        System.out.println(posList);
        System.out.println(negList);
        int length=(negList.size()<posList.size())?negList.size():posList.size();
        int j=0;
        int k=0;
        int i=0;
        for(i=0;i<2*length;i++){
            if(i%2==0){
                arr[i]=posList.get(j);
                j++;
            }
            else{
                arr[i]=negList.get(k);
                k++;
            }
        }
        while(j!=posList.size()){
            arr[i]=posList.get(j);
            j++;
            i++;
        }
        while(k!=negList.size()){
            arr[i]=negList.get(k);
            k++;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
    }
}