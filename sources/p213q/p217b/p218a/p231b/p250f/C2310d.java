package p213q.p217b.p218a.p231b.p250f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C0195b;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0196a;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0197b;

/* renamed from: q.b.a.b.f.d */
public final class C2310d implements C0195b {
    /* renamed from: a */
    public final C0196a mo1540a(Context context, String str, C0197b bVar) {
        int i;
        C0196a aVar = new C0196a();
        aVar.f1103a = bVar.mo1541a(context, str);
        int a = bVar.mo1542a(context, str, true);
        aVar.f1104b = a;
        if (aVar.f1103a == 0 && a == 0) {
            i = 0;
        } else if (aVar.f1104b >= aVar.f1103a) {
            aVar.f1105c = 1;
            return aVar;
        } else {
            i = -1;
        }
        aVar.f1105c = i;
        return aVar;
    }
}
