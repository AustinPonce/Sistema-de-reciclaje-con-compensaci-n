import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
	public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                final Procesos accionesDelMenu = new Procesos(); // Creamos objeto para ejecución
                accionesDelMenu.setVisible(true); // Lo hacemos visibles
                accionesDelMenu.addWindowListener(new WindowAdapter() { // Acción para cerrar si se marca la x en la principal.

                	public void windowClosing(WindowEvent e) {
    					int x = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?", "Seguro?",
    							JOptionPane.OK_CANCEL_OPTION);

    					if (x == JOptionPane.OK_OPTION) {//si se seleciona aceptar
    						JOptionPane.showMessageDialog(null, " Cerrado el programa de forma exitosa.","Informe",JOptionPane.INFORMATION_MESSAGE);
    						System.exit(0);//cierra el programa
    					} else {
    						JOptionPane.showMessageDialog(null, " El cierre se cancelo con exito.","Informe",JOptionPane.INFORMATION_MESSAGE);
    						accionesDelMenu.setDefaultCloseOperation(0);//cancela el cierre..
    					}
    				}
    				});
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // Fin método run
    }); // Fin del EventQueue
}}// Fin del método main

