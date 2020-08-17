package hibernate.example;

import hibernate.example.DAO.AlumnoDAO;
import hibernate.example.entity.Alumno;

public class ExampleApplication {

	public static void main(String[] args) {
		
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		Alumno[] alumnos = {new Alumno(),new Alumno(),new Alumno()};
		
		alumnos[0].setId(1L);
		alumnos[0].setNombre("Jose");
		alumnos[0].setApellido("Perez");
		
		alumnos[1].setId(2L);
		alumnos[1].setNombre("Esteban");
		alumnos[1].setApellido("Quito");
		
		alumnos[2].setId(3L);
		alumnos[2].setNombre("Ulrica");
		alumnos[2].setApellido("Godofreda");
		
		for(Alumno alumn : alumnos ) {
			alumnoDAO.createAlumno(alumn);
		}
		
		System.out.println("Lista Original");
		for(Alumno alumn : alumnoDAO.getAlumnos()) {
			System.out.println(alumn.getNombre()+" "+alumn.getApellido());
		}
		
		
		Alumno updateAlumno = alumnoDAO.getAlumnos("Esteban","Quito").get(0);
		
		updateAlumno.setNombre("Estefano");
		
		alumnoDAO.updateAlumno(updateAlumno);

		Alumno deletedAlumno = alumnoDAO.getAlumnos("Jose","Perez").get(0);
		
		
		alumnoDAO.removeAlumno(deletedAlumno);
		
		System.out.println("nueva Lista");
		for(Alumno alumn : alumnoDAO.getAlumnos()) {
			System.out.println(alumn.getNombre()+" "+alumn.getApellido());
		}
	}

}
