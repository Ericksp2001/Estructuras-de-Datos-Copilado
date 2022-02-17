/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstDatosNormales;

/**
 * 20/12/2021
 * @author Erick Perez
 */
public class RegLibro {
    private String _titulo;
    private String _autor;
    private int _precio;
    private int _isbn;

    public RegLibro(String nombre, String autor, int precio, int isbn) {
        this._titulo = nombre;
        this._autor = autor;
        this._precio = precio;
        this._isbn = isbn;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String titulo) {
        this._titulo = titulo;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String autor) {
        this._autor = autor;
    }

    public int getPrecio() {
        return _precio;
    }

    public void setPrecio(int precio) {
        this._precio = precio;
    }

    public int getIsbn() {
        return _isbn;
    }

    public void setIsbn(int isbn) {
        this._isbn = isbn;
    }
    
    @Override
    public String toString(){
        return _isbn+"\t"+_titulo+"de "+ _autor+"\t"+_precio;
    }
}
