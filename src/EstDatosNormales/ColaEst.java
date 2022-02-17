/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstDatosNormales;

/**
 * 20/12/2021
 * @author Erick Perez
 */
public class ColaEst {
    private ListaEst _cola;
    
    public ColaEst(int max){
        _cola= new ListaEst(max);
    }
    
    public ColaEst(){
        _cola= new ListaEst();
    }

    public ListaEst getCola() {
        return _cola;
    }

    public void setCola(ListaEst cola) {
        this._cola = cola;
    }
    public boolean encolar( RegLibro libro){
        return _cola.poner(_cola.numEle()+1, libro);
    }
    public boolean desencolar(){
        return _cola.sacar(1);
    }
    
    @Override
    public String toString(){
        return _cola.toString();
    }
}
