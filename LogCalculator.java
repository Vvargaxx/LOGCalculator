import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LogCalculator extends JFrame
{
	private JTextField cantidad;
	private JLabel resultLabel;
	private String resultado;
	
	public LogCalculator() {
		super("Log - Dec Calculator"); 
		JButton boton1 = new JButton("A Decimal"); 
		JButton boton2 = new JButton("A Logaritmo"); 
		cantidad = new JTextField(10); 
		JLabel text = new JLabel("Introduce el número a calcular"); 
		add(text); 
		add(cantidad); 
		add(boton1); 
		add(boton2); 
		resultLabel = new JLabel(resultado);		//Etiqueta con el resultado, inicialmente vacía
		add(resultLabel);
		setLayout(new FlowLayout()); 			//Layout por defecto, de izquierda a derecha
		boton1.addActionListener(new BtListener()); 
		boton2.addActionListener(new BtListener()); 
		setSize(600, 300);				//Tamaño ventana
		setLocationRelativeTo(null); 			//Ventana en el centro de la pantalla
		setVisible(true);				//Ventana visible
		setResizable(false); 				//No reescalable
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Salir del programa al cerrar la ventana
	}
	
	public static void main(String[] args) {		
		LogCalculator lc = new LogCalculator();
	}
	
	class BtListener implements ActionListener { 	// Button Listener

		public void actionPerformed(ActionEvent ae) {			
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
			
		} 
	}
}



