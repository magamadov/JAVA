/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author mgmzlm
 */
public class Beer99 {
       
      public static void main(String[] args) {
    
    int numbBottles = 99;
    String bottle = " бутылок", bottle2 = " бутылка", bottle3 = " бутылки";
    String bottleInsert = "";      
    
    
    for (int x = 0; numbBottles > x; numbBottles--) {
        
        int n = numbBottles % 10;
        
        if (numbBottles >= 13 && numbBottles <= 19) {
             bottleInsert = bottle;
        } else {
            if (n == 1) {
                bottleInsert = bottle2;
            } else if (n == 2 || n == 3 || n == 4){
                bottleInsert = bottle3;
            }  else {
                bottleInsert = bottle;
            }
        }
        
        
        System.out.println(numbBottles + bottleInsert + " пива на стене");
        System.out.println(numbBottles + bottleInsert + " пива!");
        System.out.println("Возьми одну, пусти по кругу");        
        
    }
    System.out.println("Нет больше пива!");
 

}
    
    
}
