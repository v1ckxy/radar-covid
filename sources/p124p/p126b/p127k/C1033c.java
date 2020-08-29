package p124p.p126b.p127k;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.C0007b;

/* renamed from: p.b.k.c */
public class C1033c implements OnItemClickListener {

    /* renamed from: e */
    public final /* synthetic */ AlertController f2680e;

    /* renamed from: f */
    public final /* synthetic */ C0007b f2681f;

    public C1033c(C0007b bVar, AlertController alertController) {
        this.f2681f = bVar;
        this.f2680e = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2681f.f84p.onClick(this.f2680e.f41b, i);
        if (!this.f2681f.f88t) {
            this.f2680e.f41b.dismiss();
        }
    }
}
