package apredendojava;


public class Task75 {

    public String marca;
    public String modelo;
    public String tela;
    private String cor;
    private int polegada;
    private boolean smart;

    public Task75(String a, String m, String c, String t, int p) {  //Este metodo construtor 
        this.marca = a;
        this.modelo = m;
        this.tela = t;
        this.cor = c;
        this.polegada = p;
        this.smart();

    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String a) {
        this.modelo = a;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getTela() {
        return this.tela;
    }

    public void setTela(String t) {
        this.modelo = t;
    }

    public float getPolegada() {
        return this.polegada;
    }

    public void setPolegada(int p) {
        this.polegada = p;
    }

    public void smart() {
        this.smart = true;

    }

    public void nsmart() {
        this.smart = false;

    }

    public void status() {
        System.out.println("Sobre a Televisão");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tela: " + this.getTela());
        System.out.println("Polegada: " + this.getPolegada());
        System.out.println("Cor: " + this.cor);
        System.out.println("Smart: " + this.smart);

    }

}
