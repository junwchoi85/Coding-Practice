/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.reviewingoca.cat.species;

import com.oracle.education.reviewingoca.cat.BigCat;

/**
 *
 * @author junwh
 */
public class Lynx extends BigCat{
    public static void main(String []args) {
        BigCat cat = new BigCat();
        System.out.println("name = " + cat.name);
        System.out.println("hasFur = " + cat.hasFur);
        /*
        Lynx cat = new Lynx();
        then it would have access to hasFur.
        */
        System.out.println("hasPaws = " + cat.hasPaws);
        System.out.println("id = " + cat.id);
    }
}




