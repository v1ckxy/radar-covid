package p213q.p217b.p218a.p231b.p262i.p265d.p266b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2184j;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2234e;
import p213q.p217b.p218a.p231b.p251g.p257f.C2814g2;
import p213q.p217b.p218a.p231b.p262i.C3190a;
import p213q.p217b.p218a.p231b.p262i.p265d.C3205a;

/* renamed from: q.b.a.b.i.d.b.b */
public final class C3207b extends C2234e<C3214i> {

    /* renamed from: A */
    public final ClientAppContext f8057A;

    /* renamed from: B */
    public final int f8058B;

    /* renamed from: z */
    public final C2814g2<C2184j, IBinder> f8059z = new C2814g2<>();

    @TargetApi(14)
    public C3207b(Context context, Looper looper, C2151a aVar, C2152b bVar, C2228c cVar, C3205a aVar2) {
        int i;
        super(context, looper, 62, cVar, aVar, bVar);
        String str = cVar.f6159e;
        int i2 = context instanceof Activity ? 1 : context instanceof Application ? 2 : context instanceof Service ? 3 : 0;
        if (aVar2 != null) {
            ClientAppContext clientAppContext = new ClientAppContext(1, str, null, false, i2, null);
            this.f8057A = clientAppContext;
            i = aVar2.f8056a;
        } else {
            ClientAppContext clientAppContext2 = new ClientAppContext(1, str, null, false, i2, null);
            this.f8057A = clientAppContext2;
            i = -1;
        }
        this.f8058B = i;
        if (i2 == 1) {
            Activity activity = (Activity) context;
            String str2 = "NearbyMessagesClient";
            if (Log.isLoggable(str2, 2)) {
                Log.v(str2, String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new C3208c(activity, this, null));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return queryLocalInterface instanceof C3214i ? (C3214i) queryLocalInterface : new C3215j(iBinder);
    }

    /* renamed from: b */
    public final void mo8878b(int i) {
        String str;
        String str2 = "NearbyMessagesClient";
        if (i == 1) {
            str = "ACTIVITY_STOPPED";
        } else if (i != 2) {
            if (Log.isLoggable(str2, 5)) {
                Log.w(str2, String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", new Object[]{Integer.valueOf(i)}));
            }
            return;
        } else {
            str = "CLIENT_DISCONNECTED";
        }
        if (mo7227a()) {
            C3213h hVar = new C3213h(i);
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, String.format("Emitting client lifecycle event %s", new Object[]{str}));
            }
            ((C3214i) mo7243q()).mo8891a(hVar);
            return;
        }
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str}));
        }
    }

    /* renamed from: c */
    public final boolean mo7230c() {
        return C3190a.m7518b(this.f6117c);
    }

    /* renamed from: d */
    public final int mo7231d() {
        return C2129i.f5999a;
    }

    /* renamed from: i */
    public final void mo7236i() {
        try {
            mo8878b(2);
        } catch (RemoteException e) {
            String str = "NearbyMessagesClient";
            if (Log.isLoggable(str, 2)) {
                Log.v(str, String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e}));
            }
        }
        this.f8059z.f7044a.clear();
        super.mo7236i();
    }

    /* renamed from: o */
    public final Bundle mo7241o() {
        Bundle bundle = new Bundle();
        bundle.putInt("NearbyPermissions", this.f8058B);
        bundle.putParcelable("ClientAppContext", this.f8057A);
        return bundle;
    }

    /* renamed from: r */
    public final String mo7244r() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    /* renamed from: s */
    public final String mo7245s() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }
}
