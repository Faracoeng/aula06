package poo;

public class Aritmetica {
    /**
     * Esse método retorna a soma de dois inteiros
     *
     * @param x primeiro inteiro
     * @param y segundo inteiro
     * @return soma dos dois inteiros
     */

    public int soma(int x, int y) {
        return x + y;
    }

    /**
     * Esse método retorna a subtração de dois inteiros
     *
     * @param x primeiro inteiro
     * @param y segundo inteiro
     * @return subtração dos dois inteiros
     */

    public int sub(int x, int y) {
        return x - y;
    }

    /**
     * Esse método retorna a multiplicação de dois inteiros
     *
     * @param x primeiro inteiro
     * @param y segundo inteiro
     * @return multiplica dos dois inteiros
     */

    public int mult(int x, int y) {
        return x * y;
    }

    /**
     * Esse método retorna a divisão de dois inteiros
     *
     * @param x primeiro inteiro
     * @param y segundo inteiro
     * @return divisão dos dois inteiros, retornando um float
     */
    public float div(int x, int y) {
        return (float) x/y;
    }
}
