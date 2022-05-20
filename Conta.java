package at2;

public class Conta {
	
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numConta, String nomeTitular) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		 
	}
	private int getNumConta() {
		return numConta;
	}
	private void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	private String getNomeTitular() {
		return nomeTitular;
	}
	private void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double v1) {
		if(v1>saldo) {
			System.out.println("saldo insuficiente");
		}else
			this.saldo = saldo - v1;
		System.out.println("saque de R$" + v1 + " na conta de " + nomeTitular + " feito com sucesso");
	}
	
	public void depositar(double v2) {
		this.saldo = saldo + v2;
		System.out.println("deposito de R$" + v2 + " na conta de " + nomeTitular + " feito com sucesso");
	}
	
	public void transferir(double v3, Conta destino) {
		this.saldo = this.saldo - v3;
		destino.saldo = destino.saldo + v3;
		System.out.println("transferência de R$" + v3 + " da conta de " + nomeTitular + " para a conta de " + destino.getNomeTitular() + " feito com sucesso");
	}
	
	
	@Override
	public String toString() {
		return "Conta [Número da conta:" + numConta + ", Titular:" + nomeTitular + ", Saldo R$" + saldo + "]";
	}
}


