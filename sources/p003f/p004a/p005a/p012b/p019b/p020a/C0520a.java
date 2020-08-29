package p003f.p004a.p005a.p012b.p019b.p020a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.features.covidreport.confirmation.ConfirmationActivity;

/* renamed from: f.a.a.b.b.a.a */
public final class C0520a implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ ConfirmationActivity f1931e;

    /* renamed from: f */
    public final /* synthetic */ Uri f1932f;

    public C0520a(ConfirmationActivity confirmationActivity, Uri uri) {
        this.f1931e = confirmationActivity;
        this.f1932f = uri;
    }

    public final void onClick(View view) {
        ConfirmationActivity confirmationActivity = this.f1931e;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.f1932f);
        confirmationActivity.startActivity(intent);
    }
}
