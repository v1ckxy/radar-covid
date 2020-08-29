package p003f.p004a.p005a.p006a.p011e;

import android.content.Context;
import android.text.Spanned;
import android.text.SpannedString;
import es.gob.radarcovid.R;
import java.util.Map;
import p003f.p004a.p005a.p006a.p007a.C0427g;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: f.a.a.a.e.a */
public final class C0500a {

    /* renamed from: a */
    public Map<String, String> f1896a;

    /* renamed from: b */
    public final Context f1897b;

    /* renamed from: c */
    public final C0427g f1898c;

    public C0500a(Context context, C0427g gVar) {
        if (context == null) {
            C4638h.m10271a("context");
            throw null;
        } else if (gVar != null) {
            this.f1897b = context;
            this.f1898c = gVar;
            this.f1896a = gVar.mo3687g();
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }

    /* renamed from: a */
    public final Spanned mo3714a(String str, CharSequence charSequence) {
        String str2 = (String) this.f1896a.get(str);
        if (str2 != null) {
            Spanned a = C1061o.m2459a(str2, 0);
            if (a != null) {
                return a;
            }
        }
        return new SpannedString(charSequence);
    }

    /* renamed from: a */
    public final String mo3715a() {
        return mo3714a("CONTACT_PHONE", this.f1897b.getText(R.string.contact_support_phone)).toString();
    }

    /* renamed from: a */
    public final String mo3716a(String str, String... strArr) {
        if (str == null) {
            C4638h.m10271a("labelId");
            throw null;
        } else if (strArr != null) {
            String str2 = (String) this.f1896a.get(str);
            if (str2 == null) {
                str2 = Objects.EMPTY_STRING;
            }
            if (str2.length() > 0) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str3 = strArr[i];
                    if (str2 == null) {
                        C4638h.m10271a("$this$replaceFirst");
                        throw null;
                    } else if (str3 != null) {
                        int a = C4681g.m10306a((CharSequence) str2, "%@", 0, false, 2);
                        if (a >= 0) {
                            int i2 = 2 + a;
                            if (i2 >= a) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2, 0, a);
                                String str4 = "this.append(value, startIndex, endIndex)";
                                C4638h.m10270a((Object) sb, str4);
                                sb.append(str3);
                                sb.append(str2, i2, str2.length());
                                C4638h.m10270a((Object) sb, str4);
                                str2 = sb.toString();
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("End index (");
                                sb2.append(i2);
                                sb2.append(") is less than start index (");
                                sb2.append(a);
                                sb2.append(").");
                                throw new IndexOutOfBoundsException(sb2.toString());
                            }
                        }
                        i++;
                    } else {
                        C4638h.m10271a("newValue");
                        throw null;
                    }
                }
            }
            return str2;
        } else {
            C4638h.m10271a("values");
            throw null;
        }
    }
}
