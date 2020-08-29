package p124p.p126b.p127k;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p124p.p126b.C1018a;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p150h.p162l.C1392d;
import p124p.p150h.p162l.C1392d.C1393a;

/* renamed from: p.b.k.n */
public class C1059n extends Dialog implements C1037f {

    /* renamed from: e */
    public C1038g f2784e;

    /* renamed from: f */
    public final C1393a f2785f;

    /* renamed from: p.b.k.n$a */
    public class C1060a implements C1393a {
        public C1060a() {
        }

        /* renamed from: a */
        public boolean mo4533a(KeyEvent keyEvent) {
            return C1059n.this.mo4523a(keyEvent);
        }
    }

    public C1059n(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C1018a.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f2785f = new C1060a();
        C1038g a = mo4522a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(C1018a.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((C1039h) a).f2711R = i;
        a.mo4458a((Bundle) null);
    }

    /* renamed from: a */
    public C1038g mo4522a() {
        if (this.f2784e == null) {
            this.f2784e = C1038g.m2348a((Dialog) this, (C1037f) this);
        }
        return this.f2784e;
    }

    /* renamed from: a */
    public C1089a mo4430a(C1090a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4431a(C1089a aVar) {
    }

    /* renamed from: a */
    public boolean mo4523a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo4522a().mo4460a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo4434b(C1089a aVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1392d.m3484a(this.f2785f, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        C1039h hVar = (C1039h) mo4522a();
        hVar.mo4483f();
        return hVar.f2725i.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        mo4522a().mo4463b();
    }

    public void onCreate(Bundle bundle) {
        mo4522a().mo4457a();
        super.onCreate(bundle);
        mo4522a().mo4458a(bundle);
    }

    public void onStop() {
        super.onStop();
        mo4522a().mo4466c();
    }

    public void setContentView(int i) {
        mo4522a().mo4464b(i);
    }

    public void setContentView(View view) {
        mo4522a().mo4459a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo4522a().mo4465b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo4522a().mo4461a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo4522a().mo4461a(charSequence);
    }
}
