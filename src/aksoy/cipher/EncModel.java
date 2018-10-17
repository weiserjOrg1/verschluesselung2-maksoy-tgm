package aksoy.cipher;

public class EncModel {
	private SubstitutionCipher subst;
	private ShiftCipher shift;
	
	public EncModel(){
			this.subst = new SubstitutionCipher();
			this.shift = new ShiftCipher();
	}
}
