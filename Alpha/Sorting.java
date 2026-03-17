import java.util.Arrays;
public class Sorting{
    static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
                
            }
            
        }
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;

    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
}
}
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev!=-1&&cur<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }
    
    static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]!=0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        display(arr);
    }
}