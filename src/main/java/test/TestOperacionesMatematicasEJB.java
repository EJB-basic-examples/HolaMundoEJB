package test;

import beans.OperacionesMatematicasEjbRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestOperacionesMatematicasEJB {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            OperacionesMatematicasEjbRemote operacionesMatematicasEJB = (OperacionesMatematicasEjbRemote)jndi.lookup("java:global/HolaMundoEJB-1.0/OperacionesMatematicasEjbImpl!beans.OperacionesMatematicasEjbRemote");
            int operador1 = 5;
            int operador2 = 3;
            int suma = operacionesMatematicasEJB.sumar(operador1, operador2);
            int resta = operacionesMatematicasEJB.restar(operador1, operador2);
            int multiplicacion = operacionesMatematicasEJB.multiplicar(operador1, operador2);
            int division = operacionesMatematicasEJB.dividir(operador1, operador2);
            
            System.out.println("Operaciones matematicas enteras");
            imprimir("Suma", operador1 + " + " + operador2, suma);
            imprimir("Resta", operador1 + " - " + operador2, resta);
            imprimir("Multiplicacion", operador1 + " * " + operador2, multiplicacion);
            imprimir("Division", operador1 + " / " + operador2, division);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
        
    }
    
    public static void imprimir(String nombreOperacion, String operacion, int resultado) {
        System.out.printf("%s: %s = %d\n", nombreOperacion, operacion, resultado);
    }
}
