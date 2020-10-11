package unidad1.practica1.facturacion;

import java.util.List;

import java.util.ArrayList;

public class UtilidadesFactura {

	// CALCULAR EL IMPORTE SIN IVA DE LA FACTURA
	public static double calcularImporteFactura(Factura f) {
		double importeSinIVA = 0;

		for (var producto : f.getProductos()) {
			importeSinIVA += producto.getImporte();
		}
		return importeSinIVA;
	}

	// CALCULAR EL IVA DEL TOTAL DE LA FACTURA
	public static double calcularIVAFactura(Factura f) {
		double IVA = 21;

		for (var producto : f.getProductos()) {
			IVA += producto.getImporte() * producto.getIVA().porcentaje;
		}
		return IVA;
	}

	// CALCULAR EL IMPORTE DE LA FACTURA  CON IVA
	public static double calcularImporteFacturaConIVA(Factura f) {
		return calcularImporteFactura(f) + calcularIVAFactura(f);
	}
}