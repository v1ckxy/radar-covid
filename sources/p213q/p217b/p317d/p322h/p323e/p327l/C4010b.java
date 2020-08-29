package p213q.p217b.p317d.p322h.p323e.p327l;

import android.content.Context;
import java.io.File;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3986k;

/* renamed from: q.b.d.h.e.l.b */
public class C4010b {

    /* renamed from: d */
    public static final C4013c f9791d = new C4013c(null);

    /* renamed from: a */
    public final Context f9792a;

    /* renamed from: b */
    public final C4012b f9793b;

    /* renamed from: c */
    public C4009a f9794c = f9791d;

    /* renamed from: q.b.d.h.e.l.b$b */
    public interface C4012b {
    }

    /* renamed from: q.b.d.h.e.l.b$c */
    public static final class C4013c implements C4009a {
        public /* synthetic */ C4013c(C4011a aVar) {
        }

        /* renamed from: a */
        public void mo10199a() {
        }

        /* renamed from: a */
        public void mo10200a(long j, String str) {
        }

        /* renamed from: b */
        public String mo10201b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo10202c() {
            return null;
        }

        /* renamed from: d */
        public void mo10203d() {
        }
    }

    public C4010b(Context context, C4012b bVar) {
        this.f9792a = context;
        this.f9793b = bVar;
        mo10204a(null);
    }

    /* renamed from: a */
    public final void mo10204a(String str) {
        this.f9794c.mo10199a();
        this.f9794c = f9791d;
        if (str != null) {
            if (!C3944g.m9363a(this.f9792a, "com.crashlytics.CollectCustomLogs", true)) {
                C3913b.f9552c.mo10108a("Preferences requested no custom logs. Aborting log file creation.");
                return;
            }
            this.f9794c = new C4020e(new File(((C3986k) this.f9793b).mo10190a(), C1965a.m4752a("crashlytics-userlog-", str, ".temp")), 65536);
        }
    }
}
