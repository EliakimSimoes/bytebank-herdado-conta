package modelo;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conex�o");
		throw new IllegalStateException();
		
	}
	
	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}

	@Override
	public void close()  {
		// TODO Auto-generated method stub
			
	}

}
