
package modelo;

//Eliminamos las librerias (ArrayList, etc)
public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Cliente[] clientes;
    private Categoria[] categorias;
    private Trabajador[] trabajadores;
    private Producto[] productos;
    private int clientesCont;
    private int categoriasCont;
    private int trabajadoresCont;
    private int productosCont;

    public Tienda(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new Cliente[10];
        this.categorias = new Categoria[10];
        this.trabajadores = new Trabajador[10];
        this.productos = new Producto[10];
        this.clientesCont = 0;
        this.categoriasCont = 0;
        this.trabajadoresCont = 0;
        this.productosCont = 0;
    }

    //Cambio de los métodos (ya que se elimino los arrays)
    public void agregarCliente(Cliente c) {
        if (clientesCont < clientes.length) {
            clientes[clientesCont] = c;
            clientesCont++;
        } else {
            System.out.println("No hay suficiente espacio para agregar un nuevo cliente.");
        }
    }

    public void agregarCategoria(Categoria cat) {
        if (categoriasCont < categorias.length) {
            categorias[categoriasCont] = cat;
            categoriasCont++;
        } else {
            System.out.println("No hay suficiente espacio para agregar una nueva categoría.");
        }
    }

    public void agregarTrabajador(Trabajador t) {
        if (trabajadoresCont < trabajadores.length) {
            trabajadores[trabajadoresCont] = t;
            trabajadoresCont++;
        } else {
            System.out.println("No hay suficiente espacio para agregar un nuevo trabajador.");
        }
    }

    public void agregarProducto(Producto p) {
        if (productosCont < productos.length) {
            productos[productosCont] = p;
            productosCont++;
        } else {
            System.out.println("No hay suficiente espacio para agregar un nuevo producto.");
        }
    }

    public Producto[] buscarProductoPorCategoria(Categoria cat) {
        Producto[] productosEncontrados = new Producto[productosCont];
        int count = 0;
        for (int i = 0; i < productosCont; i++) {
            if (productos[i].getCategoria() == cat) {
                productosEncontrados[count] = productos[i];
                count++;
            }
        }
        return productosEncontrados;
    }

    public Producto[] buscarProductoPorNombre(String nombre) {
        Producto[] productosEncontrados = new Producto[productosCont];
        int count = 0;
        for (int i = 0; i < productosCont; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                productosEncontrados[count] = productos[i];
                count++;
            }
        }
        return productosEncontrados;
    }

    public Trabajador autenticar(String email, String password) {
        for (int i = 0; i < trabajadoresCont; i++) {
            if (trabajadores[i].getEmail().equals(email) && trabajadores[i].getPassword().equals(password)) {
                return trabajadores[i];
            }
        }
        return null;
    }
}

