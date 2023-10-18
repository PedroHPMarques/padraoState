public class Carro {
    private String nome;
    private CarroEstado estado;
    public Carro(){
        this.estado = CarroEstadoPark.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CarroEstado getEstado() {
        return estado;
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }

    public void setEstado(CarroEstado estado){
        this.estado = estado;
    }
    public boolean estacionar() {
        return estado.estacionar(this);
    }
    public boolean re() {
        return estado.re(this);
    }
    public boolean dirigir() {
        return estado.dirigir(this);
    }
    public boolean neutro() {
        return estado.neutro(this);
    }
}
