public class ConcatExample{  
public static void main(String args[]){  
String s1="java string";  
s1.concat("is immutable");  
System.out.println(s1);  
s1=s1.concat(" is immutable so assign it explicitly");  
System.out.println(s1);  
}}  