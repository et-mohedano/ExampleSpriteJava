/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvsprite;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Integrantes:
 * -Loran Cazares Guadalupe Zeltzin
 * -Mohedano Torres Efrain
 */
public class clsSprite {
    // Atrbutos
    List<JLabel> etiquetas;
    JLabel etiqueta;
    // variables
    int posEtiquetas;
    // Constructor
    public clsSprite(){
        etiquetas = new ArrayList<>();
        posEtiquetas = 0;
    } 
    // Getters and Setters
    public List<JLabel> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<JLabel> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }
    public void crearEtiquetas(JPanel panel){
        int posX = 60;
        int posY = 60;
        for (int i = 0; i < 2; i++) {
            etiqueta = new JLabel();
            etiqueta.setName("jlblEtiqueta" + posEtiquetas);
            etiqueta.setBackground(Color.white);
            etiqueta.setOpaque(true);
            etiqueta.setVisible(true); 
            etiqueta.setSize(60, 60); // Ambos sprites tienene el mismo tamaño de imagen
            etiqueta.setLocation(posX,posY);
            panel.add(etiqueta);
            etiquetas.add(etiqueta);
            posEtiquetas++;
            posX += 50;
            panel.validate();
            panel.updateUI();
        }
    }
    
}
