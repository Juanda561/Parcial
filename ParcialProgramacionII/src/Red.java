/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Red {
    
    private String nombre;
    private char clase_red;
    
    private Host[] hosts;

    public Host[] getHosts() {
        return hosts;
    }

    public void setHosts(Host[] hosts) {
        this.hosts = hosts;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    private int limit=3;

    public Red(String nombre, char clase_red) {
        this.nombre = nombre;
        this.clase_red = clase_red;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getClase_red() {
        return clase_red;
    }

    public void setClase_red(char clase_red) {
        this.clase_red = clase_red;
    }
    
    public void details(){
        
    }
    
    public boolean isLimitHost(){
        
        return true;
    }
            
    
}
