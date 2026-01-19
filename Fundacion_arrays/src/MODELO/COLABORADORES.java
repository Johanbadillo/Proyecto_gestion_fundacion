package MODELO;

public class COLABORADORES extends PERSONA {
    private int horas_por_mes;
    private int meta_voluntaria;
    private double bonificacion;

    public COLABORADORES(int horas_por_mes, int meta_voluntaria, double bonificacion, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.horas_por_mes = horas_por_mes;
        this.meta_voluntaria = meta_voluntaria;
        this.bonificacion = bonificacion;
    }

    public int gethoras_por_mes() {
        return horas_por_mes;
    }

    public void sethoras_por_mes(int horas_por_mes) {
        this.horas_por_mes = horas_por_mes;
    }

    public int getmeta_voluntaria() {
        return meta_voluntaria;
    }

    public void setmeta_voluntaria(int meta_voluntaria) {
        this.meta_voluntaria = meta_voluntaria;
    }

    public double getbonificacion() {
        return bonificacion;
    }

    public void setbonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void Presentarse(){
        System.out.println("Hola soy un colaborador, mi nombre es "+getNombre()+" "+getApellido());
    }
}