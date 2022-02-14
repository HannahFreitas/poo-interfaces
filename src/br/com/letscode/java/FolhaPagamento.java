package br.com.letscode.java;

import br.com.letscode.java.empregado.Empregado;
import java.math.BigDecimal;

public class FolhaPagamento<T extends Empregado> {

    private T emp;

    public FolhaPagamento(T emp) {
        this.emp = emp;
    }

    public BigDecimal calcularSalario(int horas) {
        return emp.getSalario().multiply(BigDecimal.valueOf(horas));
    }

}
