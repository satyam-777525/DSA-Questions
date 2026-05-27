import java.util.*;

class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    int cap;

    public LRUCache(int capacity) {

        cap = capacity;

        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {

        if (map.containsKey(key)) {
            return map.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {

        if (!map.containsKey(key) && map.size() >= cap) {

            int firstKey = map.keySet().iterator().next();

            map.remove(firstKey);
        }

        map.put(key, value);
    }
}