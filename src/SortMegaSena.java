
/* 
   Criação de Adelino Junior.
   07 de Feveiro de 2024.
   Exibir 6 números aleatórios distintos de 1 a 60 para jogar na MegaSena.
   Baseado na versão de 18 de setembro de 2003
*/
import java.util.Random;
import java.util.SortedMap;
import javax.swing.JOptionPane;

public class SortMegaSena {

    // Método para sortear as dezenas
    public static void drawNumber(TicketMegaSena ticket) {
        Random r = new Random();
        boolean validNumber = true;
        // Sorteando os números
        for (int i = 0; i < 6; i++) {
            ticket.getSequence()[i] = Math.abs(r.nextInt()) % 61;
            if (i >= 0) {
                for (int j = 0; j < i; j++) {
                    if (ticket.getSequence()[i] == ticket.getSequence()[j]) {
                        validNumber = false;
                        break;
                    }
                }
            }
            if ((validNumber == false) | (ticket.getSequence()[i] == 0)) {
                i--;
                validNumber = true;
            }
        }
    }

    // Método para ordenar as dezenas sorteadas em ordem crescente
    public static void sortNumber(TicketMegaSena ticket) {
        // aux = variável que usaremos para guardar o maior valor de cada comparação
        int aux = 0;
        for (int i = 0; i < ticket.getSequence().length; i++) {
            for (int j = 0; j < ticket.getSequence().length; j++) {
                if (ticket.getSequence()[i] < ticket.getSequence()[j]) {
                    // aqui acontece a troca, o Valor maior vai para a direita e o menor para a
                    // esquerda
                    aux = ticket.getSequence()[i];
                    ticket.getSequence()[i] = ticket.getSequence()[j];
                    ticket.getSequence()[j] = aux;
                }
            }
        }
    }

    public static void showNumbers(TicketMegaSena ticket) {
        JOptionPane.showMessageDialog(null, "As Dezenas Escolhidas Foram: " + ticket.getSequence()[0] + ","
                + ticket.getSequence()[1] + "," + ticket.getSequence()[2] + "," + ticket.getSequence()[3] +
                "," + ticket.getSequence()[4] + "," + ticket.getSequence()[5] + "\n\n Created by Adelino Junior",
                "Dezenas Para Jogar Na MEGASENA", JOptionPane.PLAIN_MESSAGE);
    }
}
