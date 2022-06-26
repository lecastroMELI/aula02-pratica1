package exercicios;

public class Pessoa {
    // atributos = características
    private String id;
    private String name;
    private int age;
    private int weight; // kg
    private int height; // metros

    // CONSTRUTORES
    Pessoa() {}

    Pessoa(String id, String name, int age) {}

    Pessoa(String id, String name, int age, int weight, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // MÉTODOS
    int calcularIMC(int weight, int height) {
        int imc = weight / (height ^ 2);

        if (imc < 20) {
            return -1;
        } else {
            if (imc <= 25) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    boolean ehMaiorIdade(int age) {
        return age >= 18;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id
            + ", Nome: " + name
            + ", Peso: " + weight + "kg"
            + ", Altura: " + height + "m"
            + ", Idade: " + age + " anos";
    }
}
