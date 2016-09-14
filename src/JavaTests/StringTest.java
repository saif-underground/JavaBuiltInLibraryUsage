/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTests;
//hello world how are you doing? I am fine.
/**
 *
 * @author Saif
 */
public class StringTest {
    
    public static void main(String[] args){
        //testString();
        testStringBuilder();
    }//end of method
    
    public static void testStringBuilder(){
        StringBuilder sb = new StringBuilder(200); //initial capacity 200
        
        //append
        //append can take, boolean, int, string, double, char[], etc
        char[] charr = {'a', 'b'};
        sb.append(true).append(1).append(charr);
        System.out.println(sb);
        
        //current capacity -- 200 in this case
        sb.capacity();
        
        //char at
        sb.charAt(4);
        
        //delete
        sb.delete(0, 4);
        sb.deleteCharAt(2);
        
        //index of
        int index = sb.indexOf("buddha");
        
        //insert at index --- boolean, int, double, char[] can be inserted
        sb.insert(0, charr);
        
        //last index of
        sb.indexOf("string");
        sb.indexOf("str", 0);
        
        //length
        sb.length();
       
        //replace
        sb.replace(0, 3, "saif");
        
        //reverse
        sb.reverse();
        
        //set char at
        sb.setCharAt(0, 'z');
        
        //substring
        System.out.println(sb.substring(0));
        System.out.println(sb.substring(0, 3));
        
        //compare
        // no compare methods
    }//end of method
    
    public static void testString(){
        String str = "abcdef";
        String otstr = "def";
        
        //substring
        String s1 = str.substring(0, 2);
        s1 = str.substring(3); // from 3 to end
        System.out.println(s1);
        //charat
        char c = str.charAt(2);
        System.out.println(c);
        
        //compare to
        boolean equl = str.equals("saif");
        equl = str.equalsIgnoreCase("saif");
        //contains
        s1.contains("saif".subSequence(0, 4));
        
        //index of
        int index = str.indexOf('f');
        index = str.indexOf("saif");
        int startIndex = 3;
        index = str.indexOf(str, startIndex); //search for string str from start index
        index = str.indexOf('c', startIndex);
        //isempty
        boolean isEmpty = str.isEmpty();
        
        //indexof
        index = str.indexOf(otstr);
        index = str.lastIndexOf(otstr);
        
        //length
        int len = str.length();
        
        //starts with, ends with
        boolean strtwith = str.startsWith(otstr);
        boolean endswith = str.endsWith(otstr);
        
        //tolower case, to upper case
        String low = str.toLowerCase();
        String up = str.toUpperCase();
        
        //trim leading and trailing spaces
        String trimmed = str.trim();
        
        //value of 
        char [] arr = {'s', 'a', 'i', 'f'};
        String strArr = String.valueOf(arr);
        String intStr = String.valueOf(3);
        String doubleStr = String.valueOf(3.1416);
    }//end main
}//end of class
