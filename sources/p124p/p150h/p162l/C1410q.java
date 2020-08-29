package p124p.p150h.p162l;

import android.text.TextUtils;
import android.view.View;
import p124p.p150h.p162l.C1404o.C1406b;

/* renamed from: p.h.l.q */
public class C1410q extends C1406b<CharSequence> {
    public C1410q(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    /* renamed from: a */
    public Object mo5901a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: a */
    public void mo5902a(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    /* renamed from: a */
    public boolean mo5904a(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
