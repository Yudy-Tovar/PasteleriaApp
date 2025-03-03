package com.pasteleriaapp.control;

import com.pasteleriaapp.interfaz.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    Principal ventana;

    public Controlador() {
        ventana = new Principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public  void iniciar(){
     ventana.setTitle("Ventana principal");
     ventana.setLocationRelativeTo(null);
     ventana.setVisible(true);
    }
}
