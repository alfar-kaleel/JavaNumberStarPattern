/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfar
 */
public class Number {
    
    
      public static void main(String[] args) {
        
        
        
        showNumber();
    }
      
      
      
      static void showNumber(){
      
     System.out.print("   ");
          
          
      for(int i = 1; i <=9 ;i++ ){
      
      System.out.print(i + "  ");
      
      
      }
      System.out.println();
      System.out.println("----------------------------- ");
      
     for (int i = 1; i<10;i++){
         
         System.out.print(i + "| ");
     
        for(int j = 1 ; j < 10 ;j++){
        
        if(i*j >9){
        System.out.print(i*j + " ");
        }
        else{
        System.out.print(i*j + "  ");
        }
        
        
        }
         
     System.out.println();
     }
      
      
      
      
      }
    
    
}
