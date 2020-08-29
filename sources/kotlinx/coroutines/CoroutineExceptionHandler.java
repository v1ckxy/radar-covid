package kotlinx.coroutines;

import p392u.p395p.C4583f;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;

public interface CoroutineExceptionHandler extends C4584a {

    /* renamed from: c */
    public static final C0886a f2460c = C0886a.f2461a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C0886a implements C4586b<CoroutineExceptionHandler> {

        /* renamed from: a */
        public static final /* synthetic */ C0886a f2461a = new C0886a();
    }

    void handleException(C4583f fVar, Throwable th);
}
