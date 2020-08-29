package p124p.p199y;

import android.annotation.SuppressLint;

/* renamed from: p.y.o */
public interface C1805o {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C1810c f5287a = new C1810c(null);
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C1809b f5288b = new C1809b(null);

    /* renamed from: p.y.o$b */
    public static abstract class C1807b {

        /* renamed from: p.y.o$b$a */
        public static final class C1808a extends C1807b {

            /* renamed from: a */
            public final Throwable f5289a;

            public C1808a(Throwable th) {
                this.f5289a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f5289a.getMessage()});
            }
        }

        /* renamed from: p.y.o$b$b */
        public static final class C1809b extends C1807b {
            public /* synthetic */ C1809b(C1806a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: p.y.o$b$c */
        public static final class C1810c extends C1807b {
            public C1810c() {
            }

            public /* synthetic */ C1810c(C1806a aVar) {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
