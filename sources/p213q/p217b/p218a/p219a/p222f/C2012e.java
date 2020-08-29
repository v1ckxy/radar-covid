package p213q.p217b.p218a.p219a.p222f;

import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.C1966a;

/* renamed from: q.b.a.a.f.e */
public final class C2012e {

    /* renamed from: a */
    public final C1966a f5780a;

    /* renamed from: b */
    public final byte[] f5781b;

    public C2012e(C1966a aVar, byte[] bArr) {
        if (aVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f5780a = aVar;
            this.f5781b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012e)) {
            return false;
        }
        C2012e eVar = (C2012e) obj;
        if (!this.f5780a.equals(eVar.f5780a)) {
            return false;
        }
        return Arrays.equals(this.f5781b, eVar.f5781b);
    }

    public int hashCode() {
        return ((this.f5780a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5781b);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("EncodedPayload{encoding=");
        a.append(this.f5780a);
        a.append(", bytes=[...]}");
        return a.toString();
    }
}
