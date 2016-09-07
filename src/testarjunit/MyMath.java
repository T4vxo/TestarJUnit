/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarjunit;

/**
 *
 * @author Daniel
 */
public class MyMath {
    
    public int add(String a, String b){       
        int tal1, tal2; 
        try {
            tal1 = Integer.parseInt(a);
            tal2 = Integer.parseInt(b);
            return tal1+tal2;
        } catch (Exception e) {
            throw new NumberFormatException("Du måste ha siffror");
        }
    }
    
    public boolean isEqual(int a, int b){
        return a == b;
    }
    
    public double convertToFarenheit(double c){
        //om c < -273.15 
            //skicka fel
            //throw new NumberFormatException("Cant be lower than abs zero");
            
            // Temp F = 1.8xC + 32
        return 0; 
    }
    
    public int compareTo(int a, int b){
        
        //om a > b --> 1
        
        //om a == b --> 0
        
        //om a < b --> -1
        return 0; 
    }
}
