package tudelft.caesarshift;

public class CaesarShiftCipher {

	public String CesarShiftCipher(String message, int shift) {
	    StringBuilder sb = new StringBuilder();

	    shift = shift % 26;

	    for (int i = 0; i < message.length(); i++) {
	        char currentChar = message.charAt(i);

	        if (currentChar == ' ') {
	            sb.append(' ');
	            continue;
	        }

	        if (currentChar < 'a' || currentChar > 'z') {
	            return "invalido";
	        }

	        int newChar = ((currentChar - 'a' + shift) % 26 + 26) % 26;

	        sb.append((char) ('a' + newChar));
	    }

	    return sb.toString();
	}
}
