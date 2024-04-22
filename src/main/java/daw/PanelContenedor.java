/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author khalid
 */
public class PanelContenedor extends JPanel implements ActionListener{
    
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
        
        
        for (JButton boton : this.operaciones.getGrupoBotones()) {
                boton.addActionListener(this);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //obtenemos el objeto que activa el evento
        Object o = e.getSource();
        //y si es un boton lo instanciamos
        if (o instanceof JButton) {
            System.out.println(((JButton)o).getText());
            areaTexto.setText(((JButton)o).getText());
        }
        
        
        
        
    }
    
       
}
