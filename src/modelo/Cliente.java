
package modelo;

/**
 *
 * @author Emerson
 */
public class Cliente extends Persona {
    private String celular;
    private float dinero;
    
    public Cliente(String nombre, String paterno, String materno, String nacimiento, String numDocumento, String celular,
            float dinero) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }
    
    public boolean pagar() {
        
    }

    public boolean recargarDinero(float monto) {
        if (monto > 0) {
            dinero += monto;
            return true;
        }
        return false;
    }
}
