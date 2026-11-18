# Exercise 01 – Caesar Cipher

## 1. Objective

The goal of this exercise is to decrypt a message encrypted with a Caesar cipher and find the hidden flag.

The message was encrypted by shifting every letter by the same number of positions in the alphabet.

## 2. What is a Caesar Cipher?

The Caesar cipher is a simple substitution cipher.

Each letter is replaced by another letter a fixed number of positions further in the alphabet.

For example, with a shift of +3:

| Original | A | B | C | D | E |
|---|---|---|---|---|---|
| Encrypted | D | E | F | G | H |

To decrypt the message, we move backwards in the alphabet.

## 3. Finding the shift

The beginning of the encrypted message is:

```text
Drobo gkc xy kxcgob.
```

By testing possible shifts, we obtain:

```text
There was no answer.
```

This shows that the encryption shift is +10.

To decrypt the message, we use a shift of -10.

## 4. Decryption formula

We use the following formula:

```text
P = (C - 10) mod 26
```

Where:

- `P` is the plaintext letter position.
- `C` is the ciphertext letter position.
- `10` is the Caesar cipher shift.
- `mod 26` keeps the result inside the alphabet.

We use positions from 0 to 25, where A = 0 and Z = 25.

## 5. Java implementation

The Java program processes each character of the encrypted message.

It shifts uppercase and lowercase letters backwards by 10 positions. Spaces, numbers and punctuation remain unchanged.

See `CaesarCipher.java` for the implementation.

## 6. Result

After decrypting the message, we find the hidden flag:

```text
flag{9404d482a3837c8d2de5d47e3133ae04ccbcfcf8cee2f6a53f04a28cb5577cf6}
```

## 7. What I learned

- How the Caesar cipher works.
- How to identify a fixed alphabet shift.
- How to decrypt a message using modular arithmetic.
- How to implement a Caesar cipher in Java.
- Why simple substitution ciphers are not secure.

## 8. Security note

The Caesar cipher is not secure for real-world communication.

It has only 25 possible non-zero shifts, so an attacker can easily test all possible keys.

It is useful for learning basic cryptography, but it should never be used to protect sensitive information.