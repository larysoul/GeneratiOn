package POO44;

public abstract class Animal2 {
	

		private String especie;

		public Animal2(String especie) {
			this.especie = especie;
		}

		abstract public void som(double quantidade);
		
		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}

	}
