package p213q.p217b.p218a.p271c.p275d0;

import android.graphics.Typeface;
import p213q.p217b.p218a.p271c.p273b0.C3295a;
import p213q.p217b.p218a.p271c.p273b0.C3296b;

/* renamed from: q.b.a.c.d0.a */
public final class C3319a extends C3324d {

    /* renamed from: a */
    public final Typeface f8315a;

    /* renamed from: b */
    public final C3320a f8316b;

    /* renamed from: c */
    public boolean f8317c;

    /* renamed from: q.b.a.c.d0.a$a */
    public interface C3320a {
    }

    public C3319a(C3320a aVar, Typeface typeface) {
        this.f8315a = typeface;
        this.f8316b = aVar;
    }

    /* renamed from: a */
    public void mo1990a(int i) {
        mo9044a(this.f8315a);
    }

    /* renamed from: a */
    public final void mo9044a(Typeface typeface) {
        if (!this.f8317c) {
            C3296b bVar = ((C3295a) this.f8316b).f8227a;
            C3319a aVar = bVar.f8269v;
            boolean z = true;
            if (aVar != null) {
                aVar.f8317c = true;
            }
            if (bVar.f8266s != typeface) {
                bVar.f8266s = typeface;
            } else {
                z = false;
            }
            if (z) {
                bVar.mo9006e();
            }
        }
    }

    /* renamed from: a */
    public void mo1991a(Typeface typeface, boolean z) {
        mo9044a(typeface);
    }
}
