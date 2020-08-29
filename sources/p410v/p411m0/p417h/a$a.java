package p410v.p411m0.p417h;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4638h;
import p423w.C4882a0;
import p423w.C4915y;

/* renamed from: v.m0.h.a$a */
public final class a$a implements C4827b {
    /* renamed from: a */
    public void mo11288a(File file) {
        if (file == null) {
            C4638h.m10271a("file");
            throw null;
        } else if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to delete ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: b */
    public C4882a0 mo11290b(File file) {
        if (file != null) {
            return C0967p0.m2230b(file);
        }
        C4638h.m10271a("file");
        throw null;
    }

    /* renamed from: c */
    public C4915y mo11291c(File file) {
        if (file != null) {
            try {
                return C0967p0.m2185a(file, false, 1);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0967p0.m2185a(file, false, 1);
            }
        } else {
            C4638h.m10271a("file");
            throw null;
        }
    }

    /* renamed from: d */
    public void mo11292d(File file) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    C4638h.m10270a((Object) file2, "file");
                    if (file2.isDirectory()) {
                        mo11292d(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
        C4638h.m10271a("directory");
        throw null;
    }

    /* renamed from: e */
    public C4915y mo11293e(File file) {
        if (file != null) {
            try {
                return C0967p0.m2184a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0967p0.m2184a(file);
            }
        } else {
            C4638h.m10271a("file");
            throw null;
        }
    }

    /* renamed from: f */
    public boolean mo11294f(File file) {
        if (file != null) {
            return file.exists();
        }
        C4638h.m10271a("file");
        throw null;
    }

    /* renamed from: g */
    public long mo11295g(File file) {
        if (file != null) {
            return file.length();
        }
        C4638h.m10271a("file");
        throw null;
    }

    /* renamed from: a */
    public void mo11289a(File file, File file2) {
        if (file == null) {
            C4638h.m10271a("from");
            throw null;
        } else if (file2 != null) {
            mo11288a(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        } else {
            C4638h.m10271a("to");
            throw null;
        }
    }
}
