
public class CaesarCipher {

    public static void main(String[] args) {

        String encrypted = "Drobo gkc xy kxcgob.";
        int shift = 10;

        StringBuilder decrypted = new StringBuilder();

        for (char c : encrypted.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                char decoded = (char) (
                        'a' + (c - 'a' - shift + 26) % 26
                );
                decrypted.append(decoded);

            } else if (c >= 'A' && c <= 'Z') {
                char decoded = (char) (
                        'A' + (c - 'A' - shift + 26) % 26
                );
                decrypted.append(decoded);

            } else {
                decrypted.append(c);
            }
        }

        System.out.println(decrypted);
    }
}
