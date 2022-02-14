package br.com.letscode.java.empregado;

import java.math.BigDecimal;
import java.util.Objects;

public class Empregado implements Comparable<Empregado> {

    protected String nome;
    protected String endereco;
    protected BigDecimal salario;

    @Override
    public int compareTo(Empregado o) {
        return this.nome.compareTo(o.nome);
    }

    public Empregado() {
//        this.nome = "Jessé";
//        this.endereco = "Rua Sem Nome, 100";
//        this.salario = BigDecimal.valueOf(10_000.00);
    }

    public Empregado(String nome, String endereco, BigDecimal salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Empregado empregado = (Empregado) o;//cast
        return Objects.equals(nome, empregado.nome) &&
            Objects.equals(endereco, empregado.endereco) &&
            Objects.equals(salario, empregado.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, salario);
    }

    @Override
    public String toString() {
        return "Empregado{" +
            "nome='" + this.nome + '\'' +
            ", endereco='" + this.endereco + '\'' +
            ", salario=" + this.salario +
            '}';
    }
}
