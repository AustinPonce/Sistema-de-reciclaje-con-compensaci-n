public class Plastico extends Resiclaje{// star class
    //atrivutos

    public int packsPlastic;// cantidad de paquetes de plastico
    public String typePlastic; // tipo de plastico botellas, jueguetes, cajas, etc

    public Plastico(String name, int id, double kg, String typePlastic, int packsPlastic){
        super(name,id,kg);
        this.packsPlastic = packsPlastic;
        this.typePlastic = typePlastic;
    }

    public double remuneracion(){
        double remuneracion =0;
        double valorPlastico =300; //monto por asignar
        remuneracion = valorPlastico *(getPacksPlastic() * getKg());
        return remuneracion; 
        }
//star gets and sets
public int getPacksPlastic(){
    return packsPlastic;
}
public int setPacksPlastic(int packsPlastic){
    return packsPlastic;
}
public String getTypePlastic(){
    return typePlastic;
}
public String setTypePlastic(String typePlastic){
    return typePlastic;
}
//end gets and sets
//override
@Override
public  String toString(){

    return "Vidrio\n"
    + super.toString()
    + "\nTipo de plastico" + typePlastic
    + "\nPaquetes de plastico"+ packsPlastic;

}//end override
}//end class