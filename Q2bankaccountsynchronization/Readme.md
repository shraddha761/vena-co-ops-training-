# Bank Account Synchronization Simulation

This project demonstrates a thread-safe bank account model in Java, with a simulation of concurrent deposits and withdrawals by multiple users. It showcases the importance of synchronization in concurrent programming and provides a simple transaction log for auditability.

---

## Features

- **Thread-safe BankAccount class** using per-account locking
- **Concurrent simulation** with multiple user threads performing deposits and withdrawals
- **Transaction log** records all operations with thread info
- **Final balance and transaction history** output after all operations

---

## Files

- `BankAccount.java`: The core bank account class with synchronized methods and transaction logging.
- `BankSimulation.java`: The simulation driver that spawns multiple threads to perform random operations on a single account.

---
