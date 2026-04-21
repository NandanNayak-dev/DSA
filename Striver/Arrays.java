import java.util.*;
public class Arrays{
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
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}