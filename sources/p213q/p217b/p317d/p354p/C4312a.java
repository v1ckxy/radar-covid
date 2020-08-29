package p213q.p217b.p317d.p354p;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.p.a */
public final class C4312a extends C4316e {

    /* renamed from: a */
    public final String f10367a;

    /* renamed from: b */
    public final String f10368b;

    public C4312a(String str, String str2) {
        if (str != null) {
            this.f10367a = str;
            if (str2 != null) {
                this.f10368b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4316e)) {
            return false;
        }
        C4312a aVar = (C4312a) ((C4316e) obj);
        if (!this.f10367a.equals(aVar.f10367a) || !this.f10368b.equals(aVar.f10368b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f10367a.hashCode() ^ 1000003) * 1000003) ^ this.f10368b.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("LibraryVersion{libraryName=");
        a.append(this.f10367a);
        a.append(", version=");
        return C1965a.m4754a(a, this.f10368b, Objects.ARRAY_END);
    }
}
