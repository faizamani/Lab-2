/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodninjaapp;

import java.util.Scanner;

/**
 *
 * @author My HP
 */
public class FoodNinjaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner (System.in);
  Scanner scanner1 = new Scanner ( System.in);
 
  System.out.print("How Many Data Want To Add ");
  
  int num = scanner.nextInt();
  Food food [] = new Food [num];
  
  for ( int i=0;i<num;i++){
      System.out.println("Staff"+(i+1));
      System.out.println("Name :");
      String name = scanner.nextLine();
      System.out.println("Id :");
      String id = scanner.nextLine();
      System.out.println("Salary :");
      String salary = scanner.nextLine();
      System.out.println("Branch :");
      String branch = scanner.nextLine();
  }
    for (int i = 0 ;i<num;i++){
        
        System.out.println("Staff Information"+(i+1));
        System.out.println("Name :"+ food[i].getName());
        System.out.println("Id :"+ food[i].getId());
        System.out.println("Salary :"+ food[i].getSalary());
        System.out.println("Branch :"+ food[i].getBranch());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
