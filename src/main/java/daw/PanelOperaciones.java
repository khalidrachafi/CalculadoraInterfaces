/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author khalid
 */
public class PanelOperaciones extends JPanel{
    
    //array de botones 
    //debe haber todos los numeros y los botone para las
    //operaciones de suma, resta, multiplicar, dividir,=,y AC;
    JButton [] grupoBotones = new JButton[16];

    public PanelOperaciones() {
        initComponents();
    }
    
    
    private void initComponents(){
        
        //crear botones
        for (int i = 0; i < 10; i++) {
            //botones de los numeros
            grupoBotones[i] = new JButton(Integer.toString(i));
        }
        
        //Botones de las operaciones aritmeticas
        grupoBotones[10] = new JButton("+");
        grupoBotones[11] = new JButton("-");
        grupoBotones[12] = new JButton("*");
        grupoBotones[13] = new JButton("/");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("AC");
        
        
        //establecer la division del panel con layout
        this.setLayout (new GridLayout(4, 4));
        
        for (JButton grupoBotone : grupoBotones) {
            this.add(grupoBotone);
        }
        
  
        
    }

    public JButton[] getGrupoBotones() {
        return grupoBotones;
    }
    
    
    
    
    
    
    
    
    
    
}
