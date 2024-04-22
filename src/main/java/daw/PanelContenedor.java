/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author khalid
 */
public class PanelContenedor extends JPanel{
    
    private PanelOperaciones operaciones;
    private JTextArea areaTexto;
    private int tipoOperacion;

    public PanelContenedor() {
        initComponents();
        this.tipoOperacion = tipoOperacion;
    }
    
    
    private void initComponents(){
        operaciones = new PanelOperaciones();
        
        //crear el areatexto
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);
        
        
        //layout principal
        this.setLayout(new BorderLayout());
        //le metemos la parte de visualizacion y operaciones
        this.add(areaTexto,BorderLayout.NORTH);
        this.add(operaciones,BorderLayout.SOUTH);
        
        
    }
    
       
}
