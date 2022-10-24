/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelos.Usuario;

/**
 *
 * @author isi7
 */
public class DUsuario {
    private ArrayList<Usuario> lista = new ArrayList<>();
    
    public void agregar(String user,String nombre, String pwd, String email,
            String ape){
        this.lista.add(new Usuario(user,pwd,nombre,ape,email,4));
    }
    
    public boolean buscarUsuario(String user, String pwd){
        for (Usuario us: this.lista){
            if(us.existeUser(user, pwd))
                return true;
        }
        return false;
    }
}
