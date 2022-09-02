package t25;

public class Main
{
	public static void main(String args[])
    {
       Medico doctor = new Medico(); 

        System.out.println("Especialidad: "+doctor.mostrarEspecialidad());
        System.out.println("Nombre: "+doctor.mostrarNombre());
        System.out.println("DNI: "+doctor.mostrarDNI());
    }
}