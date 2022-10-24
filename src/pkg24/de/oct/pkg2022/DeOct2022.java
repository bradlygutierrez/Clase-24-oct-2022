/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24.de.oct.pkg2022;

import Formularios.FrmLoggin;
import dao.DUsuario;

/**
 *
 * @author isi7
 */
public class DeOct2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DUsuario listaU = new DUsuario();
        listaU.agregar("Avi", "Avi", "123", "avi.zepeda@gmail.com","Zepeda");
        listaU.agregar("Dayer", "Dayer", "123", "dayer@gmail.com", "Torres");
        listaU.agregar("Eliseo", "Eliseo", "234","elipaz@gmail.com", "Paz");
        
        FrmLoggin login = new FrmLoggin();
        login.lista = listaU;
        login.setVisible(true);
    }
    
}
