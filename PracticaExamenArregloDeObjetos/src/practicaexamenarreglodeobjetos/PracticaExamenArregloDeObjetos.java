/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenarreglodeobjetos;

/**
 *
 * @author Andy
 */
public class PracticaExamenArregloDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        RegistroEstudiantes estu = new RegistroEstudiantes(); //Creamos un nuevo estudiante en la clase de registro estudiante 
        estu.agregarinfo(estu.arrEstudiantes); 
        estu.eliminarEstudiante();
        estu.mostrarinfo(estu.arrEstudiantes);
        estu.buscarinfo(estu.arrEstudiantes);
        //se llaman los metodos al main 
        
    }
}
