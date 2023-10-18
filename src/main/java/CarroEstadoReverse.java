public class CarroEstadoReverse extends CarroEstado {
    private CarroEstadoReverse(){};
    private static CarroEstadoReverse instance = new CarroEstadoReverse();
    public static CarroEstadoReverse getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Ré";
    }
    public boolean estacionar(Carro carro){
        carro.setEstado(CarroEstadoPark.getInstance());
        return true;
    }
    public boolean dirigir(Carro carro){
        carro.setEstado(CarroEstadoDrive.getInstance());
        return true;
    }
    public boolean neutro(Carro carro){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        return true;
    }
}
