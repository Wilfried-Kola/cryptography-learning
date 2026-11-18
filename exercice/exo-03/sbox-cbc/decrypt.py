
import re

# Read the challenge observations
with open("daten.txt", "r", encoding="utf-8") as file:
    data = file.read()

# Known plaintext blocks
plaintext = [0xFF, 0xF0, 0x0F, 0xC3, 0x3C]

# Store the recovered inverse S-box
inverse_sbox = {}

# Extract the 161 observations
pattern = (
    r"Tag\s+\d+\s+c_\d+\s*=\s*"
    r"((?:[01]{8}\s*){5})"
    r"\s*v_\d+\s*=\s*([01]{8})"
)

observations = re.findall(pattern, data)

print("Observations found:", len(observations))

# Recover S-box mappings using CBC
for ciphertext_bits, iv_bits in observations:
    ciphertext = [
        int(byte, 2)
        for byte in re.findall(r"[01]{8}", ciphertext_bits)
    ]

    previous = int(iv_bits, 2)

    for p, c in zip(plaintext, ciphertext):
        sbox_input = p ^ previous

        if c in inverse_sbox and inverse_sbox[c] != sbox_input:
            raise ValueError("Inconsistent S-box mapping")

        inverse_sbox[c] = sbox_input
        previous = c

print("Recovered mappings:", len(inverse_sbox))

# Extract the additional ciphertext
section = data.split("Zusätzliche Nachricht an Tag 1", 1)[1]
bits = re.findall(r"[01]{8}", section)

# The last byte is the IV
additional_ciphertext = [int(b, 2) for b in bits[:-1]]
iv = int(bits[-1], 2)

# Decrypt the additional message
result = []
previous = iv

for c in additional_ciphertext:
    if c not in inverse_sbox:
        raise ValueError(
            f"Missing inverse S-box entry for ciphertext byte {c:02x}"
        )

    p = inverse_sbox[c] ^ previous
    result.append(p)
    previous = c

print("Decrypted bytes:", bytes(result))
print("Message:", bytes(result).decode("utf-8"))
