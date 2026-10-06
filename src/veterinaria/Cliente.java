/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author ON
 */
public class Cliente extends Persona {
    private String identificacion;
    private String telefono;

    public Cliente(String identificacion, String nombre, String telefono) {
        super(nombre);
        this.identificacion = identificacion;
        this.telefono = telefono;
    }
        
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.trim().equals("")) {
            System.out.println("El id no es valido");
        } else {
            this.identificacion = identificacion;
        }
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().equals("")) {
            System.out.println("El telefono no es valido");
        } else {
            this.telefono = telefono;
        }
    }
    
    
}
