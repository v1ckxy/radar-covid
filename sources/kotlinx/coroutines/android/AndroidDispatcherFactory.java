package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p119o.p120a.C0944i1;
import p119o.p120a.p122t1.C0982a;
import p119o.p120a.p122t1.C0984c;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    /* renamed from: a */
    public String mo4164a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: a */
    public C0944i1 mo4165a(List list) {
        return new C0982a(C0984c.m2261a(Looper.getMainLooper(), true), "Main", false);
    }

    /* renamed from: b */
    public int mo4166b() {
        return 1073741823;
    }
}
