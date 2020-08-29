package p425x.p472b.p473a.p474a.p476l.p478l;

import android.util.SparseArray;

/* renamed from: x.b.a.a.l.l.c */
public enum C5222c {
    OPEN_APP(0),
    SYNC(1),
    WORKER_STARTED(2),
    FAKE_REQUEST(3),
    NEXT_DAY_KEY_UPLOAD_REQUEST(4);
    

    /* renamed from: k */
    public static final SparseArray<C5222c> f12441k = null;

    /* renamed from: e */
    public int f12443e;

    /* access modifiers changed from: public */
    static {
        int i;
        C5222c[] values;
        f12441k = new SparseArray<>(values().length);
        for (C5222c cVar : values()) {
            f12441k.put(cVar.f12443e, cVar);
        }
    }

    /* access modifiers changed from: public */
    C5222c(int i) {
        this.f12443e = i;
    }
}
