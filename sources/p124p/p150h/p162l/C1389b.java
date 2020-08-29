package p124p.p150h.p162l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import p124p.p126b.p134p.p135i.C1120j.C1121a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.l.b */
public abstract class C1389b {

    /* renamed from: a */
    public C1390a f4149a;

    /* renamed from: p.h.l.b$a */
    public interface C1390a {
    }

    public C1389b(Context context) {
    }

    /* renamed from: a */
    public View mo4952a(MenuItem menuItem) {
        return ((C1121a) this).f3133b.onCreateActionView();
    }

    /* renamed from: a */
    public void mo4953a(C1390a aVar) {
        if (!(this.f4149a == null || aVar == null)) {
            StringBuilder a = C1965a.m4756a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            a.append(getClass().getSimpleName());
            a.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", a.toString());
        }
        this.f4149a = aVar;
    }

    /* renamed from: a */
    public boolean mo4954a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo4955b() {
        return false;
    }
}
