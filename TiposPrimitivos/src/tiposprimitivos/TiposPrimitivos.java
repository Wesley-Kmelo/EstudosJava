/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author W_TheVirous
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dadosentrada = new Scanner(System.in);
        System.out.print("Digite o nome do aluno :");
        String nome = dadosentrada.nextLine();
        System.out.print("DIgite a nota do aluno, com virgula se precisare :");
        float nota = dadosentrada.nextFloat();
        System.out.println();
        System.out.printf("A nota de %s é %.2f \n \n" , nome , nota );
        
    }

}
