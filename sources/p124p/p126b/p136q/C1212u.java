package p124p.p126b.p136q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: p.b.q.u */
public final class C1212u {

    /* renamed from: a */
    public TextView f3423a;

    /* renamed from: b */
    public TextClassifier f3424b;

    public C1212u(TextView textView) {
        if (textView != null) {
            this.f3423a = textView;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public TextClassifier mo5311a() {
        TextClassifier textClassifier = this.f3424b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f3423a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
