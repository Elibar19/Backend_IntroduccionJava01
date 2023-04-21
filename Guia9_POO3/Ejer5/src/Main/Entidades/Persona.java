package Main.Entidades;

import java.util.Date;

public class Persona {
    private String name;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String name, Date fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
