package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.IOException;

/* renamed from: q.b.a.b.g.e.p6 */
public class C2618p6 extends IOException {
    public C2618p6(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C2618p6 m6290a() {
        return new C2618p6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static C2618p6 m6291b() {
        return new C2618p6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C2618p6 m6292c() {
        return new C2618p6("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static C2667s6 m6293d() {
        return new C2667s6("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C2618p6 m6294e() {
        return new C2618p6("Failed to parse the message.");
    }

    /* renamed from: f */
    public static C2618p6 m6295f() {
        return new C2618p6("Protocol message had invalid UTF-8.");
    }
}
