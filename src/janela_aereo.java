import java.util.*;
public class janela_aereo 
{
	private String sub_titulos[]= {"Codigo","Nome Cliente","BI","Data Partidada","Data Chegada","Valor Bilhete","Forma de Pagamento","Quant_Milhas","Nome Companhia"};
	
	public janela_aereo() {
		
	}
	public String[][] criarTabela(Vector lista)
	  {   int h=0;
		  Bilhete b;
		  Aereo a;
	  	  String [][] x=new String[Aereo.ContAereo][sub_titulos.length];
	  	for(int i=0;i<lista.size();i++)
	  	{
	  		
	  	    b=(Bilhete)lista.elementAt(i);
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
	  		
	  		
	  	}
	  	return x;
	  }

}
