public class CarroEstadoNeutral extends CarroEstado {
    private CarroEstadoNeutral(){};
    private static CarroEstadoNeutral instance = new CarroEstadoNeutral();
    public static CarroEstadoNeutral getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Neutro";
    }
    public boolean estacionar(Carro carro){
        carro.setEstado(CarroEstadoPark.getInstance());
        return true;
    }
    public boolean re(Carro carro){
        carro.setEstado(CarroEstadoReverse.getInstance());
        return true;
    }
    public boolean dirigir(Carro carro){
        carro.setEstado(CarroEstadoDrive.getInstance());
        return true;
    }
}
