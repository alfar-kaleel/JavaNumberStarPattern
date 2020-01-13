/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author alfar
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        showPyramid();
    }
    
    static void showPyramid(){
    
    for(int i = 1 ; i<=19 ;i= i+2 ){
        
         
    
       for (int j=19 - i; j>=1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            }   
    
        for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                
                if(i!=j){
                System.out.print("* "); 
                }
                
            } 
    
       System.out.println();
    
    }
    
    
     for(int i = 1 ; i<=19 ;i= i+2 ){
        
         
     for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                
                if(i!=j){
                System.out.print(" "); 
                }
                
            }
         
         
       for (int j=18 - i; j>=1; j--) 
            { 
                // printing spaces 
                System.out.print("* "); 
            }   
    
        
    
       System.out.println();
    
    }
    
    
        
         
    
    
    
    }
    
}
