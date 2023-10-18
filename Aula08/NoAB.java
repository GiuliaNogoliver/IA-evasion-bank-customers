package Aula08;

public class NoAB {

    private int elemento;
    private NoAB esquerdo;
    private NoAB direito;

    public NoAB(int elm, NoAB esq, NoDE drt) {
        elemento = elm;
        esquerdo = esq;
        direito = drt;
    }
}