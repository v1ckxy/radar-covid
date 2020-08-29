package p124p.p150h.p158h;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;

/* renamed from: p.h.h.e */
public final class C1353e {
    static {
        Class<String> cls = String.class;
        if (VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, cls, Integer.TYPE});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, cls, Integer.TYPE});
                Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, cls, Integer.TYPE});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m3437a() {
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m3438a(String str) {
        Trace.beginSection(str);
    }
}
