package p119o.p120a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineExceptionHandler.C0886a;
import p392u.C4560l;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4618l;

/* renamed from: o.a.a1 */
public interface C0916a1 extends C4584a {

    /* renamed from: d */
    public static final C0917a f2512d = C0917a.f2513a;

    /* renamed from: o.a.a1$a */
    public static final class C0917a implements C4586b<C0916a1> {

        /* renamed from: a */
        public static final /* synthetic */ C0917a f2513a = new C0917a();

        static {
            C0886a aVar = CoroutineExceptionHandler.f2460c;
        }
    }

    /* renamed from: a */
    C0949k0 mo4206a(boolean z, boolean z2, C4618l<? super Throwable, C4560l> lVar);

    /* renamed from: a */
    C0954m mo4207a(C0962o oVar);

    /* renamed from: a */
    boolean mo4208a();

    /* renamed from: h */
    CancellationException mo4209h();

    boolean start();
}
