/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstDatosNormales;

/**
 * 20/12/2021
 * @author Erick Perez
 */
public class ListaEst {
    //Atributos
    private int _max;
    private int _numEle;
    private RegLibro[] _libreria;

    //Constructor
    public ListaEst(int max) {
        this._max = max;
        this._numEle = 0;
        this._libreria = new RegLibro[this._max];
    }
    public ListaEst() {
        this._max = 10;
        this._numEle = 0;
        this._libreria = new RegLibro[this._max];
    }

    //Getter and Setter
    public int max() {
        return _max;
    }

    public void max(int max) {
        this._max = max;
    }

    public int numEle() {
        return _numEle;
    }

    public void numEle(int numEle) {
        this._numEle = numEle;
    }

    public RegLibro[] libreria() {
        return _libreria;
    }

    public void libreria(RegLibro[] cine) {
        this._libreria = cine;
    }
    
    public RegLibro libreria(int pos) {
        return _libreria[pos];
    }

    public void cine(int pos,RegLibro c) {
        this._libreria[pos] = c;
    }
   
    //---------------------------------------------------------------------------------------------------//
    //Funcion para recorrer los elementos de la lista
    public void recorrer(int posicion, boolean derecha){
        if(derecha){      //si es verdadero, entonces se recorre a la derecha        (Si se agrega elementos)
            for(int i=this._numEle; i>=posicion; i--){
                this._libreria[i]=this._libreria[i-1];
            }
        }else{          //Si es false, entonces se recorre a la izquierda         (Si se elimina elementos)
            for(int i=posicion; i<=this._numEle; i++){
                this._libreria[i-1]=this._libreria[i];
                if(i==this._numEle){
                    this._libreria[i-1]=null;
                }
            }
        }
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para colocar elementos a al lista, devuelve falso si la lista esta llena
    public boolean poner(int posicion, RegLibro pelicula){
        boolean resp=true;
        if(this._numEle<this._max){
            if(posicion>this._numEle){
                this._libreria[this._numEle]=pelicula;
            }else{
                recorrer(posicion, true);
                this._libreria[posicion-1]=pelicula;
            }
            this._numEle++;
        }else{
           resp=false; 
        }
        return resp;
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para sacar elementos de la lista, devuelve false si la lista esta vacia
    public boolean sacar(int posicion){
        boolean resp=true;
        if(this._numEle>0){
            if(posicion<=this._numEle){
                recorrer(posicion, false);
                this._numEle--;
            }else{
                resp=false;  
            }
        }else{
            resp=false;
        }
        return resp;
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para imprimir la lista
    @Override
    public String toString(){
        String texto="";
        for(int i=0; i<this._numEle; i++){
            texto+= i+1 +".-\t"+this._libreria[i].toString()+"\n";
        }
        return texto;
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para buscar elementos en la lista en funcion del titulo
    public String buscarTitulo(String dato){
        String titulo="";
        for(int i=0; i<this._numEle; i++){
            if(this._libreria[i].getTitulo().equals(dato)){
                titulo+=i+1 +".-\t"+this._libreria[i].toString()+"\n";
            }
        }
        return titulo;
    }
    //Funcion para buscar elementos en la lista en funcion del autor
    public String buscarAutor(String dato){
        String titulo="";
        for(int i=0; i<this._numEle; i++){
            if(this._libreria[i].getAutor().equals(dato)){
                titulo+=i+1 +".-\t"+this._libreria[i].toString()+"\n";
            }
        }
        return titulo;
    }
    //Funcion para buscar elementos en la lista en funcion del isbn
    public String buscarIsbn(int dato){
        String titulo="";
        for(int i=0; i<this._numEle; i++){
            if(this._libreria[i].getIsbn()==dato){
                titulo+=i+1 +".-\t"+this._libreria[i].toString()+"\n";
            }
        }
        return titulo;
    }
    //Funcion para buscar elementos en la lista en funcion del precio
    public String buscarPrecio(int dato){
        String titulo="";
        for(int i=0; i<this._numEle; i++){
            if(this._libreria[i].getPrecio()==dato){
                titulo+=i+1 +".-\t"+this._libreria[i].toString()+"\n";
            }
        }
        return titulo;
    }
    //Funcion para buscar elementos en la lista en funcion de la posicion
    public String buscarPosicion(int dato){
        String titulo="";
        for(int i=0; i<this._numEle; i++){
            if(i==dato){
                titulo+=i+1 +".-\t"+this._libreria[i].toString()+"\n";
            }
        }
        return titulo;
    }
}
