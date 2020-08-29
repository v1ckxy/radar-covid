package p213q.p217b.p218a.p231b.p250f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C0195b;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0196a;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0197b;

/* renamed from: q.b.a.b.f.b */
public final class C2308b implements C0195b {
    /* renamed from: a */
    public final C0196a mo1540a(Context context, String str, C0197b bVar) {
        C0196a aVar = new C0196a();
        int a = bVar.mo1541a(context, str);
        aVar.f1103a = a;
        if (a != 0) {
            aVar.f1105c = -1;
        } else {
            int a2 = bVar.mo1542a(context, str, true);
            aVar.f1104b = a2;
            if (a2 != 0) {
                aVar.f1105c = 1;
            }
        }
        return aVar;
    }
}
