package Animais;

public class Animal {
	
	private String metabolismo = "";
	private String respiracao = "Pulmonar";
	private String reproducao = "";
	
	public String getMetabolismo() {
		return metabolismo;
	}
	public void setMetabolismo(String metabolismo) {
		this.metabolismo = metabolismo;
	}
	public String getRespiracao() {
		return respiracao;
	}
	public void setRespiracao(String respiracao) {
		this.respiracao = respiracao;
	}
	public String getReproducao() {
		return reproducao;
	}
	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [metabolismo=");
		builder.append(metabolismo);
		builder.append(", respiracao=");
		builder.append(respiracao);
		builder.append(", reproducao=");
		builder.append(reproducao);
		builder.append("]");
		return builder.toString();
	}
	
}
