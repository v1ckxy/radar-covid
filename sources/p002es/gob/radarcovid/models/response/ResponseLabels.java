package p002es.gob.radarcovid.models.response;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: es.gob.radarcovid.models.response.ResponseLabels */
public final class ResponseLabels extends HashMap<String, String> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey(str);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue(str);
    }

    public final /* bridge */ Set<Entry<String, String>> entrySet() {
        return getEntries();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ String get(String str) {
        return (String) super.get(str);
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return obj != null ? obj instanceof String : true ? getOrDefault((String) obj, (String) obj2) : obj2;
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault(str, str2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove(str);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z = true;
        if (obj != null ? obj instanceof String : true) {
            if (obj2 != null) {
                z = obj2 instanceof String;
            }
            if (z) {
                return remove((String) obj, (String) obj2);
            }
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove(str, str2);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<String> values() {
        return getValues();
    }
}
