public class EqualsExample2 {  
    public static void main(String[] args) {  
        String s1 = "hello";    
        String s2 = "hello";    
        String s3 = "Hello";  
        System.out.println(s1.equals(s2)); // True because content is same    
        if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     
    }  
}  