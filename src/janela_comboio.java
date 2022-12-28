import java.util.*;
public class janela_comboio 
{
	private String sub_titulos[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","nrKilometros","tipoilhete"}; 

	public janela_comboio() {
		
	}
	 public String[][] criarTabela(Vector lista)
     {
    	 int h=0;
    	 Comboio c;
    	 Bilhete b;
    	 String x[][]=new String[Comboio.ContComboio][sub_titulos.length];
    	 
    	 for(int i=0;i<lista.size();i++)
    	 {
    		 b=(Bilhete)lista.elementAt(i);
    		 if(b instanceof Comboio)
    		 {
    			 c=(Comboio)b;
    			 x[h][0]=c.getCodigo()+"";
    			 x[h][1]=c.getNomeCliente()+"";
    			 x[h][2]=c.getBi()+"";
    			 x[h][3]=c.getDatapartida()+"";
    			 x[h][4]=c.getDatachegada()+"";
    			 x[h][5]=c.getValorBilhete()+"";
    			 x[h][6]=c.getFormapagamento()+"";
    			 x[h][7]=c.getNrKilometros()+"";
    			 x[h][8]=c.getTipoBilhete()+"";
    			 h++;
    		 }
    	
    	 }
    	return x; 
     }

}
