package p119o.p120a.p121a;

/* renamed from: o.a.a.p */
public final /* synthetic */ class C0911p {

    /* renamed from: a */
    public static final int f2506a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final String m1998a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
