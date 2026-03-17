public class pattern {
    static void pattern(int n){
      for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" "+j);
        }
        for(int j=i-1;j>=1;j--){
            System.out.print(" "+j);
        }
        System.out.println("");
      }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
