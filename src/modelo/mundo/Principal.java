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
			 System.out.println("| 3. Calcular la antig�edad del Empleado              |" );
			 System.out.println("| 4. Calcular las prestaciones del Empleado           |" );
			 System.out.println("| 5. Visualizar la informaci�n del Empleado           |" );
			 System.out.println("| 6. Salir                                            |" );
			 do {
		        	try {
		        		System.out.println("|Elija una opci�n del men�:                           |");
						 opcion= sn.nextInt();
									
					}
					catch(InputMismatchException e) {
						System.out.println("_______________________________________________________");
						System.out.println("|Ingresar solo n�meros!!                              |");
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
						System.out.println("| No debe ingresar nada m�s que letras                |");
						nombre = sn.next();
				 }
				 
			       //Apellido solo letras
				 System.out.println("|Apellido: ");
				 apellidoEmplPrin = sn.next();
				 while (!miEmpleado.validarLetras(apellidoEmplPrin)) {
					System.out.println("_______________________________________________________");
					System.out.println("| No debe ingresar nada m�s que letras                |");
						apellidoEmplPrin =sn.next();
				 }
				 //G�nero del Empleado solo del 1 al 2
				 System.out.println("|Nota: 1 para masculino, 2 para femenino");
				 do {
			        	try {
			        
							System.out.println("|Genero: ");
							 empleadoGenero= sn.nextInt();
										
						}
						catch(InputMismatchException e) {
							System.out.println("|Debe ingresar solo n�meros  ");
							empleadoGenero = 0;
							sn.nextLine();
						}
			        }while (empleadoGenero<1 || empleadoGenero>2);
				 //Salario del Empleado 
				      
				 System.out.println("|Salario: (No ingrese n�meros menores a 0,1) ");
				do {
			        	try {
							salarioPrin= sn.nextDouble();
						}
						catch(InputMismatchException e) {
							salarioPrin = 0;
							sn.nextLine();
						}
			        	if(salarioPrin<0.1) {
							System.out.println("|Debe ingresar solo n�meros separados por la coma (0,1)");
			        	}
			        }while (salarioPrin<0.1);
				 
				 //------------------------------------------------------------------------------------------------
				 //Fechas de Naciemiento
				 //------------------------------------------------------------------------------------------------
				 
				 System.out.println("_______________________________________________________");
				 System.out.println("|---------Ingreso de Fechas de Nacimiento-------------|");
				 System.out.println("|Las fechas deben ser mayores a cero,                 |");
				 System.out.println("|Formato de fechas: D�a(1-31) Mes(1-12) A�o(1900-2021)|");
				 System.out.println("|Ingrese d�a de nacimiento:                           |");

				 //D�a de nacimiento
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
			        		System.out.println("|Debe ingresar solo n�meros (1-31)                    |");
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
					        		System.out.println("|Debe ingresar solo n�meros (1-12)                    |");					        	
					        		}
					        }while (mes<1 || mes>12);
				//A�o de Nacimiento
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
					        		System.out.println("|Debe ingresar solo n�meros (1900-2021)               |");					        	
					        		}
					        }while (anio<1900 || anio>2021);
					     
				         fechaNac =new Fecha (dia,mes,anio);
				         
				         //-----------------------------------------------------------------------------------------------
				         //Fechas de Ingreso
				         //----------------------------------------------------------------------------------------------
				         
				         System.out.println("_______________________________________________________");
						 System.out.println("|-----------Ingreso de Fechas de Ingreso--------------|");
						 //d�a
					     System.out.println("|Ingrese d�a de ingreso: ");
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
					        		System.out.println("|Debe ingresar solo n�meros (1-31)                    |");
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
					        		System.out.println("|Debe ingresar solo n�meros (1-12)                    |");
					        		}
					        }while (mes<1 || mes>12);
					     
					     //A�o
					     System.out.println("|Ingrese a�o de ingreso: "); 
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
					        		System.out.println("|Debe ingresar solo n�meros (1900-2021)               |");					        	
					        		}
					        }while (anio<1900 || anio>2021);
					     
				fechaIngreso= new Fecha(dia,mes,anio);
			    miEmpleado.setEmpleado(nombre, apellidoEmplPrin,empleadoGenero ,imagenPrin,salarioPrin,fechaNac,fechaIngreso);
		        break;
			 case 2:
				System.out.println("|-Calculando la edad del Empleado: "+ miEmpleado.calcularEdad());
				break;
			 case 3:
				System.out.println("|-Calculando la antig�edad del Empleado: " + miEmpleado.calcularAntiguedad());
				 break;
			 case 4:
				System.out.println("_______________________________________________________");
				System.out.println("|-Calculando las prestaciones del Empleado: "+ miEmpleado.calcularPrestaciones());
				 break;
			 case 5:
				 System.out.println("_______________________________________________________"); 
				 System.out.println("|-------Visualizando la informaci�n del Empleado------|" );
				 miEmpleado.mostrarInforEmpleado();
				 break;
			 case 6:
				 System.out.println("_______________________________________________________"); 
				 System.out.println("|_________________Ha salido con �xito!!_______________|");
				 System.out.println("_______________________________________________________"); 
				 salir=true;
				 break;
				 default:
					 System.out.println("|Error opci�n inv�lida!; por favor intente de nuevo   |");
					
			 }
			 
	}

	}
}
