
package domnio;


public class Clase {
     paquete  curso ;

 clase  pública Curso {
     notas dobles privadas [];
     promedio doble privado ;
    privado  int studiantesEncimaPromedio;
    
    public  Curso () {
        notas =  nuevo  doble [ 12 ];
    }
    
    public  void  setNotas ( notas dobles  []) {
        esto . notas = notas;
    }
    
    public  void  mostrarNotas ( notas dobles  []) {
        para ( int i = 0 ; i < 12 ; i ++ ) {
            Sistema . fuera . println ((i + 1 ) + " . Estudiante: " + this . notas [i]);
        }
    }
    public  void  setPromedio ( doble [] notas ) {
        doble promedio =  0 ;
        suma doble = 0 ;
        para ( int i = 0 ; i < 12 ; i ++ ) {
            doble almacenamiento = notas [i];
            suma = almacenamiento + suma; // se sumaran los valores
            // registrados de los 12 estudiantes
        }
        promedio = suma / 12 ;
        esto . promedio = promedio;
    }
    
    public  void  setEstudiantesEncimaPromedio () {
        // codigo duplicado ya está en el metodo promedio
        // solo hacemos referencia a la variable de clase promedio
        int estudiantes =  0 ;
        doble promedio = 0 ;
        suma doble = 0 ;
        para ( int i = 0 ; i < 12 ; i ++ ) {
            doble almacenamiento = notas [i];
            suma = almacenamiento + suma; // se sumaran los valores
            // registrados de los 12 estudiantes
        }
        promedio = suma / 12 ;
        para ( int i =  0 ; i <  12 ; i ++ ) {
            if (notas [i] > promedio) {
                estudiantes = estudiantes + 1 ;
            }
        }
        esto . studiantesEncimaPromedio = estudiantes;
    }
    
    public  double  getPromedio () {
        devuelve  esto . promedio;
    }
    public  int  getnroEstudiantesEncimaPromedio () {
        devuelve  esto . studiantesEncimaPromedio;
    }
}
