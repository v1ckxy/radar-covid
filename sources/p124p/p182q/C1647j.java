package p124p.p182q;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import p124p.p182q.p184m.C1650a;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.C1670c;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.q.j */
public class C1647j implements C1670c {

    /* renamed from: e */
    public final Context f4852e;

    /* renamed from: f */
    public final String f4853f;

    /* renamed from: g */
    public final File f4854g;

    /* renamed from: h */
    public final int f4855h;

    /* renamed from: i */
    public final C1670c f4856i;

    /* renamed from: j */
    public C1618a f4857j;

    /* renamed from: k */
    public boolean f4858k;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo6436a(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f4853f != null) {
            readableByteChannel = Channels.newChannel(this.f4852e.getAssets().open(this.f4853f));
        } else if (this.f4854g != null) {
            readableByteChannel = new FileInputStream(this.f4854g).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4852e.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                channel.transferFrom(readableByteChannel, 0, RecyclerView.FOREVER_NS);
            }
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder a = C1965a.m4756a("Failed to create directories for ");
                a.append(file.getAbsolutePath());
                throw new IOException(a.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder a2 = C1965a.m4756a("Failed to move intermediate file (");
                a2.append(createTempFile.getAbsolutePath());
                a2.append(") to destination (");
                a2.append(file.getAbsolutePath());
                a2.append(").");
                throw new IOException(a2.toString());
            }
        } catch (Throwable th) {
            readableByteChannel.close();
            channel.close();
            throw th;
        }
    }

    public synchronized void close() {
        this.f4856i.close();
        this.f4858k = false;
    }

    public String getDatabaseName() {
        return this.f4856i.getDatabaseName();
    }

    public synchronized C1669b getWritableDatabase() {
        if (!this.f4858k) {
            mo6435a();
            this.f4858k = true;
        }
        return this.f4856i.getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4856i.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    public final void mo6435a() {
        String str;
        String str2 = "ROOM";
        String databaseName = this.f4856i.getDatabaseName();
        File databasePath = this.f4852e.getDatabasePath(databaseName);
        C1618a aVar = this.f4857j;
        C1650a aVar2 = new C1650a(databaseName, this.f4852e.getFilesDir(), aVar == null || aVar.f4762j);
        try {
            aVar2.f4866b.lock();
            if (aVar2.f4867c) {
                FileChannel channel = new FileOutputStream(aVar2.f4865a).getChannel();
                aVar2.f4868d = channel;
                channel.lock();
            }
            str = "Unable to copy database file.";
            if (!databasePath.exists()) {
                mo6436a(databasePath);
                aVar2.mo6445a();
            } else if (this.f4857j == null) {
                aVar2.mo6445a();
            } else {
                try {
                    int a = C1651b.m4196a(databasePath);
                    if (a == this.f4855h) {
                        aVar2.mo6445a();
                    } else if (this.f4857j.mo6381a(a, this.f4855h)) {
                        aVar2.mo6445a();
                    } else {
                        if (this.f4852e.deleteDatabase(databaseName)) {
                            try {
                                mo6436a(databasePath);
                            } catch (IOException e) {
                                Log.w(str2, str, e);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to delete database file (");
                            sb.append(databaseName);
                            sb.append(") for a copy destructive migration.");
                            Log.w(str2, sb.toString());
                        }
                        aVar2.mo6445a();
                    }
                } catch (IOException e2) {
                    Log.w(str2, "Unable to read database version.", e2);
                    aVar2.mo6445a();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException(str, e3);
        } catch (IOException e4) {
            throw new IllegalStateException("Unable to grab copy lock.", e4);
        } catch (Throwable th) {
            aVar2.mo6445a();
            throw th;
        }
    }
}
