package p124p.p126b.p127k;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p124p.p143e.C1251c;

/* renamed from: p.b.k.g */
public abstract class C1038g {

    /* renamed from: e */
    public static final C1251c<WeakReference<C1038g>> f2687e = new C1251c<>();

    /* renamed from: f */
    public static final Object f2688f = new Object();

    /* renamed from: a */
    public static C1038g m2347a(Activity activity, C1037f fVar) {
        return new C1039h(activity, null, fVar, activity);
    }

    /* renamed from: a */
    public static void m2349a(C1038g gVar) {
        synchronized (f2688f) {
            m2351c(gVar);
            f2687e.add(new WeakReference(gVar));
        }
    }

    /* renamed from: b */
    public static void m2350b(C1038g gVar) {
        synchronized (f2688f) {
            m2351c(gVar);
        }
    }

    /* renamed from: c */
    public static void m2351c(C1038g gVar) {
        synchronized (f2688f) {
            Iterator it = f2687e.iterator();
            while (it.hasNext()) {
                C1038g gVar2 = (C1038g) ((WeakReference) it.next()).get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo4457a();

    /* renamed from: a */
    public abstract void mo4458a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo4459a(View view);

    /* renamed from: a */
    public abstract void mo4460a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo4461a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo4462a(int i);

    /* renamed from: b */
    public abstract void mo4463b();

    /* renamed from: b */
    public abstract void mo4464b(int i);

    /* renamed from: b */
    public abstract void mo4465b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo4466c();

    /* renamed from: a */
    public static C1038g m2348a(Dialog dialog, C1037f fVar) {
        return new C1039h(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }
}
