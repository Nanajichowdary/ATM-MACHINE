# 💳 Java ATM Machine Project

A complete Java-based ATM system that allows users to register, log in, manage their bank accounts, and enables admin control. This project simulates real-world ATM functionality and includes persistent storage using local files.

---

## 🚀 Features

### 🧑 User Functionalities
- User Registration (Account Number + PIN)
- Secure Login
- Deposit Money
- Withdraw Money
- View Account Balance
- View Transaction History

### 🔐 Admin Panel
- Admin Login
- View All Accounts
- View All Transactions
- View Total Money in the System

---

## 📁 Project Structure
ATM-Machine/
├── ATM.java # Main class
├── Account.java # Bank account model
├── OptionMenu.java # User menu interface
├── FileManager.java # Handles file I/O for accounts & logs
├── AdminPanel.java # Admin functionalities
├── accounts.txt # Stores registered user data
├── transaction_log.txt # Stores all user transactions
└── README.md # Project documentation


---

## 🛠️ Installation

1. **Java Required**: Java 8 or above  
2. **Download**:
   - Clone the repository:
     ```bash
     git clone https://github.com/your-username/ATM-Machine.git
     ```
   - Or [Download the ZIP](./ATM-Machine.zip)

3. **Compile**:
   ```bash
   javac ATM.java

   
## sample demo
👤 Default User:
Account Number: 123456
PIN: 1234
## 🛡️ Default Admin:
Username: admin
Password: admin123

## 🔮 Upcoming Enhancements
GUI interface (Swing or JavaFX)

Encrypted PIN storage

Email/SMS Notifications

Support for multiple accounts per user

## 🤝 Contributing
We welcome contributions! Here's how:

Fork the repo

Create a new branch (git checkout -b feature-X)

Make your changes

Commit and push (git push origin feature-X)

Open a Pull Request and describe your changes

