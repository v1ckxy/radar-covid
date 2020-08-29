package p213q.p217b.p218a.p219a.p220e.p221b;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1990l.C1991a;

/* renamed from: q.b.a.a.e.b.f */
public final class C1982f extends C1990l {

    /* renamed from: a */
    public final long f5659a;

    /* renamed from: b */
    public final Integer f5660b;

    /* renamed from: c */
    public final long f5661c;

    /* renamed from: d */
    public final byte[] f5662d;

    /* renamed from: e */
    public final String f5663e;

    /* renamed from: f */
    public final long f5664f;

    /* renamed from: g */
    public final C1994o f5665g;

    /* renamed from: q.b.a.a.e.b.f$a */
    public static final class C1983a extends C1991a {

        /* renamed from: a */
        public Long f5666a;

        /* renamed from: b */
        public Integer f5667b;

        /* renamed from: c */
        public Long f5668c;

        /* renamed from: d */
        public byte[] f5669d;

        /* renamed from: e */
        public String f5670e;

        /* renamed from: f */
        public Long f5671f;

        /* renamed from: g */
        public C1994o f5672g;
    }

    public /* synthetic */ C1982f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C1994o oVar) {
        this.f5659a = j;
        this.f5660b = num;
        this.f5661c = j2;
        this.f5662d = bArr;
        this.f5663e = str;
        this.f5664f = j3;
        this.f5665g = oVar;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1990l)) {
            return false;
        }
        C1990l lVar = (C1990l) obj;
        C1982f fVar = (C1982f) lVar;
        if (this.f5659a == fVar.f5659a) {
            Integer num = this.f5660b;
            if (num != null ? num.equals(fVar.f5660b) : fVar.f5660b == null) {
                if (this.f5661c == fVar.f5661c) {
                    byte[] bArr2 = this.f5662d;
                    if (lVar instanceof C1982f) {
                        bArr = fVar.f5662d;
                    } else {
                        bArr = fVar.f5662d;
                    }
                    if (Arrays.equals(bArr2, bArr)) {
                        String str = this.f5663e;
                        if (str != null ? str.equals(fVar.f5663e) : fVar.f5663e == null) {
                            if (this.f5664f == fVar.f5664f) {
                                C1994o oVar = this.f5665g;
                                if (oVar != null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.f5659a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f5660b;
        int i2 = 0;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.f5661c;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5662d)) * 1000003;
        String str = this.f5663e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f5664f;
        int i3 = (hashCode3 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1994o oVar = this.f5665g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("LogEvent{eventTimeMs=");
        a.append(this.f5659a);
        a.append(", eventCode=");
        a.append(this.f5660b);
        a.append(", eventUptimeMs=");
        a.append(this.f5661c);
        a.append(", sourceExtension=");
        a.append(Arrays.toString(this.f5662d));
        a.append(", sourceExtensionJsonProto3=");
        a.append(this.f5663e);
        a.append(", timezoneOffsetSeconds=");
        a.append(this.f5664f);
        a.append(", networkConnectionInfo=");
        a.append(this.f5665g);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
