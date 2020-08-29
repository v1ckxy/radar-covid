package p213q.p217b.p218a.p271c.p295x;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0129t;
import com.google.android.material.button.MaterialButton;

/* renamed from: q.b.a.c.x.i */
public class C3477i extends C0129t {

    /* renamed from: a */
    public final /* synthetic */ C3486q f8864a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f8865b;

    /* renamed from: c */
    public final /* synthetic */ C3468f f8866c;

    public C3477i(C3468f fVar, C3486q qVar, MaterialButton materialButton) {
        this.f8866c = fVar;
        this.f8864a = qVar;
        this.f8865b = materialButton;
    }

    /* renamed from: a */
    public void mo1256a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f8865b.getText());
        }
    }

    /* renamed from: a */
    public void mo1257a(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager r0 = this.f8866c.mo9424r0();
        int t = i < 0 ? r0.mo923t() : r0.mo924u();
        this.f8866c.f8845f0 = this.f8864a.mo9449b(t);
        this.f8865b.setText(this.f8864a.f8885d.f8814e.mo9430a(t).f8873f);
    }
}
