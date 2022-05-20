package at2;

public class TestaConta {

	public static void main(String[] args) {
		
	Conta c1 = new Conta (53666, "Joao");
	Conta c2 = new Conta (21154, "Matheus");
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println("------------");
	c1.depositar(1000);
	c2.depositar(500);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println("------------");
	c1.transferir(500, c2);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println("------------");
	c2.sacar(300);
	System.out.println(c2);
}
}