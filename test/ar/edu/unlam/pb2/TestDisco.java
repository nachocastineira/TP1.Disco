package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestDisco {

	@Test
	public void testQueCalculaPerimetroInterior()
	{
		Disco miDisco = new Disco();
		miDisco.setRadioInterior(3.0);
		
		Double perimetroInterior;
		perimetroInterior = miDisco.calcularPerimetroInterior();
				
		Assert.assertEquals(18.84, perimetroInterior, 0.01);
	}

	@Test
	public void testQueCalculaPerimetroExterior()
	{
		Disco miDisco = new Disco();
		miDisco.setRadioExterior(9.0);
		
		Double perimetroExterior;
		perimetroExterior = miDisco.calcularPerimetroExterior();
				
		Assert.assertEquals(56.54, perimetroExterior, 0.01);
	}
	
	@Test
	public void testQueCalculaSuperficieTotal()
	{
		Disco miDisco = new Disco();
		miDisco.setRadioExterior(9.0);
		
		Double superficieTotal;
		superficieTotal = miDisco.calcularSuperficieTotal();
		
		Assert.assertEquals(254.46, superficieTotal, 0.01);
	}
	
}
