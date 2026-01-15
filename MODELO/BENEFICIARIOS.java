package MODELO;

public class BENEFICIARIO extends PERSONA{
    private int ayuda_mes;

    public BENEFICIARIO(int ayuda_mes,String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
        this.ayuda_mes = ayuda_mes;
    }

    public int getayuda_mes() {
        return ayuda_mes;
    }

    public void setayuda_mes(int ayuda_mes) {
        this.ayuda_mes = ayuda_mes;
    }

    @Override
    public void Presentarse(){
        System.out.println("Hola soy un Beneficiario, mi nombre es "+getNombre()+ " "+getApellido());
    }
}