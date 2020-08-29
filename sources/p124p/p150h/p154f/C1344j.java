package p124p.p150h.p154f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p159i.C1355b.C1361f;

/* renamed from: p.h.f.j */
public class C1344j {

    /* renamed from: a */
    public ConcurrentHashMap<Long, C1328c> f4059a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public Typeface mo5801a(Context context, Resources resources, int i, String str, int i2) {
        File a = C1061o.m2462a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C1061o.m2513a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo5799a(Context context, CancellationSignal cancellationSignal, C1361f[] fVarArr, int i) {
        throw null;
    }

    /* renamed from: a */
    public Typeface mo5811a(Context context, InputStream inputStream) {
        File a = C1061o.m2462a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C1061o.m2514a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo5800a(Context context, C1328c cVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: a */
    public C1361f mo5810a(C1361f[] fVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C1361f fVar = null;
        int i3 = Integer.MAX_VALUE;
        for (C1361f fVar2 : fVarArr) {
            int abs = (Math.abs(fVar2.f4086c - i2) * 2) + (fVar2.f4087d == z ? 0 : 1);
            if (fVar == null || i3 > abs) {
                fVar = fVar2;
                i3 = abs;
            }
        }
        return fVar;
    }
}
