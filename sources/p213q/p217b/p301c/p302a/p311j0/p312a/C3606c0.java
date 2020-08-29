package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.IOException;

/* renamed from: q.b.c.a.j0.a.c0 */
public class C3606c0 extends IOException {

    /* renamed from: q.b.c.a.j0.a.c0$a */
    public static class C3607a extends C3606c0 {
        public C3607a(String str) {
            super(str);
        }
    }

    public C3606c0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C3606c0 m8174a() {
        return new C3606c0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static C3606c0 m8175b() {
        return new C3606c0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static C3606c0 m8176c() {
        return new C3606c0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static C3607a m8177d() {
        return new C3607a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C3606c0 m8178e() {
        return new C3606c0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static C3606c0 m8179f() {
        return new C3606c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static C3606c0 m8180g() {
        return new C3606c0("Failed to parse the message.");
    }

    /* renamed from: h */
    public static C3606c0 m8181h() {
        return new C3606c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
