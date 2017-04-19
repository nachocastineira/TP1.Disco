package ar.edu.unlam.pb2;

public class Disco 
{
		//ATRIBUTOS//
	private Double radioExterior;
	private Double radioInterior;
	
	
		//GETTERS AND SETTERS//
	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}


	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

		//METODOS//	
	public Double calcularPerimetroInterior()
	{
		Double perimetroInterior;
		perimetroInterior = 2*Math.PI*radioInterior;
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior()
	{
		Double perimetroExterior;
		perimetroExterior = 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularSuperficieTotal()
	{
		Double superficieTotal;
		superficieTotal = Math.PI*(radioExterior*radioExterior);
		return superficieTotal;
	}

}
