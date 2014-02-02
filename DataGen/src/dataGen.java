/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class dataGen {

   // ----------------------------------------------
	
    public static void main(String[] args) {
        // TODO code application logic here
    
        Random generator = new Random();
        
        for ( int i = 0 ; i < 500 ; i++ ) {
        
            int rand = generator.nextInt(98) + 1;
            
            System.out.println("arr.insert(" + rand + ");");
        
        } // end for
    
    } // end main
    
} // end main class