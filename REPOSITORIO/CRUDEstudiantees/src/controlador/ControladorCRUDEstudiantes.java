package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import vista.VistaCRUDEstudiantes;

public class ControladorCRUDEstudiantes {
    
    public VistaCRUDEstudiantes objVistaCRUDEst;
    ArchivoTexto objArchivo;
   
    public ControladorCRUDEstudiantes(VistaCRUDEstudiantes aThis, ArchivoTexto objArchivo) {
        this.objVistaCRUDEst=aThis;
        this.objArchivo=objArchivo;
    }
    public void llenarTabla(){
        String [] columnas = {"Num.Control", "Nombre", "Apellidos","Semestre", "Grupo", "Carrera"};        
        ArchivoTexto objArchivo = new ArchivoTexto();
        //Abrir Archivo
        objArchivo.abrirArchivoTexto('r', "estudiantes.txt");        
        //Lectura de datos desde el archivo (extraer los registros)
        String [][] filas = objArchivo.obtenerMatrizRegistros(6);        
        //Cerrar el archivo        
        objArchivo.cerrarArchivo('r');
        DefaultTableModel modelo;
        modelo= new DefaultTableModel(filas,columnas);        
        this.objVistaCRUDEst.jtblEstudiantes.setModel(modelo);                        
    } 
    
    public void guardarRegistro(String nc, String nom, String ape, String sem, String gpo, String carrera){
        String linea= nc + "," + nom + ","+ ape + ","+ sem + ","+ gpo + ","+ carrera;
        this.objArchivo = new ArchivoTexto();
        this.objArchivo.abrirArchivoTexto('w', "estudiantes.txt");
        this.objArchivo.crearLinea(linea);
        this.objArchivo.cerrarArchivo('w');
        this.llenarTabla();
    }
    
    public String[] buscarRegistro(String nc){
        String[] datos=null;
        this.objArchivo = new ArchivoTexto();
        this.objArchivo.abrirArchivoTexto('r', "estudiantes.txt");
        datos=this.objArchivo.buscarDato(nc);
        this.objArchivo.cerrarArchivo('r');  
        return datos;
    }

    public void eliminarRegistro(String numControl) {        
        this.objArchivo = new ArchivoTexto();
        this.objArchivo.abrirArchivoTexto('r', "estudiantes.txt");
        this.objArchivo.eliminarLinea(numControl);
        this.objArchivo.cerrarArchivo('r');   
        
        this.objArchivo.eliminarArchivo("estudiantes.txt");
        this.objArchivo.renombrarArchivo("temporal.txt", "estudiantes.txt");
        
        this.llenarTabla();
    }
    public void editarRegistro(String numControl, String nuevoNombre, String nuevoApellido, String nuevoSemestre, String nuevoGrupo, String nuevaCarrera) {
    // Buscar el registro original
    String[] datosOriginales = this.buscarRegistro(numControl);
    if (datosOriginales != null) {
        // Eliminar el registro original
        this.eliminarRegistro(numControl);
        
        // Crear la nueva línea con los datos actualizados
        String nuevaLinea = numControl + "," + nuevoNombre + "," + nuevoApellido + "," + nuevoSemestre + "," + nuevoGrupo + "," + nuevaCarrera;
        // Guardar el nuevo registro
        this.objArchivo.abrirArchivoTexto('w', "estudiantes.txt");
        this.objArchivo.crearLinea(nuevaLinea);
        this.objArchivo.cerrarArchivo('w');
        
        // Actualizar la tabla
        this.llenarTabla();
    } 
     /*buscarseleccionarRegistro(Sting nc){
    boolean encontrado=false;
    aqui se pone el color se puede en vista o en controlador
     */
    }
}
