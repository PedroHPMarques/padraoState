import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @BeforeEach
    public void setUp(){carro = new Carro();}

    //Carro Estacionado

    @Test
    public void naoDeveEstacionarCarroEstacionado(){
        carro.setEstado(CarroEstadoPark.getInstance());
        assertFalse(carro.estacionar());
    }

    @Test
    public void deveDarRéCarroEstacionado(){
        carro.setEstado(CarroEstadoPark.getInstance());
        assertTrue(carro.re());
        assertEquals(CarroEstadoReverse.getInstance(),carro.getEstado());
    }
    @Test
    public void devePorNeutroCarroEstacionado(){
        carro.setEstado(CarroEstadoPark.getInstance());
        assertTrue(carro.neutro());
        assertEquals(CarroEstadoNeutral.getInstance(),carro.getEstado());
    }
    @Test
    public void deveDirigirCarroEstacionado(){
        carro.setEstado(CarroEstadoPark.getInstance());
        assertTrue(carro.dirigir());
        assertEquals(CarroEstadoDrive.getInstance(),carro.getEstado());
    }

    // Carro Neutro
    @Test
    public void naoDevePorNeutroCarroNeutro(){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        assertFalse(carro.neutro());
    }
    @Test
    public void deveDarRéCarroNeutro(){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        assertTrue(carro.re());
        assertEquals(CarroEstadoReverse.getInstance(),carro.getEstado());
    }
    @Test
    public void deveDirigirCarroNeutro(){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        assertTrue(carro.dirigir());
        assertEquals(CarroEstadoDrive.getInstance(),carro.getEstado());
    }
    @Test
    public void deveEstacionarCarroNeutro(){
        carro.setEstado(CarroEstadoNeutral.getInstance());
        assertTrue(carro.estacionar());
        assertEquals(CarroEstadoPark.getInstance(),carro.getEstado());
    }

    //Carro Dirigindo
    @Test
    public void naoDeveDirigirCarroDirigindo(){
        carro.setEstado(CarroEstadoDrive.getInstance());
        assertFalse(carro.dirigir());
    }
    @Test
    public void deveEstacionarCarroDirigindo(){
        carro.setEstado(CarroEstadoDrive.getInstance());
        assertTrue(carro.estacionar());
        assertEquals(CarroEstadoPark.getInstance(),carro.getEstado());
    }
    @Test
    public void deveDarRéCarroDirigindo(){
        carro.setEstado(CarroEstadoDrive.getInstance());
        assertTrue(carro.re());
        assertEquals(CarroEstadoReverse.getInstance(),carro.getEstado());
    }
    @Test
    public void devePorNeutroCarroDirigindo(){
        carro.setEstado(CarroEstadoDrive.getInstance());
        assertTrue(carro.neutro());
        assertEquals(CarroEstadoNeutral.getInstance(),carro.getEstado());
    }

    //Carro Reverse
    @Test
    public void naoDeveDarRéCarroReverse(){
        carro.setEstado(CarroEstadoReverse.getInstance());
        assertFalse(carro.re());
    }
    @Test
    public void devePorNeutroCarroReverse(){
        carro.setEstado(CarroEstadoReverse.getInstance());
        assertTrue(carro.neutro());
        assertEquals(CarroEstadoNeutral.getInstance(),carro.getEstado());
    }
    @Test
    public void deveEstacionarCarroReverse(){
        carro.setEstado(CarroEstadoReverse.getInstance());
        assertTrue(carro.estacionar());
        assertEquals(CarroEstadoPark.getInstance(),carro.getEstado());
    }
    @Test
    public void deveDirigirCarroReverse(){
        carro.setEstado(CarroEstadoReverse.getInstance());
        assertTrue(carro.dirigir());
        assertEquals(CarroEstadoDrive.getInstance(),carro.getEstado());
    }
}