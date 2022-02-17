
package EstEnlacesDobles;

import EstVeterinaria.ClsVeterinaria;

/**
 *
 * @author Erick Perez
 * 29/01/2021
 */
public class ClsColaDim2 {
    
    private ClsListDim2 _Cola;

    public ClsColaDim2(){
        _Cola = new ClsListDim2();
    }

    public int nelem(){
        return _Cola.nelem();
    }

    public ClsNodo2 CabIzq(){
        return _Cola.cabizq();
    }

    public ClsNodo2 CabDer(){
        return _Cola.cabder();
    }

    /**
     * Adaptacion del metodo poner de la clase ClsListDim2 que cumple con la estructura de una cola
     * @param dato Objeto de tipo ClsAnimal que sera contenido en un nodo
     */
    public void Poner(ClsVeterinaria dato){
        _Cola.poner(1, dato, true);
    }

    /**
     * Adaptacion del metodo sacar de la clase ClsListDim2 que cumple con la estructura de una cola
     * @return Valor booleano que es verdadero cuando el proceso fue exitoso
     */
    public Boolean Sacar(){
        return _Cola.sacar(_Cola.nelem(), false);
    }

    /**
     * Adaptacion del metodo Buscar de la clase ClsListDim2 que cumple con la estructura de una cola
     * @param clave String que se compara con el atributo nombre del objeto ClsAnimal contenido en cada nodo
     * @return Entero que indica la posicion del nodo coincidente
     */
    public int Buscar(String clave){
        return _Cola.Buscar(clave);
    }
}
    

