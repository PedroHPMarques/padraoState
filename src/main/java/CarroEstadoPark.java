public class CarroEstadoPark extends CarroEstado {
    private CarroEstadoPark(){};
    private static CarroEstadoPark instance = new CarroEstadoPark();
    public static CarroEstadoPark getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Estacionado";
    }
    public boolean dirigir(Carro carro){
        carro.setEstado(CarroEstadoDrive.getInstance());
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
