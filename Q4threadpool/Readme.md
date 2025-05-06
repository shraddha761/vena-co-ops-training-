# ImageProcessor (Java Concurrency Example)

This project demonstrates parallel image processing in Java using a **Fixed Thread Pool** (`ExecutorService`) and `Future` objects to manage asynchronous tasks.

---

## 🚀 Features

- Simulates image processing for 50 images.
- Uses a thread pool of 5 threads for concurrent execution.
- Introduces delays to mimic real-world image processing time.
- Implements **timeouts** when fetching results from futures.
- Measures and prints total execution time.

---

## 🛠️ Technologies Used

- Java 8+
- `ExecutorService`
- `Future`
- `TimeUnit`
- `Thread.sleep` (to simulate processing)
- Exception handling for concurrency operations

---

