package p124p.p150h.p151d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p124p.p150h.p162l.C1392d;
import p124p.p150h.p162l.C1392d.C1393a;
import p124p.p150h.p162l.C1404o;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p177n.C1552q;

/* renamed from: p.h.d.d */
public class C1316d extends Activity implements C1542h, C1393a {

    /* renamed from: e */
    public C1543i f3955e = new C1543i(this);

    /* renamed from: a */
    public boolean mo4533a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1404o.m3537b(decorView, keyEvent)) {
            return C1392d.m3484a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1404o.m3537b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1552q.m3947a((Activity) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f3955e.mo6231a(C1539b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
