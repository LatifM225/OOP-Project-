/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package library;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
/**
 *
 * @author Malak
 */
public class Librarian extends Library{
    private String name;
    private int LibID;
    private String password;
    
    public Librarian (String name,int LibID, String password){
    this.name=name;
    this.LibID=LibID;
    this.password=password;
    }
   
    public void addLibrarian(){
        
    System.out.println("enter Librarian name");
    Scanner input=new Scanner(System.in);
     name=input.nextLine();//using nextline will read the entire line if we only want one name use next only
     
     System.out.println(name+"'s"+" "+"new ID: ");
     generateNewID();
    
     System.out.println(name+" please enter a passowrd");
     Scanner input2=new Scanner(System.in);
     password=input2.nextLine();
     String passConfirm;
     System.out.println("please enter your password again to confirm it");
     Scanner input3=new Scanner(System.in);
      passConfirm=input3.nextLine();
      if(!password.equals(passConfirm)){
      while(!password.equals(passConfirm)){
      System.out.println("The passowrd you entered doesn't match the first password");
      System.out.println("please re-enter your password to confirm it.");
      passConfirm=input3.nextLine();
      }
      }
      else {
      System.out.println(name+", Welcome");
      }
    }
    
    
    
}
