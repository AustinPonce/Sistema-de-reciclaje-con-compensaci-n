
import javax.swing.*;

public class Resiclaje  extends JFrame{//star class
    //atrivutos
protected String name;
protected int id;
protected double kg;
    
//star met abst
public Resiclaje (String name, int id, double kg){
    this.name=name;
    this.id=id;
    this.kg=kg;
} 
//end met abst

// gets and sets

public Resiclaje() {
	// TODO Auto-generated constructor stub
}

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

@Override
public  String toString(){

    return "Informacion \r\n"
    +"Nombre: "+ name 
    +"\nID: " + id
    + "\nKg: "+ kg;
}
}//end override