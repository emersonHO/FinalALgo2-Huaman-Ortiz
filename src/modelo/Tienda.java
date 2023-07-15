
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Cliente[] clientes;
    private Categoria[] categorias;
    private Producto[] productos;

    public Tienda(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new Cliente[10];
        this.categorias = new Categoria[10];
        this.productos = new Producto[10];
    }  

    public void agregarCliente(Cliente c) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = c;
                break;
            }
        }
    }

    public void agregarCategoria(Categoria cat) {
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i] == null) {
                categorias[i] = cat;
                break;
            }
        }
    }

    public void agregarProducto(Producto p) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = p;
                break;
            }
        }
    }

    public Producto[] buscarProductoPorCategoria(Categoria cat) {
        List<Producto> productosEncontrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p != null && p.getCategoria() == cat) {
                productosEncontrados.add(p);
            }
        }
        return productosEncontrados.toArray(new Producto[0]);
    }

    public Producto[] buscarProductoPorNombre(String nombre) {
        List<Producto> productosEncontrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p != null && p.getNombre().equals(nombre)) {
                productosEncontrados.add(p);
            }
        }
        return productosEncontrados.toArray(new Producto[0]);
    }

    public Persona autenticar(String email, String password) {
        
    }
}

