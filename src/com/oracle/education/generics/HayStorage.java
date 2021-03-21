/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

/**
 *
 * @author junwh
 * Practicing Singleton Pattern
 */
public class HayStorage {
    private int quantity = 0;
    private HayStorage(){}
    
    private static final HayStorage instance = new HayStorage();
    public static HayStorage getInstance() {
        return instance;
    }
    
    public synchronized void addHay(int amount) {
        quantity += amount;
    }
    
    public synchronized boolean removeHay(int amount) {
        if(quantity<amount) return false;
        quantity -= amount;
        return true;
    }
    
    public synchronized int getHayQuantity() {
        return quantity;
    }
    
}


