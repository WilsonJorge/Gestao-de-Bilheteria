

import java.util.*;
public class Janela_Mar 
{
	private String sub_titulos[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","tipo de barco"};
	//Metodo Construtor
  public Janela_Mar()
  {
  }
//Metodo que preenche a tabela com os 
  public String[][] criarTabelaMAR(Vector lista)
  {   int h=0;
	  Bilhete b;
	  Mar m;
  	  String [][] x= new String[Mar.ContMar][sub_titulos.length];
  	for(int i=0;i<lista.size();i++)
  	{
  		
  	    b=(Bilhete)lista.elementAt(i);
  		if(b instanceof Mar)
  		{				 
	       	 m=(Mar)b;
	       	 x[h][0]=m.getCodigo()+"";
	       	 x[h][1]=m.getNomeCliente();
	       	 x[h][2]=m.getBi()+"";
	       	 x[h][3]=m.getDatapartida()+"";	
	       	 x[h][4]=m.getDatachegada()+"";
	       	 x[h][5]=m.getValorBilhete()+"";
	       	 x[h][6]=m.getFormapagamento();
	       	 x[h][7]= m.getTipoBarco();
  	  	  	h++;
  		}
  		
  		
  	}
  	return x;
  }
}