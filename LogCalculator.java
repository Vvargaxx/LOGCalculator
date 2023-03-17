import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LogCalculator extends JFrame implements ActionListener
{
	private JTextField cantidad;
	private JLabel resultLabel;
	private JButton boton1, boton2;
	private String resultado;
	
	public LogCalculator() {
		super("Log - Dec Calculator"); 
		boton1 = new JButton("A Decimal"); 
		boton2 = new JButton("A Logaritmo"); 
		boton1.addActionListener(this); 
		boton2.addActionListener(this); 
		cantidad = new JTextField(10); 
		JLabel text = new JLabel("Introduce el número a calcular"); 
		add(text); 
		add(cantidad); 
		add(boton1); 
		add(boton2); 
		resultLabel = new JLabel(resultado);		//Etiqueta con el resultado, inicialmente vacía
		add(resultLabel);
		setLayout(new FlowLayout()); 			//Layout por defecto, de izquierda a derecha
		setSize(600, 300);				//Tamaño ventana
		setLocationRelativeTo(null); 			//Ventana en el centro de la pantalla
		setVisible(true);				//Ventana visible
		setResizable(false); 				//No reescalable
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Salir del programa al cerrar la ventana
	}
	
	public static void main(String[] args) {		
		LogCalculator lc = new LogCalculator();
	}
	
	public void actionPerformed(ActionEvent ae) {			
		 if (ae.getSource() == boton1 || ae.getSource() == boton2) {   
		    try {
			float valor = Float.parseFloat(cantidad.getText()); 	// Número introducido
			String s = (String)ae.getActionCommand(); 		// Texto del botón pulsado

			if(s.equals("A Logaritmo")) { 
				valor = (float)Math.log10(valor)*10;
				resultado = "El resultado Logarítmico es: "+ String.format("%.03f", valor);
				resultLabel.setText(resultado); 
				
			} else if (s.equals("A Decimal")) { 
				valor = (float)(Math.pow(10, (valor/10))); 
				resultado = "El resultado Decimal es: "+ String.format("%.03f", valor);
				resultLabel.setText(resultado); 
			} 
		    } catch (NumberFormatException e) {
		    	JOptionPane.showMessageDialog(this, "Por favor ingrese un número o un logaritmo válido.", "Error", JOptionPane.ERROR_MESSAGE);
		    }
	       }	
	}	
}
