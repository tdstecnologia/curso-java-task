package br.com.tdstecnologia.samira.vendas;

/**
 * @author Expression Samorim is undefined on line 6, column 14 in
 * Templates/Classes/Class.java.
 */
public class Vendas {

    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal();

        Produto celular = new Produto("Celular", 999.99);

        Produto televisao = new Produto("Televisao", 2333.00);
        
        nf.getProduto().add(celular);
        nf.getProduto().add(televisao);
        
        CalcularValorNF calc = new CalcularValorNF();
        Double total = calc.calcularValorTotalNF(nf);
                
        System.out.println(total);
    }
}
