package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;

/* renamed from: p.b.q.d */
public class C1160d extends AutoCompleteTextView {

    /* renamed from: g */
    public static final int[] f3241g = {16843126};

    /* renamed from: e */
    public final C1162e f3242e;

    /* renamed from: f */
    public final C1214v f3243f;

    public C1160d(Context context) {
        this(context, null);
    }

    public C1160d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.autoCompleteTextViewStyle);
    }

    public C1160d(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1213u0 a = C1213u0.m3013a(getContext(), attributeSet, f3241g, i, 0);
        if (a.mo5326f(0)) {
            setDropDownBackgroundDrawable(a.mo5318b(0));
        }
        a.f3426b.recycle();
        C1162e eVar = new C1162e(this);
        this.f3242e = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f3243f = vVar;
        vVar.mo5334a(attributeSet, i);
        this.f3243f.mo5328a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f3243f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1061o.m2461a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3242e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1214v vVar = this.f3243f;
        if (vVar != null) {
            vVar.mo5331a(context, i);
        }
    }
}
