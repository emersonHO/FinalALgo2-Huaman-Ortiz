
package modelo;

/**
 *
 * @author Emerson
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private String nacimiento;
    private String numDocumento;
}

public class Cliente extends Persona {
    private String celular;
    private float dinero;

    public boolean pagar() {
        
    }

    public boolean recargarDinero() {
        
    }
}