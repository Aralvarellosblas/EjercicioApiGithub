package com.mycompany.ejemplomaven;

import javax.swing.JOptionPane;

/**
 * Clase principal contenedora del metodo main del programa con el menú para la
 * seleccion de los distintos metodos
 *
 * @author Arturo
 */
public class EjemploMaven{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String[] menu={"Crear repositorio", "Clonar", "Commit", "Inicializar un repositorio", "Push", "Salir"};
        int opcion=JOptionPane.showOptionDialog(null, "Seleccione una opción", "GitHub", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, null);

        switch(opcion){
            case 0:
                Metodos.crearRepositorio();
                break;
            case 1:
                Metodos.clonarRepositorio();
                break;
            case 2:
                Metodos.commit();
                break;
            case 3:
                Metodos.inicializarRepositorio();
                break;
            case 4:
                Metodos.push();
                break;
            case 5:
                System.exit(0);
        }
    }

}
