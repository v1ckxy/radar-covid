package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p124p.p195w.C1765a;
import p124p.p195w.C1766b;

public class IconCompatParcelizer {
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(p124p.p195w.C1765a r4) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f545a
            r2 = 1
            int r1 = r4.mo6740a(r1, r2)
            r0.f545a = r1
            byte[] r1 = r0.f547c
            r2 = 2
            boolean r2 = r4.mo6747a(r2)
            if (r2 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            r1 = r4
            p.w.b r1 = (p124p.p195w.C1766b) r1
            android.os.Parcel r2 = r1.f5184e
            int r2 = r2.readInt()
            if (r2 >= 0) goto L_0x0025
            r1 = 0
            goto L_0x002d
        L_0x0025:
            byte[] r2 = new byte[r2]
            android.os.Parcel r1 = r1.f5184e
            r1.readByteArray(r2)
            r1 = r2
        L_0x002d:
            r0.f547c = r1
            android.os.Parcelable r1 = r0.f548d
            r2 = 3
            android.os.Parcelable r1 = r4.mo6741a(r1, r2)
            r0.f548d = r1
            int r1 = r0.f549e
            r3 = 4
            int r1 = r4.mo6740a(r1, r3)
            r0.f549e = r1
            int r1 = r0.f550f
            r3 = 5
            int r1 = r4.mo6740a(r1, r3)
            r0.f550f = r1
            android.content.res.ColorStateList r1 = r0.f551g
            r3 = 6
            android.os.Parcelable r1 = r4.mo6741a(r1, r3)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f551g = r1
            java.lang.String r1 = r0.f553i
            r3 = 7
            boolean r3 = r4.mo6747a(r3)
            if (r3 != 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            p.w.b r4 = (p124p.p195w.C1766b) r4
            android.os.Parcel r4 = r4.f5184e
            java.lang.String r1 = r4.readString()
        L_0x0067:
            r0.f553i = r1
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.valueOf(r1)
            r0.f552h = r4
            int r4 = r0.f545a
            switch(r4) {
                case -1: goto L_0x009c;
                case 0: goto L_0x0074;
                case 1: goto L_0x008a;
                case 2: goto L_0x007a;
                case 3: goto L_0x0075;
                case 4: goto L_0x007a;
                case 5: goto L_0x008a;
                case 6: goto L_0x007a;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x00ab
        L_0x0075:
            byte[] r4 = r0.f547c
            r0.f546b = r4
            goto L_0x00ab
        L_0x007a:
            java.lang.String r4 = new java.lang.String
            byte[] r1 = r0.f547c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r4.<init>(r1, r2)
            r0.f546b = r4
            goto L_0x00ab
        L_0x008a:
            android.os.Parcelable r4 = r0.f548d
            if (r4 == 0) goto L_0x008f
            goto L_0x00a0
        L_0x008f:
            byte[] r4 = r0.f547c
            r0.f546b = r4
            r0.f545a = r2
            r1 = 0
            r0.f549e = r1
            int r4 = r4.length
            r0.f550f = r4
            goto L_0x00ab
        L_0x009c:
            android.os.Parcelable r4 = r0.f548d
            if (r4 == 0) goto L_0x00a3
        L_0x00a0:
            r0.f546b = r4
            goto L_0x00ab
        L_0x00a3:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r4.<init>(r0)
            throw r4
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(p.w.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, C1765a aVar) {
        if (aVar != null) {
            iconCompat.f553i = iconCompat.f552h.name();
            String str = "UTF-16";
            switch (iconCompat.f545a) {
                case -1:
                case 1:
                case 5:
                    iconCompat.f548d = (Parcelable) iconCompat.f546b;
                    break;
                case 2:
                    iconCompat.f547c = ((String) iconCompat.f546b).getBytes(Charset.forName(str));
                    break;
                case 3:
                    iconCompat.f547c = (byte[]) iconCompat.f546b;
                    break;
                case 4:
                case 6:
                    iconCompat.f547c = iconCompat.f546b.toString().getBytes(Charset.forName(str));
                    break;
            }
            int i = iconCompat.f545a;
            if (-1 != i) {
                aVar.mo6752b(i, 1);
            }
            byte[] bArr = iconCompat.f547c;
            if (bArr != null) {
                aVar.mo6751b(2);
                C1766b bVar = (C1766b) aVar;
                bVar.f5184e.writeInt(bArr.length);
                bVar.f5184e.writeByteArray(bArr);
            }
            Parcelable parcelable = iconCompat.f548d;
            if (parcelable != null) {
                aVar.mo6751b(3);
                ((C1766b) aVar).f5184e.writeParcelable(parcelable, 0);
            }
            int i2 = iconCompat.f549e;
            if (i2 != 0) {
                aVar.mo6752b(i2, 4);
            }
            int i3 = iconCompat.f550f;
            if (i3 != 0) {
                aVar.mo6752b(i3, 5);
            }
            ColorStateList colorStateList = iconCompat.f551g;
            if (colorStateList != null) {
                aVar.mo6751b(6);
                ((C1766b) aVar).f5184e.writeParcelable(colorStateList, 0);
            }
            String str2 = iconCompat.f553i;
            if (str2 != null) {
                aVar.mo6751b(7);
                ((C1766b) aVar).f5184e.writeString(str2);
                return;
            }
            return;
        }
        throw null;
    }
}
