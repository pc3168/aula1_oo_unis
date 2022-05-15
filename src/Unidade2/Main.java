package Unidade2;

public class Main {
    public static void main(String[] args) {
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("José", "Maria", 1234.54, 2);

        funcionarioComissionado.vendeu(5);
        System.out.println("Nome: "+ funcionarioComissionado.getNome());
        System.out.println("Sobrenome: "+ funcionarioComissionado.getSobreNome());
        System.out.println("Salário Base: "+ funcionarioComissionado.getSalario());
        System.out.println("Total (Sal + Com): "+ funcionarioComissionado.calcPagamento());
    }
}
