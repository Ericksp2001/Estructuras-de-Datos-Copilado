/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstVeterinaria;

//Autor: Alexa Amaguaya

public class ClsVeterinaria {
    
    String _NombreMascota;
    String _SexoMascota;
    String _RazaMascota;
    int _EdadMascota;
    Double _PesoMascota;
    String _NombreDueño;
    String _IdDueño;
    String _Telefono;
    Double _CostoFactura;

    
      public ClsVeterinaria() {
      _NombreMascota=null;
      _SexoMascota=null;
      _RazaMascota=null;
      _EdadMascota=0;
      _PesoMascota=0.00;
      _NombreDueño=null;
      _IdDueño=null;
      _Telefono=null;
      _CostoFactura=0.00;
          
          
    }

    public ClsVeterinaria(String _NombreMascota, String _SexoMascota, String _RazaMascota, int _EdadMascota, Double _PesoMascota, String _NombreDueño, String _IdDueño, String _Telefono, Double CostoFactura) {
        this._NombreMascota = _NombreMascota;
        this._SexoMascota = _SexoMascota;
        this._RazaMascota = _RazaMascota;
        this._EdadMascota = _EdadMascota;
        this._PesoMascota = _PesoMascota;
        this._NombreDueño = _NombreDueño;
        this._IdDueño = _IdDueño;
        this._Telefono = _Telefono;
        this._CostoFactura = CostoFactura;
    }

   
    public String NombreMascota() {
        return _NombreMascota;
    }

    public void NombreMascota(String _NombreMascota) {
        this._NombreMascota = _NombreMascota;
    }

    public String SexoMascota() {
        return _SexoMascota;
    }

    public void SexoMascota(String _SexoMascota) {
        this._SexoMascota = _SexoMascota;
    }

    public String RazaMascota() {
        return _RazaMascota;
    }

    public void RazaMascota(String _RazaMascota) {
        this._RazaMascota = _RazaMascota;
    }

    public int EdadMascota() {
        return _EdadMascota;
    }

    public void EdadMascota(int _EdadMascota) {
        this._EdadMascota = _EdadMascota;
    }

    public Double PesoMascota() {
        return _PesoMascota;
    }

    public void PesoMascota(Double _PesoMascota) {
        this._PesoMascota = _PesoMascota;
    }

    public String NombreDueño() {
        return _NombreDueño;
    }

    public void NombreDueño(String _NombreDueño) {
        this._NombreDueño = _NombreDueño;
    }

    public String IdDueño() {
        return _IdDueño;
    }

    public void IdDueño(String _IdDueño) {
        this._IdDueño = _IdDueño;
    }

    public String Telefono() {
        return _Telefono;
    }

    public void Telefono(String _Telefono) {
        this._Telefono = _Telefono;
    }

    public Double CostoFactura() {
        return _CostoFactura;
    }

    public void CostoFactura(Double CostoFactura) {
        this._CostoFactura = CostoFactura;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_NombreMascota);
        sb.append(_NombreDueño);
        sb.append(_IdDueño);
        sb.append(_Telefono);
        sb.append(_CostoFactura);
        return sb.toString();
    }
    
    
    
    
    
    
}
