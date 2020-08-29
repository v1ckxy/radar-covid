package p213q.p217b.p218a.p231b.p250f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C0195b;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0196a;
import com.google.android.gms.dynamite.DynamiteModule.C0195b.C0197b;

/* renamed from: q.b.a.b.f.c */
public final class C2309c implements C0195b {
    /* renamed from: a */
    public final C0196a mo1540a(Context context, String str, C0197b bVar) {
        C0196a aVar = new C0196a();
        int a = bVar.mo1541a(context, str);
        aVar.f1103a = a;
        aVar.f1104b = a != 0 ? bVar.mo1542a(context, str, false) : bVar.mo1542a(context, str, true);
        if (aVar.f1103a == 0 && aVar.f1104b == 0) {
            aVar.f1105c = 0;
        } else if (aVar.f1103a >= aVar.f1104b) {
            aVar.f1105c = -1;
        } else {
            aVar.f1105c = 1;
        }
        return aVar;
    }
}
