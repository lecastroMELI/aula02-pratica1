package exercicios;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("A321","Dyana Prince", 35);
        Pessoa pessoa3 = new Pessoa("B245", "Wonder Woman", 35, 65,175);

        int IMC;
        boolean maioridade;

        IMC = pessoa3.calcularIMC(65, 175);
        maioridade = pessoa3.ehMaioIdade(35);

        System.out.println(IMC);
        System.out.println(maioridade);
    }
}
