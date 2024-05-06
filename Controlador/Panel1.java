    import java.awt.CardLayout;
    import java.awt.Color;
    import java.awt.Font;
    import java.awt.TextArea;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.Serializable;
    import java.util.ArrayList;
    
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;
    import javax.swing.JTextField;
    import javax.swing.border.EmptyBorder;
    @SuppressWarnings("serial")
    public class Panel1 extends JFrame implements Serializable{
    
        private JPanel Principal;
        ArrayList <Resiclaje> U = new ArrayList <Resiclaje>();
        //Componentes de la interfaz de usuario
        
        
        public Panel1() {
            
            setTitle("Sistema de resiclaje ");
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            Principal = new JPanel();
            Principal.setBackground(Color.LIGHT_GRAY);
            Principal.setToolTipText("Registro de usuarios");
            Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(Principal);
            
            JLabel lblBienvenidosAlRegistro = new JLabel("Bienvenidos al sistema de resiclaje"
                    + "");
            lblBienvenidosAlRegistro.setBounds(100, 11, 350, 23);
            lblBienvenidosAlRegistro.setFont(new Font("Tahoma", Font.PLAIN, 16));
            Principal.add(lblBienvenidosAlRegistro);
            
            JLabel label = new JLabel("");
            label.setBounds(527, 331, 137, 164);
            Principal.add(label);
            
    /****************************************************************************************************************************************************************/
            // Botón para ingresar datos
            JButton btnIngresar = new JButton("Ingresar datos");
            btnIngresar.setBounds(42, 59, 138, 23);
            btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 10));
            
            btnIngresar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    Resiclaje	Informacion = new Resiclaje();
                    U.add(Informacion);			
                }
            });		
            Principal.setLayout(null);
    
            btnIngresar.setToolTipText("Ingresar datos de usuarios");
            Principal.add(btnIngresar);
            
    /****************************************************************************************************************************************************************/		
            // Botón para mostrar datos
            JButton btnMostrarDatos = new JButton("Mostrar datos");
            btnMostrarDatos.setFont(new Font("Tahoma", Font.PLAIN, 10));
            btnMostrarDatos.setBounds(261, 59, 138, 23);
            btnMostrarDatos.addActionListener(new ActionListener() {
    
                public void actionPerformed(ActionEvent arg0) {
                    
                    Mostrar();
                }
            });
            
            btnMostrarDatos.setToolTipText("Muestra datos del usuario");
            Principal.add(btnMostrarDatos);
            
        
    
    /***************************************************************************************************************************************************************/		
            // Botón para eliminar datos
            JButton btnEliminarDatos =  new JButton("Eliminar datos");
            btnEliminarDatos.setBounds(42, 104, 138, 23);
            btnEliminarDatos.setFont(new Font("Tahoma", Font.PLAIN, 10));
            btnEliminarDatos.setToolTipText("Elimina datos de usuarios");
            btnEliminarDatos.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        Eliminar();
                }
            });
            Principal.add(btnEliminarDatos);
            // Botón para salir
            JButton btnSalir = new JButton("Salir");
            btnSalir.setBounds(261, 104, 138, 23);;
            btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 10));
            btnSalir.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                    
                    int a = JOptionPane.showConfirmDialog(null,"Esta seguro de que desea salir del registro?", "Confirmaci�n",JOptionPane.YES_NO_OPTION);
                    if(JOptionPane.YES_NO_OPTION == a) {
                        JOptionPane.showMessageDialog(null, "Gracias por preferirnos", "Cerrando sistema", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }	
                }
                    
            });
            
            btnSalir.setToolTipText("Salida del registro");
            Principal.add(btnSalir);
            
        }
        
         // Método para mostrar los datos almacenados en el ArrayList U
        protected void Mostrar() {
            
            JFrame frame = new JFrame();
            TextArea textArea = new TextArea (30,70);
            textArea.setEditable(false);
            JScrollPane A = new JScrollPane(textArea);
            
            // Metodo de recorrido y muestra sin grafica
            if(U.size()!=0) {
            String Dato = ""; 
            
            
            for (int Movimiento = 0; Movimiento < U.size(); Movimiento++) { // Ciclo para recorrer todo el vector
    
                                                                                                                    // en el vector son distintos de null
                        Dato += U.get(Movimiento)+
                    "\n---------------------------------------------------------------------------------------------------------";
                        // Guardar los datos en la variable
                    }		
                
                textArea.setText(Dato); // LLamada del metodo que muestra los datos, con los datos almacenados
                                // anteriormente de referencia
                
                JOptionPane.showMessageDialog(frame, A);
            }
    
            else {
            JOptionPane.showMessageDialog(null, "No hay datos que se puedan mostrar", "No tenemos ningun registro", JOptionPane.INFORMATION_MESSAGE);
        }
            
            
        }//fin mostrar
         // Método para eliminar datos de un usuario
        public void Eliminar() { // hacerlo en un panel
            JFrame frame = new JFrame();
            TextArea textArea = new TextArea(30, 70);
            textArea.setEditable(false);
            JScrollPane A = new JScrollPane(textArea);
            boolean registroEncontrado = false;
            String datos = "";
    
            int idEliminar;
            try {
                idEliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del usuario que desea eliminar", "Eliminación de usuario", JOptionPane.INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
      
            for (int i = 0; i < U.size(); i++) {
                if (U.get(i).getId() == idEliminar) {
                    registroEncontrado = true;
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        U.remove(i);
                        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break; // Salir del bucle una vez que se ha encontrado y eliminado el registro
                }
            }
    
            if (!registroEncontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró ningún registro con el ID especificado.", "Registro no encontrado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
