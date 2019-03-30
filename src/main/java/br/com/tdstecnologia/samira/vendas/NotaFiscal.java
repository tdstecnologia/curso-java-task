package br.com.tdstecnologia.samira.vendas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Expression Samorim is undefined on line 6, column 14 in
 * Templates/Classes/Class.java.
 */
public class NotaFiscal {

    private List<Produto> produtos;

    public NotaFiscal() {
    }

    public List<Produto> getProduto() {
        if (this.produtos == null) {
            this.produtos = new ArrayList<>();
        }
        return produtos;

    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
