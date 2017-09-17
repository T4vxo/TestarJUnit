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
    
    public int difference(int a, int b){
        //skillnaden mellan a och b; 
        
        //om a = 4 och b = 2 -> 2
        
        //om a = 2 och b = 4 -> 2
        
        return 0;
    }
    


}
