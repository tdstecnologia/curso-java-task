package br.com.tdstecnologia.luciana.notafiscal.vendas;

public class Vendas {
   
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal();
        Produto radio = new Produto("Radio", 200.99);
        Produto tv = new Produto("Televisao", 100.00);
        
        nf.getProduto().add(radio);
        nf.getProduto().add(tv);
        
        CalcularValorNF calc = new CalcularValorNF();
        Double total = calc.calcularValorTotalNF(nf);
                
      
        System.out.println("O valor total é: " + total);
    }
}

/**
 * @author luestevam@homail.com
 */
