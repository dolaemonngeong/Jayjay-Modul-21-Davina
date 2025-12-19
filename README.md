# Web UI Test Automation Framework

## Deskripsi
Repositori ini berisi implementasi kerangka uji Web UI Automation menggunakan:
- Java
- Selenium WebDriver
- Cucumber
- Gradle
- Page Object Model (POM)

Framework ini digunakan untuk melakukan pengujian fitur login dan cart pada website https://www.saucedemo.com/

---

## Teknologi yang Digunakan
- Java
- Selenium WebDriver
- Cucumber
- Gradle
- JUnit
- WebDriverManager

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
│       │       ├── Page/
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

## Cara Menjalankan Test
- Menggunakan terminal
./gradlew clean test

- Menggunakan IntelliJ IDEA
1. Buka class CucumberTest
2. Klik tombol Run

## Catatan
- Browser yang digunakan adalah Google Chrome
- WebDriver dikelola menggunakan WebDriverManager
- Framework ini menggunakan pendekatan BDD dengan Cucumber

## Author
Nama: Davina Teresa  Wijaya

