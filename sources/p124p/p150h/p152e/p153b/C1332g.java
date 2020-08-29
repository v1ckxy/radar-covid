package p124p.p150h.p152e.p153b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: p.h.e.b.g */
public abstract class C1332g {

    /* renamed from: p.h.e.b.g$a */
    public class C1333a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Typeface f4030e;

        public C1333a(Typeface typeface) {
            this.f4030e = typeface;
        }

        public void run() {
            C1332g.this.mo5338a(this.f4030e);
        }
    }

    /* renamed from: p.h.e.b.g$b */
    public class C1334b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f4032e;

        public C1334b(int i) {
            this.f4032e = i;
        }

        public void run() {
            C1332g.this.mo5337a(this.f4032e);
        }
    }

    /* renamed from: a */
    public abstract void mo5337a(int i);

    /* renamed from: a */
    public final void mo5792a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C1334b(i));
    }

    /* renamed from: a */
    public abstract void mo5338a(Typeface typeface);

    /* renamed from: a */
    public final void mo5793a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C1333a(typeface));
    }
}
