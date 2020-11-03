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
public class CrapsGame {
    
    private int point;
    
    public CrapsGame() {
        point = 0;
    }
    
    public int processRoll(int total) {
        if (point == 0) {
            if (total == 12 || total == 3 || total == 2) {
                return -1;
            } else if (total == 7 || total == 11) {
                return 1;
            } else {
                point = total;
                return 0;
            }
        } else {
            if (total == point) {
                point = 0;
                return 1;
            } else if (total == 7) {
                point = 0;
                return -1;
            } else {
                return 0;
            }
        }
        
    }
    
    public int getPoint() {
        return point;
    }
}
