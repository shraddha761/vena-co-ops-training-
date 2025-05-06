# Odd-Even Number Printer

This project demonstrates a classic multi-threading synchronization problem in Java: printing numbers from 1 to 100 in order, alternating between odd and even numbers, using two threads.

---

## Features

- **Two threads**: One prints odd numbers, the other prints even numbers.
- **Proper synchronization**: Uses `wait()` and `notify()` to ensure correct alternation and order.
- **Thread-safe**: Prevents race conditions and guarantees all numbers from 1 to 100 are printed in sequence.

---

## Files

- `OddEven.java`  
  Contains the logic for synchronized printing of odd and even numbers using a shared lock.
- `Main.java`  
  Starts the two threads for odd and even number printing.

---
