package p116io.jsonwebtoken.lang;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.jsonwebtoken.lang.Maps */
public final class Maps {

    /* renamed from: io.jsonwebtoken.lang.Maps$HashMapBuilder */
    public static class HashMapBuilder<K, V> implements MapBuilder<K, V> {
        public final Map<K, V> data;

        public HashMapBuilder() {
            this.data = new HashMap();
        }

        public MapBuilder and(K k, V v) {
            this.data.put(k, v);
            return this;
        }

        public Map<K, V> build() {
            return Collections.unmodifiableMap(this.data);
        }
    }

    /* renamed from: io.jsonwebtoken.lang.Maps$MapBuilder */
    public interface MapBuilder<K, V> {
        MapBuilder and(K k, V v);

        Map<K, V> build();
    }

    /* renamed from: of */
    public static <K, V> MapBuilder<K, V> m1961of(K k, V v) {
        return new HashMapBuilder().and(k, v);
    }
}
