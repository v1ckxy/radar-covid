package p213q.p217b.p218a.p271c.p287q;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;

/* renamed from: q.b.a.c.q.d */
public class C3438d implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C3439e f8679e;

    public C3438d(C3439e eVar) {
        this.f8679e = eVar;
    }

    public void onClick(View view) {
        C1118i itemData = ((C3436b) view).getItemData();
        C3439e eVar = this.f8679e;
        if (!eVar.f8684C.mo4810a((MenuItem) itemData, (C1129m) eVar.f8683B, 0)) {
            itemData.setChecked(true);
        }
    }
}
