package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p213q.p217b.p218a.p231b.p251g.p254c.C2324a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.d.n.h */
public interface C2241h extends IInterface {

    /* renamed from: q.b.a.b.d.n.h$a */
    public static abstract class C2242a extends C2324a implements C2241h {

        /* renamed from: q.b.a.b.d.n.h$a$a */
        public static class C2243a extends C2325b implements C2241h {
            public C2243a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo7277a() {
                Parcel a = mo7338a(2, mo7340d());
                Account account = (Account) C2326c.m5410a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C2241h m5095a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C2241h ? (C2241h) queryLocalInterface : new C2243a(iBinder);
        }
    }

    /* renamed from: a */
    Account mo7277a();
}
