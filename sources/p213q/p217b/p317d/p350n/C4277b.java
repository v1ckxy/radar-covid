package p213q.p217b.p317d.p350n;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: q.b.d.n.b */
public class C4277b {

    /* renamed from: a */
    public final FileChannel f10286a;

    /* renamed from: b */
    public final FileLock f10287b;

    public C4277b(FileChannel fileChannel, FileLock fileLock) {
        this.f10286a = fileChannel;
        this.f10287b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC, Splitter:B:15:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[SYNTHETIC, Splitter:B:19:0x003b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213q.p217b.p317d.p350n.C4277b m9768a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x002a, Error -> 0x0028 }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0025, Error -> 0x0023 }
            q.b.d.n.b r1 = new q.b.d.n.b     // Catch:{ IOException -> 0x0021, Error -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0021, Error -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x002d
        L_0x0021:
            r1 = move-exception
            goto L_0x002d
        L_0x0023:
            r1 = move-exception
            goto L_0x0026
        L_0x0025:
            r1 = move-exception
        L_0x0026:
            r5 = r0
            goto L_0x002d
        L_0x0028:
            r1 = move-exception
            goto L_0x002b
        L_0x002a:
            r1 = move-exception
        L_0x002b:
            r4 = r0
            r5 = r4
        L_0x002d:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x0039
            r5.release()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r4.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.C4277b.m9768a(android.content.Context, java.lang.String):q.b.d.n.b");
    }

    /* renamed from: a */
    public void mo10473a() {
        try {
            this.f10287b.release();
            this.f10286a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
