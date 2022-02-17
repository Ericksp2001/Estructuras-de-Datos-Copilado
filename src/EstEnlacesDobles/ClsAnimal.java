
package EstEnlacesDobles;

/**
 *
 * @author Erick Perez
 * 29/01/2021
 */

public class ClsAnimal {
    private String _nombre;
    private int _cantidad;
    private int _id;

    //Constructores
    public ClsAnimal(String nombre, int cantidad, int id) {
        this._nombre = nombre;
        this._cantidad = cantidad;
        this._id = id;
    }
    
    public ClsAnimal() {
        this._nombre = "";
        this._cantidad = 0;
        this._id = 0;
    }

    //Rutinas Getter y Setter
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public int getCantidad() {
        return _cantidad;
    }

    public void setCantidad(int cantidad) {
        this._cantidad = cantidad;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
    
    //Metodo toString sobreescrito
    @Override
    public String toString(){
        return this.getNombre()+" "+this.getId()+" "+this.getCantidad();
    }
    
}