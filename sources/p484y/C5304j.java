package p484y;

import java.util.Objects;

/* renamed from: y.j */
public class C5304j extends RuntimeException {
    public C5304j(C5263c0<?> c0Var) {
        Objects.requireNonNull(c0Var, "response == null");
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(c0Var.f12549a.f11063i);
        sb.append(" ");
        sb.append(c0Var.f12549a.f11062h);
        super(sb.toString());
        int i = c0Var.f12549a.f11063i;
    }
}
