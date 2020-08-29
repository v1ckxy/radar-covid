package p213q.p217b.p218a.p219a.p220e.p221b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: q.b.a.a.e.b.n */
public abstract class C1993n {
    /* renamed from: a */
    public static C1993n m4775a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C1985h(Long.parseLong(jsonReader.nextString()));
                } else {
                    C1985h hVar = new C1985h(jsonReader.nextLong());
                    jsonReader.close();
                    return hVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
