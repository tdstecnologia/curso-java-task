package br.com.tdstecnologia.eder.vendas;

import javax.swing.JOptionPane;

public class Venda88 {

    public static void main(String[] args) {
        NotaFiscal88 nf = new NotaFiscal88();
        Produto88 produto1 = new Produto88();
        Produto88 produto2 = new Produto88();
        Produto88 produto3 = new Produto88();

        produto1.setNome("Mi mix");
        produto1.setMarca("Xiaomi");
        produto1.setValor(50.00);
        produto2.setNome("Red Mi");
        produto2.setMarca("Xiaomi");
        produto2.setValor(100.00);
        produto3.setNome("mi Explorer");
        produto3.setMarca("Xiaomi");
        produto3.setValor(500.00);

        nf.getProdutos().add(produto2);
        nf.getProdutos().add(produto1);
        nf.getProdutos().add(produto3);

        CalcularValorDaNF88 vendaTotal = new CalcularValorDaNF88();
        Double total = vendaTotal.calcularValorTotalNotaFiscal(nf);
        System.out.println(total);

    }

}
