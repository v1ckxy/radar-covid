package p124p.p177n;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import p124p.p177n.C1537e.C1538a;

/* renamed from: p.n.q */
public class C1552q extends Fragment {

    /* renamed from: e */
    public C1553a f4570e;

    /* renamed from: p.n.q$a */
    public interface C1553a {
        /* renamed from: b */
        void mo6246b();

        /* renamed from: c */
        void mo6247c();

        /* renamed from: d */
        void mo6248d();
    }

    /* renamed from: a */
    public static void m3947a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C1552q(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo6239a(C1538a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C1545j) {
            ((C1545j) activity).mo2g().mo6230a(aVar);
            return;
        }
        if (activity instanceof C1542h) {
            C1537e g = ((C1542h) activity).mo2g();
            if (g instanceof C1543i) {
                ((C1543i) g).mo6230a(aVar);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1553a aVar = this.f4570e;
        if (aVar != null) {
            aVar.mo6247c();
        }
        mo6239a(C1538a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo6239a(C1538a.ON_DESTROY);
        this.f4570e = null;
    }

    public void onPause() {
        super.onPause();
        mo6239a(C1538a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        C1553a aVar = this.f4570e;
        if (aVar != null) {
            aVar.mo6246b();
        }
        mo6239a(C1538a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        C1553a aVar = this.f4570e;
        if (aVar != null) {
            aVar.mo6248d();
        }
        mo6239a(C1538a.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo6239a(C1538a.ON_STOP);
    }
}
