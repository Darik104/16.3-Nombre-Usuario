import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NombreUsuarioApp {

    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Ingreso de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Crear un campo de texto para el nombre de usuario
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Enviar");

        // Agregar componentes al marco
        frame.add(new JLabel("Ingrese su nombre:"));
        frame.add(textField);
        frame.add(button);

        // Acci�n del bot�n
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el nombre ingresado
                String nombre = textField.getText();
                // Crear y mostrar la segunda ventana
                mostrarSegundaVentana(nombre);
            }
        });

        // Hacer visible el marco principal
        frame.setVisible(true);
    }

    private static void mostrarSegundaVentana(String nombre) {
        // Crear la segunda ventana
        JFrame segundaVentana = new JFrame("Nombre Ingresado");
        segundaVentana.setSize(300, 100);
        segundaVentana.setLayout(new FlowLayout());

        // Crear un label para mostrar el nombre
        JLabel label = new JLabel("Nombre ingresado: " + nombre);
        segundaVentana.add(label);

        // Configurar la ventana para que se cierre correctamente
        segundaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        segundaVentana.setVisible(true);
    }
}