package p003f.p004a.p005a.p012b.p050g.p051a;

import p002es.gob.radarcovid.features.locale.view.LocaleSelectionFragment;
import p003f.p004a.p005a.p012b.p050g.p053c.C0582c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.a.d */
public final class C0577d implements C4427b<C0582c> {

    /* renamed from: a */
    public final C0574a f2003a;

    /* renamed from: b */
    public final C4547a<LocaleSelectionFragment> f2004b;

    public C0577d(C0574a aVar, C4547a<LocaleSelectionFragment> aVar2) {
        this.f2003a = aVar;
        this.f2004b = aVar2;
    }

    public Object get() {
        LocaleSelectionFragment localeSelectionFragment = (LocaleSelectionFragment) this.f2004b.get();
        if (this.f2003a == null) {
            throw null;
        } else if (localeSelectionFragment != null) {
            C2286e.m5279b(localeSelectionFragment, "Cannot return null from a non-@Nullable @Provides method");
            return localeSelectionFragment;
        } else {
            C4638h.m10271a("fragment");
            throw null;
        }
    }
}
