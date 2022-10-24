/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author isi7
 */
public class Usuario {
    private String userName;
    private String pwdUser; 
    private String nombre;
    private String apellido; 
    private String email;
    private int estado; 

    public Usuario() {
    }

    public Usuario(String userName, String pwdUser, String nombre, String apellido, String email, int estado) {
        this.userName = userName;
        this.pwdUser = pwdUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   public boolean existeUser(String user, String pwd){
       return this.userName.equals(user) && this.pwdUser.equals(pwd);
   }
}
