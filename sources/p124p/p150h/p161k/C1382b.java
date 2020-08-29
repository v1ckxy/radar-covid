package p124p.p150h.p161k;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: p.h.k.b */
public class C1382b extends Writer {

    /* renamed from: e */
    public final String f4138e;

    /* renamed from: f */
    public StringBuilder f4139f = new StringBuilder(128);

    public C1382b(String str) {
        this.f4138e = str;
    }

    /* renamed from: a */
    public final void mo5857a() {
        if (this.f4139f.length() > 0) {
            Log.d(this.f4138e, this.f4139f.toString());
            StringBuilder sb = this.f4139f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo5857a();
    }

    public void flush() {
        mo5857a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo5857a();
            } else {
                this.f4139f.append(c);
            }
        }
    }
}
