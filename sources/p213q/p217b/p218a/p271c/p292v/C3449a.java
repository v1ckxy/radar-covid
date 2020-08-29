package p213q.p217b.p218a.p271c.p292v;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: q.b.a.c.v.a */
public class C3449a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f8742a;

    public C3449a(Chip chip) {
        this.f8742a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C3450b bVar = this.f8742a.f1280h;
        if (bVar != null) {
            bVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
