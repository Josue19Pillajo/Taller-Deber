prueba de paquete ;

import  dominio.Curso ;

público  de clase  TestCurso {

    public  static  void  main ( String [] args ) {

        Curso cursoA =  nuevo  Curso ();
        doble [] notas =  nuevo  doble [ 12 ];
        llenaNotas (notas);
        cursoA . setNotas (notas);
        cursoA . mostrarNotas ();
        cursoA . setEstudiantesEncimaPromedio ();
        cursoA . setPromedio ();
        Sistema . fuera . println ( " Promedio de curso = "  + cursoA . getPromedio ());
        Sistema . fuera . println ( " Nro de esstudiantes encima del promedio = "  + cursoA . nroEstudiantesEncimaPromedio ());

    }

    public  static  void  llenaNotas ( double [] notas ) {
        para ( int i =  0 ; i <  12 ; i ++ ) {
            notas [i] =  Matemáticas . aleatorio () *  6 ;
        }
    }
}
