import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class Plastico extends Resiclaje {// star class
	// atrivutos

	public String typePlastic; // tipo de plastico botellas, jueguetes, cajas, etc

	private JTextField textName;
	private JTextField textID;
	private JTextField textKG;
	private JTextField texttypePlastic;

	public Plastico(String name, int id, double kg, String typePlastic) {
		super(name, id, kg);
		this.typePlastic = typePlastic;
	}

	public double remuneracionPlastico() {
		double remuneracion = 0;
		double valorPlastico = 300; // monto por asignar
		remuneracion = valorPlastico * getKg();
		return remuneracion;
	}

//star gets and sets
	public String getTypePlastic() {
		return typePlastic;
	}

	public void setTypePlastic(String typePlastic) {
		this.typePlastic = typePlastic;
	}

//end gets and sets
	public Plastico() {

		// Configurar JFrame y establecer propiedades
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		setTitle("Ingrese la informacion solicitada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		setVisible(true);
		Panel.setLayout(null);

		 
		// Etiquetas y campos de texto para ingresar información del usuario
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setToolTipText("Nombre");
		Nombre.setFont(new Font("Serif", Font.PLAIN, 16));// tamaño de fuente
		Nombre.setBounds(25, 33, 63, 14); // (x, y, cuadro de lectras,alto de letras)
		Panel.add(Nombre);

		// Campo de texto para ingresar el nombre
		textName = new JTextField();
		textName.setBounds(228, 30, 86, 20);
		textName.setColumns(10);

		// Agregar KeyListener para permitir solo letras en el campo de nombre
		textName.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if ((caracter != KeyEvent.VK_SPACE)) {

					if (((caracter < 'A') || (caracter > 'Z') && ((caracter < 'a') | (caracter > 'z'))) // Permite el
																										// ingreso
																										// unicamente de
																										// letras
							&& (caracter != KeyEvent.VK_BACK_SPACE)) {

						e.consume();
						JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar letras",
								"Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		Panel.add(textName);

		// Etiqueta y campo de texto para ingresar el número de placa
		JLabel id = new JLabel("ID");
		id.setToolTipText("ID");
		id.setFont(new Font("Serif", Font.PLAIN, 16));// tamaño de fuente
		id.setBounds(25, 61, 137, 14); // (x, y, cuadro de lectras,alto de letras)
		Panel.add(id);

		textID = new JTextField();
		textID.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();

					JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar numeros", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}

				if (textID.getText().length() == 9) // cantidad maxima de carateres
				{
					e.consume();
				}
			}
		});
		textID.setBounds(228, 61, 86, 20);
		textID.setColumns(10);
		Panel.add(textID);

		JLabel kg = new JLabel("Peso total en Kg");
		kg.setToolTipText("Peso total en Kg");
		kg.setFont(new Font("Serif", Font.PLAIN, 16));// tamaño de fuente
		kg.setBounds(25, 96, 113, 18); // (x, y, cuadro de lectras,alto de letras)
		Panel.add(kg);

		// JTextField textKG = new JTextField();
		textKG = new JTextField();
		textKG.setBounds(228, 93, 86, 20);
		textKG.setColumns(10);

		textKG.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();

					JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar numeros", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}

				if (textKG.getText().length() == 9) // cantidad maxima de carateres
				{
					e.consume();
				}
			}
		});

		Panel.add(textKG);

		// Etiqueta y campo de texto para ingresar el ID
		JLabel tipo = new JLabel("Tipo de Plastico");
		tipo.setToolTipText("Tipo de Plastico");
		tipo.setFont(new Font("Serif", Font.PLAIN, 16));
		tipo.setBounds(25, 129, 179, 14);
		Panel.add(tipo);

		texttypePlastic = new JTextField();
		texttypePlastic.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if ((caracter != KeyEvent.VK_SPACE)) {

					if (((caracter < 'A') || (caracter > 'Z') && ((caracter < 'a') | (caracter > 'z'))) // Permite el
																										// ingreso
																										// unicamente de
																										// letras
							&& (caracter != KeyEvent.VK_BACK_SPACE)) {

						e.consume();
						JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar letras",
								"Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		texttypePlastic.setColumns(10);
		texttypePlastic.setBounds(228, 126, 86, 20);
		Panel.add(texttypePlastic);

		// Botón "Aceptar" para procesar los datos ingresados
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textName.getText().isEmpty() || textID.getText().isEmpty() || textKG.getText().isEmpty()
						|| texttypePlastic.getText().isEmpty()) {
					// Mostrar advertencia si faltan datos
					JOptionPane.showMessageDialog(null, "Aun no ha completado todos los datos solicitados",
							"Verificación de datos", JOptionPane.WARNING_MESSAGE);
				} else {
					// Obtener los valores de los campos de texto
					setName(textName.getText());
				    setId(Integer.parseInt(textID.getText()));
					setKg(Double.parseDouble(textKG.getText()));
					setTypePlastic(texttypePlastic.getText());
					dispose();

					// Mostrar el monto en un JOptionPane
					JOptionPane.showMessageDialog(null, "La compensacion por resiclar es: " + remuneracionPlastico(), "Pago Total",
							JOptionPane.INFORMATION_MESSAGE);

					// Mostrar mensaje de éxito
					JOptionPane.showMessageDialog(null, "Se han ingresado los datos exitosamente", "Ingreso exitoso",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});

		btnAceptar.setFont(new Font("Serif", Font.PLAIN, 16));
		btnAceptar.setToolTipText("Aceptar");
		btnAceptar.setBounds(130, 168, 100, 20);
		Panel.add(btnAceptar);
		// Botón "Cancelar" para salir del ingreso de datos
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = JOptionPane.showConfirmDialog(null, "Estás seguro de que quieres salir?",
						"Ingrese la informacion solicitada", JOptionPane.YES_NO_OPTION);

				if (JOptionPane.YES_NO_OPTION == a) {
					setName("Nulo");
					dispose(); // Cerrar solo esta ventana

					JOptionPane.showMessageDialog(null, "Acabas de perder todos los datos ingresados", "Datos perdidos",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btnCancelar.setFont(new Font("Serif", Font.PLAIN, 16));
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setBounds(300, 168, 100, 20);
		Panel.add(btnCancelar);
	}

// Override
	@Override
	public String toString() {
		return "\nPlastico:\n" + super.toString() +"\nCompensacion por resiclar: "+ remuneracionPlastico() + "\nTipo de plastico: " + typePlastic;

	}

}// end class