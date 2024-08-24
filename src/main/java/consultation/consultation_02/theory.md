### 

Вот основные методы класса `ArrayList` в Java:

1. **add(E e)**: Добавляет элемент в конец списка. Если текущий размер списка меньше его емкости, элемент добавляется в конец; в противном случае для списка создается новый массив большего размера.

2. **add(int index, E element)**: Вставляет указанный элемент в список по указанному индексу. Элементы, которые были после этого индекса, сдвигаются вправо.

3. **remove(Object o)**: Удаляет первое вхождение указанного элемента из списка, если он присутствует. Возвращает `true`, если список содержал указанный элемент.

4. **remove(int index)**: Удаляет элемент по указанному индексу. Все последующие элементы сдвигаются на одну позицию влево. Возвращает элемент, который был удален из списка.

5. **set(int index, E element)**: Заменяет элемент по указанному индексу на элемент, указанный в параметре. Возвращает элемент, который был заменен.

6. **get(int index)**: Возвращает элемент, расположенный по указанному индексу.

7. **clear()**: Удаляет все элементы из списка. После этого список будет пустым.

8. **size()**: Возвращает количество элементов в списке.

9. **isEmpty()**: Возвращает `true`, если список не содержит элементов.

10. **contains(Object o)**: Возвращает `true`, если список содержит указанный элемент.

11. **indexOf(Object o)**: Возвращает индекс первого вхождения указанного элемента в списке или -1, если элемент не найден.

12. **lastIndexOf(Object o)**: Возвращает индекс последнего вхождения указанного элемента в списке или -1, если элемент не найден.

13. **toArray()**: Возвращает массив, содержащий все элементы списка в правильной последовательности.


### `HashMap<K, V>`

`HashMap` — это коллекция, реализующая интерфейс `Map`, которая хранит элементы в виде "ключ-значение" и не гарантирует никакого порядка.

#### Основные методы `HashMap`:

1. **`put(K key, V value)`**: Добавляет элемент (ключ-значение) в `HashMap`. Если такой ключ уже существует, то заменяет старое значение новым.
   ```java
   map.put("key1", "value1");
   ```

2. **`get(Object key)`**: Возвращает значение, соответствующее заданному ключу. Если ключ не найден, возвращает `null`.
   ```java
   String value = map.get("key1");
   ```

3. **`remove(Object key)`**: Удаляет элемент по ключу. Возвращает значение, которое было связано с этим ключом, или `null`, если ключ не найден.
   ```java
   map.remove("key1");
   ```

4. **`containsKey(Object key)`**: Проверяет, содержится ли указанный ключ в `HashMap`.
   ```java
   boolean hasKey = map.containsKey("key1");
   ```

5. **`containsValue(Object value)`**: Проверяет, содержится ли указанное значение в `HashMap`.
   ```java
   boolean hasValue = map.containsValue("value1");
   ```

6. **`isEmpty()`**: Проверяет, пуста ли `HashMap`.
   ```java
   boolean isEmpty = map.isEmpty();
   ```

7. **`size()`**: Возвращает количество пар "ключ-значение" в `HashMap`.
   ```java
   int size = map.size();
   ```

8. **`keySet()`**: Возвращает набор всех ключей `HashMap`.
   ```java
   Set<String> keys = map.keySet();
   ```

9. **`values()`**: Возвращает коллекцию всех значений `HashMap`.
   ```java
   Collection<String> values = map.values();
   ```

10. **`entrySet()`**: Возвращает набор всех пар "ключ-значение" `HashMap`.
    ```java
    Set<Map.Entry<String, String>> entries = map.entrySet();
    ```

11. **`putAll(Map<? extends K, ? extends V> m)`**: Копирует все элементы из указанной коллекции в `HashMap`.
    ```java
    map.putAll(otherMap);
    ```

12. **`clear()`**: Удаляет все элементы из `HashMap`.
    ```java
    map.clear();
    ```

13. **`compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`**: Обновляет значение, связанное с заданным ключом, используя указанную функцию.
    ```java
    map.compute("key1", (key, val) -> val + "Updated");
    ```

14. **`merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)`**: Если ключ существует, объединяет его текущее значение с новым, используя заданную функцию.
    ```java
    map.merge("key1", "newValue", (oldVal, newVal) -> oldVal + newVal);
    ```

15. **`groupingBy`**: Этот метод используется для группировки элементов коллекции по заданному ключу. Он обычно используется в сочетании со стримами и `Collectors`.
    ```java
    Map<String, List<User>> usersByRole = users.stream()
        .collect(Collectors.groupingBy(User::getRole));
    ```

