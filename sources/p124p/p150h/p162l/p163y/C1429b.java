package p124p.p150h.p162l.p163y;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p150h.p162l.p163y.C1436d.C1437a;
import p124p.p150h.p162l.p163y.C1436d.C1438b;
import p124p.p150h.p162l.p163y.C1436d.C1439c;
import p124p.p150h.p162l.p163y.C1436d.C1440d;
import p124p.p150h.p162l.p163y.C1436d.C1441e;
import p124p.p150h.p162l.p163y.C1436d.C1442f;
import p124p.p150h.p162l.p163y.C1436d.C1443g;
import p124p.p150h.p162l.p163y.C1436d.C1444h;

/* renamed from: p.h.l.y.b */
public class C1429b {

    /* renamed from: d */
    public static int f4202d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f4203a;

    /* renamed from: b */
    public int f4204b = -1;

    /* renamed from: c */
    public int f4205c = -1;

    /* renamed from: p.h.l.y.b$a */
    public static class C1430a {

        /* renamed from: e */
        public static final C1430a f4206e = new C1430a(16, null);

        /* renamed from: f */
        public static final C1430a f4207f = new C1430a(4096, null);

        /* renamed from: g */
        public static final C1430a f4208g = new C1430a(8192, null);

        /* renamed from: h */
        public static final C1430a f4209h = new C1430a(262144, null);

        /* renamed from: i */
        public static final C1430a f4210i = new C1430a(524288, null);

        /* renamed from: j */
        public static final C1430a f4211j = new C1430a(1048576, null);

        /* renamed from: k */
        public static final C1430a f4212k;

        /* renamed from: l */
        public static final C1430a f4213l;

        /* renamed from: a */
        public final Object f4214a;

        /* renamed from: b */
        public final int f4215b;

        /* renamed from: c */
        public final Class<? extends C1437a> f4216c;

        /* renamed from: d */
        public final C1436d f4217d;

        static {
            Class<C1439c> cls = C1439c.class;
            Class<C1438b> cls2 = C1438b.class;
            AccessibilityAction accessibilityAction = null;
            new C1430a(1, null);
            new C1430a(2, null);
            new C1430a(4, null);
            new C1430a(8, null);
            new C1430a(32, null);
            new C1430a(64, null);
            new C1430a(128, null);
            new C1430a(256, null, cls2);
            new C1430a(512, null, cls2);
            new C1430a(1024, null, cls);
            new C1430a(2048, null, cls);
            new C1430a(16384, null);
            new C1430a(32768, null);
            new C1430a(65536, null);
            new C1430a(131072, null, C1443g.class);
            new C1430a(2097152, null, C1444h.class);
            new C1430a(AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new C1430a(AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, C1441e.class);
            C1430a aVar = new C1430a(AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            f4212k = aVar;
            new C1430a(AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            C1430a aVar2 = new C1430a(AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            f4213l = aVar2;
            new C1430a(AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            new C1430a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C1430a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C1430a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C1430a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C1430a(AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            new C1430a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C1442f.class);
            new C1430a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C1440d.class);
            new C1430a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C1430a(accessibilityAction, 16908357, null, null, null);
        }

        public C1430a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public C1430a(int i, CharSequence charSequence, Class<? extends C1437a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public C1430a(Object obj, int i, CharSequence charSequence, C1436d dVar, Class<? extends C1437a> cls) {
            this.f4215b = i;
            this.f4217d = dVar;
            if (obj == null) {
                obj = new AccessibilityAction(i, charSequence);
            }
            this.f4214a = obj;
            this.f4216c = cls;
        }

        /* renamed from: a */
        public int mo5954a() {
            return ((AccessibilityAction) this.f4214a).getId();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1430a)) {
                return false;
            }
            C1430a aVar = (C1430a) obj;
            Object obj2 = this.f4214a;
            Object obj3 = aVar.f4214a;
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f4214a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: p.h.l.y.b$b */
    public static class C1431b {

        /* renamed from: a */
        public final Object f4218a;

        public C1431b(Object obj) {
            this.f4218a = obj;
        }
    }

    /* renamed from: p.h.l.y.b$c */
    public static class C1432c {

        /* renamed from: a */
        public final Object f4219a;

        public C1432c(Object obj) {
            this.f4219a = obj;
        }

        /* renamed from: a */
        public static C1432c m3642a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C1432c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public C1429b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4203a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static String m3630a(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: b */
    public static ClickableSpan[] m3631b(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public CharSequence mo5942a() {
        return this.f4203a.getContentDescription();
    }

    /* renamed from: a */
    public final List<Integer> mo5943a(String str) {
        ArrayList integerArrayList = this.f4203a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f4203a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo5944a(int i, boolean z) {
        Bundle b = mo5948b();
        if (b != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = b.getInt(str, 0) & (~i);
            if (!z) {
                i = 0;
            }
            b.putInt(str, i | i2);
        }
    }

    /* renamed from: a */
    public void mo5945a(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            this.f4203a.setHintText(charSequence);
        } else {
            this.f4203a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: a */
    public void mo5946a(Object obj) {
        this.f4203a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C1431b) obj).f4218a);
    }

    /* renamed from: a */
    public void mo5947a(C1430a aVar) {
        this.f4203a.addAction((AccessibilityAction) aVar.f4214a);
    }

    /* renamed from: b */
    public Bundle mo5948b() {
        return this.f4203a.getExtras();
    }

    /* renamed from: b */
    public void mo5949b(Object obj) {
        this.f4203a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C1432c) obj).f4219a);
    }

    /* renamed from: c */
    public CharSequence mo5950c() {
        String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
        if (!(!mo5943a(str).isEmpty())) {
            return this.f4203a.getText();
        }
        List a = mo5943a(str);
        List a2 = mo5943a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = mo5943a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = mo5943a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4203a.getText(), 0, this.f4203a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C1428a(((Integer) a4.get(i)).intValue(), this, mo5948b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
        }
        return spannableString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1429b)) {
            return false;
        }
        C1429b bVar = (C1429b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4203a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f4203a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f4203a)) {
            return false;
        }
        return this.f4205c == bVar.f4205c && this.f4204b == bVar.f4204b;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4203a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        List list;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f4203a.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.f4203a.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.f4203a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f4203a.getClassName());
        sb.append("; text: ");
        sb.append(mo5950c());
        sb.append("; contentDescription: ");
        sb.append(mo5942a());
        sb.append("; viewId: ");
        sb.append(this.f4203a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f4203a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f4203a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f4203a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f4203a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f4203a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f4203a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f4203a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f4203a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f4203a.isPassword());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(this.f4203a.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        List actionList = this.f4203a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                C1430a aVar = new C1430a(actionList.get(i), 0, null, null, null);
                arrayList.add(aVar);
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1430a aVar2 = (C1430a) list.get(i2);
            String a = m3630a(aVar2.mo5954a());
            if (a.equals("ACTION_UNKNOWN") && ((AccessibilityAction) aVar2.f4214a).getLabel() != null) {
                a = ((AccessibilityAction) aVar2.f4214a).getLabel().toString();
            }
            sb.append(a);
            if (i2 != list.size() - 1) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
