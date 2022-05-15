package Unidade2.sobreposicao;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcula(3 , 3));
        System.out.println(calc.calcula(2.2, 8.9));
        System.out.println(calc.calcula("deu " , "Certo?"));

    }
}
