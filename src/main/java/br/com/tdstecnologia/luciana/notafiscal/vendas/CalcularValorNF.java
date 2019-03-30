package br.com.tdstecnologia.luciana.notafiscal.vendas;

import java.util.List;
public class CalcularValorNF {

    public Double calcularValorTotalNF(NotaFiscal nf){
        Double total = 0.0;
        
        List<Produto> produto = nf.getProduto();
        
        for(int i = 0; i < produto.size(); i++){
            Produto p = produto.get(i);
            total = total + p.getValor();
        
    }
    return total;    
        
    }    
    
}



















/**
  * @author luestevam@homail.com
 */