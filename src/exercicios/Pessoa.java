package exercicios;

public class Pessoa {
    // atributos = características
    private String id;
    private String name;
    private int age;
    private int weight; // kg
    private int height; // metros

    // CONSTRUTORES
    Pessoa() {

    };

    Pessoa(String id, String name, int age) {

    };

    Pessoa(String id, String name, int age, int weight, int height) {

    };

    // MÉTODOS
    int calcularIMC(int weight, int height) {
        int imc = weight / (height ^ 2);

        if (imc < 20) {
            return -1;
        } else {
            if (imc >= 20 && imc <= 25) {
                return 0;
            } else {
                return -1;
            }
        }
    };

    boolean ehMaioIdade(int age) {
        return age >= 18;
    };
}
