//Representa al CRUD de un archivo de texto
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoTexto {
    File fichero;
    FileWriter writer;
    PrintWriter pw;
    FileReader reader;
    BufferedReader buffer;
    int totReg;
    
    public ArchivoTexto(){
        this.fichero=null;
        this.writer=null;
        this.pw=null;
        this.reader=null;
        this.buffer=null;
        this.totReg=0;
    }
    
    private boolean establecerFlujo(String nombreArchivo){
        fichero = new File(nombreArchivo);
        return fichero.exists();
    }
    public boolean abrirArchivoTexto(char modo, String nombreArchivo){
        try {
            boolean existe= this.establecerFlujo(nombreArchivo);
            switch(modo){
                case 'w': this.writer = new FileWriter(this.fichero,true);
                          this.pw = new PrintWriter(this.writer);
                          break;
                case 'r':                         
                        if (!existe) return false;
                          this.reader = new FileReader(this.fichero);
                          this.buffer = new BufferedReader(this.reader); 
                          break;
            }                        
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return true;
    }
    
    public void crearLinea(String linea){
        this.pw.println(linea);
    }
    
    public void cerrarArchivo(char modo){
        try {
            switch(modo){
                case 'w':this.pw.close();
                         this.writer.close();   
                         break;
                case 'r':this.buffer.close();
                         this.reader.close();
                         break;
            }
                     
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String obtenerLineas() {    
        String lineas="";
        try {
            String linea=null;
            linea = buffer.readLine();            
            while(linea!=null){
                this.totReg++;
                lineas+=linea+"\n";
                linea = buffer.readLine();                
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineas;
    }
    
    public String[][] obtenerMatrizRegistros(int numCol){
        
        String lineas= this.obtenerLineas();
        String lista[] = lineas.split("\n");
        String registros[][]= new String[this.totReg][numCol];
        
        for(int f=0;f< this.totReg; f++){
            String datos[] = lista[f].split(",");
            for(int c=0; c<numCol;c++){
                registros[f][c]=datos[c];
            }
        }                
        //System.out.println("Lineas:"+ lineas);
        return registros;
    }
    public String[] buscarDato(String nc) {        
        try {
            String linea=null;
            linea = buffer.readLine();            
            while(linea!=null){                
                String datos[] = linea.split(",");
                if (datos[0].equals(nc)) return datos;
                linea = buffer.readLine();                
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;
    }

    public void eliminarLinea(String numControl) {
        File ficheroTemporal = new File("temporal.txt");
        //Abrir el archivo que se va a utilizar como temporal, se abre para escritura
        try {
            this.writer = new FileWriter(ficheroTemporal);
            this.pw = new PrintWriter(this.writer);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            
            String linea=null;
            linea = buffer.readLine();            
            while(linea!=null){                
                String datos[] = linea.split(",");
                //Paso a temporal todas las lineas distintas
                if ( !(datos[0].equals(numControl))) 
                    this.crearLinea(linea);
                linea = buffer.readLine();                
            }
            //Cierro el archivo temporal.txt
            this.pw.close();
            this.writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void eliminarArchivo(String archivoEliminar){
        if (this.establecerFlujo(archivoEliminar)){
            this.fichero.delete();
        }        
    }
    
    public void renombrarArchivo(String archivoRenombrar, String nuevoNombre){
        if (this.establecerFlujo(archivoRenombrar)){
            File fichero2 = new File(nuevoNombre);
            this.fichero.renameTo(fichero2);
        }
    }/*
    public String[] buscarDato(String nc) {        
        try {
            String linea=null;
            linea = buffer.readLine(); 
            
            while(linea!=null){                
                String datos[] = linea.split(",");
                if (datos[0].equals(nc)) 
            {datos[6]+=numReg);
                linea = buffer.r
                return dadtos;
    }
    linea = buffer.readLine();                
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;
*/
    }



