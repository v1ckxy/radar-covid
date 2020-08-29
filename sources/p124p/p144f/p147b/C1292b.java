package p124p.p144f.p147b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0064a;
import java.util.Arrays;
import p124p.p144f.p145a.p146h.C1278d;
import p124p.p144f.p145a.p146h.C1283h;

/* renamed from: p.f.b.b */
public abstract class C1292b extends View {

    /* renamed from: e */
    public int[] f3831e = new int[32];

    /* renamed from: f */
    public int f3832f;

    /* renamed from: g */
    public Context f3833g;

    /* renamed from: h */
    public C1283h f3834h;

    /* renamed from: i */
    public boolean f3835i = false;

    /* renamed from: j */
    public String f3836j;

    public C1292b(Context context) {
        super(context);
        this.f3833g = context;
        mo5736a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo5742a(str.substring(i));
                    return;
                } else {
                    mo5742a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5740a() {
        if (this.f3834h != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0064a) {
                ((C0064a) layoutParams).f475k0 = this.f3834h;
            }
        }
    }

    /* renamed from: a */
    public void mo5736a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1300h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1300h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3836j = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5741a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f3836j);
        }
        C1283h hVar = this.f3834h;
        if (hVar != null) {
            hVar.f3801l0 = 0;
            for (int i = 0; i < this.f3832f; i++) {
                View view = (View) constraintLayout.f413e.get(this.f3831e[i]);
                if (view != null) {
                    C1283h hVar2 = this.f3834h;
                    C1278d a = constraintLayout.mo562a(view);
                    int i2 = hVar2.f3801l0 + 1;
                    C1278d[] dVarArr = hVar2.f3800k0;
                    if (i2 > dVarArr.length) {
                        hVar2.f3800k0 = (C1278d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    }
                    C1278d[] dVarArr2 = hVar2.f3800k0;
                    int i3 = hVar2.f3801l0;
                    dVarArr2[i3] = a;
                    hVar2.f3801l0 = i3 + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5742a(String str) {
        int i;
        if (str != null && this.f3833g != null) {
            String trim = str.trim();
            try {
                i = C1299g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f3833g.getResources().getIdentifier(trim, "id", this.f3833g.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo560a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3831e, this.f3832f);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f3835i) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3832f = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f3832f + 1;
        int[] iArr = this.f3831e;
        if (i2 > iArr.length) {
            this.f3831e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3831e;
        int i3 = this.f3832f;
        iArr2[i3] = i;
        this.f3832f = i3 + 1;
    }
}
