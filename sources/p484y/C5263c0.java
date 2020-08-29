package p484y;

import java.util.Objects;
import javax.annotation.Nullable;
import p410v.C4720i0;
import p410v.C4725j0;

/* renamed from: y.c0 */
public final class C5263c0<T> {

    /* renamed from: a */
    public final C4720i0 f12549a;
    @Nullable

    /* renamed from: b */
    public final T f12550b;
    @Nullable

    /* renamed from: c */
    public final C4725j0 f12551c;

    public C5263c0(C4720i0 i0Var, @Nullable T t, @Nullable C4725j0 j0Var) {
        this.f12549a = i0Var;
        this.f12550b = t;
        this.f12551c = j0Var;
    }

    /* renamed from: a */
    public static <T> C5263c0<T> m11721a(@Nullable T t, C4720i0 i0Var) {
        Objects.requireNonNull(i0Var, "rawResponse == null");
        if (i0Var.mo11034f()) {
            return new C5263c0<>(i0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public boolean mo11985a() {
        return this.f12549a.mo11034f();
    }

    public String toString() {
        return this.f12549a.toString();
    }
}
