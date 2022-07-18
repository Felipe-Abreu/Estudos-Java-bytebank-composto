
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Abreu";
		felipe.cpf = "111.222.333-45";
		felipe.profissao = "programador";
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		
		contaDoFelipe.titular = felipe;
		System.out.println(contaDoFelipe.titular.nome);
		System.out.println(contaDoFelipe.getSaldo());
	}

}
