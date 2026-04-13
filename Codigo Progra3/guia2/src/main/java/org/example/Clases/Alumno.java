package org.example.Clases;

public class Alumno {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String email;


    public Alumno(String nombre, String apellido, int edad, String email) {
        if (nombre == null || apellido == null || edad <= 0 || email == null) {
            throw new IllegalArgumentException("Datos inválidos para Alumno");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }
}
