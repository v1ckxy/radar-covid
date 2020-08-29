package p213q.p217b.p218a.p231b.p249e;

import android.os.IBinder;
import android.os.IInterface;
import p213q.p217b.p218a.p231b.p251g.p254c.C2324a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;

/* renamed from: q.b.a.b.e.a */
public interface C2303a extends IInterface {

    /* renamed from: q.b.a.b.e.a$a */
    public static abstract class C2304a extends C2324a implements C2303a {

        /* renamed from: q.b.a.b.e.a$a$a */
        public static class C2305a extends C2325b implements C2303a {
            public C2305a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C2304a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C2303a m5378a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C2303a ? (C2303a) queryLocalInterface : new C2305a(iBinder);
        }
    }
}
