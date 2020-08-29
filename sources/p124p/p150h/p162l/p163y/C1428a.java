package p124p.p150h.p162l.p163y;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: p.h.l.y.a */
public final class C1428a extends ClickableSpan {

    /* renamed from: e */
    public final int f4199e;

    /* renamed from: f */
    public final C1429b f4200f;

    /* renamed from: g */
    public final int f4201g;

    public C1428a(int i, C1429b bVar, int i2) {
        this.f4199e = i;
        this.f4200f = bVar;
        this.f4201g = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4199e);
        C1429b bVar = this.f4200f;
        bVar.f4203a.performAction(this.f4201g, bundle);
    }
}
