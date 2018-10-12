package aksoy.cipher;
/**The class test 
 * 
 * @author meliH
 *
 */
public class test {
	public static void main(String[] args) {
		MonoAlphabeticCipher abc = new MonoAlphabeticCipher();
		try {
		abc.setSecretAlphabet("YXWVUTSRQPONMLßÜÖÄZKJIHGFEDCBA");
		}catch (CipherException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(abc.decrypt(abc.encrypt("The quick brown fox jumps over the lazy dog")));
	}
}