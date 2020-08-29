package p213q.p217b.p317d.p322h.p323e.p331o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f;
import p213q.p217b.p317d.p322h.p323e.p337s.C4168e;

/* renamed from: q.b.d.h.e.o.g */
public class C4137g {

    /* renamed from: g */
    public static final Charset f10007g = Charset.forName("UTF-8");

    /* renamed from: h */
    public static final int f10008h = 15;

    /* renamed from: i */
    public static final C4125f f10009i = new C4125f();

    /* renamed from: j */
    public static final Comparator<? super File> f10010j = C4135e.f10005e;

    /* renamed from: k */
    public static final FilenameFilter f10011k = C4136f.f10006a;

    /* renamed from: a */
    public final AtomicInteger f10012a = new AtomicInteger(0);

    /* renamed from: b */
    public final File f10013b;

    /* renamed from: c */
    public final File f10014c;

    /* renamed from: d */
    public final File f10015d;

    /* renamed from: e */
    public final File f10016e;

    /* renamed from: f */
    public final C4168e f10017f;

    public C4137g(File file, C4168e eVar) {
        File file2 = new File(file, "report-persistence");
        this.f10013b = new File(file2, "sessions");
        this.f10014c = new File(file2, "priority-reports");
        this.f10015d = new File(file2, "reports");
        this.f10016e = new File(file2, "native-reports");
        this.f10017f = eVar;
    }

    /* renamed from: a */
    public static List<File> m9550a(File file) {
        return m9551a(file, (FileFilter) null);
    }

    /* renamed from: a */
    public static List<File> m9551a(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    /* renamed from: a */
    public static List<File> m9552a(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    /* renamed from: a */
    public static List<File> m9553a(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> size : listArr) {
            i += size.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m9554a(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m9555a(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    /* renamed from: b */
    public static void m9559b(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f10007g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: c */
    public static String m9560c(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f10007g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    /* renamed from: d */
    public static void m9562d(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File d : file.listFiles()) {
                    m9562d(d);
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public void mo10335a() {
        for (File delete : mo10338b()) {
            delete.delete();
        }
    }

    /* renamed from: b */
    public final File mo10337b(String str) {
        return new File(this.f10013b, str);
    }

    /* renamed from: b */
    public final List<File> mo10338b() {
        List[] listArr = {m9553a((List<File>[]) new List[]{m9550a(this.f10014c), m9550a(this.f10016e)}), m9550a(this.f10015d)};
        for (int i = 0; i < 2; i++) {
            Collections.sort(listArr[i], f10010j);
        }
        return m9553a((List<File>[]) listArr);
    }

    /* renamed from: b */
    public static File m9558b(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not create directory ");
        sb.append(file);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public void mo10336a(String str) {
        C4131a aVar = new C4131a(str);
        Iterator it = ((ArrayList) m9553a((List<File>[]) new List[]{m9552a(this.f10014c, (FilenameFilter) aVar), m9552a(this.f10016e, (FilenameFilter) aVar), m9552a(this.f10015d, (FilenameFilter) aVar)})).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }
}
