package Unidade2.heranca;

public class Funcionario {
    private String nome;
    private String SobreNome;
    private double salario;

    public Funcionario(String nome, String sobreNome, double salario) {
        this.nome = nome;
        SobreNome = sobreNome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
