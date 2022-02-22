/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstDatosNormales;
/**
 * @author Erick Perez, Alexa Amaguaya
 * 22/02/2022
 */
import ClsVeterinaria.ClsVeterinaria;

/**
 * 20/12/2021
 * @author Erick Perez
 */
public class PilaEst {
    private ListaEst _pila;
    public PilaEst(int max){
        _pila= new ListaEst(max);
    }
    
    public PilaEst(){
        _pila= new ListaEst();
    }

    public ListaEst Pila() {
        return _pila;
    }

    public void Pila(ListaEst pila) {
        this._pila = pila;
    }
    public boolean empilar( ClsVeterinaria registro){
        return _pila.poner(1,registro);
    }
    public boolean desempilar(){
        return _pila.sacar(1);
    }
    
    @Override
    public String toString(){
        return _pila.toString();
    }
}
