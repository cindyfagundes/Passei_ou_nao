import java.util.Scanner;

public class PasseiOuNao {

    public static void main (String[] args) {
         float nota;
         Scanner entrada = new Scanner (System.in);
            

            System.out.println("Digite sua nota (0.0 ate 10.0): ");
            nota = entrada.nextFloat();

            if ((nota>=0.0) && (nota<=10.0)) {
                  
                if (nota<5.0){
                System.out.println("Reprovado direto");

                }else  {
                    if ((nota>=5.0) && (nota<7.0)){
                    System.out.println("Esta de recuperacao");
                    }else{
                    System.out.println("Parabens! Voce passou direto");
                    }
                  }
                 } 
            else{
                System.out.println("Nota invalida! encerrando sistema");
                }
            }

         }


    



