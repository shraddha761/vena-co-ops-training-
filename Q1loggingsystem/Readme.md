
Simulates:
- 100 concurrent threads
- 100 messages per thread (10,000 total messages)
- Ordered message processing
- Graceful shutdown

## Configuration Options

| Constructor | Description |
|-------------|-------------|
| `Logger()` | Console logging with default settings |
| `Logger(true, "path.log")` | File logging with append mode |

## Implementation Details

### Key Components
- **LogEntry**: Immutable log record with timestamp
- **BlockingQueue**: Thread-safe message buffer
- **Dedicated flush thread**: Handles output writing
- **Graceful shutdown**: Ensures no log loss

### Performance Characteristics
- Non-blocking `log()` method (O(1) insertion)
- Batch processing during flushes
- Configurable flush interval (5 seconds)

## Shutdown Protocol
1. Call `shutdown()`
2. Completes current flush cycle
3. Writes remaining logs
4. Closes file handles (if applicable)
5. Terminates worker thread

