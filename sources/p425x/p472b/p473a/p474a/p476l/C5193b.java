package p425x.p472b.p473a.p474a.p476l;

import java.util.Comparator;
import org.dpppt.android.sdk.models.ExposureDay;

/* renamed from: x.b.a.a.l.b */
/* compiled from: lambda */
public final /* synthetic */ class C5193b implements Comparator {

    /* renamed from: e */
    public static final /* synthetic */ C5193b f12410e = new C5193b();

    private /* synthetic */ C5193b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((ExposureDay) obj).getExposedDate().compareTo(((ExposureDay) obj2).getExposedDate());
    }
}
