package p213q.p217b.p317d.p322h.p323e.p331o;

import android.content.Context;
import java.io.File;
import p213q.p217b.p317d.p322h.p323e.C3913b;

/* renamed from: q.b.d.h.e.o.h */
public class C4138h {

    /* renamed from: a */
    public final Context f10018a;

    public C4138h(Context context) {
        this.f10018a = context;
    }

    /* renamed from: a */
    public File mo10339a() {
        File file = new File(this.f10018a.getFilesDir(), ".com.google.firebase.crashlytics");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        C3913b.f9552c.mo10113c("Couldn't create file");
        return null;
    }
}
