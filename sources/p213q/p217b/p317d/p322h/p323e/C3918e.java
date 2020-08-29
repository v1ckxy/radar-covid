package p213q.p217b.p317d.p322h.p323e;

import android.util.Log;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p322h.p323e.p337s.C4166d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;

/* renamed from: q.b.d.h.e.e */
public class C3918e implements C3253h<C4173b, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f9556a;

    /* renamed from: b */
    public final /* synthetic */ C4166d f9557b;

    /* renamed from: c */
    public final /* synthetic */ Executor f9558c;

    /* renamed from: d */
    public final /* synthetic */ C3921h f9559d;

    public C3918e(C3921h hVar, String str, C4166d dVar, Executor executor) {
        this.f9559d = hVar;
        this.f9556a = str;
        this.f9557b = dVar;
        this.f9558c = executor;
    }

    /* renamed from: a */
    public C3255i mo8939a(Object obj) {
        try {
            C3921h.m9326a(this.f9559d, (C4173b) obj, this.f9556a, this.f9557b, this.f9558c, true);
            return null;
        } catch (Exception e) {
            C3913b bVar = C3913b.f9552c;
            if (bVar.mo10110a(6)) {
                Log.e(bVar.f9553a, "Error performing auto configuration.", e);
            }
            throw e;
        }
    }
}
