/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Validacoes {
	private BufferedReader k;
	public Validacoes() {
		k= new BufferedReader(new InputStreamReader(System.in));
	}
	
	//Metodo para validar String
	public String validarString(String a,String b ) {
		String s= " ";
		
		do {
			
			
			if(!s.equalsIgnoreCase(a) && !s.equalsIgnoreCase(b)) {
				System.out.println("Nome Invalido, tente novamente!");
			}
		}while(!s.equalsIgnoreCase(a) && !s.equalsIgnoreCase(b));
		return s;
	}
	public String validarStringTamanho(String msg,int a,int b ) {
		String s= " ";
		
		do {
			try {
				System.out.println(msg);
				s= k.readLine();
				
			}catch(NumberFormatException n) {
				System.out.println(n.getMessage());
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			if(s.length()<a || s.length()>b) {
				System.out.println("Nome Invalido, tente novamente!");
			}
		}while(s.length()<a || s.length()>b);
		return s;
	}
	
	//Metodo para validar Byte
	public byte validarByte( String msg, byte min, byte max){
		byte y = 0;
		
		do{
			try{
				System.out.println(msg);
				y= Byte.parseByte(k.readLine());
			}catch(NumberFormatException f){
				System.out.println(f.getMessage());
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			
			if(y<min || y>max){
				System.out.println("Erro! Tente novamente!");
			}
			
		}while(y<min || y>max);
		
		return y;
	}
	
	//Metodo para validar Int
	public int validarInt(int min, int max){
		int n= 0;
		do{
			n=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza a quantidade de milhas que deseja alterar"));
			if(n<min || n>max)
			{
				JOptionPane.showMessageDialog(null,"valor fora da faixa,introduza novamente");
			}
		}while(n<min || n>max);
		return n;
	}
	
	//Metodo para validar Float
	public float validarFloat(float min,float max, String msg){
	    float  num=0;
	    
		do{
			try{
				System.out.println(msg);
		        num=Float.parseFloat(k.readLine());
				
			}catch(NumberFormatException f1) {
				System.out.println(f1.getMessage());
			}catch(Exception f2){
				System.out.println(f2.getMessage());
			}
			if (num<min||num>max) {
				System.out.println("Erro, texto invalido. Tente novamente!");
			}
			
		}while(num<min||num>max);
		return num;
    }
	
	//Metodo para validar Char
	public char validarChar( char a,char b,char c,char d,String msg) {
		char s=0;
		
		do {
			try {
				System.out.println(msg);
				s=k.readLine().charAt(0);
				
			}catch(NumberFormatException f1) {
				System.out.println(f1.getMessage());
			}catch(Exception f2) {
				System.out.println(f2.getMessage());
			}
			if (s!=a && s!=b && s!=c && s!=d) {
				System.out.println("Erro, texto invalido. Tente novamente!");
			}
		}while(s!=a && s!=b && s!=c && s!=d);
		return s;
	}
   
	//Metodo para validar Char
   public char validarChar( char a,char b,char c,char d, char e ,char f,String msg){
		char s=0;
		do{
			try{
				System.out.println(msg);
				s=k.readLine().charAt(0);
				
			}catch(NumberFormatException f1) {
				System.out.println(f1.getMessage());
			}catch(Exception f2) {
				System.out.println(f2.getMessage());
			}
			if (s!=a && s!=b && s!=c && s!=d && s!=e && s!=f) {
				System.out.println("Erro, texto invalido. Tente novamente!");
			}
			
		}while(s!=a && s!=b && s!=c && s!=d && s!=e && s!=f);
		return s;
	}
	
}