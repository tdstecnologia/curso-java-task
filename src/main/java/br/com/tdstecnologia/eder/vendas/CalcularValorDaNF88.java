package br.com.tdstecnologia.eder.vendas;

import java.util.List;

public class CalcularValorDaNF88 {

    public Double calcularValorTotalNotaFiscal(NotaFiscal88 nf) {
        Double total = 0.0;

        List<Produto88> produtos = nf.getProdutos();

        for (int i = 0; i < produtos.size(); i++) {
            Produto88 p = produtos.get(i);
            total = total + p.getValor();

        }
        return (total);
    }
}
