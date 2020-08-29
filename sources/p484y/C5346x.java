package p484y;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* renamed from: y.x */
public class C5346x extends C5347y<Object> {

    /* renamed from: a */
    public final /* synthetic */ C5347y f12645a;

    public C5346x(C5347y yVar) {
        this.f12645a = yVar;
    }

    /* renamed from: a */
    public void mo12059a(C5251a0 a0Var, @Nullable Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f12645a.mo12059a(a0Var, Array.get(obj, i));
            }
        }
    }
}
