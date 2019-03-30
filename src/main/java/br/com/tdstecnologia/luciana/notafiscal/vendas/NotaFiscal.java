package br.com.tdstecnologia.luciana.notafiscal.vendas;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

   private List<Produto>produto;
   
   public NotaFiscal() {
   }
   
   public List<Produto>getProduto(){
       if(this.produto == null) {
           this.produto = new ArrayList();
       }
       return produto;
   }
   
   public void setProdutos(List<Produto>produto) {
           this.produto = produto;
   }

}


















/**
  * @author luestevam@homail.com
 */