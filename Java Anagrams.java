import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
       boolean value = false;
        char [] arr1 =   a.toLowerCase().toCharArray();
        char [] arr2 = b.toLowerCase().toCharArray();
         java.util.Arrays.sort(arr1);
         java.util.Arrays.sort(arr2);
         
         if(arr1.length == arr2.length){
             for(int i=0;i<arr1.length;i++){
                 if(arr1[i]==arr2[i]){
                     value = true;
                 }
                 else{
                     value = false;
                     break;
                 }
             }
         }
         else{
             value = false;
            
         }
         
         
        return value;
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
