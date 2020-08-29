package p124p.p150h.p160j;

import android.text.TextUtils;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: p.h.j.e */
public final class C1380e {

    /* renamed from: a */
    public static final Locale f4137a;

    static {
        String str = Objects.EMPTY_STRING;
        f4137a = new Locale(str, str);
    }

    /* renamed from: a */
    public static int m3464a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
