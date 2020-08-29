package p124p.p170k.p171a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p.k.a.x */
public class C1519x extends C1476b0 {

    /* renamed from: p.k.a.x$a */
    public class C1520a extends EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f4520a;

        public C1520a(C1519x xVar, Rect rect) {
            this.f4520a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f4520a;
        }
    }

    /* renamed from: p.k.a.x$b */
    public class C1521b implements TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f4521a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4522b;

        public C1521b(C1519x xVar, View view, ArrayList arrayList) {
            this.f4521a = view;
            this.f4522b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4521a.setVisibility(8);
            int size = this.f4522b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4522b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: p.k.a.x$c */
    public class C1522c implements TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f4523a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4524b;

        /* renamed from: c */
        public final /* synthetic */ Object f4525c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f4526d;

        /* renamed from: e */
        public final /* synthetic */ Object f4527e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f4528f;

        public C1522c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4523a = obj;
            this.f4524b = arrayList;
            this.f4525c = obj2;
            this.f4526d = arrayList2;
            this.f4527e = obj3;
            this.f4528f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f4523a;
            if (obj != null) {
                C1519x.this.mo6051a(obj, this.f4524b, null);
            }
            Object obj2 = this.f4525c;
            if (obj2 != null) {
                C1519x.this.mo6051a(obj2, this.f4526d, null);
            }
            Object obj3 = this.f4527e;
            if (obj3 != null) {
                C1519x.this.mo6051a(obj3, this.f4528f, null);
            }
        }
    }

    /* renamed from: p.k.a.x$d */
    public class C1523d extends EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f4530a;

        public C1523d(C1519x xVar, Rect rect) {
            this.f4530a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4530a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4530a;
        }
    }

    /* renamed from: a */
    public static boolean m3894a(Transition transition) {
        return !C1476b0.m3722a(transition.getTargetIds()) || !C1476b0.m3722a(transition.getTargetNames()) || !C1476b0.m3722a(transition.getTargetTypes());
    }

    /* renamed from: a */
    public Object mo6043a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo6045a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo6046a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1523d(this, rect));
        }
    }

    /* renamed from: a */
    public void mo6047a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo6048a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1521b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo6049a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C1522c cVar = new C1522c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: a */
    public void mo6050a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo6050a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3894a(transition) && C1476b0.m3722a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6051a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo6051a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3894a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget((View) arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo6054a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo6055b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo6056b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public void mo6057b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: b */
    public void mo6058b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1476b0.m3721a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo6050a((Object) transitionSet, arrayList);
    }

    /* renamed from: b */
    public void mo6059b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo6051a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo6060c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: c */
    public void mo6061c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo6044a(view, rect);
            transition.setEpicenterCallback(new C1520a(this, rect));
        }
    }
}
