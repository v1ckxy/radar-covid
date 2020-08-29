package p213q.p217b.p218a.p271c.p273b0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p213q.p217b.p218a.p271c.p275d0.C3321b;
import p213q.p217b.p218a.p271c.p275d0.C3323c;
import p213q.p217b.p218a.p271c.p275d0.C3324d;

/* renamed from: q.b.a.c.b0.h */
public class C3305h {

    /* renamed from: a */
    public final TextPaint f8292a = new TextPaint(1);

    /* renamed from: b */
    public final C3324d f8293b = new C3306a();

    /* renamed from: c */
    public float f8294c;

    /* renamed from: d */
    public boolean f8295d = true;

    /* renamed from: e */
    public WeakReference<C3307b> f8296e = new WeakReference<>(null);

    /* renamed from: f */
    public C3321b f8297f;

    /* renamed from: q.b.a.c.b0.h$a */
    public class C3306a extends C3324d {
        public C3306a() {
        }

        /* renamed from: a */
        public void mo1990a(int i) {
            C3305h hVar = C3305h.this;
            hVar.f8295d = true;
            C3307b bVar = (C3307b) hVar.f8296e.get();
            if (bVar != null) {
                bVar.mo9033a();
            }
        }

        /* renamed from: a */
        public void mo1991a(Typeface typeface, boolean z) {
            if (!z) {
                C3305h hVar = C3305h.this;
                hVar.f8295d = true;
                C3307b bVar = (C3307b) hVar.f8296e.get();
                if (bVar != null) {
                    bVar.mo9033a();
                }
            }
        }
    }

    /* renamed from: q.b.a.c.b0.h$b */
    public interface C3307b {
        /* renamed from: a */
        void mo9033a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C3305h(C3307b bVar) {
        this.f8296e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public float mo9031a(String str) {
        if (!this.f8295d) {
            return this.f8294c;
        }
        float measureText = str == null ? 0.0f : this.f8292a.measureText(str, 0, str.length());
        this.f8294c = measureText;
        this.f8295d = false;
        return measureText;
    }

    /* renamed from: a */
    public void mo9032a(C3321b bVar, Context context) {
        if (this.f8297f != bVar) {
            this.f8297f = bVar;
            if (bVar != null) {
                TextPaint textPaint = this.f8292a;
                C3324d dVar = this.f8293b;
                bVar.mo9045a();
                bVar.mo9048a(textPaint, bVar.f8329l);
                bVar.mo9047a(context, (C3324d) new C3323c(bVar, textPaint, dVar));
                C3307b bVar2 = (C3307b) this.f8296e.get();
                if (bVar2 != null) {
                    this.f8292a.drawableState = bVar2.getState();
                }
                bVar.mo9046a(context, this.f8292a, this.f8293b);
                this.f8295d = true;
            }
            C3307b bVar3 = (C3307b) this.f8296e.get();
            if (bVar3 != null) {
                bVar3.mo9033a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }
}
