package primeiroTeste;

public class solucao1 {
    public static void main(String[] args) {
        // 1) Observe o trecho de código abaixo:

        // int INDICE = 13, SOMA = 0, K = 0;

        // enquanto K < INDICE faça

        // {

        // K = K + 1;

        // SOMA = SOMA + K;

        // }

        // imprimir(SOMA);


        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K++;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);

        //A váriavel SOMA tem o valor de 91.
    }
}
