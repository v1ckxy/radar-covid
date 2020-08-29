package p484y;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p410v.C4706e0;
import p484y.C5268e.C5269a;

/* renamed from: y.i */
public final class C5286i extends C5269a {
    @Nullable

    /* renamed from: a */
    public final Executor f12581a;

    /* renamed from: y.i$a */
    public class C5287a implements C5268e<Object, C5264d<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f12582a;

        /* renamed from: b */
        public final /* synthetic */ Executor f12583b;

        public C5287a(C5286i iVar, Type type, Executor executor) {
            this.f12582a = type;
            this.f12583b = executor;
        }

        /* renamed from: a */
        public Object mo12003a(C5264d dVar) {
            Executor executor = this.f12583b;
            return executor == null ? dVar : new C5288b(executor, dVar);
        }

        /* renamed from: a */
        public Type mo12004a() {
            return this.f12582a;
        }
    }

    /* renamed from: y.i$b */
    public static final class C5288b<T> implements C5264d<T> {

        /* renamed from: e */
        public final Executor f12584e;

        /* renamed from: f */
        public final C5264d<T> f12585f;

        /* renamed from: y.i$b$a */
        public class C5289a implements C5271f<T> {

            /* renamed from: a */
            public final /* synthetic */ C5271f f12586a;

            public C5289a(C5271f fVar) {
                this.f12586a = fVar;
            }

            /* renamed from: a */
            public void mo11952a(C5264d<T> dVar, Throwable th) {
                C5288b.this.f12584e.execute(new C5253b(this, this.f12586a, th));
            }

            /* renamed from: a */
            public void mo11953a(C5264d<T> dVar, C5263c0<T> c0Var) {
                C5288b.this.f12584e.execute(new C5250a(this, this.f12586a, c0Var));
            }

            /* renamed from: a */
            public /* synthetic */ void mo12026a(C5271f fVar, Throwable th) {
                fVar.mo11952a((C5264d<T>) C5288b.this, th);
            }

            /* renamed from: a */
            public /* synthetic */ void mo12027a(C5271f fVar, C5263c0 c0Var) {
                if (C5288b.this.f12585f.mo11992h()) {
                    fVar.mo11952a((C5264d<T>) C5288b.this, (Throwable) new IOException("Canceled"));
                } else {
                    fVar.mo11953a((C5264d<T>) C5288b.this, c0Var);
                }
            }
        }

        public C5288b(Executor executor, C5264d<T> dVar) {
            this.f12584e = executor;
            this.f12585f = dVar;
        }

        /* renamed from: a */
        public void mo11987a(C5271f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f12585f.mo11987a(new C5289a(fVar));
        }

        public void cancel() {
            this.f12585f.cancel();
        }

        public Object clone() {
            return new C5288b(this.f12584e, this.f12585f.clone());
        }

        /* renamed from: clone reason: collision with other method in class */
        public C5264d<T> m11855clone() {
            return new C5288b(this.f12584e, this.f12585f.clone());
        }

        /* renamed from: f */
        public C5263c0<T> mo11990f() {
            return this.f12585f.mo11990f();
        }

        /* renamed from: g */
        public C4706e0 mo11991g() {
            return this.f12585f.mo11991g();
        }

        /* renamed from: h */
        public boolean mo11992h() {
            return this.f12585f.mo11992h();
        }
    }

    public C5286i(@Nullable Executor executor) {
        this.f12581a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C5268e<?, ?> mo12005a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        Executor executor = null;
        if (C5282h0.m11767b(type) != C5264d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C5282h0.m11759a(0, (ParameterizedType) type);
            if (!C5282h0.m11766a(annotationArr, C5272f0.class)) {
                executor = this.f12581a;
            }
            return new C5287a(this, a, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
