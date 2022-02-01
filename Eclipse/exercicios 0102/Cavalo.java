package POO44;

public class Cavalo extends Animal1 {
	
	private String corCavalo;
	

	public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corCavalo) 
	{
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corCavalo = corCavalo;
	}

	public void infoCavalo() {
		System.out.print(getNomeAnimal()+" é um cavalo que possui "+getIdadeAnimal()+" ano(s), ");
		if(isEmiteSom()) {
			System.out.print("emite um relincho");
		} else {
			System.out.print("não emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo e é da cor "+corCavalo);
	}
	
	public String getCorCavalo() {
		return corCavalo;
	}
	public void setCorCavalo(String corCavalo) {
		this.corCavalo = corCavalo;
	}
	
}