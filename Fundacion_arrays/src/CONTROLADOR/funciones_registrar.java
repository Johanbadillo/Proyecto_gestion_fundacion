package CONTROLADOR;

import MODELO.BENEFICIARIOS;
import MODELO.COLABORADORES;
import MODELO.EMPLEADOS;
import java.util.ArrayList;
import java.util.Scanner;

public class funciones_registrar {

    ArrayList<EMPLEADOS> listaEmpleados = new ArrayList<>();
    ArrayList<COLABORADORES> listaColaboradores = new ArrayList<>();
    ArrayList<BENEFICIARIOS> listaBeneficiarios = new ArrayList<>();

    public void agg_empleados() {
        validaciones v = new validaciones();

        int ope = 0;
        do {
            System.out.println("Ingrese El nombre del empleado: ");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese El apellido del empleado: ");
            String apellido = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la edad del empleado: ");
            int edad = new Scanner(System.in).nextInt();
            System.out.println("Ingrese El documento del empleado: ");
            String documento = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la direccion del empleado: ");
            String direccion = new Scanner(System.in).nextLine();
            System.out.println("Ingrese El salario del empleado: ");
            double salario = new Scanner(System.in).nextDouble();
            System.out.println("Ingrese El cargo del empleado: ");
            String cargo = new Scanner(System.in).nextLine();
            System.out.println("Ingrese El horario del empleado: ");
            String horario = new Scanner(System.in).nextLine();
            EMPLEADOS emp = new EMPLEADOS(salario, cargo, horario, documento, nombre, apellido, edad, direccion);
            listaEmpleados.add(emp);
            ope = v.validacion(1, 2, "¿Quieres continuar registrando Empleados?\n1. SI\n2. NO");
        } while (ope != 2);

    }

    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay EMPLEADOS registradas");
        } else {
            System.out.println("\n========== Lista de EMPLEADOS ==========");
            for (EMPLEADOS e : listaEmpleados) {
                e.Presentarse();
                System.out.println("---------------------------------------");
            }
        }
    }

    public void agg_colaboradores() {
        validaciones v = new validaciones();

        int ope = 0;
        do {
            System.out.println("Ingrese El nombre del colaborador: ");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese El apellido del colaborador: ");
            String apellido = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la edad del colaborador: ");
            int edad = new Scanner(System.in).nextInt();
            System.out.println("Ingrese El documento del colaborador: ");
            String documento = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la direccion del colaborador: ");
            String direccion = new Scanner(System.in).nextLine();
            System.out.println("Ingrese las horas por mes del colaborador: ");
            int horas_por_mes = new Scanner(System.in).nextInt();
            System.out.println("Ingrese la meta voluntaria del colaborador: ");
            int meta_voluntaria = new Scanner(System.in).nextInt();
            System.out.println("Ingrese la bonificacion del colaborador: ");
            double bonificacion = new Scanner(System.in).nextDouble();
            COLABORADORES clb = new COLABORADORES(horas_por_mes, meta_voluntaria, bonificacion, documento, nombre, apellido, edad, direccion);
            listaColaboradores.add(clb);
            ope = v.validacion(1, 2, "¿Quieres continuar registrando colaboradores?\n1. SI\n2. NO");
        } while (ope != 2);

    }

    public void mostrarColaboradores() {
        if (listaColaboradores.isEmpty()) {
            System.out.println("No hay COLABORADORES registradas");
        } else {
            System.out.println("\n========== Lista de COLABORADORES ==========");
            for (COLABORADORES c : listaColaboradores) {
                c.Presentarse();
                System.out.println("---------------------------------------");
            }
        }
    }

    public void agg_beneficiarios() {
        validaciones v = new validaciones();

        int ope = 0;
        do {
            System.out.println("Ingrese El nombre del beneficiario: ");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese El apellido del beneficiario: ");
            String apellido = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la edad del beneficiario: ");
            int edad = new Scanner(System.in).nextInt();
            System.out.println("Ingrese El documento del beneficiario: ");
            String documento = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la direccion del beneficiario: ");
            String direccion = new Scanner(System.in).nextLine();
            int ayuda_mes = v.validacion(1, 5, "Ingrese las ayuda por mes del beneficiario(MAX: 5): ");
            BENEFICIARIOS bnf = new BENEFICIARIOS(ayuda_mes, documento, nombre, apellido, edad, direccion);
            listaBeneficiarios.add(bnf);
            ope = v.validacion(1, 2, "¿Quieres continuar registrando colaboradores?\n1. SI\n2. NO");
        } while (ope != 2);

    };
    
    public void mostrarBeneficiarios() {
        if (listaBeneficiarios.isEmpty()) {
            System.out.println("No hay BENEFICIARIOS registradas");
        } else {
            System.out.println("\n========== Lista de BENEFICIARIOS ==========");
            for (BENEFICIARIOS b : listaBeneficiarios) {
                b.Presentarse();
                System.out.println("---------------------------------------");
            }
        }
    }
}
