package p124p.p150h.p162l;

import android.view.View;
import p124p.p150h.p162l.C1404o.C1406b;

/* renamed from: p.h.l.r */
public class C1411r extends C1406b<Boolean> {
    public C1411r(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* renamed from: a */
    public Object mo5901a(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* renamed from: a */
    public void mo5902a(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public boolean mo5904a(Object obj, Object obj2) {
        return !mo5903a((Boolean) obj, (Boolean) obj2);
    }
}
