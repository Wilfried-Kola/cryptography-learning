# Exercise 03 – S-Box CBC Cryptanalysis

## Objective

The objective of this exercise is to decrypt an additional encrypted message by analyzing a custom substitution box (S-Box) used in CBC mode.

The encryption uses:
- **Block size:** 8 bits (1 byte)
- **Mode:** Cipher Block Chaining (CBC)
- **S-Box:** Unknown permutation of 256 possible byte values
- **Known plaintext:** Five fixed bytes sent every day
- **Known ciphertext:** 161 daily observations

## Known Plaintext

The same plaintext is encrypted every day:

```text
11111111 11110000 00001111 11000011 00111100
```

In hexadecimal:

```text
FF F0 0F C3 3C
```

Each day also uses a different 8-bit initialization vector (IV).

## Cryptanalysis Approach

The goal is to reconstruct the unknown S-Box using the known plaintext and ciphertext pairs.

For CBC encryption:

```text
C[i] = S(P[i] XOR C[i-1])
```

Where:
- `P[i]` is the plaintext byte.
- `C[i]` is the ciphertext byte.
- `C[i-1]` is the previous ciphertext byte.
- `S` is the unknown S-Box.
- `C[0]` is the initialization vector (IV).

By collecting observations from the 161 days, we can recover the S-Box mapping.

Once the inverse S-Box is reconstructed, the additional message can be decrypted.

## Files

```text
sbox-cbc/
├── daten.txt
├── decrypt.py
└── README.md
```

- `daten.txt`: Contains the 161 known ciphertext observations and the additional encrypted message.
- `decrypt.py`: Python script used to reconstruct the inverse S-Box and decrypt the message.
- `README.md`: Documentation for this exercise.

## How to Run

Open a terminal and navigate to the exercise directory:

```bash
cd exercice/exo-03/sbox-cbc
```

Run the Python script:

```bash
python3 decrypt.py
```

The script should display:
- Number of observations found.
- Number of recovered S-Box mappings.
- Decrypted message.

## Result

**Flag:**

```text
Not recovered yet.
```

The flag will be added here after successfully decrypting the additional message.

## Key Learnings

- Understanding CBC encryption.
- Understanding substitution boxes (S-Boxes).
- Recovering an unknown permutation from known plaintext and ciphertext.
- Using XOR operations in cryptanalysis.
- Implementing a cryptanalysis script in Python.
