package aksoy.cipher;

public class ShiftCipher extends MonoAlphabeticCipher {
	public ShiftCipher() {
		super();
	}

	public ShiftCipher(int value) throws CipherException {
		this.setShiftValue(value);
	}

	public void setShiftValue(int value) throws CipherException {
		if (value == 0)
			return;
		String alph = super.getSecretAlphabet();
		String newAlph = "";
		value = value % 30;
		if (value >= 0) {
			newAlph = alph.substring(value);
			newAlph += alph.substring(0, value);
		} else {
			for (int i = 29; i > 29 + value; i--) {
				newAlph += alph.charAt(i);
			}
			newAlph = alph.substring(0, 29 + value);
			super.setSecretAlphabet(newAlph);
		}
	}
}