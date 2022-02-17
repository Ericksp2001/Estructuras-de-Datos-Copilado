
package EstEnlacesDobles;
/**
 *
 * @author Erick Perez
 * 29/01/2021
 */
public class ClsNodo2 {
    private ClsAnimal _inf;
    private ClsNodo2 _enlizq;
    private ClsNodo2 _enlder;
    
    //Constructores
    public ClsNodo2 () {
        _inf = new ClsAnimal();
        _enlizq=null;
        _enlder=null;
    }
    public ClsNodo2(ClsAnimal recep){
        this._inf=recep;
        _enlizq=null;
        _enlder=null;
    }
    public ClsNodo2 (ClsNodo2 dato){
        _enlizq =dato._enlizq;
        _enlder=dato._enlder;
        _inf=dato._inf;
    }
    
    //Rutinas Set y Get
    public void enlizq(ClsNodo2 valor){
        _enlizq=valor;
    }
    
    public ClsNodo2 enlizq(){
        return _enlizq;
    }
    
     public void enlder(ClsNodo2 valor){
        _enlder=valor;
    }
     
    public ClsNodo2 enlder(){
        return _enlder;
    }
    
     public void inf(ClsAnimal dato){
        _inf=dato;
    }
    
    public ClsAnimal inf(){
        return _inf;
    }
}
