package p213q.p217b.p218a.p271c.p295x;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import p213q.p217b.p218a.p271c.p295x.C3468f.C3472d;
import p213q.p217b.p218a.p271c.p295x.C3468f.C3474f;

/* renamed from: q.b.a.c.x.p */
public class C3485p implements OnItemClickListener {

    /* renamed from: e */
    public final /* synthetic */ MaterialCalendarGridView f8883e;

    /* renamed from: f */
    public final /* synthetic */ C3486q f8884f;

    public C3485p(C3486q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f8884f = qVar;
        this.f8883e = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C3484o adapter = this.f8883e.getAdapter();
        if (i >= adapter.mo9440a() && i <= adapter.mo9441b()) {
            C3474f fVar = this.f8884f.f8887f;
            long longValue = this.f8883e.getAdapter().getItem(i).longValue();
            C3472d dVar = (C3472d) fVar;
            if (C3468f.this.f8844e0.f8817h.mo9411d(longValue)) {
                C3468f.this.f8843d0.mo9413g(longValue);
                Iterator it = C3468f.this.f8891b0.iterator();
                while (it.hasNext()) {
                    ((C3488r) it.next()).mo9450a(C3468f.this.f8843d0.mo9416o());
                }
                C3468f.this.f8849j0.getAdapter().f778a.mo1183b();
                RecyclerView recyclerView = C3468f.this.f8848i0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f778a.mo1183b();
                }
            }
        }
    }
}
