/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Pappu
 */
public class MainScreen extends JFrame implements ActionListener{
    
    public MainScreen() {
        super();
        windowConfiguration();
        initComponents();
    
    }
    
    //metodo para la configuracion de la ventana.
    private void windowConfiguration(){
        this.setTitle("PaxSign");                               //Aplicamos el nombre a la ventana.
        this.setExtendedState(MAXIMIZED_BOTH);                  //La ventana se inicia en tamaño completo de la pantalla.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Finaliza el programa al cerrar la ventana.
        this.setSize(1000, 800);                                 //Establecemos el tamaño de la ventana. 
        
    }
    
    //método para inicializar i mostrar todos los componentes de la ventana.
    private void initComponents(){
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
