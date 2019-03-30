package br.com.tdstecnologia.breno.vendas;

public class Venda {
    
    public static void main(String[] args) {
        NotaFiscal nota = new NotaFiscal();
        
        Produto relogio = new Produto();
        relogio.setNome("Armani");
        relogio.setPreco(300.0);
        
        Produto celular = new Produto();
        celular.setNome("Xiaomi");
        celular.setPreco(1000.0);
        
        nota.getProdutos().add(relogio);
        nota.getProdutos().add(celular);
        
        CalcularValorNF calcnf = new CalcularValorNF();
        Double total = calcnf.calcularValorTotalDaNotaFiscal(nota);
        System.out.println(total);
    }
}
