package p124p.p180p.p181d;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import java.util.Map;
import java.util.WeakHashMap;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1433c;

/* renamed from: p.p.d.v */
public class C1609v extends C1387a {

    /* renamed from: d */
    public final RecyclerView f4735d;

    /* renamed from: e */
    public final C1610a f4736e;

    /* renamed from: p.p.d.v$a */
    public static class C1610a extends C1387a {

        /* renamed from: d */
        public final C1609v f4737d;

        /* renamed from: e */
        public Map<View, C1387a> f4738e = new WeakHashMap();

        public C1610a(C1609v vVar) {
            this.f4737d = vVar;
        }

        /* renamed from: a */
        public C1433c mo5867a(View view) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            return aVar != null ? aVar.mo5867a(view) : super.mo5867a(view);
        }

        /* renamed from: a */
        public boolean mo5869a(View view, AccessibilityEvent accessibilityEvent) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            return aVar != null ? aVar.mo5869a(view, accessibilityEvent) : this.f4146a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            if (aVar != null) {
                aVar.mo770b(view, accessibilityEvent);
            } else {
                this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: c */
        public void mo5871c(View view, AccessibilityEvent accessibilityEvent) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            if (aVar != null) {
                aVar.mo5871c(view, accessibilityEvent);
            } else {
                this.f4146a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: d */
        public void mo5872d(View view, AccessibilityEvent accessibilityEvent) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            if (aVar != null) {
                aVar.mo5872d(view, accessibilityEvent);
            } else {
                this.f4146a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            if (!this.f4737d.mo6374a() && this.f4737d.f4735d.getLayoutManager() != null) {
                this.f4737d.f4735d.getLayoutManager().mo1204a(view, bVar);
                C1387a aVar = (C1387a) this.f4738e.get(view);
                if (aVar != null) {
                    aVar.mo768a(view, bVar);
                    return;
                }
            }
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
        }

        /* renamed from: a */
        public boolean mo5870a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1387a aVar = (C1387a) this.f4738e.get(viewGroup);
            return aVar != null ? aVar.mo5870a(viewGroup, view, accessibilityEvent) : this.f4146a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo769a(View view, int i, Bundle bundle) {
            if (this.f4737d.mo6374a() || this.f4737d.f4735d.getLayoutManager() == null) {
                return super.mo769a(view, i, bundle);
            }
            C1387a aVar = (C1387a) this.f4738e.get(view);
            if (aVar != null) {
                if (aVar.mo769a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo769a(view, i, bundle)) {
                return true;
            }
            C0132v vVar = this.f4737d.f4735d.getLayoutManager().f795b.mRecycler;
            return false;
        }

        /* renamed from: a */
        public void mo5868a(View view, int i) {
            C1387a aVar = (C1387a) this.f4738e.get(view);
            if (aVar != null) {
                aVar.mo5868a(view, i);
            } else {
                this.f4146a.sendAccessibilityEvent(view, i);
            }
        }
    }

    public C1609v(RecyclerView recyclerView) {
        this.f4735d = recyclerView;
        C1610a aVar = this.f4736e;
        if (aVar == null) {
            aVar = new C1610a(this);
        }
        this.f4736e = aVar;
    }

    /* renamed from: a */
    public void mo768a(View view, C1429b bVar) {
        this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
        if (!mo6374a() && this.f4735d.getLayoutManager() != null) {
            C0120o layoutManager = this.f4735d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f795b;
            layoutManager.mo1208a(recyclerView.mRecycler, recyclerView.mState, bVar);
        }
    }

    /* renamed from: a */
    public boolean mo6374a() {
        return this.f4735d.hasPendingAdapterUpdates();
    }

    /* renamed from: b */
    public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
        this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo6374a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo894a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public boolean mo769a(View view, int i, Bundle bundle) {
        if (super.mo769a(view, i, bundle)) {
            return true;
        }
        if (mo6374a() || this.f4735d.getLayoutManager() == null) {
            return false;
        }
        C0120o layoutManager = this.f4735d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f795b;
        return layoutManager.mo1211a(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }
}
