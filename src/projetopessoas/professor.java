package projetopessoas;
public class professor extends pessoa{
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aument){
        this.salario+=aument;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
