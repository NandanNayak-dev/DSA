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
    static void shortestDistance(String s){
         
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
    static String subString(String s,int si,int ei){
    String res="";
    for(int i=si;i<ei;i++){
        res+=s.charAt(i);
    }
    return res;
   }
    static void capitalize(){
        String s="hello world i am nandan";
       StringBuilder res=new StringBuilder("");
          res.append(Character.toUpperCase(s.charAt(0)));
          for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==' '){
                res.append(Character.toUpperCase(s.charAt(i)));
                continue;
                
            }
            res.append(s.charAt(i));
          }
          System.out.println(res);
    }
    static void stringCompression(){
        String s="abbbcc";
    StringBuilder res=new StringBuilder("");
    // res.append(s.charAt(0));
    int count=1;
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }
        else{
            res.append(s.charAt(i-1));
            if(count>1){
                res.append(count);
            }
            count=1;
            
        }
        if(i==s.length()-1){
            res.append(s.charAt(i));
            if(count>1){
                res.append(count);
            }
        }
    }
    System.out.println(res);
    }
   public static void main(String[] args){
    
   }
}
