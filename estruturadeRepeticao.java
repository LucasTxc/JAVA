

import java.util.Scanner;

public class estruturadeRepeticao {
    public static void main(String[] args){

        char cont;

        Scanner sc = new Scanner(System.in); 

          do {
              System.out.println("Informe o Valor de X: ");
              int x = sc.nextInt();
              if (x < 1 || x > 10) {
                  System.out.println("Valor Invalido!");

              } else {
                  for (int i = x; i <= 10; i++) { 
                      System.out.println("Valor de i: " + i);

                  }
              }
              System.out.println("Deseja continuar [S/N]?");
              cont = sc.next().charAt(0); /*Ler dados do tipo Char*/

              if (cont != 'n' && cont != 'N' || cont != 's' && cont != 'S') {
                  System.out.println("Caractere Invalido");
              }
          } while (cont != 'N' && cont != 'n') ; 
            sc.close();




    }

}
