package modelo.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class empleado {

	//Atributos
	
	private String nombreEmpl;
	private String apellidoEmpl;
	private int genero; //1 FEMENINO - 2 MASCULINO
	private String imagen;
	private double salario;
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	
	//Método Constructor sin parámetros
	public empleado() {
		nombreEmpl = "";
		apellidoEmpl = "";
		genero = 0;
		imagen = "";
		salario= 0.0;
		fechaNacimiento=new Fecha(10,12,1971);
		fechaIngreso=new Fecha(13,12,2015);
	}
	
	//Método Constructor con Parámetro
	public empleado (String pNombreEmpl, String pApellidoEmpl,int pGenero,String pImagen,double pSalario) {
		nombreEmpl = pNombreEmpl;
		apellidoEmpl =pApellidoEmpl;
		genero  = pGenero;
		imagen = pImagen;
		salario= pSalario;
	}
	//Método analizados(Permiten obtener o modificar la infor de los atributo9
	//Getters(obtener) //setter(Cambiar o modificar)
	
	public String getNombre() {
		return nombreEmpl;
	}
	public String apellidoEmpl() {
		return apellidoEmpl;
	}
	public String getGenero() {
		String generoString=null;
		if(genero==1) {
			generoString="Masculino";
		}else {
			generoString="Femenino";	
		}
		return generoString;
	}
	
	public String getImagen() {
		return imagen;
	}
	public double getSalario() {
		return salario;
	}

	public String getFechaNacimiento() {
		String strFecha = fechaNacimiento.toString();
		return strFecha;
	}

	public String getFechaIngreso() {
		String strFecha = fechaNacimiento.toString();
		return strFecha;
	}
	//Método funcionales calcula la antiguedad en años
	public int calcularAntiguedad () {
		Fecha fechaActual = getFechaActual();
    	int antiguedad = fechaIngreso.darDiferenciaMese(fechaActual)/12;        			
    	return antiguedad;
	}
	
	//Método funcional calcula edad del empleado en años
    public int calcularEdad () {
	Fecha fechaActual = getFechaActual();
	int edad = fechaNacimiento.darDiferenciaMese(fechaActual)/12;    	
	return edad;
    }
    public double calcularPrestaciones ()  {
	
	double prestaciones;
	int antiguedad = calcularAntiguedad();
	prestaciones= ((double)(antiguedad*salario))/12;
	return prestaciones; 
     }
	
    //Método Setters
        public void setEmpleado (String pNombreEmpl, String pApellidoEmpl,int pGenero,String pImagen,double pSalario, Fecha pFechaN, Fecha pFechaIng) {
		nombreEmpl = pNombreEmpl;
		apellidoEmpl =pApellidoEmpl;
		genero  = pGenero;
		imagen = pImagen;
		salario= pSalario;
		fechaNacimiento= pFechaN;
		fechaIngreso=pFechaIng;
	}

        public Fecha getFechaActual() {
    		
    		GregorianCalendar gc = new GregorianCalendar ( );
    		int dia = gc.get(Calendar.DAY_OF_MONTH);
    		int mes = gc.get(Calendar.MONTH)+1;
    		int anio = gc.get(Calendar.YEAR);
    		Fecha fechaActual = new Fecha(dia,mes,anio);
    		
    		
    		return fechaActual;
    	}
        
    	
    //Método que permite visualizar la informacion del empleado
    public void mostrarInforEmpleado ( ) {
		
		System.out.println("|Nombre: "+ nombreEmpl);
		System.out.println("|Apellido: "+ apellidoEmpl);
		System.out.println("|Fecha de Nacimiento: "+ getFechaNacimiento());
		System.out.println("|Edad: "+ calcularEdad());
		System.out.println("|Genero: "+ getGenero());
		System.out.println("|Ingreso a la Empresa el: "+ getFechaIngreso());
		System.out.println("|Salario: "+ salario);
		System.out.println("|Prestaciones: "+ calcularPrestaciones());
		System.out.println("|Antiguedad: "+ calcularAntiguedad());
		
		

	}
    //Método que permite la validación de letras en las variables nombre y apellido
	public static boolean validarLetras(String datos) {
		// TODO Auto-generated method stub
		return datos.matches("[a-zA-Z]*");
		
	}
}

