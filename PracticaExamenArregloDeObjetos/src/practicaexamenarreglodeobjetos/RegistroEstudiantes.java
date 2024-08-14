
package practicaexamenarreglodeobjetos;

import javax.swing.JOptionPane;


public class RegistroEstudiantes {
     int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio: ")); //Le preguntamos al usuario sobre el tamano el cual quiere que se haga el arrego 
    Estudiantes[] arrEstudiantes = new Estudiantes[tamanio]; // Se define el tamano del arreglo con respecto lo que se le solicita al usuario 

    
     public void agregarinfo(Estudiantes[] agregarinfo) { //creamos el metodo para poder agregarle informacion al arreglo  
        for (int i = 0; i < agregarinfo.length; i++) { //Creamos un for que nos funcione para solicitar la informacion al usuario 
            JOptionPane.showMessageDialog(null, "Datos del estudiante: " + (i + 1));  
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            String curso = JOptionPane.showInputDialog("Ingrese el curso");
             //Se le solicitaron los datos del  estudiante 
            agregarinfo[i] = new Estudiantes(nombre, edad, curso);
             //Lo que se hace esq siempre se cree uno nuevo con la informcion que se solicito 

        }
    }

  public void eliminarEstudiante() { 
    // Este método se encarga de iniciar el proceso de eliminar un estudiante.

    arrEstudiantes = eliminarEstudiante(arrEstudiantes); 
    // Aquí llamamos a otro método que realmente hará el trabajo de eliminar al estudiante,
    // y luego actualizamos el arreglo con el nuevo que nos devuelva.
}

private Estudiantes[] eliminarEstudiante(Estudiantes[] arrEstudiantes) { 
    // Este es el método que se encarga de eliminar al estudiante y devolver un nuevo arreglo sin él.
    
    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del estudiante que desea eliminar")); 
    // Le pedimos al usuario que ingrese el número del estudiante que quiere eliminar.
    
    if (num >= 1 && num <= arrEstudiantes.length) { 
        // Verificamos que el número ingresado sea válido, es decir, que corresponda a un estudiante existente.
        
        Estudiantes[] nuevoArrib = new Estudiantes[arrEstudiantes.length - 1]; 
        // Creamos un nuevo arreglo con un tamaño que es uno menos que el original  ya que vamos a eliminar un estudiante.
        
        int j = 0; 
        // Iniciamos una variable  en cero que utilizaremos para llenar el nuevo arreglo.
        
        for (int i = 0; i < arrEstudiantes.length; i++) { 
            // se recorre  todo el arreglo 
            
            if (i != num - 1) { 
                // Si el indice actual no es el del estudiante que queremos eliminar
                
                nuevoArrib[j++] = arrEstudiantes[i]; 
                // copiamos ese estudiante al nuevo arreglo y luego incrementamos el indice `j`.
            }
        }
        arrEstudiantes = nuevoArrib; 
        // Actualizamos el arreglo original para que apunte al nuevo arreglo sin el estudiante eliminado.
        
        JOptionPane.showMessageDialog(null, "El estudiante ha sido eliminado"); 
        return nuevoArrib; 
        // Devolvemos el nuevo arreglo que ya no incluye al estudiante eliminado.
    } else {
        JOptionPane.showMessageDialog(null, "No se logró eliminar al estudiante"); 
        return arrEstudiantes; 
        // Devolvemos el arreglo original sin cambios
    }
}


    public void mostrarinfo(Estudiantes[] arrEstudiantes) { //Se crea el arreglo para mostrar los datos de los estudiantes 
        for (int i = 0; i < arrEstudiantes.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Estudiante #" + (i + 1) + ":\n"
                    + "Nombre: " + arrEstudiantes[i].getNombre() + "\n"
                    + "Curso: " + arrEstudiantes[i].getCurso() + "\n"  //Recorremos todo el arreglo y vamos imprimiendo los datos 
                    + "Edad: " + arrEstudiantes[i].getEdad() + "\n");
        }
    }

    public void buscarinfo(Estudiantes[] arrEstudiantes) { 
    // Este metodo es para buscar información sobre un estudiante en el arreglo.
    String buscaInfo = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que quiere buscar?");
    // Pedimos al usuario que ingrese el nombre del estudiante que está buscando.
    for (int i = 0; i < arrEstudiantes.length; i++) { 
        // Recorremos todo el arreglo de estudiantes uno por uno
        if (arrEstudiantes[i].getNombre().equals(buscaInfo)) { 
            // validamos que  encontramos un estudiante con el nombre que el usuario pidio 
            JOptionPane.showMessageDialog(null,
                    "Estudiante #" + (i + 1) + ":\n"
                    + "Nombre: " + arrEstudiantes[i].getNombre() + "\n"
                    + "Curso: " + arrEstudiantes[i].getCurso() + "\n"
                    + "Edad: " + arrEstudiantes[i].getEdad() + "\n");
            // mostramos la información del estudiante
        }
    }
}
}

