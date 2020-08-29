package p116io.jsonwebtoken.orgjson.p118io;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;
import p116io.jsonwebtoken.lang.Classes;
import p116io.jsonwebtoken.lang.Collections;
import p116io.jsonwebtoken.lang.DateFormats;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p116io.jsonwebtoken.p117io.Encoders;
import p116io.jsonwebtoken.p117io.SerializationException;
import p116io.jsonwebtoken.p117io.Serializer;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.orgjson.io.OrgJsonSerializer */
public class OrgJsonSerializer<T> implements Serializer<T> {
    public static final Class JSON_STRING_CLASS;
    public static final String JSON_STRING_CLASS_NAME = "org.json.JSONString";
    public static final String JSON_WRITER_CLASS_NAME = "org.json.JSONWriter";
    public static final Class[] VALUE_TO_STRING_ARG_TYPES = {Object.class};

    static {
        String str = JSON_STRING_CLASS_NAME;
        JSON_STRING_CLASS = Classes.isAvailable(str) ? Classes.forName(str) : null;
    }

    public static boolean isJSONString(Object obj) {
        Class cls = JSON_STRING_CLASS;
        if (cls != null) {
            return cls.isInstance(obj);
        }
        return false;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r3v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray toJSONArray(java.util.Collection<java.lang.Object> r3) {
        /*
            r2 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r2.toJSONInstance(r1)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.orgjson.p118io.OrgJsonSerializer.toJSONArray(java.util.Collection):org.json.JSONArray");
    }

    private Object toJSONInstance(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || JSONObject.NULL.equals(obj) || isJSONString(obj) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof BigInteger) || (obj instanceof BigDecimal) || (obj instanceof Enum)) {
            return obj;
        }
        if (obj instanceof Calendar) {
            obj = ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return DateFormats.formatIso8601((Date) obj);
        }
        if (obj instanceof byte[]) {
            return Encoders.BASE64.encode((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return new String((char[]) obj);
        }
        if (obj instanceof Map) {
            return toJSONObject((Map) obj);
        }
        if (obj instanceof Collection) {
            return toJSONArray((Collection) obj);
        }
        if (Objects.isArray(obj)) {
            return toJSONArray(Collections.arrayToList(obj));
        }
        StringBuilder a = C1965a.m4756a("Unable to serialize object of type ");
        a.append(obj.getClass().getName());
        a.append(" to JSON using known heuristics.");
        throw new SerializationException(a.toString());
    }

    private JSONObject toJSONObject(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put(String.valueOf(entry.getKey()), toJSONInstance(entry.getValue()));
        }
        return jSONObject;
    }

    public byte[] serialize(T t) {
        try {
            return toBytes(toJSONInstance(t));
        } catch (SerializationException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder a = C1965a.m4756a("Unable to serialize object of type ");
            a.append(t.getClass().getName());
            a.append(" to JSON: ");
            a.append(e2.getMessage());
            throw new SerializationException(a.toString(), e2);
        }
    }

    public byte[] toBytes(Object obj) {
        String str;
        if (obj instanceof JSONObject) {
            str = obj.toString();
        } else {
            str = (String) Classes.invokeStatic(JSON_WRITER_CLASS_NAME, "valueToString", VALUE_TO_STRING_ARG_TYPES, obj);
        }
        return str.getBytes(Strings.UTF_8);
    }
}
