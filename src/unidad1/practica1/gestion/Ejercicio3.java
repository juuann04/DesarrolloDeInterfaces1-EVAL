package unidad1.practica1.gestion;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import unidad1.practica1.facturacion.*;
import unidad1.practica1.facturacion.Producto.IVA;

public class Ejercicio3 {

	public static void main(String[] args) {

		List<Factura> facturas = Arrays.asList(
			new Factura(1,
					Arrays.asList(
						new Producto(.70, "Botellín", IVA.Superreducido),
						new Producto(1, "Tomate", IVA.Normal),
						new Producto(.50, "Regaliz")
					),
					new Calendar.Builder().setDate(2020, Calendar.JANUARY, 5).build()
				),
			new Factura(2,
					Arrays.asList(
						new Producto(1.1, "Maíz", IVA.Normal),
						new Producto(6.25, "Lechuga", IVA.Reducido),
						new Producto(2.67, "Huevos")
					),
					new Calendar.Builder().setDate(2020, Calendar.SEPTEMBER, 17).build()
				),
			new Factura(3, 
					Arrays.asList(
						new Producto(2.5, "Helado", IVA.Normal),
						new Producto(0.59, "Gominolas", IVA.Normal),
						new Producto(2.5, "Guisantes")
					),
					new Calendar.Builder().setDate(2020, Calendar.JUNE, 7).build()
				),
			new Factura(4, 
					Arrays.asList(
							new Producto(5.5, "Hamburguesas", IVA.Reducido),
							new Producto(3.99, "Spaguettis", IVA.Normal),
							new Producto(4.78, "Merluza")
						),
					new Calendar.Builder().setDate(2020, Calendar.MARCH, 15).build()
				),
			new Factura(5,
					Arrays.asList(
							new Producto(5.99, "Patatas", IVA.Reducido),
							new Producto(3.89, "Lentejas"),
							new Producto(2, "Garbanzos", IVA.Superreducido)
						),
					new Calendar.Builder().setDate(2020, Calendar.OCTOBER, 12).build()
				)
			);
		
		for ( var factura : facturas ) {
			System.out.println(factura);
		}
		
		System.out.printf("El IVA Trimestral: %.2f€", UtilidadesCalculoIVA.calculoIVATrimestral(facturas, 2020, Calendar.JANUARY));
		System.out.printf("\nEl IVA Mensual: %.2f€", UtilidadesCalculoIVA.calculoIVAMesActual(facturas, 2020, Calendar.OCTOBER));
	}
}