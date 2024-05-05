import  java.awt.*;
import javax.swing.*;

public class Resiclaje  extends JFrame{//star class
    //atrivutos
protected String name,id;
protected double kg;
    
//star met abst
public Resiclaje (String name,String id, double kg){
    this.name=name;
    this.id=id;
    this.kg=kg;
} 
//end met abst

///////////////////////////////////////////////////////////////////////////////////////////////////////////////



    public void Ventana(){
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(0,153,153))

        setTitle("Bien venido");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

public String getId(){
    return id;
}
public void setId(String id){
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