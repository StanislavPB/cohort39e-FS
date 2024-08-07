# Lesson 03

## Синхронизаторы

### 1. `Semaphore`
- **Описание**: Управляет доступом к ресурсу, используя счётчик разрешений.
- **Конструкторы**:
    - `Semaphore(int permits)`
    - `Semaphore(int permits, boolean fair)`
- **Методы**:
    - `acquire()`, `acquire(int permits)`
    - `release()`, `release(int permits)`

#### Пример кода с `Semaphore`:
```java
Semaphore sem = new Semaphore(1);
sem.acquire();
// действия с общим ресурсом
sem.release();
```

### 2. `CountDownLatch`
- **Описание**: Позволяет потокам ожидать, пока не произойдёт определённое количество событий.
- **Конструктор**: `CountDownLatch(int count)`
- **Методы**: `await()`, `countDown()`

#### Пример кода с `CountDownLatch`:
```java
CountDownLatch latch = new CountDownLatch(3);
// в других потоках
latch.countDown();
latch.await();
// продолжение работы после завершения всех событий
```

### 3. `CyclicBarrier`
- **Описание**: Позволяет группе потоков ожидать друг друга в определённой точке исполнения.
- **Конструкторы**:
    - `CyclicBarrier(int parties)`
    - `CyclicBarrier(int parties, Runnable barrierAction)`
- **Метод**: `await()`

### 4. `Exchanger`
- **Описание**: Позволяет двум потокам обменяться данными.
- **Метод**: `exchange(V x)`

### 5. `Phaser`
- **Описание**: Синхронизирует потоки, проходящие через несколько фаз.
- **Конструкторы**: `Phaser()`, `Phaser(int parties)`
- **Методы**: `arrive()`, `arriveAndAwaitAdvance()`

## Параллельные коллекции

Представляют собой потокобезопасные версии коллекций, позволяющие безопасно работать с ними из нескольких потоков.

### Примеры коллекций:
- `ConcurrentHashMap`
- `CopyOnWriteArrayList`
- `ConcurrentLinkedQueue`

## Исполнители (Executors)

Позволяют управлять потоками на более высоком уровне, чем работа напрямую с объектами `Thread`.

### Типы исполнителей:
- `ExecutorService` - управляет пулом потоков.
- `ScheduledExecutorService` - позволяет планировать выполнение задач.

#### Пример кода с использованием `ExecutorService`:
```java
ExecutorService executor = Executors.newFixedThreadPool(10);
executor.submit(() -> {
    // ваш код
});
executor.shutdown();
```

## Рекомендации по использованию

1. Внимательно выбирайте тип пула потоков в зависимости от задачи.
2. Явно завершайте работу пулов потоков, используя метод `shutdown()`.
3. Избегайте ситуаций, когда задачи в пуле ожидают завершения друг друга, чтобы предотвратить взаимную блокировку.



