/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.reviewingoca;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;
/**
 *
 * @author junwh
 */
public class LIstHelper {
    public List <String> copyAndSortList(List <String> original) {
        List <String> list = new ArrayList <String>(original);
        sort(list);
        return list;
    }
}





