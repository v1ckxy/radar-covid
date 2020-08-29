package p213q.p217b.p317d.p322h.p323e.p333q.p334c;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c.C4154a;

/* renamed from: q.b.d.h.e.q.c.d */
public class C4155d implements C4153c {

    /* renamed from: a */
    public final File f10051a;

    /* renamed from: b */
    public final File[] f10052b;

    /* renamed from: c */
    public final Map<String, String> f10053c;

    public C4155d(File file, Map<String, String> map) {
        this.f10051a = file;
        this.f10052b = new File[]{file};
        this.f10053c = new HashMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo10359a() {
        return Collections.unmodifiableMap(this.f10053c);
    }

    /* renamed from: b */
    public File[] mo10360b() {
        return this.f10052b;
    }

    /* renamed from: c */
    public String mo10361c() {
        return this.f10051a.getName();
    }

    /* renamed from: d */
    public String mo10362d() {
        String c = mo10361c();
        return c.substring(0, c.lastIndexOf(46));
    }

    /* renamed from: e */
    public File mo10363e() {
        return this.f10051a;
    }

    public C4154a getType() {
        return C4154a.JAVA;
    }

    public void remove() {
        C3913b bVar = C3913b.f9552c;
        StringBuilder a = C1965a.m4756a("Removing report at ");
        a.append(this.f10051a.getPath());
        bVar.mo10108a(a.toString());
        this.f10051a.delete();
    }
}
