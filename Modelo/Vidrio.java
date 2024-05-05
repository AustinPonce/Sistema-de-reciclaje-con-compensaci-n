public class Vidrio extends Resiclaje{// star class
	//atrivutos
	public int packsGlass;// para saber las cantidad de paquetes 
	public String typeGlass;// para indicar si son vasos, botellas. etc

	//met 
	public Vidrio(String name, String id, double kg, String typeGlass, int packsGlass ){
	super(name,id,kg);
	this.packsGlass=packsGlass;
	this.typeGlass=typeGlass;
	}

	//metodo para calcular la remuneracion por el vidrio
	public double remuneracion(){
	double remuneracion =0;
	double valorVidrio =250; //monto por asignar
	remuneracion = valorVidrio *(getPacksGlass() * getKg());
	return remuneracion; 
	} 

	//gets y sets
	public int getPacksGlass(){
	    return packsGlass;
	}
	public int setPacksGlass(int packsGlass){
	    return packsGlass;
	}
	public String getTypeGlass(){
	    return typeGlass;
	}
	public String setTypeGlass(String typeGlass){
	    return typeGlass;
	}
	//fin gets y sets
	//override
	@Override
	public  String toString(){

	    return "Vidrio\n"
	    + super.toString()
	    + "\nTipo de vidrio" + typeGlass
	    + "\nPaquetes de vidrio"+ packsGlass;

	}//fin override

	}// fin class