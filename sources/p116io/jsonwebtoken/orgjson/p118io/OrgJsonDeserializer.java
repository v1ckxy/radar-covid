package p116io.jsonwebtoken.orgjson.p118io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Strings;
import p116io.jsonwebtoken.p117io.DeserializationException;
import p116io.jsonwebtoken.p117io.Deserializer;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.orgjson.io.OrgJsonDeserializer */
public class OrgJsonDeserializer implements Deserializer<Object> {
    private Object convertIfNecessary(Object obj) {
        if (JSONObject.NULL.equals(obj)) {
            return null;
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj instanceof JSONObject ? toMap((JSONObject) obj) : obj;
    }

    private Object parse(String str) {
        JSONTokener jSONTokener = new JSONTokener(str);
        char nextClean = jSONTokener.nextClean();
        jSONTokener.back();
        return nextClean == '{' ? toMap(new JSONObject(jSONTokener)) : nextClean == '[' ? toList(new JSONArray(jSONTokener)) : convertIfNecessary(jSONTokener.nextValue());
    }

    private List<Object> toList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(convertIfNecessary(jSONArray.get(i)));
        }
        return arrayList;
    }

    private Map<String, Object> toMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            linkedHashMap.put(str, convertIfNecessary(jSONObject.get(str)));
        }
        return linkedHashMap;
    }

    public Object deserialize(byte[] bArr) {
        Assert.notNull(bArr, "JSON byte array cannot be null");
        if (bArr.length != 0) {
            try {
                return parse(new String(bArr, Strings.UTF_8));
            } catch (Exception e) {
                StringBuilder a = C1965a.m4756a("Invalid JSON: ");
                a.append(e.getMessage());
                throw new DeserializationException(a.toString(), e);
            }
        } else {
            throw new DeserializationException("Invalid JSON: zero length byte array.");
        }
    }
}
