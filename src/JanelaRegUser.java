import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class JanelaRegUser extends JFrame
{
	private JTextField txtNome;
	private JPasswordField txtCod,txtCod2;
	private JButton res,vol;
	private JLabel lblnome,lblSenha,confirmar;
	
	private JPanel panel;
	//++++++++++++++
	private  Container cont;
	
	
	public JanelaRegUser()
	{
		super("Registo");
		cont= getContentPane();
		cont.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel=new JPanel();
		
		
		TrataEvento x = new TrataEvento();
		panel.setLayout(new GridLayout(4,2,10,10));
		
		lblnome=new JLabel("Nome:");
		panel.add(lblnome);
		
		txtNome=new JTextField(10);
		panel.add(txtNome);
		
		lblSenha=new JLabel("Senha");
		panel.add(lblSenha);
		
		txtCod=new JPasswordField();
		panel.add(txtCod);
		
		confirmar=new JLabel("confirmar Senha");
		panel.add(confirmar);
		
		txtCod2=new JPasswordField();
		panel.add(txtCod2);
		
		//+++++++++++++++++++++++++++++++++++++++
		
		vol=new JButton("Voltar");
		panel.add(vol);
		res=new JButton("Registar");
		panel.add(res);
		
		cont.add(panel);
		
		
		res.addActionListener(x);
		vol.addActionListener(x);
		
		vol.setBackground(new Color(187, 30, 16));
		vol.setForeground(Color.white);
		
		res.setBackground(new Color(7, 151, 41));
		res.setForeground(Color.white);
		
		setSize(290,190);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	private class TrataEvento implements ActionListener
	   { 
		private Tarefa jm=new Tarefa();
		   public void actionPerformed(ActionEvent e) 
		     {  
			   if(e.getSource()==res)
			   {
				   if(txtCod.getText().isEmpty()||txtCod2.getText().isEmpty() ||txtNome.getText().isEmpty())
				   {
					   JOptionPane.showMessageDialog(null,"Preecha os campos");
				   }
				   else
				   {
					   if(txtCod.getText().equalsIgnoreCase(txtCod2.getText()))
					   {
						   gravarUsers(txtNome.getText(),txtCod.getText()); 
						   jm.adaplogin();
					   }
					   else
					   {
						   txtCod2.setBackground(new Color(241, 99, 99));
						   JOptionPane.showMessageDialog(null,"confirme a senha na aba de Confirmacao");
					   }
				   }
				   
			   }
			   else
			   {
				   setVisible(false);
				   JanelaLogin lg= new JanelaLogin();
				   jm.adaplogin();
			   }
		     }
	   }
	public void gravarUsers(String nome, String cod)
	{
		try
		{
			JOptionPane.showMessageDialog(null,"Utilizador Registrado");
			FileWriter infile= new FileWriter("Users.txt",true);
			BufferedWriter bw = new BufferedWriter(infile);
			
			bw.newLine();
			bw.write(nome+";"+cod);
			bw.close();
			setVisible(false);
			new JanelaLogin();
		}catch(FileNotFoundException ex)
		{
			System.out.println("Ficheiro nao encontrado");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
