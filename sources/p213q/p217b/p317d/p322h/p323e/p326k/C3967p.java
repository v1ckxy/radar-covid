package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* renamed from: q.b.d.h.e.k.p */
public class C3967p implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ Set f9685a;

    public C3967p(C3975t tVar, Set set) {
        this.f9685a = set;
    }

    public boolean accept(File file, String str) {
        if (str.length() < 35) {
            return false;
        }
        return this.f9685a.contains(str.substring(0, 35));
    }
}
