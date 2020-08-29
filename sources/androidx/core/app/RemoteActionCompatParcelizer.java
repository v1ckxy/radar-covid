package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p124p.p195w.C1765a;
import p124p.p195w.C1766b;
import p124p.p195w.C1767c;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1765a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f538a;
        if (aVar.mo6747a(1)) {
            obj = aVar.mo6754c();
        }
        remoteActionCompat.f538a = (IconCompat) obj;
        remoteActionCompat.f539b = aVar.mo6742a(remoteActionCompat.f539b, 2);
        remoteActionCompat.f540c = aVar.mo6742a(remoteActionCompat.f540c, 3);
        remoteActionCompat.f541d = (PendingIntent) aVar.mo6741a(remoteActionCompat.f541d, 4);
        remoteActionCompat.f542e = aVar.mo6748a(remoteActionCompat.f542e, 5);
        remoteActionCompat.f543f = aVar.mo6748a(remoteActionCompat.f543f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1765a aVar) {
        if (aVar != null) {
            IconCompat iconCompat = remoteActionCompat.f538a;
            aVar.mo6751b(1);
            aVar.mo6746a((C1767c) iconCompat);
            CharSequence charSequence = remoteActionCompat.f539b;
            aVar.mo6751b(2);
            C1766b bVar = (C1766b) aVar;
            TextUtils.writeToParcel(charSequence, bVar.f5184e, 0);
            CharSequence charSequence2 = remoteActionCompat.f540c;
            aVar.mo6751b(3);
            TextUtils.writeToParcel(charSequence2, bVar.f5184e, 0);
            aVar.mo6753b((Parcelable) remoteActionCompat.f541d, 4);
            boolean z = remoteActionCompat.f542e;
            aVar.mo6751b(5);
            bVar.f5184e.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.f543f;
            aVar.mo6751b(6);
            bVar.f5184e.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
