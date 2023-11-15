/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashsetexample;

/**
 *
 * @author hp
 */
public class Coin {
    private int denomination;
    
    public Coin(int denomination){
        this.denomination = denomination;
    }
    public int getdenomination(){
        return denomination;
    }
    public int hashCode(){
        return denomination;
    }

    public String toString(){
        return "Coins{"+"denomination=" +denomination+'}';
    }
    
    
}
