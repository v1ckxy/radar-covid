package p116io.jsonwebtoken.impl;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.DateFormats;

/* renamed from: io.jsonwebtoken.impl.JwtMap */
public class JwtMap implements Map<String, Object> {
    public final Map<String, Object> map;

    public JwtMap() {
        this.map = new LinkedHashMap();
    }

    public JwtMap(Map<String, ?> map2) {
        this();
        Assert.notNull(map2, "Map argument cannot be null.");
        putAll(map2);
    }

    public static Date parseIso8601Date(String str, String str2) {
        try {
            return DateFormats.parseIso8601Date(str);
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(str2);
            sb.append("' value does not appear to be ISO-8601-formatted: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public static Date toDate(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return parseIso8601Date((String) obj, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create Date from '");
        sb.append(str);
        sb.append("' value '");
        sb.append(obj);
        sb.append("'.");
        throw new IllegalStateException(sb.toString());
    }

    public static Date toSpecDate(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            obj = Long.valueOf(((Number) obj).longValue() * 1000);
        } else if (obj instanceof String) {
            try {
                obj = Long.valueOf(Long.parseLong((String) obj) * 1000);
            } catch (NumberFormatException unused) {
            }
        }
        return toDate(obj, str);
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    public Set<Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public boolean equals(Object obj) {
        return this.map.equals(obj);
    }

    public Object get(Object obj) {
        return this.map.get(obj);
    }

    public String getString(String str) {
        Object obj = get(str);
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public Object put(String str, Object obj) {
        return obj == null ? this.map.remove(str) : this.map.put(str, obj);
    }

    public void putAll(Map<? extends String, ?> map2) {
        if (map2 != null) {
            for (String str : map2.keySet()) {
                put(str, map2.get(str));
            }
        }
    }

    public Object remove(Object obj) {
        return this.map.remove(obj);
    }

    @Deprecated
    public void setDate(String str, Date date) {
        if (date == null) {
            this.map.remove(str);
            return;
        }
        this.map.put(str, Long.valueOf(date.getTime() / 1000));
    }

    public Object setDateAsSeconds(String str, Date date) {
        if (date == null) {
            return this.map.remove(str);
        }
        return this.map.put(str, Long.valueOf(date.getTime() / 1000));
    }

    public void setValue(String str, Object obj) {
        if (obj == null) {
            this.map.remove(str);
        } else {
            this.map.put(str, obj);
        }
    }

    public int size() {
        return this.map.size();
    }

    public String toString() {
        return this.map.toString();
    }

    public Collection<Object> values() {
        return this.map.values();
    }
}
