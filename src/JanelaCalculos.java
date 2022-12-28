import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.util.*;

public class JanelaCalculos {

private String titulosTotais[]= {"Total Carro","Total Comboio","Total Aereo","Total Mar","Total Recebido","Total Iva"};


     //Classe Construtor
    public JanelaCalculos() {
    	
    }
    
    //Metodo para visualizar dados do Vector
    public String[][] criarCalculos(Vector lista){
    	int h=0;
    	
    	Calculo cal= new Calculo();
    	String [][] x=new String[1][titulosTotais.length];
	  	  	x[h][0]= cal.calcularTotalCarro(lista)+"";
	  	  	x[h][1]= cal.calcularTotalComboio(lista)+"";
	  	   	x[h][2]= cal.calcularTotalAereo(lista)+"";
	  	 	x[h][3]= cal.calcularTotalMar(lista)+"";
	  	  	x[h][4]= cal.calcularTotal(lista)+"";
	  	  	x[h][5]= cal.calcularTotalIva(lista)+"";	
	  	  	h++;
	  return x;
    }
}