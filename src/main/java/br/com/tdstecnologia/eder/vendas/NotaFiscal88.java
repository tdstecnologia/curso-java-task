package br.com.tdstecnologia.eder.vendas;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal88 {

    private List<Produto88> produtos;

    public NotaFiscal88() {
    }

    public List<Produto88> getProdutos() {
        if (this.produtos == null) {
            this.produtos = new ArrayList<>();

        }
        return produtos;
    }

}
