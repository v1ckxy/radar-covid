package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1061o;

/* renamed from: p.b.q.j */
public class C1181j extends EditText {

    /* renamed from: e */
    public final C1162e f3334e;

    /* renamed from: f */
    public final C1214v f3335f;

    /* renamed from: g */
    public final C1212u f3336g;

    public C1181j(Context context) {
        this(context, null);
    }

    public C1181j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.editTextStyle);
    }

    public C1181j(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f3334e = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f3335f = vVar;
        vVar.mo5334a(attributeSet, i);
        this.f3335f.mo5328a();
        this.f3336g = new C1212u(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f3335f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public Editable getText() {
        return VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C1212u uVar = this.f3336g;
            if (uVar != null) {
                return uVar.mo5311a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1061o.m2461a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3334e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1214v vVar = this.f3335f;
        if (vVar != null) {
            vVar.mo5331a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C1212u uVar = this.f3336g;
            if (uVar != null) {
                uVar.f3424b = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
}
