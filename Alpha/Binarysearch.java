
class Binarysearch{
    static void bs(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int middle;
        
        while(start<=end){
            middle=(start+end)/2;
            if(arr[middle]==key){
                System.out.println("Found");
                
                return;
            }
          else  if(key>arr[middle]){
                start=middle+1;
            }
           else if(key<arr[middle]){
                end=middle-1;
            }
        }
        System.out.println(" Not Found");

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        bs(arr,1);
    }
}