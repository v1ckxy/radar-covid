package p213q.p217b.p218a.p219a.p220e.p221b;

import android.util.SparseArray;

/* renamed from: q.b.a.a.e.b.p */
public enum C1997p {
    DEFAULT,
    UNMETERED_ONLY,
    UNMETERED_OR_DAILY,
    FAST_IF_RADIO_AWAKE,
    NEVER,
    UNRECOGNIZED;
    

    /* renamed from: k */
    public static final SparseArray<C1997p> f5735k = null;

    /* access modifiers changed from: public */
    static {
        DEFAULT = new C1997p("DEFAULT", 0);
        UNMETERED_ONLY = new C1997p("UNMETERED_ONLY", 1);
        UNMETERED_OR_DAILY = new C1997p("UNMETERED_OR_DAILY", 2);
        FAST_IF_RADIO_AWAKE = new C1997p("FAST_IF_RADIO_AWAKE", 3);
        NEVER = new C1997p("NEVER", 4);
        UNRECOGNIZED = new C1997p("UNRECOGNIZED", 5);
        SparseArray<C1997p> sparseArray = new SparseArray<>();
        f5735k = sparseArray;
        sparseArray.put(0, DEFAULT);
        f5735k.put(1, UNMETERED_ONLY);
        f5735k.put(2, UNMETERED_OR_DAILY);
        f5735k.put(3, FAST_IF_RADIO_AWAKE);
        f5735k.put(4, NEVER);
        f5735k.put(-1, UNRECOGNIZED);
    }
}
