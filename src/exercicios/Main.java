package exercicios;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("A321","Dyana Prince", 35);
        Pessoa pessoa3 = new Pessoa("B245", "Wonder Woman", 35, 65,175);

        int IMC;
        boolean maioridade;

        IMC = pessoa3.calcularIMC(65, 175);
        maioridade = pessoa3.ehMaiorIdade(35);

        switch (IMC){
            case -1:
                System.out.println("Abaixo do peso");
                break;
            case 0:
                System.out.println("Peso saudável");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
        }

        System.out.println(pessoa3.getName() + " é maior de idade? " + maioridade);

        System.out.println(pessoa3);
    }
}
