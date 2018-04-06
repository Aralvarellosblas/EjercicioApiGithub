package com.mycompany.ejemplomaven;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class DatosUsuario{

    private static String user, pass, nombreRep, descr;

    public static String getUser(){
        return user;
    }

    public static void setUser(String user){
        DatosUsuario.user=user;
    }

    public static String getPass(){
        return pass;
    }

    public static void setPass(String pass){
        DatosUsuario.pass=pass;
    }

    public static String getNombreRep(){
        return nombreRep;
    }

    public static void setNombreRep(String nombreRep){
        DatosUsuario.nombreRep=nombreRep;
    }

    public static String getDescr(){
        return descr;
    }

    public static void setDescr(String descr){
        DatosUsuario.descr=descr;
    }

    public static void logging(){
        user=JOptionPane.showInputDialog("Introduce el nombre de usuario(Correo)");
        pass=JOptionPane.showInputDialog("Introduce la contraseña e usuario");

    }

    public static String nombreRepo(){
        nombreRep=JOptionPane.showInputDialog("Nombre del repositorio deseado");
        return nombreRep;

    }

    public static String descripcion(){
        descr=JOptionPane.showInputDialog("Descripcion del repositorio");
        return descr;

    }
}
