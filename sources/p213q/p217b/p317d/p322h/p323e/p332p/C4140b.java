package p213q.p217b.p317d.p322h.p323e.p332p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.h.e.p.b */
public class C4140b extends FileOutputStream {

    /* renamed from: h */
    public static final FilenameFilter f10021h = new C4141a();

    /* renamed from: e */
    public final String f10022e;

    /* renamed from: f */
    public File f10023f;

    /* renamed from: g */
    public boolean f10024g = false;

    /* renamed from: q.b.d.h.e.p.b$a */
    public class C4141a implements FilenameFilter {
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public C4140b(File file, String str) {
        String str2 = ".cls_temp";
        super(new File(file, C1965a.m4751a(str, str2)));
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        this.f10022e = C1965a.m4754a(sb, File.separator, str);
        this.f10023f = new File(C1965a.m4754a(new StringBuilder(), this.f10022e, str2));
    }

    /* renamed from: a */
    public void mo10342a() {
        if (!this.f10024g) {
            this.f10024g = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.f10024g) {
            this.f10024g = true;
            super.flush();
            super.close();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10022e);
            sb.append(".cls");
            File file = new File(sb.toString());
            if (this.f10023f.renameTo(file)) {
                this.f10023f = null;
                return;
            }
            String str = Objects.EMPTY_STRING;
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f10023f.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not rename temp file: ");
            sb2.append(this.f10023f);
            sb2.append(" -> ");
            sb2.append(file);
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }
}
