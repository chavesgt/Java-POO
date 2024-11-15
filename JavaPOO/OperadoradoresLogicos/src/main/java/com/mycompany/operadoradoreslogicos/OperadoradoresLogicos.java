/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoradoreslogicos;

/**
 *
 * @author Gabriel
 */
public class OperadoradoresLogicos {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z= 12;
        boolean r;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
}
