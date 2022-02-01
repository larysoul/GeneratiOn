package POO44;

public class Cachorro extends Animal1 {

	private String raca;

	public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, 
			String deslocamento, String raca) {
		
	super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
	this.raca = raca;
	
	}


	public void infoCachorro() {
	System.out.print(getNomeAnimal()+" é um cachorro que possui "+getIdadeAnimal()+" ano(s), ");
	if(isEmiteSom()) {
		System.out.print("emite um latido");
	} else {
		System.out.print("não emite som");
		}
	System.out.println(", "+getDeslocamento()+" o tempo todo e é da raça "+raca);
	}


		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
}