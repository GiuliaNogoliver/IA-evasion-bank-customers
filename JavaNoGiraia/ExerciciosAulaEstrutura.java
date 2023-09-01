package JavaNoGiraia;

import javax.swing.JOptionPane;

public class ExerciciosAulaEstrutura {
    public static void main (String[] args){
        contador();
    // 1) Elaborar um programa, em linguagem Java, capaz inicializar com 0 (zero) um vetor
    // do tipo int de 100 elementos, utilizando-se das malhas (laços, loops, etc.) while, do-while
    // e for;
    }
    public static void contador(){
        int tamanho = 100;
        int[] vetor = new int[tamanho];

        //preciso fazer um loop do tipo while
        int variavel = 0;
        while(variavel < tamanho){
            vetor[variavel]=0;
            variavel++;
        }

        String vetorString = "";
        for (int valor : vetor) {
            vetorString += valor + " ";
        }

        JOptionPane.showMessageDialog(null, vetorString);
    }
    

}
