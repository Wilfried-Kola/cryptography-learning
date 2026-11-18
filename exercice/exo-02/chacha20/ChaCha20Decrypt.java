
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class ChaCha20Decrypt {

    public static void main(String[] args) throws Exception {

        // Read the secret key from the binary file
        byte[] key = Files.readAllBytes(Path.of("chacha20-key.bin"));

        // Decode the nonce and ciphertext from Base64
        byte[] nonce = Base64.getDecoder().decode("JFakfZjjTssWMpNx");

        byte[] ciphertext = Base64.getDecoder().decode(
                "xRc+++/hUs2fZk4gETcjLIneaeIA7Fb2/l8VydEnQQdyRD5wedmAZ3OKCTZjZYEOwjvvWT5mtedDyk8uJPZev9enTT3dig=="
        );

        // Check key and nonce lengths
        if (key.length != 32) {
            throw new IllegalArgumentException("Key must be 32 bytes (256 bits)");
        }

        if (nonce.length != 12) {
            throw new IllegalArgumentException("Nonce must be 12 bytes (96 bits)");
        }

        // Initialize the ChaCha20 engine for decryption
        ChaCha7539Engine engine = new ChaCha7539Engine();
        engine.init(false, new ParametersWithIV(
                new KeyParameter(key),
                nonce
        ));

        // Decrypt the ciphertext
        byte[] plaintext = new byte[ciphertext.length];
        engine.processBytes(ciphertext, 0, ciphertext.length, plaintext, 0);

        // Display the decrypted message
        System.out.println("Decrypted message:");
        System.out.println(new String(plaintext, StandardCharsets.UTF_8));
    }
}
