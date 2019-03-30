package br.com.tdstecnologia.breno.vendas;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    
    private List<Produto> produtos;
    
    public NotaFiscal (){
    }
    
    public List<Produto> getProdutos() {
        if(this.produtos == null){
            this.produtos = new ArrayList<>();
        }
        return produtos;
    }
    
    public void setProdutos(List<Produto> produtos){
        this.produtos = produtos;
    }
    
}
