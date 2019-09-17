/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaaula2;

/**
 *
 * @author USUARIO
 */
public class Pessoa {
    
    private String Nome;
    private int Matricula;
    private String Disciplina;
    private String Cpf;
    private String Endereco;
    private String Horario;

    public String getNome() {
        return Nome;
    }

    public void setNome(String N) {
        this.Nome = N;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int M) {
        this.Matricula = M;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String D) {
        this.Disciplina = D;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String C) {
        this.Cpf = C;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String E) {
        this.Endereco = E;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String H) {
        this.Horario = H;
    }
    
}
