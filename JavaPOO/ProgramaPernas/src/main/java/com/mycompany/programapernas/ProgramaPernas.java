/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas Pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
             case 3:
                 tipo = "Tripé";
                 break;
             case 4 :
                 tipo = "Quadrúpede";
                 break;
             case 5:
                 tipo = "Aranha";
                 break;
             default:
                 tipo = "ET";
                 break;
        }
        System.out.println(tipo);
    }
}
