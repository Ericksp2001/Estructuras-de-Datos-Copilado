/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstDatosNormales;

import ClsVeterinaria.ClsVeterinaria;

/**
 * 20/12/2021
 * @author Erick Perez
 */
public class ListaEst {
    //Atributos
    private int _max;
    private int _numEle;
    private ClsVeterinaria[] _registro;

    //Constructor
    public ListaEst(int max) {
        this._max = max;
        this._numEle = 0;
        this._registro = new ClsVeterinaria[this._max];
    }
    public ListaEst() {
        this._max = 10;
        this._numEle = 0;
        this._registro = new ClsVeterinaria[this._max];
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

    public ClsVeterinaria[] registro() {
        return _registro;
    }

    public void registro(ClsVeterinaria[] cine) {
        this._registro = cine;
    }
    
    public ClsVeterinaria registro(int pos) {
        return _registro[pos];
    }

    public void cine(int pos,ClsVeterinaria c) {
        this._registro[pos] = c;
    }
   
    //---------------------------------------------------------------------------------------------------//
    //Funcion para recorrer los elementos de la lista
    public void recorrer(int posicion, boolean derecha){
        if(derecha){      //si es verdadero, entonces se recorre a la derecha        (Si se agrega elementos)
            for(int i=this._numEle; i>=posicion; i--){
                this._registro[i]=this._registro[i-1];
            }
        }else{          //Si es false, entonces se recorre a la izquierda         (Si se elimina elementos)
            for(int i=posicion; i<=this._numEle; i++){
                this._registro[i-1]=this._registro[i];
                if(i==this._numEle){
                    this._registro[i-1]=null;
                }
            }
        }
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para colocar elementos a al lista, devuelve falso si la lista esta llena
    public boolean poner(int posicion,ClsVeterinaria registro){
        boolean resp=true;
        if(this._numEle<this._max){
            if(posicion>this._numEle){
                this._registro[this._numEle]=registro;
            }else{
                recorrer(posicion, true);
                this._registro[posicion-1]=registro;
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
    
    public String InfoDueños(){
        String texto="";
        for(int i=0; i<this._numEle; i++){
            texto+=this._registro[i].BusDueño()+"\n";
        }
        return texto;
    }
    
    public String InfoMascotas(){
        String texto="";
        for(int i=0; i<this._numEle; i++){
            texto+=this._registro[i].BusMascota()+"\n";
        }
        return texto;
    }
    
    
    public String InfoIdDueños(){
        String texto="";
        for(int i=0; i<this._numEle; i++){
            texto+=this._registro[i].BusIDDueño()+"\n";
        }
        return texto;
    }
    //---------------------------------------------------------------------------------------------------//
    //Funcion para buscar elementos en la lista en funcion del titulo
    public boolean buscarMascota(String dato){
        boolean resp=true;
        for(int i=0; i<this._numEle; i++){
            if(this._registro[i].NombreMascota().equals(dato)){
              return resp;
            }
           
        }
       return false;
    }
     public boolean buscarDueño(String dato){
        boolean resp=true;
        for(int i=0; i<this._numEle; i++){
            if(this._registro[i].NombreDueño().equals(dato)){
              return resp;
            }
           
        }
       return false;
    }
   public boolean buscarIdDueño(String dato){
        boolean resp=true;
        for(int i=0; i<this._numEle; i++){
            if(this._registro[i].IdDueño().equals(dato)){
              return resp;
            }
           
        }
       return false;
    }

    
}