/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programamedia;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        System.out.print("Primeiroa nota: ");
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua Média foi " + m);
        if (m>9) {
            System.out.println("Parabéns, pequeno gafanhoto");
        }
    }
}
