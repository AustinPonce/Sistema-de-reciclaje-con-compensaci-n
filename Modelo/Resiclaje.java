
import javax.swing.*;

public class Resiclaje  extends JFrame{//star class
    private static final long serialVersionUID = 1L;
	
    //atrivutos
protected String name; 
protected int id;
protected static double kg;

//star met abst
public Resiclaje (String name,int id, double kg){
    this.name=name;
    this.id=id;
    this.kg=kg;
}
//end met abst
// gets and sets

public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public double getKg(){
    return kg;
}
public double setKg(double kg){
    return this.kg=kg;
}
//end gets and sets

//construtor vacio
public Resiclaje() {
}

// Override
@Override
public String toString() {
    return "Informacion\n" + "Nombre: "+ name + "\nID: "+id+"\nKilos entregados: "+kg;

}

}//end class