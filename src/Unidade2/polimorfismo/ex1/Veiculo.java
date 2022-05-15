package Unidade2.polimorfismo.ex1;

public class Veiculo {

    private String nome;
    private String combustivel;
    private String buzina;
    private int qtdPeneu;

    public Veiculo(String nome, String combustivel, String buzina, int qtdPeneu) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.buzina = buzina;
        this.qtdPeneu = qtdPeneu;
    }

    public String getNome() {
        return nome;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getBuzina() {
        return buzina;
    }

    public int getQtdPeneu() {
        return qtdPeneu;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", buzina='" + buzina + '\'' +
                ", qtdPeneu=" + qtdPeneu +
                '}';
    }

    public static void main(String[] args) {
        Veiculo moto = new Moto("Moto", "Gasolina", "pi.. pi ", 2);
        Veiculo carro = new Carro("Carro", "Etanol ", "bi.. bi ", 4);
        Veiculo caminhao = new Caminhao("Caminhão", "Diesel", "Fóoo... foo ", 6);

        System.out.println(moto);
        System.out.println("------------------------------------");
        System.out.println(carro);
        System.out.println("------------------------------------");
        System.out.println(caminhao);
        System.out.println("------------------------------------");
    }

    public static class Carro extends Veiculo {

        public Carro(String nome, String combustivel, String buzina, int qtdPeneu) {
            super(nome, combustivel, buzina, qtdPeneu);
        }
    }

    public static class Moto extends Veiculo {

        public Moto(String nome, String combustivel, String buzina, int qtdPeneu) {
            super(nome, combustivel, buzina, qtdPeneu);
        }
    }

    public static class Caminhao extends Veiculo {

        public Caminhao(String nome, String combustivel, String buzina, int qtdPeneu) {
            super(nome, combustivel, buzina, qtdPeneu);
        }
    }



}


