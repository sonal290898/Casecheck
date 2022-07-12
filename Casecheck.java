/*# Casecheck
Check case are in Lower or upper class*/
  import java.util.Scanner;
 public class Checkclass{
     public static void main(String args []){
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().trim().charAt(0);
    if(ch>='a' && cha<='z'){
         System.out.println("Lowercase");
     }
     else{
         System.out.println("Uppercase");
         }
 }
 }
