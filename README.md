# 🔐 Cryptography Learning

A hands-on journey into cryptography, cybersecurity, and secure systems.

This repository contains my learning notes, programming exercises, experiments, and small projects related to cryptography and information security.

My goal is to understand how cryptographic algorithms work, implement them using Java, and document each project in a clear and beginner-friendly way.

## 🎯 Goals

- Understand the fundamentals of cryptography.
- Learn how encryption and decryption work.
- Explore hashing, digital signatures, and key management.
- Practice implementing cryptographic concepts with Java.
- Use cryptographic libraries such as Bouncy Castle.
- Document my progress and solutions to exercises.
- Share knowledge with other students and developers.

## 📚 Topics

| Topic | Description | Status |
|---|---|---|
| Encoding | ASCII, Binary, Base64 | 🟡 Learning |
| Hashing | SHA-256 and hash functions | 🔜 Planned |
| Symmetric Encryption | AES and secret keys | 🔜 Planned |
| Asymmetric Encryption | RSA and public/private keys | 🔜 Planned |
| Digital Signatures | Signing and verification | 🔜 Planned |
| Key Management | Key generation and storage | 🔜 Planned |
| Secure Systems | Security principles and applications | 🟡 Learning |

*Status will be updated as I progress.*

## 📂 Repository Structure

```text
cryptography-learning/
├── 01-basics/
├── 02-hashing/
├── 03-symmetric-encryption/
├── 04-asymmetric-encryption/
├── 05-digital-signatures/
├── 06-key-management/
├── exercises/
├── projects/
├── README.md
└── .gitignore
```

Each folder contains source code, explanations, examples, and exercise solutions related to its topic.

## 🛠️ Technologies

- **Java** — Programming language
- **Java JDK 25** — Development environment
- **Bouncy Castle** — Cryptographic library
- **Git & GitHub** — Version control and project documentation

## ⚙️ Setup

### 1. Install Java

Check that Java is installed:

```bash
java -version
javac -version
```

### 2. Download Bouncy Castle

The projects may use the Bouncy Castle cryptographic library.

Official website:

https://www.bouncycastle.org/download/bouncy-castle-java/

For my current setup, I use the following library:

`bcprov-jdk18on-1.86.jar`

### 3. Compile a Java program

Example:

```bash
javac -cp "bcprov-jdk18on-1.86.jar" MyProgram.java
```

### 4. Run a Java program

On macOS and Linux:

```bash
java -cp ".:bcprov-jdk18on-1.86.jar" MyProgram
```

On Windows, use `;` instead of `:` in the classpath:

```bash
java -cp ".;bcprov-jdk18on-1.86.jar" MyProgram
```

## 🧪 Exercises and Projects

Every exercise or project aims to include:

- The problem or objective
- A simple explanation of the cryptographic concept
- The Java implementation
- Comments explaining important parts of the code
- Example input and output
- What I learned
- References, when applicable

## 💡 Learning Approach

I believe understanding the concept is just as important as writing the code.

For each topic, I try to answer these questions:

1. What problem does this cryptographic concept solve?
2. How does it work?
3. What are its advantages and limitations?
4. How can it be implemented in Java?
5. What mistakes should be avoided?

## 📖 Code Documentation

I aim to write comments in simple English so that beginners can understand the purpose of each important step.

Example:

```java
// Create a secure random number generator.
// Secure randomness is important for cryptographic keys.
SecureRandom secureRandom = new SecureRandom();
```

Comments should explain **why something is done**, not simply repeat what the code already says.

## ⚠️ Disclaimer

This repository is for educational purposes only.

The implementations and experiments in this repository are not intended for production use.

Cryptographic software must be carefully reviewed and tested before being used to protect real data.

Never upload private keys, passwords, tokens, or other sensitive information to a public repository.

## 📈 Progress

This repository is a work in progress.

I will continuously add new exercises, implementations, notes, and projects as I learn more about cryptography and secure systems.

## 🤝 Feedback

Suggestions, corrections, and constructive feedback are welcome.

If you find a mistake or have an idea to improve an explanation, feel free to open an issue.

---

**Learning cryptography one step at a time. 🔐**
