package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.SelectableGroupLinearLayout;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p124p.p150h.p152e.C1325a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.m */
public final class C0851m extends SelectableGroupLinearLayout implements C0836c {

    /* renamed from: f */
    public C0857b f2427f;

    /* renamed from: g */
    public HashMap f2428g;

    /* renamed from: f.a.a.g.c.m$a */
    public static final class C0852a extends FrameLayout {

        /* renamed from: e */
        public C0855a f2429e;

        /* renamed from: f */
        public HashMap f2430f;

        public /* synthetic */ C0852a(Context context, AttributeSet attributeSet, int i, int i2) {
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if (context != null) {
                super(context, attributeSet, i);
                LayoutInflater.from(context).inflate(R.layout.view_rate_item, this);
                LayoutParams layoutParams = new LayoutParams(0, context.getResources().getDimensionPixelSize(R.dimen.rate_item_height), 1.0f);
                layoutParams.gravity = 17;
                setLayoutParams(layoutParams);
                setBackgroundResource(R.drawable.selector_rate_view_mid);
                setOnClickListener(new C0850l(this));
                return;
            }
            C4638h.m10271a("context");
            throw null;
        }

        /* renamed from: a */
        public View mo3940a(int i) {
            if (this.f2430f == null) {
                this.f2430f = new HashMap();
            }
            View view = (View) this.f2430f.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View findViewById = findViewById(i);
            this.f2430f.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        public void setSelected(boolean z) {
            super.setSelected(z);
            ((TextView) mo3940a(C0699d.textViewRate)).setTextColor(C1325a.m3373a(getContext(), z ? R.color.white : R.color.black_26));
            C0855a aVar = this.f2429e;
            if (aVar != null) {
                aVar.f2433g = z;
            }
        }
    }

    public /* synthetic */ C0851m(Context context, AttributeSet attributeSet, int i, int i2) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (context != null) {
            super(context, attributeSet, i);
            LayoutInflater.from(context).inflate(R.layout.view_rate, this);
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public final C0857b getQuestion() {
        return this.f2427f;
    }

    public C0857b getSelectedAnswers() {
        C0857b bVar = this.f2427f;
        if (bVar != null) {
            return bVar;
        }
        C0857b bVar2 = new C0857b(0, null, null, null, 0, 0, 0, 0, 255);
        return bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r2 != null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setQuestion(p003f.p004a.p005a.p108g.p114c.p115p.C0857b r11) {
        /*
            r10 = this;
            r10.f2427f = r11
            if (r11 == 0) goto L_0x00ad
            java.util.List<f.a.a.g.c.p.a> r0 = r11.f2437h
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L_0x000c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            r5 = 0
            if (r2 < 0) goto L_0x00a9
            f.a.a.g.c.p.a r3 = (p003f.p004a.p005a.p108g.p114c.p115p.C0855a) r3
            f.a.a.g.c.m$a r6 = new f.a.a.g.c.m$a
            android.content.Context r7 = r10.getContext()
            java.lang.String r8 = "context"
            p392u.p401r.p403c.C4638h.m10270a(r7, r8)
            r8 = 6
            r6.<init>(r7, r5, r1, r8)
            r7 = 1
            if (r2 != 0) goto L_0x0036
            r2 = 2131165421(0x7f0700ed, float:1.7945059E38)
        L_0x0032:
            r6.setBackgroundResource(r2)
            goto L_0x0047
        L_0x0036:
            java.util.List<f.a.a.g.c.p.a> r8 = r11.f2437h
            int r8 = r8.size()
            int r8 = r8 - r7
            if (r2 != r8) goto L_0x0043
            r2 = 2131165419(0x7f0700eb, float:1.7945055E38)
            goto L_0x0032
        L_0x0043:
            r2 = 2131165420(0x7f0700ec, float:1.7945057E38)
            goto L_0x0032
        L_0x0047:
            int r2 = p003f.p004a.p005a.C0699d.wrapperContent
            java.util.HashMap r8 = r10.f2428g
            if (r8 != 0) goto L_0x0054
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r10.f2428g = r8
        L_0x0054:
            java.util.HashMap r8 = r10.f2428g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.get(r9)
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L_0x006f
            android.view.View r8 = r10.findViewById(r2)
            java.util.HashMap r9 = r10.f2428g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.put(r2, r8)
        L_0x006f:
            es.gob.radarcovid.common.view.SelectableGroupLinearLayout r8 = (p002es.gob.radarcovid.common.view.SelectableGroupLinearLayout) r8
            r8.addView(r6)
            r6.f2429e = r3
            if (r3 == 0) goto L_0x007d
            java.lang.String r2 = r3.f2432f
            if (r2 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            java.lang.String r2 = ""
        L_0x007f:
            int r8 = p003f.p004a.p005a.C0699d.textViewRate
            android.view.View r8 = r6.mo3940a(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = "textViewRate"
            p392u.p401r.p403c.C4638h.m10270a(r8, r9)
            r8.setText(r2)
            if (r3 == 0) goto L_0x00a6
            boolean r2 = r3.f2433g
            if (r2 != r7) goto L_0x00a6
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof p003f.p004a.p005a.p108g.p114c.C0854o
            if (r3 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r5 = r2
        L_0x009f:
            f.a.a.g.c.o r5 = (p003f.p004a.p005a.p108g.p114c.C0854o) r5
            if (r5 == 0) goto L_0x00a6
            r5.mo3138a(r6)
        L_0x00a6:
            r2 = r4
            goto L_0x000c
        L_0x00a9:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5338f()
            throw r5
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p108g.p114c.C0851m.setQuestion(f.a.a.g.c.p.b):void");
    }
}
