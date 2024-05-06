
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Panel1 extends JFrame {

	private JPanel Principal;
	ArrayList<Resiclaje> U = new ArrayList<Resiclaje>();
	// Componentes de la interfaz de usuario

	public Panel1() {

		setTitle("Sistema de resiclaje ");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Principal = new JPanel();
		Principal.setBackground(Color.LIGHT_GRAY);
		Principal.setToolTipText("Registro de usuarios");
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Principal);

		JLabel lblBienvenidosAlRegistro = new JLabel("Bienvenidos al sistema de resiclaje" + "");
		lblBienvenidosAlRegistro.setBounds(100, 11, 350, 23);
		lblBienvenidosAlRegistro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Principal.add(lblBienvenidosAlRegistro);

		JLabel label = new JLabel("");
		label.setBounds(527, 331, 137, 164);
		Principal.add(label);

		/****************************************************************************************************************************************************************/
		// Botón para ingresar datos
		JButton btnPapel = new JButton("Reciclaje de Papel");
		btnPapel.setBounds(42, 59, 138, 23);
		btnPapel.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Papel Informacion = new Papel();
				U.add(Informacion);
			}
		});
		Principal.setLayout(null);

		btnPapel.setToolTipText("Ingresar datos de usuarios");
		Principal.add(btnPapel);

		// Botón para ingresar datos
		JButton btnPlastico = new JButton("Reciclaje de Plastico");
		btnPlastico.setBounds(261, 59, 138, 23);
		btnPlastico.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnPlastico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plastico Informacion = new Plastico();
				U.add(Informacion);
			}
		});
		Principal.setLayout(null);

		btnPlastico.setToolTipText("Ingresar datos de usuarios");
		Principal.add(btnPlastico);

		// Botón para ingresar datos
		JButton btnVidrio = new JButton("Reciclaje de vidrio");
		btnVidrio.setBounds(42, 104, 138, 23);
		btnVidrio.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnVidrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vidrio Informacion = new Vidrio();
				U.add(Informacion);
			}
		});
		Principal.setLayout(null);

		btnVidrio.setToolTipText("Ingresar datos de usuarios");
		Principal.add(btnVidrio);

		// Botón para mostrar datos
		JButton btnMostrarDatos = new JButton("Mostrar datos");
		btnMostrarDatos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMostrarDatos.setBounds(261, 104, 138, 23);
		btnMostrarDatos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				Mostrar();
			}
		});

		btnMostrarDatos.setToolTipText("Muestra datos del usuario");
		Principal.add(btnMostrarDatos);

		// Botón para eliminar datos
		JButton btnEliminarDatos = new JButton("Eliminar datos");
		btnEliminarDatos.setBounds(42, 153, 138, 23);
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
		btnSalir.setBounds(261, 153, 138, 23);
		;
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSalir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int a = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea salir del registro?",
						"Confirmaci�n", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.YES_NO_OPTION == a) {
					JOptionPane.showMessageDialog(null, "Gracias por preferirnos", "Cerrando sistema",
							JOptionPane.INFORMATION_MESSAGE);
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
}// fin mostrar
	// Método para eliminar datos de un usuario
	public void Eliminar() {
		// Permite al usuario eliminar los datos de un usuario específico
		@SuppressWarnings("unused")
		JFrame frame = new JFrame();
		TextArea textArea = new TextArea(30, 70);
		textArea.setEditable(false);
		@SuppressWarnings("unused")
		JScrollPane A = new JScrollPane(textArea);
		boolean v = false;
		int c;
		String Datos = "";

		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del usuario que desea eliminar",
				"Eliminaci�n de usuario", JOptionPane.INFORMATION_MESSAGE));

		for (int Movimiento = 0; Movimiento < U.size(); Movimiento++) {

			if (U.get(Movimiento).getId() == c) {
				v = true;
				int b = JOptionPane.showConfirmDialog(null, "Desea confirmar la Eliminacion", "Eliminamos?",
						JOptionPane.YES_NO_OPTION);
				if (b == JOptionPane.YES_OPTION) {
					U.remove(Movimiento);
					JOptionPane.showMessageDialog(null, "Eliminacion Exitosa.", "Eliminacion Realizada",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "Eliminacion Cancelada.", "Eliminacion Cancelada",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}

			for (int i = 0; i < U.size(); i++) {
				Datos += (i + 1) + "" + U.get(i);
			}
			textArea.setText(Datos);
		}
		if (!v) {
			JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Notificacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
