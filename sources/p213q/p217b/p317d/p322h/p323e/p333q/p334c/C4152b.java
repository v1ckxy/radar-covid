package p213q.p217b.p317d.p322h.p323e.p333q.p334c;

import java.io.File;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c.C4154a;

/* renamed from: q.b.d.h.e.q.c.b */
public class C4152b implements C4153c {

    /* renamed from: a */
    public final File f10047a;

    public C4152b(File file) {
        this.f10047a = file;
    }

    /* renamed from: a */
    public Map<String, String> mo10359a() {
        return null;
    }

    /* renamed from: b */
    public File[] mo10360b() {
        return this.f10047a.listFiles();
    }

    /* renamed from: c */
    public String mo10361c() {
        return null;
    }

    /* renamed from: d */
    public String mo10362d() {
        return this.f10047a.getName();
    }

    /* renamed from: e */
    public File mo10363e() {
        return null;
    }

    public C4154a getType() {
        return C4154a.NATIVE;
    }

    public void remove() {
        File[] b;
        for (File file : mo10360b()) {
            C3913b bVar = C3913b.f9552c;
            StringBuilder a = C1965a.m4756a("Removing native report file at ");
            a.append(file.getPath());
            bVar.mo10108a(a.toString());
            file.delete();
        }
        C3913b bVar2 = C3913b.f9552c;
        StringBuilder a2 = C1965a.m4756a("Removing native report directory at ");
        a2.append(this.f10047a);
        bVar2.mo10108a(a2.toString());
        this.f10047a.delete();
    }
}
