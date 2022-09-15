package caneta;

public class Caneta {
    public String cor;
    public String modelo;
    protected float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String cor, String modelo, float ponta, int carga, boolean tampada) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
        this.status();
    }
    void status() {
        System.out.println("Cor: "+getCor());
        System.out.println("Modelo: "+getModelor());
        System.out.println("Ponta: "+getPonta());
        System.out.println("Carga: "+getCarga());
        System.out.println("Esta tampada?: "+getTampada());
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelor() {
        return this.modelo;
    }
    public String setModelo(String modelo) {
        this.modelo = modelo;
        return modelo;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public float getCarga() {
        return this.carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void rabiscar() {
        if (this.tampada) {
            destampar();
            System.out.println("Rabiscamdo...");
            tampar();
        } else {
            System.out.println("Rabiscando...");
            tampar();
        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Tampando caneta...");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Destampando caneta...");
    }


}