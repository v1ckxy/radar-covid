package p124p.p150h.p162l;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p124p.p150h.C1307b;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p124p.p150h.p162l.p163y.C1433c;

/* renamed from: p.h.l.a */
public class C1387a {

    /* renamed from: c */
    public static final AccessibilityDelegate f4145c = new AccessibilityDelegate();

    /* renamed from: a */
    public final AccessibilityDelegate f4146a;

    /* renamed from: b */
    public final AccessibilityDelegate f4147b;

    /* renamed from: p.h.l.a$a */
    public static final class C1388a extends AccessibilityDelegate {

        /* renamed from: a */
        public final C1387a f4148a;

        public C1388a(C1387a aVar) {
            this.f4148a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4148a.mo5869a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1433c a = this.f4148a.mo5867a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.f4220a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4148a.mo770b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            View view2 = view;
            C1429b bVar = new C1429b(accessibilityNodeInfo);
            boolean A = C1404o.m3506A(view);
            if (VERSION.SDK_INT >= 28) {
                bVar.f4203a.setScreenReaderFocusable(A);
            } else {
                bVar.mo5944a(1, A);
            }
            Boolean bool = (Boolean) new C1411r(C1307b.tag_accessibility_heading, Boolean.class, 28).mo5905b(view2);
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (VERSION.SDK_INT >= 28) {
                bVar.f4203a.setHeading(booleanValue);
            } else {
                bVar.mo5944a(2, booleanValue);
            }
            CharSequence charSequence = (CharSequence) new C1410q(C1307b.tag_accessibility_pane_title, CharSequence.class, 8, 28).mo5905b(view2);
            if (VERSION.SDK_INT >= 28) {
                bVar.f4203a.setPaneTitle(charSequence);
            } else {
                bVar.f4203a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            this.f4148a.mo768a(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (VERSION.SDK_INT < 26) {
                String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
                bVar.f4203a.getExtras().remove(str);
                String str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
                bVar.f4203a.getExtras().remove(str2);
                String str3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
                bVar.f4203a.getExtras().remove(str3);
                String str4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
                bVar.f4203a.getExtras().remove(str4);
                SparseArray sparseArray = (SparseArray) view2.getTag(C1307b.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] b = C1429b.m3631b(text);
                if (b != null && b.length > 0) {
                    bVar.mo5948b().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C1307b.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(C1307b.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(C1307b.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i4 = 0; i4 < b.length; i4++) {
                        ClickableSpan clickableSpan = b[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = C1429b.f4202d;
                                C1429b.f4202d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(b[i4]));
                        ClickableSpan clickableSpan2 = b[i4];
                        Spanned spanned = (Spanned) text;
                        bVar.mo5943a(str).add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.mo5943a(str2).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.mo5943a(str3).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.mo5943a(str4).add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view2.getTag(C1307b.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                bVar.mo5947a((C1430a) list.get(i6));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4148a.mo5871c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4148a.mo5870a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f4148a.mo769a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f4148a.mo5868a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4148a.mo5872d(view, accessibilityEvent);
        }
    }

    public C1387a() {
        this.f4146a = f4145c;
        this.f4147b = new C1388a(this);
    }

    public C1387a(AccessibilityDelegate accessibilityDelegate) {
        this.f4146a = accessibilityDelegate;
        this.f4147b = new C1388a(this);
    }

    /* renamed from: a */
    public C1433c mo5867a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4146a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1433c(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: a */
    public void mo5868a(View view, int i) {
        this.f4146a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo768a(View view, C1429b bVar) {
        this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
    }

    /* renamed from: a */
    public boolean mo5869a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4146a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo5870a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4146a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
        this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo5871c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4146a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo5872d(View view, AccessibilityEvent accessibilityEvent) {
        this.f4146a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo769a(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            int r0 = p124p.p150h.C1307b.tag_accessibility_actions
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000e
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000e:
            r1 = 0
            r2 = r1
        L_0x0010:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x006f
            java.lang.Object r3 = r0.get(r2)
            p.h.l.y.b$a r3 = (p124p.p150h.p162l.p163y.C1429b.C1430a) r3
            int r4 = r3.mo5954a()
            if (r4 != r10) goto L_0x006c
            p.h.l.y.d r0 = r3.f4217d
            if (r0 == 0) goto L_0x006f
            java.lang.Class<? extends p.h.l.y.d$a> r0 = r3.f4216c
            r2 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003f }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x003f }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003f }
            java.lang.Object r0 = r0.newInstance(r4)     // Catch:{ Exception -> 0x003f }
            p.h.l.y.d$a r0 = (p124p.p150h.p162l.p163y.C1436d.C1437a) r0     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003c
            goto L_0x0064
        L_0x003c:
            throw r2     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r2 = move-exception
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0043:
            java.lang.Class<? extends p.h.l.y.d$a> r4 = r3.f4216c
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = "null"
            goto L_0x004e
        L_0x004a:
            java.lang.String r4 = r4.getName()
        L_0x004e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r2)
        L_0x0064:
            r2 = r0
        L_0x0065:
            p.h.l.y.d r0 = r3.f4217d
            boolean r0 = r0.mo1431a(r9, r2)
            goto L_0x0070
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x006f:
            r0 = r1
        L_0x0070:
            if (r0 != 0) goto L_0x0078
            android.view.View$AccessibilityDelegate r0 = r8.f4146a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L_0x0078:
            if (r0 != 0) goto L_0x00c7
            int r2 = p124p.p150h.C1307b.accessibility_action_clickable_span
            if (r10 != r2) goto L_0x00c7
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            int r11 = p124p.p150h.C1307b.tag_accessibility_clickable_spans
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00c6
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00c6
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00bf
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = p124p.p150h.p162l.p163y.C1429b.m3631b(r11)
            r2 = r1
        L_0x00ad:
            if (r11 == 0) goto L_0x00bf
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00bf
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00bc
            r11 = r0
            goto L_0x00c0
        L_0x00bc:
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00bf:
            r11 = r1
        L_0x00c0:
            if (r11 == 0) goto L_0x00c6
            r10.onClick(r9)
            r1 = r0
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p162l.C1387a.mo769a(android.view.View, int, android.os.Bundle):boolean");
    }
}
