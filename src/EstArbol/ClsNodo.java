

package EstArbol;

import ClsVeterinaria.ClsVeterinaria;

public class ClsNodo {
    private ClsVeterinaria _inf;
    private ClsNodo _enlizq;
    private ClsNodo _enlder;
    
    public ClsNodo (){
        _inf = new ClsVeterinaria();
        _enlizq=null;
        _enlder=null;
    }
    
    public ClsNodo(ClsVeterinaria vet){
        this._inf=vet;
    }
    
    public ClsNodo (ClsNodo dato){
        _enlizq =dato._enlizq;
        _enlder=dato._enlder;
        _inf=dato._inf;
    }
    
    //Rutinas Set y Get
    public void setIzq(ClsNodo valor){
        _enlizq=valor;
    }
    public ClsNodo getIzq(){
        return _enlizq;
    }
     public void setDer(ClsNodo valor){
        _enlder=valor;
    }
    public ClsNodo getDer(){
        return _enlder;
    }
     public void setInf(ClsVeterinaria dato){
        _inf=dato;
    }
    
    public ClsVeterinaria getInf(){
        return _inf;
    }
}
