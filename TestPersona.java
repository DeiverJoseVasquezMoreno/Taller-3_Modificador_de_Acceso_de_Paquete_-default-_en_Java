public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.edad = 25;

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.edad);
    }
}
