/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetcaofor;

/**
 *
 * @author W_TheVirous
 */
public class RepetcaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // for (int n = 1; n <= 3; n+=1) { //para inteiro n valendo 1 até qdo valer 3 soma mais 1 ao n
     //       System.out.println(n);
   //     }
   int i,j;
   
        for( i = 0;i<=3;i++){
            for (j = 0 ; j <=6; j+=2){
                System.out.println(i);
                System.out.println(j);
          }
        }
        
    }

}
