package t26;

public class Main
{
	public static void main(String args[])
    {
        Mesa descripcion = new Mesa(); 

        System.out.println("Color: "+descripcion.mostrarColor());
        System.out.println("Material: "+descripcion.mostrarmaterial());
        System.out.println("Horas de trabajo: "+descripcion.mostrarhorasdetrabajo());
    }
}