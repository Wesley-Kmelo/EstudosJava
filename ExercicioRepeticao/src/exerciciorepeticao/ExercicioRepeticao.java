/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author W_TheVirous
 */
public class ExercicioRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, parimpar, totalpar = 0, par = 0, impar = 0, acima100 = 0, media, somavalores = 0, soma = 0;
        String ac100, partxt, impartxt, ac100txt;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Digite um Número <br> Digite 0 para interromper"));

            if (n > 100) {
                acima100++;
            }

            parimpar = n % 2;
            if (parimpar == 0) {
                par++;

            } else {

                impar++;
            }

            soma += n;

        } while (n != 0);

        if (acima100 > 0) {
            ac100 = acima100 + " valores acima de 100 foram digitados.";
        } else {
            ac100 = " Nenhum valor acima de 100 foi digitado.";
        }

        if (soma == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Número foi digitado");

        } else {
            totalpar = par - 1;
            media = (soma / (totalpar + impar));
            somavalores = (totalpar + impar);

            if (totalpar == 1) {
                partxt = " valor é numero par e ";
            } else {
                partxt = " valores são números pares e ";
            }

            if (impar == 1) {
                impartxt = " valor é número ímpar . ";
            } else {
                impartxt = " valores são números ímpares .";
            }
            if (acima100 == 1) {
                ac100 = acima100+" valor acima de 100 foi digitado.";

             } else if (acima100>1){
                ac100= acima100+" valores acima de 100 foram digitados.";
            }else{
                 ac100 = "Nenhum valor acima de 100 foi digitado";
             }
            
                       
                JOptionPane.showMessageDialog(null, "<html> A soma dos números digitados é: " + soma
                        + " <br> Foram digitados " + somavalores + " valores, sendo que "
                        + totalpar + partxt
                        + "<br>" + impar + impartxt
                        + "<br>"
                        + "<br>" + ac100
                        + "<br> A média dos valores digitados é : " + media);
                     
            }
        }
    }
