
package EstEnlacesDobles;

import ClsVeterinaria.ClsVeterinaria;

/**
 *
 * @author Erick Perez
 * 29/01/2021
 */
public class ClsListDim2 {
    private ClsNodo2 _cabizq;
    private ClsNodo2 _cabder;
    private int _nelem;
    
    //Constructor
    public ClsListDim2(){
        _nelem=0;
        _cabizq= new ClsNodo2();
        _cabder = new ClsNodo2();
    }
    
    //Rutinas Getter y Setter
    public void cabizq(ClsNodo2 valor){
        _cabizq=valor;
    }
    
    public ClsNodo2 cabizq(){
        return _cabizq;
    }
    
    public void cabder(ClsNodo2 valor){
        _cabder=valor;
    }
    
    public ClsNodo2 cabder(){
        return _cabder;
    }
    
    public void nelem(int valor){
        _nelem=valor;
    }
    
    public int nelem(){
        return _nelem;
    }
    
    /**
     * Permite incluir un nodo en la lista
     * @param pos Entero que indica la posicion donde se va a colocar el nodo
     * @param dato Objeto de tipo ClsAnimal que sera contenido en un nodo
     * @param izq Valor booleano que indica el extremo de la lista
     */
    public void poner(int pos, ClsVeterinaria dato,boolean izq){
        ClsNodo2 nuevo =new ClsNodo2(dato);
        ClsNodo2 otro= new ClsNodo2();
        //Verificamos si se coloca en alguno de los dos extremos considerando una lista vacia
        if (pos==1 && _nelem == 0 && _cabizq.enlder() == null){
                _cabizq.enlder(nuevo);
                nuevo.enlizq(_cabizq);
                _cabder.enlizq( nuevo);
                nuevo.enlder(_cabder);
                _nelem++;
        }else{
        // Inicio de algunos de los dos extremos con sus respectivas equivalencias
            if ((pos == 1 && izq == true) || (pos == _nelem && izq == false)){
                nuevo.enlder(_cabizq.enlder()); 
                nuevo.enlder().enlizq(nuevo);  // El primero es getter el segundo es setter
                _cabizq.enlder( nuevo);
                nuevo.enlizq( _cabizq);
                _nelem++;
            }else{
                if((pos == 1 && izq == false) || (pos == _nelem && izq == true)){
                    nuevo.enlizq( _cabder.enlizq());
                    nuevo.enlizq().enlder(nuevo);
                    _cabder.enlizq(nuevo);
                    nuevo.enlder(_cabder);
                    _nelem++;
                }else{
                //Posicion intermedia desde el extremo izquierdo 
                    if (pos > 1 && izq == true)
                    {
                        otro = _cabizq.enlder();
                        for (int i = 2; i < pos; i++)
                            otro = otro.enlder();
                        nuevo.enlder(otro.enlder());
                        otro.enlder(nuevo);
                        nuevo.enlder().enlizq(nuevo);
                        nuevo.enlizq(otro);
                        _nelem++;
                    }else{
                    //Posicion intermedia desde el extremo derecho
                        if (pos > 1 && izq == false)
                        {
                            otro = _cabder.enlizq();
                            for (int i = 2; i < pos; i++)
                                otro = otro.enlizq();
                            nuevo.enlizq( otro.enlizq());
                            otro.enlizq(nuevo);
                            nuevo.enlizq().enlder(nuevo);
                            nuevo.enlder(otro);
                            _nelem++;
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Permite extraer un nodo de la lista
     * @param pos Entero que indica la posicion de donde se extraera
     * @param izq Indica el extremo de la lista
     * @return Valor booleano que es verdadero cuando el proceso se realizo con exito
     */
    public boolean sacar(int pos, boolean izq){
        boolean existe = false;
        if (pos == 1 && _nelem == 1){ //Verifica si existen nodos primeramente
            _cabizq.enlder(null);
            _cabder.enlizq(null);
            _nelem--;
            existe = true;
        }else{//Sacamos por los extremos
            if((pos == 1 && izq) || (pos == _nelem && !izq)){
                _cabizq.enlder(_cabizq.enlder().enlder());
                _nelem--;
                existe = true;
            }else{//Inicio derechar o final izquierda
                if ((pos == 1 && !izq) || (pos ==_nelem && izq)){
                    _cabder.enlizq(_cabder.enlizq().enlizq());
                    _nelem--;
                    existe = true;
                }else{//Posicion intermedia desde el extremo izquierdo 
                    if (pos > 1 && izq){
                        ClsNodo2 otro = new ClsNodo2();
                        otro = _cabizq.enlder();
                        for (int i = 2; i <= pos; i++){
                            otro = otro.enlder();
                        }
                        otro.enlder().enlizq(otro.enlizq());
                        otro.enlizq().enlder(otro.enlder());
                        _nelem--;
                        existe = true;
                    }else{//Posicion intermedia desde el extremo derecho
                        if (pos > 1 && !izq){
                            ClsNodo2 otro = new ClsNodo2();
                            otro = _cabder.enlizq();
                            for (int i = 2; i <= pos; i++){
                                otro = otro.enlizq();
                            }
                            otro.enlder().enlizq(otro.enlizq());
                            otro.enlizq().enlder(otro.enlder());
                            _nelem--;
                            existe = true;
                        }
                    }
                }
            }
        }
        return existe;
    }
    
    /**
     * Permite identificar un nodo dentro de la lista
     * @param clave String que se compara con el atributo nombre del objeto ClsAnimal contenido en cada nodo
     * @return Entero que indica la posicion del nodo coincidente
     */
    public int Buscar(String clave){
        int resp = -1;
        ClsNodo2 aux= new ClsNodo2();
        aux.enlder(_cabizq.enlder());
        for (int i = 0; i < _nelem; i++) {
            if (clave.equalsIgnoreCase(aux.enlder().inf().NombreDueño())) {
                resp = i;
            }
            aux = aux.enlder();
        }
        return resp;
    }
}
