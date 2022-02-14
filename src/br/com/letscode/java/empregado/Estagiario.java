package br.com.letscode.java.empregado;

import java.math.BigDecimal;

// Estagiario -> classe-filha, subclass
// Empregado -> classe-pai, superclass
public class Estagiario extends Empregado {

    public Estagiario() {
        super();
    }

    public Estagiario(String nome, String endereco, BigDecimal salario) {
        super(nome, endereco, salario);
    }

    public void faltarTrabalhoParaFazerProva() {
        System.out.println("Justificar falta para ir fazer prova");
    }

    @Override
    public String toString() {
        return "Estagiario{" +
            "nome='" + super.nome + '\'' +
            ", endereco='" + super.endereco + '\'' +
            ", salario=" + super.salario +
            '}';
    }
}
