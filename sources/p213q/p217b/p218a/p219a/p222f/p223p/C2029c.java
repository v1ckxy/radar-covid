package p213q.p217b.p218a.p219a.p222f.p223p;

import android.content.Context;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;

/* renamed from: q.b.a.a.f.p.c */
public final class C2029c extends C2035h {

    /* renamed from: a */
    public final Context f5807a;

    /* renamed from: b */
    public final C2099a f5808b;

    /* renamed from: c */
    public final C2099a f5809c;

    /* renamed from: d */
    public final String f5810d;

    public C2029c(Context context, C2099a aVar, C2099a aVar2, String str) {
        if (context != null) {
            this.f5807a = context;
            if (aVar != null) {
                this.f5808b = aVar;
                if (aVar2 != null) {
                    this.f5809c = aVar2;
                    if (str != null) {
                        this.f5810d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2035h)) {
            return false;
        }
        C2029c cVar = (C2029c) ((C2035h) obj);
        if (!this.f5807a.equals(cVar.f5807a) || !this.f5808b.equals(cVar.f5808b) || !this.f5809c.equals(cVar.f5809c) || !this.f5810d.equals(cVar.f5810d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f5807a.hashCode() ^ 1000003) * 1000003) ^ this.f5808b.hashCode()) * 1000003) ^ this.f5809c.hashCode()) * 1000003) ^ this.f5810d.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("CreationContext{applicationContext=");
        a.append(this.f5807a);
        a.append(", wallClock=");
        a.append(this.f5808b);
        a.append(", monotonicClock=");
        a.append(this.f5809c);
        a.append(", backendName=");
        return C1965a.m4754a(a, this.f5810d, Objects.ARRAY_END);
    }
}
