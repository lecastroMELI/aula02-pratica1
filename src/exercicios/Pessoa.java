package exercicios;

public class Pessoa {
    // atributos = características
    String id;
    String name;
    int age;
    int weight; // kg
    int height; // metros

    Pessoa() {

    };

    Pessoa(String id, String name, int age) {

    };

    Pessoa(String id, String name, int idade, int weight, int height) {

    };

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
