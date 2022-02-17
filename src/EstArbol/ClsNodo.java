

package EstArbol;

public class ClsNodo {
    private ClsVeterinaria _inf;
    private ClsNodo _enlizq;
    private ClsNodo _enlder;
    
    public ClsNodo (){
        _inf = new ClsRecepcion();
        _enlizq=null;
        _enlder=null;
    }
    
    public ClsNodo(ClsRecepcion recep){
        this._inf=recep;
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
     public void setInf(ClsRecepcion dato){
        _inf=dato;
    }
    
    public ClsRecepcion getInf(){
        return _inf;
    }
}
