# Exercise 02 – ChaCha20 Decryption

## Objective

The objective of this exercise is to decrypt a message encrypted with the ChaCha20 stream cipher.

The challenge provides:
- A 256-bit secret key stored in a binary file
- A 96-bit nonce
- A ciphertext encoded in Base64

The goal is to recover the original plaintext and find the flag.

## Algorithm

ChaCha20 is a modern stream cipher.

It generates a pseudorandom keystream from a secret key and a nonce. Encryption and decryption use the XOR operation:

```text
Ciphertext = Plaintext XOR Keystream
Plaintext  = Ciphertext XOR Keystream
```

The same key and nonce must be used for decryption as for encryption.

## Parameters

| Parameter | Value |
|---|---|
| Algorithm | ChaCha20 |
| Key length | 256 bits (32 bytes) |
| Nonce length | 96 bits (12 bytes) |
| Encoding | Base64 |
| Padding | None |

## Project Structure

```text
chacha20/
├── ChaCha20Decrypt.java
├── README.md
└── chacha20-key.bin  (local only, not committed)
```

## Requirements

- Java JDK
- Bouncy Castle library
- The challenge key file

## How to Run

First, download the key file from the challenge URL:

[Download the ChaCha20 key](https://sds-sicheresysteme.cs.rptu.de/api/challenges/cmw3tyxb700017ti230xo16i3/files/chacha20-key.bin)

Place `chacha20-key.bin` in the same directory as the Java source file.

Compile the program:

```bash
javac -cp "$HOME/BouncyCastle/bcprov-jdk18on-1.86.jar" ChaCha20Decrypt.java
```

Run the program:

```bash
java -cp ".:$HOME/BouncyCastle/bcprov-jdk18on-1.86.jar" ChaCha20Decrypt
```

## Expected Result

The program prints the decrypted plaintext.

The flag should be extracted from the decrypted message.

## Key Learnings

- Understanding stream ciphers
- Understanding the ChaCha20 algorithm
- Understanding the role of a nonce
- Working with binary key files
- Base64 decoding
- Using Bouncy Castle in Java
