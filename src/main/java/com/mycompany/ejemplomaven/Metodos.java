package com.mycompany.ejemplomaven;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 *
 * @author Arturo
 */
public class Metodos {
    
    public String urlRep(String mensaje){
        String url=JOptionPane.showInputDialog(mensaje);
        return url;
    }
    public String rutaArchivo(String mensaje){
        String ruta=JOptionPane.showInputDialog(mensaje);
        return ruta;
    }
    public void crearRepositorio(){
        try{
            DatosUsuario.loging();
            DatosUsuario.nombreRepo();
            DatosUsuario.descripcion();
            GitHub github=GitHub.connectUsingPassword(DatosUsuario.getUser(), DatosUsuario.getPass());
            GHRepository builder=github.createRepository(DatosUsuario.getNombreRep(), DatosUsuario.getDescr(), " ", true);
        }catch(IOException ex){
            Logger.getLogger(EjemploMaven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clonarRepositorio(){
        
        try{
            Git.cloneRepository()
                    .setURI(urlRep("URL del repositorio a clonar"))
                    .setDirectory(new File(rutaArchivo("Ruta de la carpeta para el repositorio clonado")))
                    .call();
        }catch(GitAPIException ex){
            Logger.getLogger(EjemploMaven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