16. **`partitioningBy`**: Делит коллекцию на две части на основе предиката, возвращает `Map<Boolean, List<T>>`.
    ```java
    Map<Boolean, List<User>> partitionedUsers = users.stream()
        .collect(Collectors.partitioningBy(user -> user.getAge() > 30));
    ```

### `HashSet<E>`

`HashSet` — это коллекция, реализующая интерфейс `Set`, которая хранит уникальные элементы и не гарантирует порядок их хранения.

#### Основные методы `HashSet`:

1. **`add(E e)`**: Добавляет элемент в `HashSet`. Возвращает `true`, если элемент добавлен успешно, и `false`, если элемент уже присутствует.
   ```java
   set.add("element1");
   ```

2. **`remove(Object o)`**: Удаляет указанный элемент из `HashSet`. Возвращает `true`, если элемент был успешно удален.
   ```java
   set.remove("element1");
   ```

3. **`contains(Object o)`**: Проверяет, содержится ли указанный элемент в `HashSet`.
   ```java
   boolean hasElement = set.contains("element1");
   ```

4. **`isEmpty()`**: Проверяет, пуста ли `HashSet`.
   ```java
   boolean isEmpty = set.isEmpty();
   ```

5. **`size()`**: Возвращает количество элементов в `HashSet`.
   ```java
   int size = set.size();
   ```

6. **`iterator()`**: Возвращает итератор для перебора элементов `HashSet`.
   ```java
   Iterator<String> iterator = set.iterator();
   ```

7. **`clear()`**: Удаляет все элементы из `HashSet`.
   ```java
   set.clear();
   ```

8. **`addAll(Collection<? extends E> c)`**: Добавляет все элементы из указанной коллекции в `HashSet`.
   ```java
   set.addAll(otherSet);
   ```

9. **`retainAll(Collection<?> c)`**: Оставляет в `HashSet` только те элементы, которые содержатся в указанной коллекции.
   ```java
   set.retainAll(otherSet);
   ```

10. **`removeAll(Collection<?> c)`**: Удаляет из `HashSet` все элементы, которые содержатся в указанной коллекции.
    ```java
    set.removeAll(otherSet);
    ```

### `TreeSet<E>`

`TreeSet` — это коллекция, реализующая интерфейс `NavigableSet`, которая хранит уникальные элементы в отсортированном порядке (натуральный порядок или порядок, заданный компаратором).

#### Основные методы `TreeSet`:

1. **`add(E e)`**: Добавляет элемент в `TreeSet`. Возвращает `true`, если элемент добавлен успешно, и `false`, если элемент уже присутствует.
   ```java
   treeSet.add("element1");
   ```

2. **`remove(Object o)`**: Удаляет указанный элемент из `TreeSet`. Возвращает `true`, если элемент был успешно удален.
   ```java
   treeSet.remove("element1");
   ```

3. **`contains(Object o)`**: Проверяет, содержится ли указанный элемент в `TreeSet`.
   ```java
   boolean hasElement = treeSet.contains("element1");
   ```

4. **`isEmpty()`**: Проверяет, пуста ли `TreeSet`.
   ```java
   boolean isEmpty = treeSet.isEmpty();
   ```

5. **`size()`**: Возвращает количество элементов в `TreeSet`.
   ```java
   int size = treeSet.size();
   ```

6. **`iterator()`**: Возвращает итератор для перебора элементов `TreeSet`.
   ```java
   Iterator<String> iterator = treeSet.iterator();
   ```

7. **`first()`**: Возвращает первый (наименьший) элемент `TreeSet`.
   ```java
   String first = treeSet.first();
   ```

8. **`last()`**: Возвращает последний (наибольший) элемент `TreeSet`.
   ```java
   String last = treeSet.last();
   ```

9. **`subSet(E fromElement, E toElement)`**: Возвращает представление части `TreeSet` от `fromElement` (включительно) до `toElement` (не включительно).
   ```java
   SortedSet<String> subset = treeSet.subSet("fromElement", "toElement");
   ```

10. **`headSet(E toElement)`**: Возвращает представление части `TreeSet`, содержащей элементы меньше указанного `toElement`.
    ```java
    SortedSet<String> headSet = treeSet.headSet("toElement");
    ```

11. **`tailSet(E fromElement)`**: Возвращает представление части `TreeSet`, содержащей элементы больше или равные указанному `fromElement`.
    ```java
    SortedSet<String> tailSet = treeSet.tailSet("fromElement");
    ```

12. **`clear()`**: Удаляет все элементы из `TreeSet`.
    ```java
    treeSet.clear();
    ```

13. **`descendingSet()`**: Возвращает обратный порядок текущего `TreeSet`.
    ```java
    NavigableSet<String> descendingSet = treeSet.descendingSet();
    ```

14. **`pollFirst()`**: Удаляет и возвращает первый (наименьший) элемент `TreeSet`.
```java
String firstElement = treeSet.pollFirst();
```

