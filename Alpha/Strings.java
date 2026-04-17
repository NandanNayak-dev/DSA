import java.util.*;
public class Strings {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
           if(s.charAt(l)!=s.charAt(r)){
            return false;
           }
           l++;
           r--;
        }
        return true;
    }
    public static void main(String[] args){
        String s="WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        double dist=Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
        System.out.println(dist);
    }
}
