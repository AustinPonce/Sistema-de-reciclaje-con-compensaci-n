public class Papel extends Resiclaje{//star class
    //atrivutos
public int packsPaper; // cantidad de paquetes/cajas de papel
public String typePaper;// tipo de papel, periodico,libros,cuadernos,etc

    public Papel(String name, String id, double kg,int packsPaper, String typePaper){
        super(name,id,kg);
        this.packsPaper = packsPaper;
        this.typePaper = typePaper; 
    }

    public double remuneracion(){
        double remuneracion =0;
        double valorPapel =150; //monto por asignar
        remuneracion = valorPapel * ( getKg());
        return remuneracion; 
        }
//star gets and sets
public int getPacksPaper(){
    return packsPaper; 
}
public int setPacksPaper(int packsPaper){
    return packsPaper; 
}
public String getTypePaper(){
    return typePaper; 
}
public String setTypePaper(String typePaper){
    return typePaper;
}
//end gets and sets

//override
@Override
public String toString(){

    return "Vidrio\n"
    + super.toString()
    + "\nTipo de papel" + typePaper
    + "\nPaquetes de papel"+ packsPaper;

}//end override
}// end class