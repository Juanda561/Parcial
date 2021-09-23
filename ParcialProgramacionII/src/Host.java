
public class Host {
    
    private String nombre_host;
    private String nombre_sistema_operativo;
    
    private Red redes;
    private InterfazRed interfazred;
    
    public Host(String nombre_host, String nombre_sistema_operativo) {
        this.nombre_host = nombre_host;
        this.nombre_sistema_operativo = nombre_sistema_operativo;
    }

    public String getNombre_host() {
        return nombre_host;
    }

    public void setNombre_host(String nombre_host) {
        this.nombre_host = nombre_host;
    }

    public String getNombre_sistema_operativo() {
        return nombre_sistema_operativo;
    }

    public void setNombre_sistema_operativo(String nombre_sistema_operativo) {
        this.nombre_sistema_operativo = nombre_sistema_operativo;
    }
    
    public void configurar(int A, int B, int C, int D){
        
        /*interfazred.setOA(A);
        interfazred.setOB(B);
        interfazred.setOC(C);
        interfazred.setOD(D);
        */
    }
    
    public boolean conectar(Red red){
        
        return true;
    }
    
    public void ping(Host host, String msg){
        
    }
    
    public void ping(String msg){
        
    }
    
}
