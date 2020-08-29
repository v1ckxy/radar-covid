package p425x.p426a.p445e.p447b.p455h;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* renamed from: x.a.e.b.h.z */
public class C5119z extends ObjectInputStream {

    /* renamed from: g */
    public static final Set f12284g;

    /* renamed from: e */
    public final Class f12285e;

    /* renamed from: f */
    public boolean f12286f = false;

    static {
        HashSet hashSet = new HashSet();
        f12284g = hashSet;
        hashSet.add("java.util.TreeMap");
        f12284g.add("java.lang.Integer");
        f12284g.add("java.lang.Number");
        f12284g.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        f12284g.add("java.util.ArrayList");
        f12284g.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        f12284g.add("[B");
        f12284g.add("java.util.LinkedList");
        f12284g.add("java.util.Stack");
        f12284g.add("java.util.Vector");
        f12284g.add("[Ljava.lang.Object;");
        f12284g.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public C5119z(Class cls, InputStream inputStream) {
        super(inputStream);
        this.f12285e = cls;
    }

    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        String str = "unexpected class: ";
        if (!this.f12286f) {
            if (objectStreamClass.getName().equals(this.f12285e.getName())) {
                this.f12286f = true;
            } else {
                throw new InvalidClassException(str, objectStreamClass.getName());
            }
        } else if (!f12284g.contains(objectStreamClass.getName())) {
            throw new InvalidClassException(str, objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
