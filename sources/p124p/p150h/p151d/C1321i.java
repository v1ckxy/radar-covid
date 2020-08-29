package p124p.p150h.p151d;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: p.h.d.i */
public class C1321i {

    /* renamed from: a */
    public static final Object f4013a = new Object();

    /* renamed from: a */
    public static Bundle m3370a(C1317e eVar) {
        Bundle bundle = new Bundle();
        IconCompat a = eVar.mo5783a();
        bundle.putInt("icon", a != null ? a.mo685a() : 0);
        bundle.putCharSequence("title", eVar.f3965j);
        bundle.putParcelable("actionIntent", eVar.f3966k);
        Bundle bundle2 = eVar.f3956a != null ? new Bundle(eVar.f3956a) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", eVar.f3960e);
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m3371a(eVar.f3958c));
        bundle.putBoolean("showsUserInterface", eVar.f3961f);
        bundle.putInt("semanticAction", eVar.f3962g);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle[] m3371a(C1322j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jVarArr.length];
        if (jVarArr.length <= 0) {
            return bundleArr;
        }
        C1322j jVar = jVarArr[0];
        new Bundle();
        throw null;
    }
}
