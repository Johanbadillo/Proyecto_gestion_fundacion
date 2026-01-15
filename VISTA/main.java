package VISTA;

import CONTROLADOR.FUNCIONES;
import CONTROLADOR.validaciones;

public class menu {

    public static void main(String[] args)  {
        validaciones v = new validaciones();
        funciones_Registrar fr = new funciones();
        funciones_presentaciones fp = new funciones();
        int op = 0;
        int opp= 0;
        do {
            op = v.validacion(1, 3, "============================\n=== FUNDACION AYUDAS COMUNITARIAS ===\n1- Registrar persona\n2- Presentacion Personas\n3- Salir\n============================");
            switch(op){
                case 1:
                    opp=v.validacion(1, 4, "============================\n=== Menu Para Registro de usuarios ===\n1- Registrar Empleado\n2- Registrar Colaborador\n3- Registrar Beneficiario\n4- salir\n============================");
                    switch(opp){
                        case 1:
                            fr.agg_empleados();
                            break;
                        case 2:
                            fr.agg_colaboradores();
                            break;
                        case 3:
                            fr.agg_beneficiarios();
                            break;
                    }
                    break;
                case 2:
                    fp.presentacion_Personas();
                    break;
            }
        } while (op != 3);
    }
}