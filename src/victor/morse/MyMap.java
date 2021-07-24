package victor.morse;

import java.util.HashMap;
import java.util.Map;

public class MyMap<K, V> extends HashMap<K,V> {
        private Map<V,K> reverseMap = new HashMap<V,K>();

        @Override
        public V put(K key, V value) {
            reverseMap.put(value, key);
            return super.put(key, value);
        }

        public K getKey(V value) {
            return reverseMap.get(value);
        }
}
