package aksoy.cipher;
/**
 * Uses the class MonoAlphabeticCipher's basic functionality
 * to encrypt and decrypt text.
 * @author Melih Aksoy
 * @version 10-10-2018
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	public SubstitutionCipher(String secretAlphabet) {
		this.setSecretAlphabet(secretAlphabet);
	}
	public void setSecretAlphabet(String secretAlphabet) {
		try{
			super.setSecretAlphabet(secretAlphabet);
		}catch (CipherException e) {
			System.out.println(e.getMessage());
		}
	}
}
