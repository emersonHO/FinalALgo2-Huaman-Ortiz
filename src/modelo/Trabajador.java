
package modelo;

/**
 *
 * @author Emerson
 */
public class Trabajador extends Persona {
    private String password;
    private String email;

    public Trabajador(String password, String email, String nombre, String paterno, String materno, String nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean ingresar(String email, String password) {
        
    }

    public boolean salir() {
        
    }

    public boolean crearVenta(Cliente c) {
        
    }
}
