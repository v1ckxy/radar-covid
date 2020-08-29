package p213q.p217b.p355e;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;
import p213q.p217b.p355e.p362x.C4400c;

/* renamed from: q.b.e.i */
public abstract class C4332i {
    /* renamed from: c */
    public C4337n mo10541c() {
        if (this instanceof C4337n) {
            return (C4337n) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C4400c cVar = new C4400c(stringWriter);
            cVar.f10493j = true;
            TypeAdapters.f1646X.mo3073a(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
