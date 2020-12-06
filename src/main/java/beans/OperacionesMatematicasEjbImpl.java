package beans;

import javax.ejb.Stateless;

@Stateless
public class OperacionesMatematicasEjbImpl implements OperacionesMatematicasEjbRemote {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        return a / b;
    }
    
}
