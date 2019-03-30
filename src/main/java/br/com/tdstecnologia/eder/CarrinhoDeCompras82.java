package br.com.tdstecnologia.eder;

public class CarrinhoDeCompras82 {

    public static void main(String[] args) {

        RepresentarTV81 lg = new RepresentarTV81();
        lg.preco = 999.0;

        RepresentarTV81 aoc = new RepresentarTV81();
        aoc.preco = 900.0;
        
        CarrinhoDeCompras82 carrinho = new CarrinhoDeCompras82();
        carrinho.calcularValorTotalCompras(lg);

    }

    public void calcularValorTotalCompras(RepresentarTV81 tv) {
        Double total = 0.0;
        total = tv.preco;
        System.out.println("TV Preço: " + total);

    }
}
