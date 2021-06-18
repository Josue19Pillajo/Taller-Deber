
package test;


public class Clase {
     prueba de paquete ;
import  curso.Curso ;
público  de clase  TestCurso {
public  static  void  main ( String [] args ) {
    Curso cursoA =  nuevo  Curso ();
    doble [] notas =  nuevo  doble [ 12 ];

    llenaNotas (notas);
    cursoA . setNotas (notas);
    cursoA . mostrarNotas (notas);
    cursoA . setPromedio (notas);
    cursoA . setEstudiantesEncimaPromedio ();

    Sistema . fuera . println ();
    Sistema . fuera . println ( " Promedio del curso = " + cursoA . getPromedio ());
    Sistema . fuera . println ( " Nro de estudiantes encima del promedio = " +
            cursoA . getnroEstudiantesEncimaPromedio ());
}
public  static  void  llenaNotas ( double [] notas ) {
           // llenado de notas
    para ( int i = 0 ; i < 12 ; i ++ ) {
        notas [i] = Matemáticas . aleatorio () * 6 ;
    } 
}

}
