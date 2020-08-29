package p369s.p370a.p371a.p378f.p380b;

/* renamed from: s.a.a.f.b.b */
public final class C4472b {
    /* renamed from: a */
    public static int m10066a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
