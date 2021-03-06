
public class Taxa {

	private String nome;
	private float valorAnual;
	private int quantParcelas;
	private int anoDeVigencia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorAnual() {
		return valorAnual;
	}
	public void setValorAnual(float valorAnual) {
		this.valorAnual = valorAnual;
	}
	public int getQuantParcelas() {
		return quantParcelas;
	}
	public void setQuantParcelas(int quantParcelas) {
		this.quantParcelas = quantParcelas;
	}
	
	public int getAnoDeVigencia() {
		return anoDeVigencia;
	}
	public void setAnoDeVigencia(int anoDeVigencia) {
		this.anoDeVigencia = anoDeVigencia;
	}
	//******
	public float valorMensal(Pagamentos pagamento) throws ValidacaoException{
		if(quantParcelas <= 0){
			throw new ValidacaoException("quantidade de parcelas");
		}
		return (valorAnual-pagamento.getPago())/(quantParcelas-pagamento.getMes());
	}
	
	
	public void validacao() throws ValidacaoException{
		if(this.nome == null || this.nome == ""){
			throw new ValidacaoException("Nome da taxa");
		}else if(valorAnual <= 0){
			throw new ValidacaoException("Valor da taxa");
		}else if(quantParcelas <= 0){
			throw new ValidacaoException("Novo nivel");
		}else if(anoDeVigencia <= 0){
			throw new ValidacaoException("Ano de vigência da taxa");
		}
	}
	public Taxa(String nome, float valorAnual, int quantParcelas, int anoDeVigencia) {
		super();
		this.nome = nome;
		this.valorAnual = valorAnual;
		this.quantParcelas = quantParcelas;
		this.anoDeVigencia = anoDeVigencia;
	}
	
	
}
