package modelo.mundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		int empleadoGenero,dia,mes,anio=0; //1 FEMENINO - 2 MASCULINO
		 String  nombre,apellidoEmplPrin, imagenPrin=null;
		 double salarioPrin=0;
		 
		 Fecha fechaNac;
		 Fecha fechaIngreso;
		 
		 //Instanciar un objeto
		 empleado miEmpleado= new empleado();		 
		 
		 Scanner sn = new Scanner(System.in); 
		 boolean salir =false;
		 int opcion=0;
		 
		 
		 while(!salir) {
			 System.out.println("    ______________________________________________     ");
			 System.out.println("____|---------------Datos del Empleado-----------|____ " );
			 System.out.println("| 1.Ingresar Datos del Empleado                       |" );
			 System.out.println("| 2. Calcular la edad del Empleado                    |" );
			 System.out.println("| 3. Calcular la antigüedad del Empleado              |" );
			 System.out.println("| 4. Calcular las prestaciones del Empleado           |" );
			 System.out.println("| 5. Visualizar la información del Empleado           |" );
			 System.out.println("| 6. Salir                                            |" );
			 do {
		        	try {
		        		System.out.println("|Elija una opción del menú:                           |");
						 opcion= sn.nextInt();
									
					}
					catch(InputMismatchException e) {
						System.out.println("_______________________________________________________");
						System.out.println("|Ingresar solo números!!                              |");
						opcion = 0;
						sn.nextLine();
					}
		        }while (opcion<1 || opcion>6);
			 
			 switch(opcion) {
			 
			 case 1: 
				 System.out.println("_______________________________________________________");
				 System.out.println("|------------Ingreso de datos del empleado------------|");
				 //Nombre solo letras
				 System.out.println("|Nombre:                                              |");
				 nombre=sn.next();
				 while (!miEmpleado.validarLetras(nombre )) {
					    System.out.println("_______________________________________________________");
						System.out.println("| No debe ingresar nada más que letras                |");
						nombre = sn.next();
				 }
				 
			       //Apellido solo letras
				 System.out.println("|Apellido: ");
				 apellidoEmplPrin = sn.next();
				 while (!miEmpleado.validarLetras(apellidoEmplPrin)) {
					System.out.println("_______________________________________________________");
					System.out.println("| No debe ingresar nada más que letras                |");
						apellidoEmplPrin =sn.next();
				 }
				 //Género del Empleado solo del 1 al 2
				 System.out.println("|Nota: 1 para masculino, 2 para femenino");
				 do {
			        	try {
			        
							System.out.println("|Genero: ");
							 empleadoGenero= sn.nextInt();
										
						}
						catch(InputMismatchException e) {
							System.out.println("|Debe ingresar solo números  ");
							empleadoGenero = 0;
							sn.nextLine();
						}
			        }while (empleadoGenero<1 || empleadoGenero>2);
				 //Salario del Empleado 
				      
				 System.out.println("|Salario: (No ingrese números menores a 0,1) ");
				do {
			        	try {
							salarioPrin= sn.nextDouble();
						}
						catch(InputMismatchException e) {
							salarioPrin = 0;
							sn.nextLine();
						}
			        	if(salarioPrin<0.1) {
							System.out.println("|Debe ingresar solo números separados por la coma (0,1)");
			        	}
			        }while (salarioPrin<0.1);
				 
				 //------------------------------------------------------------------------------------------------
				 //Fechas de Naciemiento
				 //------------------------------------------------------------------------------------------------
				 
				 System.out.println("_______________________________________________________");
				 System.out.println("|---------Ingreso de Fechas de Nacimiento-------------|");
				 System.out.println("|Las fechas deben ser mayores a cero,                 |");
				 System.out.println("|Formato de fechas: Día(1-31) Mes(1-12) Año(1900-2021)|");
				 System.out.println("|Ingrese día de nacimiento:                           |");

				 //Día de nacimiento
				 do {
					 try {
						 dia = sn.nextInt();
						 }
			        	catch(InputMismatchException e) {						
							dia = 0;
							sn.nextLine();
			        	}	
			        	if (dia<1 || dia>31) {
			        		System.out.println("_______________________________________________________");
			        		System.out.println("|Debe ingresar solo números (1-31)                    |");
			        	}
			        }while (dia<1 || dia>31);
						
				 //Mes de nacimiento
						 System.out.println("|Ingrese mes de nacimiento:");
						 do {
							 try {
								 mes = sn.nextInt();
								 }
					        	catch(InputMismatchException e) {						
									mes = 0;
									sn.nextLine();
					        	}	
					        	if (mes<1 || mes>12) {
					        		System.out.println("_______________________________________________________");
					        		System.out.println("|Debe ingresar solo números (1-12)                    |");					        	
					        		}
					        }while (mes<1 || mes>12);
				//Año de Nacimiento
					     System.out.println("|Ingrese anio de nacimiento: ");
					     do {
							 try {
								 anio = sn.nextInt();
								 }
					        	catch(InputMismatchException e) {						
					        		anio = 0;
									sn.nextLine();
					        	}	
					        	if (anio<1900 || anio>2021) {
					        		System.out.println("_______________________________________________________");
					        		System.out.println("|Debe ingresar solo números (1900-2021)               |");					        	
					        		}
					        }while (anio<1900 || anio>2021);
					     
				         fechaNac =new Fecha (dia,mes,anio);
				         
				         //-----------------------------------------------------------------------------------------------
				         //Fechas de Ingreso
				         //----------------------------------------------------------------------------------------------
				         
				         System.out.println("_______________________________________________________");
						 System.out.println("|-----------Ingreso de Fechas de Ingreso--------------|");
						 //día
					     System.out.println("|Ingrese día de ingreso: ");
					     do {
							 try {
								 dia = sn.nextInt();
								 }
					        	catch(InputMismatchException e) {						
									dia = 0;
									sn.nextLine();
					        	}	
					        	if (dia<1 || dia>31) {
					        		System.out.println("_______________________________________________________");
					        		System.out.println("|Debe ingresar solo números (1-31)                    |");
					        	}
					        }while (dia<1 || dia>31);
					    		        
					     //Mes
					     System.out.println("|Ingrese mes de ingreso: ");
					     do {
							 try {
								 mes = sn.nextInt();
								 }
					        	catch(InputMismatchException e) {						
									mes = 0;
									sn.nextLine();
					        	}	
					        	if (mes<1 || mes>12) {
					        		System.out.println("_______________________________________________________");
					        		System.out.println("|Debe ingresar solo números (1-12)                    |");
					        		}
					        }while (mes<1 || mes>12);
					     
					     //Año
					     System.out.println("|Ingrese año de ingreso: "); 
					     do {
							 try {
								 anio = sn.nextInt();
								 }
					        	catch(InputMismatchException e) {						
					        		anio = 0;
									sn.nextLine();
					        	}	
					        	if (anio<1900 || anio>2021) {
					        		System.out.println("_______________________________________________________");
					        		System.out.println("|Debe ingresar solo números (1900-2021)               |");					        	
					        		}
					        }while (anio<1900 || anio>2021);
					     
				fechaIngreso= new Fecha(dia,mes,anio);
			    miEmpleado.setEmpleado(nombre, apellidoEmplPrin,empleadoGenero ,imagenPrin,salarioPrin,fechaNac,fechaIngreso);
		        break;
			 case 2:
				System.out.println("|-Calculando la edad del Empleado: "+ miEmpleado.calcularEdad());
				break;
			 case 3:
				System.out.println("|-Calculando la antigüedad del Empleado: " + miEmpleado.calcularAntiguedad());
				 break;
			 case 4:
				System.out.println("_______________________________________________________");
				System.out.println("|-Calculando las prestaciones del Empleado: "+ miEmpleado.calcularPrestaciones());
				 break;
			 case 5:
				 System.out.println("_______________________________________________________"); 
				 System.out.println("|-------Visualizando la información del Empleado------|" );
				 miEmpleado.mostrarInforEmpleado();
				 break;
			 case 6:
				 System.out.println("_______________________________________________________"); 
				 System.out.println("|_________________Ha salido con Éxito!!_______________|");
				 System.out.println("_______________________________________________________"); 
				 salir=true;
				 break;
				 default:
					 System.out.println("|Error opción inválida!; por favor intente de nuevo   |");
					
			 }
			 
	}

	}
}
