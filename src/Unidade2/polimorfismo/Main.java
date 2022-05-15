package Unidade2.polimorfismo;

public class Main {

    public static void main(String[] args) {
        PersonalidadeObj personalidadeObj = new PersonalidadeObj();
        PersonalidadeExtrovertido extrovertido = new PersonalidadeExtrovertido();
        PersonalidadeIntrovertido introvertido = new PersonalidadeIntrovertido();
        PersonalidadePessimista pessimista = new PersonalidadePessimista();

        System.out.println("===================[Forma 1 ]=================");
        System.out.println(personalidadeObj.falar());
        System.out.println(extrovertido.falar());
        System.out.println(introvertido.falar());
        System.out.println(pessimista.falar());

        System.out.println("-----------------------------------------------");


        PersonalidadeObj[] personalidades = new PersonalidadeObj[4];

        personalidades[0] = personalidadeObj;
        personalidades[1] = extrovertido;
        personalidades[2] = introvertido;
        personalidades[3] = pessimista;

        System.out.println("===================[Forma 2 ]=================");
        for (PersonalidadeObj personalidade: personalidades) {
            System.out.println(personalidade.falar());
        }
    }
}
