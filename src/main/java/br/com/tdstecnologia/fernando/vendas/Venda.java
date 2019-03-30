package br.com.tdstecnologia.fernando.vendas;

/**
 *
 * @author fernandoborgescarvalho@gmail.com
 */
public class Venda {

    public static void main(String[] args) {

        NotaFiscal nf = new NotaFiscal();

        Produto radio = new Produto();
        Produto radio2 = new Produto();

        radio.setNome("Som1");
        radio.setPreco(1000.0);

        radio2.setNome("Som2");
        radio2.setPreco(1050.0);

        nf.getProdutos().add(radio);
        nf.getProdutos().add(radio2);

        CalcularValorNF vendatotal = new CalcularValorNF() ;

        Double total = vendatotal.calcularValorTotalDaNotaFiscal(nf);

        System.out.println(total);

    }

}
