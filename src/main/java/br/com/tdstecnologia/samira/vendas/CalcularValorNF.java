package br.com.tdstecnologia.samira.vendas;

import java.util.List;

/**
 * @author Expression Samorim is undefined on line 6, column 14 in
 * Templates/Classes/Class.java.
 */
public class CalcularValorNF {

    public Double calcularValorTotalNF(NotaFiscal nf) {
        Double total = 0.0;

        List<Produto> produto = nf.getProduto();

        for (int i = 0; i < produto.size(); i++) {
            Produto p = produto.get(i);
            total = total + p.getValor();
        }
        return total;
    }
}
