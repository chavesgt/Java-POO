/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor02;

/**
 *
 * @author Gabriel
 */
public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr","Mai","Jun","Ago","Set","Out","Nov","Dez"};
        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int c=0; c<mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }
    }
}