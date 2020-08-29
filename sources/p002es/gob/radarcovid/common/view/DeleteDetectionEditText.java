package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p124p.p126b.p136q.C1181j;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.DeleteDetectionEditText */
public final class DeleteDetectionEditText extends C1181j {

    /* renamed from: h */
    public C4607a<C4560l> f1720h;

    /* renamed from: es.gob.radarcovid.common.view.DeleteDetectionEditText$a */
    public final class C0391a extends InputConnectionWrapper {
        public C0391a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    C4607a onDeleteButtonClickListener = DeleteDetectionEditText.this.getOnDeleteButtonClickListener();
                    if (onDeleteButtonClickListener != null) {
                        C4560l lVar = (C4560l) onDeleteButtonClickListener.mo3123c();
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }
            C4638h.m10271a("event");
            throw null;
        }
    }

    public DeleteDetectionEditText(Context context) {
        super(context);
    }

    public DeleteDetectionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeleteDetectionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final C4607a<C4560l> getOnDeleteButtonClickListener() {
        return this.f1720h;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C0391a(super.onCreateInputConnection(editorInfo), true);
    }

    public final void setOnDeleteButtonClickListener(C4607a<C4560l> aVar) {
        this.f1720h = aVar;
    }
}
