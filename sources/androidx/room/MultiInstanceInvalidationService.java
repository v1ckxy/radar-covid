package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import p124p.p182q.C1620c;
import p124p.p182q.C1623d.C1624a;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: e */
    public int f909e = 0;

    /* renamed from: f */
    public final HashMap<Integer, String> f910f = new HashMap<>();

    /* renamed from: g */
    public final RemoteCallbackList<C1620c> f911g = new C0149a();

    /* renamed from: h */
    public final C1624a f912h = new C0150b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class C0149a extends RemoteCallbackList<C1620c> {
        public C0149a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            C1620c cVar = (C1620c) iInterface;
            MultiInstanceInvalidationService.this.f910f.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class C0150b extends C1624a {
        public C0150b() {
        }

        /* renamed from: a */
        public int mo1351a(C1620c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f911g) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f909e + 1;
                multiInstanceInvalidationService.f909e = i;
                if (MultiInstanceInvalidationService.this.f911g.register(cVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f910f.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.f909e--;
                return 0;
            }
        }

        /* renamed from: a */
        public void mo1352a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f911g) {
                String str = (String) MultiInstanceInvalidationService.this.f910f.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f911g.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f911g.getBroadcastCookie(i2)).intValue();
                        String str2 = (String) MultiInstanceInvalidationService.this.f910f.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            ((C1620c) MultiInstanceInvalidationService.this.f911g.getBroadcastItem(i2)).mo6384a(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f911g.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f911g.finishBroadcast();
            }
        }

        /* renamed from: a */
        public void mo1353a(C1620c cVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f911g) {
                MultiInstanceInvalidationService.this.f911g.unregister(cVar);
                MultiInstanceInvalidationService.this.f910f.remove(Integer.valueOf(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f912h;
    }
}
