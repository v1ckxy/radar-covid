package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p331o.C4138h;

/* renamed from: q.b.d.h.e.k.h0 */
public class C3950h0 {

    /* renamed from: a */
    public final String f9645a;

    /* renamed from: b */
    public final C4138h f9646b;

    public C3950h0(String str, C4138h hVar) {
        this.f9645a = str;
        this.f9646b = hVar;
    }

    /* renamed from: a */
    public boolean mo10141a() {
        try {
            return mo10142b().createNewFile();
        } catch (IOException e) {
            C3913b bVar = C3913b.f9552c;
            StringBuilder a = C1965a.m4756a("Error creating marker: ");
            a.append(this.f9645a);
            bVar.mo10112b(a.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo10142b() {
        return new File(this.f9646b.mo10339a(), this.f9645a);
    }
}
