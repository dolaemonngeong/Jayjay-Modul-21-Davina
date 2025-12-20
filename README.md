# Web UI Test Automation Framework

## Deskripsi
Project automation test website untuk melakukan pengujian fitur login dan cart pada aplikasi web https://www.saucedemo.com/

---

## Teknologi yang Digunakan
- Bahasa Pemrograman Java
- Selenium WebDriver 
- Cucumber
- Gradle
- JUnit 

---

## Struktur Proyek
```text
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/davinatw/
│   │   │       └── Main.java
│   │   └── resources/
│
│   └── test/
│       ├── java/
│       │   └── org/davinatw/
│       │       ├── page/ 
│       │       │   ├── HomePage.java
│       │       │   └── LoginPage.java
│       │       │
│       │       ├── stepdef/
│       │       │   ├── BaseTest.java
│       │       │   ├── CucumberHooks.java
│       │       │   ├── HomeStepDef.java
│       │       │   └── LoginStepDef.java
│       │       │
│       │       └── CucumberTest.java
│       │
│       └── resources/
│           ├── login.feature
│           └── cart.feature
│
├── gradle/
│   └── wrapper/
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── README.md
└── .gitignore
```

---

## Cara Menjalankan Test
- Menggunakan terminal
./gradlew clean test

- Menggunakan IntelliJ IDEA
1. Buka class CucumberTest
2. Klik tombol Run

---
## Hasil Report Test
<img width="1710" height="1107" alt="Screenshot 2025-12-19 at 22 59 43" src="https://github.com/user-attachments/assets/3602b1c4-7e69-4672-83e7-d21dbba45c63" />
<img width="1710" height="1107" alt="Screenshot 2025-12-19 at 22 59 47" src="https://github.com/user-attachments/assets/53e400fe-98f0-4c6d-8138-f73e55bf10bd" />

---

## Catatan
- Browser yang digunakan adalah Google Chrome
- WebDriver dikelola menggunakan WebDriverManager
- Framework ini menggunakan pendekatan BDD dengan Cucumber

## Author
Nama: Davina Teresa  Wijaya

