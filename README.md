# Selenium Automation Framework – AutomationExercise

## 📌 Project Overview

This project is a **Hybrid Data-Driven Selenium Automation Framework** built to automate the website:

👉 [https://automationexercise.com/](https://automationexercise.com/)

The framework is designed following **industry best practices** and is suitable for **real-world enterprise automation projects**.

---

## 🛠 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Data Driven:** Excel (Apache POI) & JSON
* **Reporting:** Extent Reports
* **Version Control:** Git & GitHub
* **IDE:** IntelliJ IDEA

---

## 📁 Framework Structure

```
Selenium_Automation2026
│
├── src/main/java
│   ├── base            # Base classes (WebDriver setup)
│   ├── pages           # Page Object classes
│   └── utils           # Utilities (Excel, JSON, Config, Reports)
│
├── src/test/java
│   └── tests           # Test classes
│
├── src/test/resources
│   ├── testdata        # Excel & JSON test data
│   └── config          # Configuration files
│
├── testng.xml          # TestNG suite file
├── pom.xml             # Maven dependencies
├── .gitignore
└── README.md
```

---

## 🔄 Framework Type – Hybrid

This is a **Hybrid Framework** combining:

* **Page Object Model (POM)**
* **Data Driven Testing**
* **TestNG features (groups, suites, DataProvider)**
* **Reusable utilities**

---

## ▶ How to Run Tests

### 🔹 Option 1: Run via TestNG XML

```
Right-click testng.xml → Run
```

### 🔹 Option 2: Run via Maven

```bash
mvn clean test
```

---

## 📊 Reports

* Extent Reports are generated after execution
* Report includes:

  * Test steps
  * Pass/Fail status
  * Screenshots on failure

📁 Location:

```
/target/ExtentReports/
```

---

## 🧪 Test Data Handling

### Excel-Based Data Provider

* File: `LoginData.xlsx`
* Location: `src/test/resources/testdata`

### JSON-Based Data Provider

* Used for flexible and scalable test data
* Easy to maintain and CI-friendly

---

## 🌿 Git Branching Strategy

* `main` → Stable production-ready code
* Feature branches (example):

  * `nitin`
  * `puja`

Pull Requests are used to merge feature branches into `main`.

---

## 🚀 CI/CD Ready

This framework is **CI-ready** and can be integrated with:

* GitHub Actions
* Jenkins
* Azure DevOps Pipelines

---

## 🎯 Key Highlights

✔ Clean and scalable framework
✔ Industry-standard folder structure
✔ Easy to extend and maintain
✔ Interview-ready project

---

## 👤 Author

**Nitin Singh**
Senior Automation Test Engineer

---

## 📌 Website Under Test

[https://automationexercise.com/](https://automationexercise.com/)

---

⭐ If you like this project, don’t forget to star the repository!