15. **`pollLast()`**: Удаляет и возвращает последний (наибольший) элемент `TreeSet`.
    ```java
    String lastElement = treeSet.pollLast();
    ```

### `TreeMap<K, V>`

`TreeMap` — это коллекция, реализующая интерфейс `NavigableMap`, которая хранит элементы в виде "ключ-значение" и поддерживает их упорядочивание по ключу (натуральный порядок или порядок, заданный компаратором).

#### Основные методы `TreeMap`:

1. **`put(K key, V value)`**: Добавляет элемент (ключ-значение) в `TreeMap`. Если такой ключ уже существует, то заменяет старое значение новым.
   ```java
   treeMap.put("key1", "value1");
   ```

2. **`get(Object key)`**: Возвращает значение, соответствующее заданному ключу. Если ключ не найден, возвращает `null`.
   ```java
   String value = treeMap.get("key1");
   ```

3. **`remove(Object key)`**: Удаляет элемент по ключу. Возвращает значение, которое было связано с этим ключом, или `null`, если ключ не найден.
   ```java
   treeMap.remove("key1");
   ```

4. **`containsKey(Object key)`**: Проверяет, содержится ли указанный ключ в `TreeMap`.
   ```java
   boolean hasKey = treeMap.containsKey("key1");
   ```

5. **`containsValue(Object value)`**: Проверяет, содержится ли указанное значение в `TreeMap`.
   ```java
   boolean hasValue = treeMap.containsValue("value1");
   ```

6. **`isEmpty()`**: Проверяет, пуста ли `TreeMap`.
   ```java
   boolean isEmpty = treeMap.isEmpty();
   ```

7. **`size()`**: Возвращает количество пар "ключ-значение" в `TreeMap`.
   ```java
   int size = treeMap.size();
   ```

8. **`firstKey()`**: Возвращает первый (наименьший) ключ в `TreeMap`.
   ```java
   String firstKey = treeMap.firstKey();
   ```

9. **`lastKey()`**: Возвращает последний (наибольший) ключ в `TreeMap`.
   ```java
   String lastKey = treeMap.lastKey();
   ```

10. **`keySet()`**: Возвращает `NavigableSet` всех ключей `TreeMap`.
    ```java
    NavigableSet<String> keys = treeMap.keySet();
    ```

11. **`values()`**: Возвращает коллекцию всех значений `TreeMap`.
    ```java
    Collection<String> values = treeMap.values();
    ```

12. **`entrySet()`**: Возвращает `Set` всех пар "ключ-значение" `TreeMap`.
    ```java
    Set<Map.Entry<String, String>> entries = treeMap.entrySet();
    ```

13. **`subMap(K fromKey, K toKey)`**: Возвращает представление части `TreeMap` от `fromKey` (включительно) до `toKey` (не включительно).
    ```java
    SortedMap<String, String> subMap = treeMap.subMap("fromKey", "toKey");
    ```

14. **`headMap(K toKey)`**: Возвращает представление части `TreeMap`, содержащей элементы с ключами меньше указанного `toKey`.
    ```java
    SortedMap<String, String> headMap = treeMap.headMap("toKey");
    ```

15. **`tailMap(K fromKey)`**: Возвращает представление части `TreeMap`, содержащей элементы с ключами больше или равными указанному `fromKey`.
    ```java
    SortedMap<String, String> tailMap = treeMap.tailMap("fromKey");
    ```

16. **`clear()`**: Удаляет все элементы из `TreeMap`.
    ```java
    treeMap.clear();
    ```

17. **`descendingKeySet()`**: Возвращает обратный порядок всех ключей `TreeMap`.
    ```java
    NavigableSet<String> descendingKeys = treeMap.descendingKeySet();
    ```

18. **`descendingMap()`**: Возвращает представление текущего `TreeMap` в обратном порядке.
    ```java
    NavigableMap<String, String> descendingMap = treeMap.descendingMap();
    ```

19. **`computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)`**: Если указанный ключ не присутствует в коллекции, вычисляет его значение, используя заданную функцию, и добавляет его в коллекцию.
    ```java
    treeMap.computeIfAbsent("key1", k -> "value1");
    ```

20. **`computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`**: Если указанный ключ присутствует в коллекции, обновляет его значение, используя заданную функцию.
    ```java
    treeMap.computeIfPresent("key1", (k, v) -> v + "Updated");
    ```

21. **`groupingBy` и аналогичные методы**: Эти методы используются для группировки и разделения элементов коллекций на основе заданных условий. Они часто используются в сочетании со стримами и `Collectors` для более сложных операций.
    ```java
    Map<String, List<User>> usersByRole = users.stream()
        .collect(Collectors.groupingBy(User::getRole));
    ```
