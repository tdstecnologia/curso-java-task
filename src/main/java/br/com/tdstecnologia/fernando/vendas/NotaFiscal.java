package br.com.tdstecnologia.fernando.vendas;

import java.util.ArrayList;
import java.util.List;

/*Calcular Valora da NF
pacote - vendas



classe NotaFiscal
lista de produtos


classe Produto
nome
preco

classe CalcularValorNF

classe Venda - main Valor total da venda:


 */
public class NotaFiscal {

    private List<Produto> produtos;

    public NotaFiscal() {

    }

    public List<Produto> getProdutos() {
        if (this.produtos == null) {
            this.produtos = new ArrayList<>();
        }
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}


