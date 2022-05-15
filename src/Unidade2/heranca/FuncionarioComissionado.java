package Unidade2.heranca;

public class FuncionarioComissionado extends Funcionario{

    private double comissao;
    private int quantidadeVendida;


    public FuncionarioComissionado(String nome, String sobreNome, double salario, double comissao) {
        super(nome, sobreNome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double calcPagamento(){
        return ( getSalario() + ( getComissao() * getQuantidadeVendida()));
    }

    public void vendeu(int qtdVendida){
        setQuantidadeVendida(getQuantidadeVendida() + qtdVendida);
    }

    public void zeraVendas(){
        setQuantidadeVendida(0);
    }


}
