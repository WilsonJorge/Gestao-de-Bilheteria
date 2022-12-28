import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.util.*;

public class JanelaMaiorVoo extends JFrame {
	
private String titulosAereo[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","Quantidade Milhas","Nome Companhia"};

     //Classe Construtor
    public JanelaMaiorVoo()
    {
    }
    

    //Metodo para visualizar dados do Vector
    public String[][] criarTabelaMaiorVoo(Vector lista, int ind)
	  {   int h=0;
		  Bilhete b;
		  Aereo a;
	  	  String [][] x=new String[1][titulosAereo.length];

	  	    b=(Bilhete)lista.elementAt(ind);
	  		if(b instanceof Aereo)
	  		{   				
	  			a=(Aereo)b;
	  			x[h][0]=a.getCodigo()+"";
	  			x[h][1]=a.getNomeCliente()+"";
	  			x[h][2]=a.getBi()+"";
	  			x[h][3]=a.getDatapartida()+"";
	  			x[h][4]=a.getDatachegada()+"";
	  			x[h][5]=a.getValorBilhete()+"";
	  			x[h][6]=a.getFormapagamento()+"";
	  			x[h][7]=a.getQuanmilhas()+"";
	  			x[h][8]=a.getNomeCompanhia()+"";	
	  	  	  	h++;
	  		}
	  		
	  	return x;
	  }
}

