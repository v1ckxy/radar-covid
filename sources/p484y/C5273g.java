package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p484y.C5268e.C5269a;

@IgnoreJRERequirement
/* renamed from: y.g */
public final class C5273g extends C5269a {

    /* renamed from: a */
    public static final C5269a f12567a = new C5273g();

    @IgnoreJRERequirement
    /* renamed from: y.g$a */
    public static final class C5274a<R> implements C5268e<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f12568a;

        @IgnoreJRERequirement
        /* renamed from: y.g$a$a */
        public class C5275a implements C5271f<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f12569a;

            public C5275a(C5274a aVar, CompletableFuture<R> completableFuture) {
                this.f12569a = completableFuture;
            }

            /* renamed from: a */
            public void mo11952a(C5264d<R> dVar, Throwable th) {
                this.f12569a.completeExceptionally(th);
            }

            /* renamed from: a */
            public void mo11953a(C5264d<R> dVar, C5263c0<R> c0Var) {
                if (c0Var.mo11985a()) {
                    this.f12569a.complete(c0Var.f12550b);
                } else {
                    this.f12569a.completeExceptionally(new C5304j(c0Var));
                }
            }
        }

        public C5274a(Type type) {
            this.f12568a = type;
        }

        /* renamed from: a */
        public Object mo12003a(C5264d dVar) {
            C5276b bVar = new C5276b(dVar);
            dVar.mo11987a(new C5275a(this, bVar));
            return bVar;
        }

        /* renamed from: a */
        public Type mo12004a() {
            return this.f12568a;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: y.g$b */
    public static final class C5276b<T> extends CompletableFuture<T> {

        /* renamed from: e */
        public final C5264d<?> f12570e;

        public C5276b(C5264d<?> dVar) {
            this.f12570e = dVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f12570e.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: y.g$c */
    public static final class C5277c<R> implements C5268e<R, CompletableFuture<C5263c0<R>>> {

        /* renamed from: a */
        public final Type f12571a;

        @IgnoreJRERequirement
        /* renamed from: y.g$c$a */
        public class C5278a implements C5271f<R> {

            /* renamed from: a */
            public final CompletableFuture<C5263c0<R>> f12572a;

            public C5278a(C5277c cVar, CompletableFuture<C5263c0<R>> completableFuture) {
                this.f12572a = completableFuture;
            }

            /* renamed from: a */
            public void mo11952a(C5264d<R> dVar, Throwable th) {
                this.f12572a.completeExceptionally(th);
            }

            /* renamed from: a */
            public void mo11953a(C5264d<R> dVar, C5263c0<R> c0Var) {
                this.f12572a.complete(c0Var);
            }
        }

        public C5277c(Type type) {
            this.f12571a = type;
        }

        /* renamed from: a */
        public Object mo12003a(C5264d dVar) {
            C5276b bVar = new C5276b(dVar);
            dVar.mo11987a(new C5278a(this, bVar));
            return bVar;
        }

        /* renamed from: a */
        public Type mo12004a() {
            return this.f12571a;
        }
    }

    @Nullable
    /* renamed from: a */
    public C5268e<?, ?> mo12005a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        if (C5282h0.m11767b(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C5282h0.m11759a(0, (ParameterizedType) type);
            if (C5282h0.m11767b(a) != C5263c0.class) {
                return new C5274a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C5277c(C5282h0.m11759a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
