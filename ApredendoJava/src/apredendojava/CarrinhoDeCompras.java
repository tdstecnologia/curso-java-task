package apredendojava;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        TV smarttv32lg = new TV();
        smarttv32lg.preco = 999.5;

        smarttv32lg.calcularValorTotalCompras(smarttv32lg);

    }

    private static class TV {

        private double preco;

        public TV() {
        }

        private void calcularValorTotalCompras(TV smarttv32lg) {
           
        }
    }

}
