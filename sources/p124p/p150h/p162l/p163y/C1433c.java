package p124p.p150h.p162l.p163y;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: p.h.l.y.c */
public class C1433c {

    /* renamed from: a */
    public final Object f4220a;

    /* renamed from: p.h.l.y.c$a */
    public static class C1434a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C1433c f4221a;

        public C1434a(C1433c cVar) {
            this.f4221a = cVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1429b a = this.f4221a.mo5957a(i);
            if (a == null) {
                return null;
            }
            return a.f4203a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (this.f4221a != null) {
                return null;
            }
            throw null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4221a.mo5958a(i, i2, bundle);
        }
    }

    /* renamed from: p.h.l.y.c$b */
    public static class C1435b extends C1434a {
        public C1435b(C1433c cVar) {
            super(cVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1429b b = this.f4221a.mo5959b(i);
            if (b == null) {
                return null;
            }
            return b.f4203a;
        }
    }

    public C1433c() {
        this.f4220a = new C1435b(this);
    }

    public C1433c(Object obj) {
        this.f4220a = obj;
    }

    /* renamed from: a */
    public C1429b mo5957a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo5958a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C1429b mo5959b(int i) {
        return null;
    }
}
