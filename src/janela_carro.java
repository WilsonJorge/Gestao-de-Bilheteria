import java.util.*;
public class janela_carro {
	private String sub_titulos[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","nrKilometros","matricula","quanCombustivel","valorPortagem"};

	public janela_carro() {
		
	}
	public String[][] criarTabela(Vector lista)
	   { 
		   int h=0;
		   Bilhete b;
		   Carro c;
		   String [][] x=new String [Carro.ContCarro][sub_titulos.length];
				   for(int i=0;i<lista.size();i++)
				   {
					   b=(Bilhete)lista.elementAt(i);
					   if(b instanceof Carro)
					   {
						   c=(Carro)b;
						    x[h][0]=c.getCodigo()+"";
			  	  	  		x[h][1]=c.getNomeCliente()+"";
			  	  	  		x[h][2]=c.getBi()+"";
			  	  	  		x[h][3]=c.getDatapartida()+"";
			  	  	  		x[h][4]=c.getDatachegada()+"";
			  	  	  		x[h][5]=c.getValorBilhete()+"";
			  	  	  		x[h][6]=c.getFormapagamento()+"";
			  	  	  		x[h][7]=c.getNrKilometros()+"";
			  	  	  		x[h][8]=c.getMatricula()+"";
			  	  	  		x[h][9]=c.getQuanCombustivel()+"";
			  	  	  		x[h][10]=c.getValorPortagem()+"";
			  	  	  	   
			  	  	  	  	
			  	  	  		h++;
						   
					   }
				   }
				   return x;
	   }

}
