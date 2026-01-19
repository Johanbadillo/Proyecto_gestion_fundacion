package MODELO;

public class EMPLEADOS extends PERSONA{
    private double salario;
    private String cargo;
    private String horario;

    public EMPLEADOS(double salario, String cargo, String horario, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public void Presentarse(){
        System.out.println("Hola soy un empleado y me llamo "+getNombre()+" "+getApellido()+"y mi cargo es "+getCargo());
    }
}