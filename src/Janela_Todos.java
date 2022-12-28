
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
public class Janela_Todos extends JFrame {
private JTable tabela,tabMar,tabCarro,tabaereo,tabComboio;
private JScrollPane scroll,scrol1,scrol2,scrol3,scrol4;
private String sub_titulos[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","Tipo Bilhete","tipo_barco","nrKilometros","matricula","quanCombustivel","valorPortagem","Quant_Milhas","Nome Companhia","tipo bilhete comboio"};
private String sub_mar[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","tipo de barco"};
private String sub_Aereo[]= {"Codigo","Nome Cliente","BI","Data Partidada","Data Chegada","Valor Bilhete","Forma de Pagamento","Quant_Milhas","Nome Companhia"};
private String sub_Carro[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","nrKilometros","tipoilhete"}; 
private String sub_comboio[]= {"codigo","nomeCliente","bi","datapartida","datachegada","valorBilhete","formapagamento","nrKilometros","tipoilhete"}; 


private Font font_lb_titulos;
private Color cor ;
private Container cont;
private JTabbedPane tp;
private String [][]Todosdados, carro,mar,comboio,aereo;
private JPanel painelTodos,painelCarro,painelAereo,painelComboio,painelMar;

     //Classe Construtor
    public Janela_Todos(Vector lista)
    {
    	super("Janela_Todos");
    	
    	cont=getContentPane();
    	
    	tp = new JTabbedPane ();
    	painelTodos=new  JPanel();
    	painelCarro=new  JPanel();
    	painelAereo=new  JPanel();
    	painelComboio=new  JPanel();
    	painelMar=new  JPanel();
    	Font font_lbs = new Font("Verdana", Font.PLAIN, 13);
        Color cor=new Color(192, 100, 54);
      
    	
    	
    	painelTodos.setLayout(new BorderLayout());
    	painelCarro.setLayout(new BorderLayout());
    	painelAereo.setLayout(new BorderLayout());
    	painelComboio.setLayout(new BorderLayout());
    	painelMar.setLayout(new BorderLayout());
    	
    	Janela_Mar me=new Janela_Mar();
    	janela_carro cc=new janela_carro();
    	janela_comboio jc=new janela_comboio();
    	janela_aereo ja=new janela_aereo();
    	
    	Todosdados=criarTabela(lista);
    	mar=me.criarTabelaMAR(lista);
        carro=cc.criarTabela(lista);
        comboio=jc.criarTabela(lista);
        aereo=ja.criarTabela(lista);
        
        tabela=new JTable(Todosdados,sub_titulos);
        scroll=new JScrollPane(tabela);
        painelTodos.add(scroll,BorderLayout.CENTER);
        tabela.setFont(font_lbs);
        
        tabMar=new JTable(mar,sub_mar);
        scrol1=new JScrollPane(tabMar);
        painelMar.add(scrol1,BorderLayout.CENTER);
        tabMar.setFont(font_lbs);
        
        
        tabCarro=new JTable(carro,sub_Carro);
        scrol2=new JScrollPane(tabCarro);
        painelCarro.add(scrol2,BorderLayout.CENTER);
        tabCarro.setFont(font_lbs);
        
        tabaereo=new JTable(aereo,sub_Aereo);
        scrol3=new JScrollPane(tabaereo);
        painelAereo.add(scrol3,BorderLayout.CENTER);
        tabaereo.setFont(font_lbs);
        
        
        tabComboio=new JTable(comboio,sub_comboio);
        scrol4=new JScrollPane(tabComboio);
        painelComboio.add(scrol4,BorderLayout.CENTER);
        tabComboio.setFont(font_lbs);
        
        tp.add("Visualizar Todos",painelTodos);
        tp.add("visualizar Mar",painelMar);
        tp.add("Visualizar Aereo",painelAereo);
        tp.add("visualizar Carro",painelCarro);
        tp.add("visualizar Comboio",painelComboio);
        tp.setFont(font_lbs);
        tp.setBackground(new Color(6,132, 163 ));
        tp.setForeground(Color.white);
        cont.add(tp);
        
        tabela.setGridColor(Color.black);
        
        cont.setBackground(new Color(101, 190, 235));
        setSize(1366,768);
		setVisible(true);
		setLocationRelativeTo(null); 
      
    }
    //Metodo para visualizar dados do Vector
    public String [][] criarTabela(Vector lista)
    {
         int h=0;
         int y=h;
    	 Bilhete b;
    	 Mar m;
    	 Carro c;
    	 Aereo a;
    	 Comboio com;
    	 String [][] x=new String[lista.size()][sub_titulos.length];
    	 for(int i=0;i<lista.size();i++)
    	 {  
    		 b=(Bilhete)lista.elementAt(i);
    		 if(b instanceof Mar)
    	    	{
    			   	    		 
    	    		    m=(Mar)b;
    	    		    x[h][0]=m.getCodigo()+"";
    	  	  	  		x[h][1]=m.getNomeCliente()+"";
    	  	  	  		x[h][2]=m.getBi()+"";
    	  	  	  		x[h][3]=m.getDatapartida()+"";
    	  	  	  		x[h][4]=m.getDatachegada()+"";
    	  	  	  		x[h][5]=m.getValorBilhete()+"";
    	  	  	  		x[h][6]=m.getFormapagamento()+"";
    	  	  	  		x[h][7]= "Mar";
    	    	  		x[h][8]=m.getTipoBarco()+"";
    	    	  		h++;
    	    	 }
    		 else {
    			  if(b instanceof Carro)
    			  {    c=(Carro)b;
    				    x[h][0]=c.getCodigo()+"";
		  	  	  		x[h][1]=c.getNomeCliente()+"";
		  	  	  		x[h][2]=c.getBi()+"";
		  	  	  		x[h][3]=c.getDatapartida()+"";
		  	  	  		x[h][4]=c.getDatachegada()+"";
		  	  	  		x[h][5]=c.getValorBilhete()+"";
		  	  	  		x[h][6]=c.getFormapagamento()+"";
		  	  	  		x[h][7]= "Carro";
		  	  	  		x[h][9]=c.getNrKilometros()+"";
		  	  	  		x[h][10]=c.getMatricula()+"";
		  	  	  		x[h][11]=c.getQuanCombustivel()+"";
		  	  	  		x[h][12]=c.getValorPortagem()+"";
    				  h++;
    			  }
    			  else {
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
    		  	  	  		x[h][7]= "Aereo";
    		  	  	  		x[h][13]=a.getQuanmilhas()+"";
    		  	  	  		x[h][14]=a.getNomeCompanhia()+"";	
    		  	  	  	h++;  
    				  }
    				  else {
    					  if(b instanceof Comboio )
    					  {
    						     com=(Comboio)b;
    			    			 x[h][0]=com.getCodigo()+"";
    			    			 x[h][1]=com.getNomeCliente()+"";
    			    			 x[h][2]=com.getBi()+"";
    			    			 x[h][3]=com.getDatapartida()+"";
    			    			 x[h][4]=com.getDatachegada()+"";
    			    			 x[h][5]=com.getValorBilhete()+"";
    			    			 x[h][6]=com.getFormapagamento()+"";
    			    			 x[h][7]= "Comboio";
    			    			 x[h][9]=com.getNrKilometros()+"";
    			    			 x[h][15]=com.getTipoBilhete()+"";
    			    			 h++;
    					  }
    				  }
    			  }
    		 }
    	    		 
    	 }
    	 
    	return x;
    }
}
