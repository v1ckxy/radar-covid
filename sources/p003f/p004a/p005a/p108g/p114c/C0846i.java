package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.SelectableGroupLinearLayout;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.i */
public final class C0846i extends SelectableGroupLinearLayout implements C0836c {

    /* renamed from: f */
    public C0857b f2419f;

    /* renamed from: f.a.a.g.c.i$a */
    public static final class C0847a extends LinearLayout {

        /* renamed from: e */
        public C0855a f2420e;

        /* renamed from: f */
        public HashMap f2421f;

        public /* synthetic */ C0847a(Context context, AttributeSet attributeSet, int i, int i2) {
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if (context != null) {
                super(context, attributeSet, i);
                LayoutInflater.from(context).inflate(R.layout.view_multiple_choice_item, this);
                ((RelativeLayout) mo3927a(C0699d.wrapperContent)).setOnClickListener(new C0845h(this));
                return;
            }
            C4638h.m10271a("context");
            throw null;
        }

        /* renamed from: a */
        public View mo3927a(int i) {
            if (this.f2421f == null) {
                this.f2421f = new HashMap();
            }
            View view = (View) this.f2421f.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View findViewById = findViewById(i);
            this.f2421f.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        public void setSelected(boolean z) {
            super.setSelected(z);
            ImageView imageView = (ImageView) mo3927a(C0699d.imageViewCheck);
            C4638h.m10270a((Object) imageView, "imageViewCheck");
            imageView.setVisibility(z ? 0 : 8);
            C0855a aVar = this.f2420e;
            if (aVar != null) {
                aVar.f2433g = z;
            }
        }
    }

    public /* synthetic */ C0846i(Context context, AttributeSet attributeSet, int i, int i2) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (context != null) {
            super(context, attributeSet, i);
            setOrientation(1);
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public final C0857b getQuestion() {
        return this.f2419f;
    }

    public C0857b getSelectedAnswers() {
        C0857b bVar = this.f2419f;
        if (bVar != null) {
            return bVar;
        }
        C0857b bVar2 = new C0857b(0, null, null, null, 0, 0, 0, 0, 255);
        return bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r4 != null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setQuestion(p003f.p004a.p005a.p108g.p114c.p115p.C0857b r9) {
        /*
            r8 = this;
            r8.f2419f = r9
            if (r9 == 0) goto L_0x006a
            f.a.a.g.c.p.b$b r0 = r9.f2435f
            f.a.a.g.c.p.b$b r1 = p003f.p004a.p005a.p108g.p114c.p115p.C0857b.C0859b.MULTIPLE_SELECTION
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000e
            r0 = r2
            goto L_0x000f
        L_0x000e:
            r0 = r3
        L_0x000f:
            r8.setAllowMultipleSelection(r0)
            java.util.List<f.a.a.g.c.p.a> r9 = r9.f2437h
            java.util.Iterator r9 = r9.iterator()
        L_0x0018:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r9.next()
            f.a.a.g.c.p.a r0 = (p003f.p004a.p005a.p108g.p114c.p115p.C0855a) r0
            f.a.a.g.c.i$a r1 = new f.a.a.g.c.i$a
            android.content.Context r4 = r8.getContext()
            java.lang.String r5 = "context"
            p392u.p401r.p403c.C4638h.m10270a(r4, r5)
            r5 = 6
            r6 = 0
            r1.<init>(r4, r6, r3, r5)
            r8.addView(r1)
            r1.f2420e = r0
            if (r0 == 0) goto L_0x0040
            java.lang.String r4 = r0.f2432f
            if (r4 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            java.lang.String r4 = ""
        L_0x0042:
            int r5 = p003f.p004a.p005a.C0699d.textViewAnswer
            android.view.View r5 = r1.mo3927a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r7 = "textViewAnswer"
            p392u.p401r.p403c.C4638h.m10270a(r5, r7)
            r5.setText(r4)
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.f2433g
            if (r0 != r2) goto L_0x0018
            android.view.ViewParent r0 = r1.getParent()
            boolean r4 = r0 instanceof p003f.p004a.p005a.p108g.p114c.C0854o
            if (r4 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r6 = r0
        L_0x0062:
            f.a.a.g.c.o r6 = (p003f.p004a.p005a.p108g.p114c.C0854o) r6
            if (r6 == 0) goto L_0x0018
            r6.mo3138a(r1)
            goto L_0x0018
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p108g.p114c.C0846i.setQuestion(f.a.a.g.c.p.b):void");
    }
}
