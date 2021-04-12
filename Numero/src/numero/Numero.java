/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author W_TheVirous
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n, soma = 0;
        Scanner teclado = new Scanner(System.in);
        String resposta;

        do {

            System.out.print("Digite um número : ");
            n = teclado.nextInt();
            soma += n;
            System.out.print("Deseja continuar ? [sim / nao]");
            resposta = teclado.next();
            

        } while (resposta.equals("sim"));
        
        System.out.println("A soma dos números digitados é : " + soma);

    }

}
