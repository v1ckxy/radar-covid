package p484y.p485i0.p487b;

import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p410v.C4725j0;
import p484y.C5280h;

/* renamed from: y.i0.b.d */
public final class C5296d implements C5280h<C4725j0, Character> {

    /* renamed from: a */
    public static final C5296d f12599a = new C5296d();

    /* renamed from: a */
    public Object mo11984a(Object obj) {
        String k = ((C4725j0) obj).mo11050k();
        if (k.length() == 1) {
            return Character.valueOf(k.charAt(0));
        }
        StringBuilder a = C1965a.m4756a("Expected body of length 1 for Character conversion but was ");
        a.append(k.length());
        throw new IOException(a.toString());
    }
}
