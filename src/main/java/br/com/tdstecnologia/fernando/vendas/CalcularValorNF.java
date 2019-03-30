package br.com.tdstecnologia.fernando.vendas;

import java.util.List;

/**
 *
 * @author fernandoborgescarvalho@gmail.com
 */
public class CalcularValorNF {

    public Double calcularValorTotalDaNotaFiscal(NotaFiscal nf) {

        Double total = 0.0;

        List<Produto> produtos = nf.getProdutos();

        for (int i = 0; i < produtos.size(); i++) {

            Produto p = produtos.get(i);
            total = total + p.getPreco();

        }

        return total;

    }

}
