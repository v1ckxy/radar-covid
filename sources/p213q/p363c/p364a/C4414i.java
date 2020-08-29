package p213q.p363c.p364a;

import android.os.Looper;

/* renamed from: q.c.a.i */
public interface C4414i {

    /* renamed from: a */
    public static final C4414i f10520a = new C4415a();

    /* renamed from: q.c.a.i$a */
    public static class C4415a implements C4414i {
        /* renamed from: a */
        public void mo10708a(C4403b bVar) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Event bus ");
                sb.append(bVar);
                sb.append(" accessed from non-main thread ");
                sb.append(Looper.myLooper());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    void mo10708a(C4403b bVar);
}
