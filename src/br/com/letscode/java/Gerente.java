package br.com.letscode.java;

import br.com.letscode.java.empregado.Empregado;
import java.math.BigDecimal;

public class Gerente extends Empregado {

    public Gerente(String nome, String endereco, BigDecimal salario) {
        super(nome, endereco, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
            "nome='" + super.nome + '\'' +
            ", endereco='" + super.endereco + '\'' +
            ", salario=" + super.salario +
            '}';
    }
}
