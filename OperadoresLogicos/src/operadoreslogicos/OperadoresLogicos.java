/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author W_TheVirous
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        boolean r;
        x=4;
        y=70;
        z=12;
        r = (x<y && y>z)?true:false; //expressão que diz 'se(expressão) retorna(?)a condição(true ou false)
        System.out.println(r);
    }
    
}
