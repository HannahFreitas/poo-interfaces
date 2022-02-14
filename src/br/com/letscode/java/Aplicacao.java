package br.com.letscode.java;

import br.com.letscode.java.empregado.Empregado;
import br.com.letscode.java.empregado.Estagiario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
//        extracted();

        Empregado emp = new Empregado("Ana", "Rua Principal, 100", BigDecimal.ONE);
        Empregado ger = new Gerente("João", "Rua Alta, 10", BigDecimal.TEN);
        Empregado estag = new Estagiario("Silva", "Rua Nova, 11", BigDecimal.TEN);//cast

        Empregado[] empregados = new Empregado[3];
        empregados[0] = emp;
        empregados[1] = ger;
        empregados[2] = estag;

        Empregado[] emps = { emp, ger, estag};

        List<Empregado> lista = new ArrayList<>();
        lista.add(ger);
        lista.add(estag);
        lista.add(emp);

        System.out.println(lista);

        lista.sort(null);

        System.out.println(lista);

        FolhaPagamento<Empregado> fp = new FolhaPagamento<>(estag);
        BigDecimal salario = fp.calcularSalario(10);
        System.out.println(salario);
    }

    private static void extracted() {
        Empregado empregado = new Empregado();
//        empregado.nome = "Jessé";
        empregado.getNome();

        Empregado estagiario = empregado;
        estagiario.setNome("Estagiario");
        estagiario.setEndereco("Rua Ali Atrás");
//        System.out.println(empregado.equals(estagiario));
        String texto = "texto";
//        System.out.println(empregado.equals(texto));
        Empregado jesse = new Empregado();
        jesse.setNome("Jessé");
//        System.out.println(empregado.equals(jesse));

        System.out.println(empregado);
        System.out.println(estagiario);
        System.out.println(jesse);

        String nome = "Fulano";
        Empregado gerente = new Empregado("Fulano", "Rua Rica", BigDecimal.valueOf(10_000));

        Estagiario stags = new Estagiario("UpStags", "Rua Ali Depois, 0", BigDecimal.valueOf(10_000));
        System.out.println(stags);
//        System.out.println(stags.nome);
        System.out.println(stags.getNome());
    }

}
