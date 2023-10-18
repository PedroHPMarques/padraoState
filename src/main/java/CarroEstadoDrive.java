public class CarroEstadoDrive extends CarroEstado {
    private CarroEstadoDrive(){};
    private static CarroEstadoDrive instance = new CarroEstadoDrive();
    public static CarroEstadoDrive getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Dirigindo";
    }

    public boolean estacionar(Carro carro){
        carro.setEstado(CarroEstadoPark.getInstance());
        return true;
    }
    public boolean re(Carro carro){
        carro.setEstado(CarroEstadoReverse.getInstance());
        return true;
    }
    public boolean neutro(Carro carro){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        return true;
    }

}
