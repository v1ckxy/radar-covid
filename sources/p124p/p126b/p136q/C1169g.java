package p124p.p126b.p136q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;

/* renamed from: p.b.q.g */
public class C1169g extends CheckedTextView {

    /* renamed from: f */
    public static final int[] f3280f = {16843016};

    /* renamed from: e */
    public final C1214v f3281e;

    public C1169g(Context context, AttributeSet attributeSet) {
        C1207r0.m3007a(context);
        super(context, attributeSet, 16843720);
        C1214v vVar = new C1214v(this);
        this.f3281e = vVar;
        vVar.mo5334a(attributeSet, 16843720);
        this.f3281e.mo5328a();
        C1213u0 a = C1213u0.m3013a(getContext(), attributeSet, f3280f, 16843720, 0);
        setCheckMarkDrawable(a.mo5318b(0));
        a.f3426b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1214v vVar = this.f3281e;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1061o.m2461a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1214v vVar = this.f3281e;
        if (vVar != null) {
            vVar.mo5331a(context, i);
        }
    }
}
