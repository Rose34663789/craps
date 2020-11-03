/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.craps;

/**
 *
 * @author mkfinnerty21
 */
public class Die {
    
    private int numDots;
    
    public Die() {
        numDots = 0;
    }
    
    public void roll() {
        numDots = (int) (Math.random() * 6 + 1);
    }
    
    public int getNumDots() {
        return numDots;
    }
}
