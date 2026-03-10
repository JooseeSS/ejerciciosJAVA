package Actividades;

import java.util.*;

public class Ej16 {
/*Solicitar un número comprendido entre 1 y 99. El programa debe mostrarlo escrito. Por ejemplo,
 *  para 56 mostrar: «cincuenta y seis».*/
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	 

	 
	          System.out.print("Introduce un número entre 1 y 99: ");
  int n = sc.nextInt();

  if (n < 1 || n > 99) {
      System.out.println("Número fuera de rango.");
      return;
  }

  int decena = n / 10;
  int unidad = n % 10;

  switch (decena) {
      case 0: 
          switch (unidad) {
              case 1: System.out.println("uno"); break;
  case 2: System.out.println("dos"); break;
  case 3: System.out.println("tres"); break;
  case 4: System.out.println("cuatro"); break;
  case 5: System.out.println("cinco"); break;
  case 6: System.out.println("seis"); break;
  case 7: System.out.println("siete"); break;
  case 8: System.out.println("ocho"); break;
  case 9: System.out.println("nueve"); break;
      }
      break;
  case 1: 
      switch (unidad) {
          case 0: System.out.println("diez"); break;
  case 1: System.out.println("once"); break;
  case 2: System.out.println("doce"); break;
  case 3: System.out.println("trece"); break;
  case 4: System.out.println("catorce"); break;
  case 5: System.out.println("quince"); break;
  case 6: System.out.println("dieciséis"); break;
  case 7: System.out.println("diecisiete"); break;
  case 8: System.out.println("dieciocho"); break;
  case 9: System.out.println("diecinueve"); break;
      }
      break;
  case 2: 
      if (unidad == 0) System.out.println("veinte");
  else switch (unidad) {
      case 1: System.out.println("veintiuno"); break;
  case 2: System.out.println("veintidós"); break;
  case 3: System.out.println("veintitrés"); break;
  case 4: System.out.println("veinticuatro"); break;
  case 5: System.out.println("veinticinco"); break;
  case 6: System.out.println("veintiséis"); break;
  case 7: System.out.println("veintisiete"); break;
  case 8: System.out.println("veintiocho"); break;
  case 9: System.out.println("veintinueve"); break;
      }
      break;
  case 3: 
      switch (unidad) {
          case 0: System.out.println("treinta"); break;
  case 1: System.out.println("treinta y uno"); break;
  case 2: System.out.println("treinta y dos"); break;
  case 3: System.out.println("treinta y tres"); break;
  case 4: System.out.println("treinta y cuatro"); break;
  case 5: System.out.println("treinta y cinco"); break;
  case 6: System.out.println("treinta y seis"); break;
  case 7: System.out.println("treinta y siete"); break;
  case 8: System.out.println("treinta y ocho"); break;
  case 9: System.out.println("treinta y nueve"); break;
      }
      break;
  case 4: 
      switch (unidad) {
          case 0: System.out.println("cuarenta"); break;
  case 1: System.out.println("cuarenta y uno"); break;
  case 2: System.out.println("cuarenta y dos"); break;
  case 3: System.out.println("cuarenta y tres"); break;
  case 4: System.out.println("cuarenta y cuatro"); break;
  case 5: System.out.println("cuarenta y cinco"); break;
  case 6: System.out.println("cuarenta y seis"); break;
  case 7: System.out.println("cuarenta y siete"); break;
  case 8: System.out.println("cuarenta y ocho"); break;
  case 9: System.out.println("cuarenta y nueve"); break;
      }
      break;
  case 5: 
      switch (unidad) {
          case 0: System.out.println("cincuenta"); break;
  case 1: System.out.println("cincuenta y uno"); break;
  case 2: System.out.println("cincuenta y dos"); break;
  case 3: System.out.println("cincuenta y tres"); break;
  case 4: System.out.println("cincuenta y cuatro"); break;
  case 5: System.out.println("cincuenta y cinco"); break;
  case 6: System.out.println("cincuenta y seis"); break;
  case 7: System.out.println("cincuenta y siete"); break;
  case 8: System.out.println("cincuenta y ocho"); break;
  case 9: System.out.println("cincuenta y nueve"); break;
      }
      break;
  case 6: 
      switch (unidad) {
          case 0: System.out.println("sesenta"); break;
  case 1: System.out.println("sesenta y uno"); break;
  case 2: System.out.println("sesenta y dos"); break;
  case 3: System.out.println("sesenta y tres"); break;
  case 4: System.out.println("sesenta y cuatro"); break;
  case 5: System.out.println("sesenta y cinco"); break;
  case 6: System.out.println("sesenta y seis"); break;
  case 7: System.out.println("sesenta y siete"); break;
  case 8: System.out.println("sesenta y ocho"); break;
  case 9: System.out.println("sesenta y nueve"); break;
      }
      break;
  case 7: 
      switch (unidad) {
          case 0: System.out.println("setenta"); break;
  case 1: System.out.println("setenta y uno"); break;
  case 2: System.out.println("setenta y dos"); break;
  case 3: System.out.println("setenta y tres"); break;
  case 4: System.out.println("setenta y cuatro"); break;
  case 5: System.out.println("setenta y cinco"); break;
  case 6: System.out.println("setenta y seis"); break;
  case 7: System.out.println("setenta y siete"); break;
  case 8: System.out.println("setenta y ocho"); break;
  case 9: System.out.println("setenta y nueve"); break;
      }
      break;
  case 8: 
      switch (unidad) {
          case 0: System.out.println("ochenta"); break;
  case 1: System.out.println("ochenta y uno"); break;
  case 2: System.out.println("ochenta y dos"); break;
  case 3: System.out.println("ochenta y tres"); break;
  case 4: System.out.println("ochenta y cuatro"); break;
  case 5: System.out.println("ochenta y cinco"); break;
  case 6: System.out.println("ochenta y seis"); break;
  case 7: System.out.println("ochenta y siete"); break;
  case 8: System.out.println("ochenta y ocho"); break;
  case 9: System.out.println("ochenta y nueve"); break;
      }
      break;
  case 9: 
      switch (unidad) {
          case 0: System.out.println("noventa"); break;
  case 1: System.out.println("noventa y uno"); break;
  case 2: System.out.println("noventa y dos"); break;
  case 3: System.out.println("noventa y tres"); break;
  case 4: System.out.println("noventa y cuatro"); break;
  case 5: System.out.println("noventa y cinco"); break;
  case 6: System.out.println("noventa y seis"); break;
  case 7: System.out.println("noventa y siete"); break;
  case 8: System.out.println("noventa y ocho"); break;
  case 9: System.out.println("noventa y nueve"); break;
		                  }
		                  break;
		          }
		      }
		  

}


