/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionIV.pdc;

/**
 *
 * @author LAB05-MAQ18
 */
public class Cuentas {
    public int id;
    public int recursivo;
    public String codigo;
    public String nombre;
    public String estado;
    
    
    public Cuentas(int p_id,String p_codigo,String p_nombre){
        this.id=p_id;
        this.codigo= p_codigo;
        this.estado=p_nombre;
        
        
    }
    
    
    public Cuentas(){
        this.id=0;
        this.recursivo= 0;
        this.codigo="1";
        this.estado="A";
        this.nombre="Activo";
    }
    
    public void setID(int p_id){
        
    }
    
    
    
}
