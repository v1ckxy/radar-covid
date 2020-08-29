package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p150h.p158h.C1353e;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1394e;
import p124p.p150h.p162l.C1395f;
import p124p.p150h.p162l.C1397h;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1412s;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1431b;
import p124p.p167j.p168a.C1458a;
import p124p.p180p.C1567a;
import p124p.p180p.C1568b;
import p124p.p180p.C1569c;
import p124p.p180p.p181d.C1570a;
import p124p.p180p.p181d.C1570a.C1571a;
import p124p.p180p.p181d.C1570a.C1572b;
import p124p.p180p.p181d.C1573a0;
import p124p.p180p.p181d.C1573a0.C1574a;
import p124p.p180p.p181d.C1573a0.C1575b;
import p124p.p180p.p181d.C1576b;
import p124p.p180p.p181d.C1576b.C1577a;
import p124p.p180p.p181d.C1576b.C1578b;
import p124p.p180p.p181d.C1579c;
import p124p.p180p.p181d.C1580d;
import p124p.p180p.p181d.C1581e;
import p124p.p180p.p181d.C1582f;
import p124p.p180p.p181d.C1587k;
import p124p.p180p.p181d.C1587k.C1588a;
import p124p.p180p.p181d.C1587k.C1589b;
import p124p.p180p.p181d.C1590l;
import p124p.p180p.p181d.C1595m;
import p124p.p180p.p181d.C1595m.C1597b;
import p124p.p180p.p181d.C1600o;
import p124p.p180p.p181d.C1609v;
import p124p.p180p.p181d.C1609v.C1610a;
import p124p.p180p.p181d.C1611w;
import p124p.p180p.p181d.C1615z;
import p124p.p180p.p181d.C1615z.C1617b;
import p213q.p214a.p215a.p216a.C1965a;

public class RecyclerView extends ViewGroup implements C1394e, C1395f {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new C0102c();
    public C1609v mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public C0108g mAdapter;
    public C1570a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public C0112j mChildDrawingOrderCallback;
    public C1576b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C0113k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public C1595m mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public C0128s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public C0114l mItemAnimator;
    public C0116b mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList<C0119n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastTouchX;
    public int mLastTouchY;
    public C0120o mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C0134x mObserver;
    public List<C0126q> mOnChildAttachStateListeners;
    public C0127r mOnFlingListener;
    public final ArrayList<C0128s> mOnItemTouchListeners;
    public final List<C0105d0> mPendingAccessibilityImportanceChange;
    public C0135y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public C1597b mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C0132v mRecycler;
    public C0133w mRecyclerListener;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public C0129t mScrollListener;
    public List<C0129t> mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C1397h mScrollingChildHelper;
    public final C0099a0 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final C0103c0 mViewFlinger;
    public final C1575b mViewInfoProcessCallback;
    public final C1573a0 mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0098a implements Runnable {
        public C0098a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0099a0 {

        /* renamed from: a */
        public int f732a = -1;

        /* renamed from: b */
        public int f733b = 0;

        /* renamed from: c */
        public int f734c = 0;

        /* renamed from: d */
        public int f735d = 1;

        /* renamed from: e */
        public int f736e = 0;

        /* renamed from: f */
        public boolean f737f = false;

        /* renamed from: g */
        public boolean f738g = false;

        /* renamed from: h */
        public boolean f739h = false;

        /* renamed from: i */
        public boolean f740i = false;

        /* renamed from: j */
        public boolean f741j = false;

        /* renamed from: k */
        public boolean f742k = false;

        /* renamed from: l */
        public int f743l;

        /* renamed from: m */
        public long f744m;

        /* renamed from: n */
        public int f745n;

        /* renamed from: o */
        public int f746o;

        /* renamed from: a */
        public int mo1135a() {
            return this.f738g ? this.f733b - this.f734c : this.f736e;
        }

        /* renamed from: a */
        public void mo1136a(int i) {
            if ((this.f735d & i) == 0) {
                StringBuilder a = C1965a.m4756a("Layout state should be one of ");
                a.append(Integer.toBinaryString(i));
                a.append(" but it is ");
                a.append(Integer.toBinaryString(this.f735d));
                throw new IllegalStateException(a.toString());
            }
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("State{mTargetPosition=");
            a.append(this.f732a);
            a.append(", mData=");
            a.append(null);
            a.append(", mItemCount=");
            a.append(this.f736e);
            a.append(", mIsMeasuring=");
            a.append(this.f740i);
            a.append(", mPreviousLayoutItemCount=");
            a.append(this.f733b);
            a.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a.append(this.f734c);
            a.append(", mStructureChanged=");
            a.append(this.f737f);
            a.append(", mInPreLayout=");
            a.append(this.f738g);
            a.append(", mRunSimpleAnimations=");
            a.append(this.f741j);
            a.append(", mRunPredictiveAnimations=");
            a.append(this.f742k);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C0100b implements Runnable {
        public C0100b() {
        }

        public void run() {
            C0114l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                C1587k kVar = (C1587k) lVar;
                boolean z = !kVar.f4636h.isEmpty();
                boolean z2 = !kVar.f4638j.isEmpty();
                boolean z3 = !kVar.f4639k.isEmpty();
                boolean z4 = !kVar.f4637i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator it = kVar.f4636h.iterator();
                    while (it.hasNext()) {
                        C0105d0 d0Var = (C0105d0) it.next();
                        View view = d0Var.f757a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f4645q.add(d0Var);
                        animate.setDuration(kVar.f788d).alpha(0.0f).setListener(new C1582f(kVar, d0Var, animate, view)).start();
                    }
                    kVar.f4636h.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(kVar.f4638j);
                        kVar.f4641m.add(arrayList);
                        kVar.f4638j.clear();
                        C1579c cVar = new C1579c(kVar, arrayList);
                        if (z) {
                            C1404o.m3524a(((C1589b) arrayList.get(0)).f4653a.f757a, (Runnable) cVar, kVar.f788d);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(kVar.f4639k);
                        kVar.f4642n.add(arrayList2);
                        kVar.f4639k.clear();
                        C1580d dVar = new C1580d(kVar, arrayList2);
                        if (z) {
                            C1404o.m3524a(((C1588a) arrayList2.get(0)).f4647a.f757a, (Runnable) dVar, kVar.f788d);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(kVar.f4637i);
                        kVar.f4640l.add(arrayList3);
                        kVar.f4637i.clear();
                        C1581e eVar = new C1581e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j = 0;
                            long j2 = z ? kVar.f788d : 0;
                            long j3 = z2 ? kVar.f789e : 0;
                            if (z3) {
                                j = kVar.f790f;
                            }
                            C1404o.m3524a(((C0105d0) arrayList3.get(0)).f757a, (Runnable) eVar, Math.max(j3, j) + j2);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0101b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C0102c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public class C0103c0 implements Runnable {

        /* renamed from: e */
        public int f748e;

        /* renamed from: f */
        public int f749f;

        /* renamed from: g */
        public OverScroller f750g;

        /* renamed from: h */
        public Interpolator f751h = RecyclerView.sQuinticInterpolator;

        /* renamed from: i */
        public boolean f752i = false;

        /* renamed from: j */
        public boolean f753j = false;

        public C0103c0() {
            this.f750g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: a */
        public void mo1140a() {
            if (this.f752i) {
                this.f753j = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C1404o.m3523a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: b */
        public void mo1142b() {
            RecyclerView.this.removeCallbacks(this);
            this.f750g.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo1142b();
                return;
            }
            this.f753j = false;
            this.f752i = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f750g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f748e;
                int i4 = currY - this.f749f;
                this.f748e = currX;
                this.f749f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0137z zVar = recyclerView4.mLayout.f800g;
                    if (zVar != null && !zVar.f841d && zVar.f842e) {
                        int a = recyclerView4.mState.mo1135a();
                        if (a == 0) {
                            zVar.mo1278a();
                        } else {
                            if (zVar.f838a >= a) {
                                zVar.f838a = a - 1;
                            }
                            zVar.mo1279a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0137z zVar2 = RecyclerView.this.mLayout.f800g;
                if ((zVar2 != null && zVar2.f841d) || !z) {
                    mo1140a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C1595m mVar = recyclerView6.mGapWorker;
                    if (mVar != null) {
                        mVar.mo6336a(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        C1597b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.f4702c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f4703d = 0;
                    }
                }
            }
            C0137z zVar3 = RecyclerView.this.mLayout.f800g;
            if (zVar3 != null && zVar3.f841d) {
                zVar3.mo1279a(0, 0);
            }
            this.f752i = false;
            if (this.f753j) {
                RecyclerView.this.removeCallbacks(this);
                C1404o.m3523a((View) RecyclerView.this, (Runnable) this);
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        /* renamed from: a */
        public void mo1141a(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f = (float) width;
                float f2 = (float) i5;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, RecyclerView.MAX_SCROLL_DURATION);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f751h != interpolator) {
                this.f751h = interpolator;
                this.f750g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f749f = 0;
            this.f748e = 0;
            RecyclerView.this.setScrollState(2);
            this.f750g.startScroll(0, 0, i, i2, i6);
            mo1140a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0104d implements C1575b {
        public C0104d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0105d0 {

        /* renamed from: t */
        public static final List<Object> f756t = Collections.emptyList();

        /* renamed from: a */
        public final View f757a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f758b;

        /* renamed from: c */
        public int f759c = -1;

        /* renamed from: d */
        public int f760d = -1;

        /* renamed from: e */
        public long f761e = -1;

        /* renamed from: f */
        public int f762f = -1;

        /* renamed from: g */
        public int f763g = -1;

        /* renamed from: h */
        public C0105d0 f764h = null;

        /* renamed from: i */
        public C0105d0 f765i = null;

        /* renamed from: j */
        public int f766j;

        /* renamed from: k */
        public List<Object> f767k = null;

        /* renamed from: l */
        public List<Object> f768l = null;

        /* renamed from: m */
        public int f769m = 0;

        /* renamed from: n */
        public C0132v f770n = null;

        /* renamed from: o */
        public boolean f771o = false;

        /* renamed from: p */
        public int f772p = 0;

        /* renamed from: q */
        public int f773q = -1;

        /* renamed from: r */
        public RecyclerView f774r;

        /* renamed from: s */
        public C0108g<? extends C0105d0> f775s;

        public C0105d0(View view) {
            if (view != null) {
                this.f757a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public void mo1144a() {
            this.f760d = -1;
            this.f763g = -1;
        }

        /* renamed from: a */
        public void mo1145a(int i) {
            this.f766j = i | this.f766j;
        }

        /* renamed from: a */
        public void mo1146a(int i, int i2) {
            this.f766j = (i & i2) | (this.f766j & (~i2));
        }

        /* renamed from: a */
        public void mo1147a(int i, boolean z) {
            if (this.f760d == -1) {
                this.f760d = this.f759c;
            }
            if (this.f763g == -1) {
                this.f763g = this.f759c;
            }
            if (z) {
                this.f763g += i;
            }
            this.f759c += i;
            if (this.f757a.getLayoutParams() != null) {
                ((C0125p) this.f757a.getLayoutParams()).f820c = true;
            }
        }

        /* renamed from: a */
        public void mo1148a(Object obj) {
            if (obj == null) {
                mo1145a(1024);
            } else if ((1024 & this.f766j) == 0) {
                if (this.f767k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f767k = arrayList;
                    this.f768l = Collections.unmodifiableList(arrayList);
                }
                this.f767k.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo1149a(boolean z) {
            int i;
            int i2 = this.f769m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f769m = i3;
            if (i3 < 0) {
                this.f769m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
                return;
            }
            if (!z && i3 == 1) {
                i = this.f766j | 16;
            } else if (z && this.f769m == 0) {
                i = this.f766j & -17;
            } else {
                return;
            }
            this.f766j = i;
        }

        /* renamed from: b */
        public void mo1150b() {
            this.f766j &= -33;
        }

        /* renamed from: b */
        public boolean mo1151b(int i) {
            return (i & this.f766j) != 0;
        }

        /* renamed from: c */
        public final int mo1152c() {
            RecyclerView recyclerView = this.f774r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        /* renamed from: d */
        public final int mo1153d() {
            int i = this.f763g;
            return i == -1 ? this.f759c : i;
        }

        /* renamed from: e */
        public List<Object> mo1154e() {
            if ((this.f766j & 1024) != 0) {
                return f756t;
            }
            List<Object> list = this.f767k;
            return (list == null || list.size() == 0) ? f756t : this.f768l;
        }

        /* renamed from: f */
        public boolean mo1155f() {
            return (this.f757a.getParent() == null || this.f757a.getParent() == this.f774r) ? false : true;
        }

        /* renamed from: g */
        public boolean mo1156g() {
            return (this.f766j & 1) != 0;
        }

        /* renamed from: h */
        public boolean mo1157h() {
            return (this.f766j & 4) != 0;
        }

        /* renamed from: i */
        public final boolean mo1158i() {
            return (this.f766j & 16) == 0 && !C1404o.m3561v(this.f757a);
        }

        /* renamed from: j */
        public boolean mo1159j() {
            return (this.f766j & 8) != 0;
        }

        /* renamed from: k */
        public boolean mo1160k() {
            return this.f770n != null;
        }

        /* renamed from: l */
        public boolean mo1161l() {
            return (this.f766j & 256) != 0;
        }

        /* renamed from: m */
        public boolean mo1162m() {
            return (this.f766j & 2) != 0;
        }

        /* renamed from: n */
        public void mo1163n() {
            this.f766j = 0;
            this.f759c = -1;
            this.f760d = -1;
            this.f761e = -1;
            this.f763g = -1;
            this.f769m = 0;
            this.f764h = null;
            this.f765i = null;
            List<Object> list = this.f767k;
            if (list != null) {
                list.clear();
            }
            this.f766j &= -1025;
            this.f772p = 0;
            this.f773q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* renamed from: o */
        public boolean mo1164o() {
            return (this.f766j & 128) != 0;
        }

        /* renamed from: p */
        public boolean mo1165p() {
            return (this.f766j & 32) != 0;
        }

        public String toString() {
            StringBuilder b = C1965a.m4763b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), Objects.ARRAY_START);
            b.append(Integer.toHexString(hashCode()));
            b.append(" position=");
            b.append(this.f759c);
            b.append(" id=");
            b.append(this.f761e);
            b.append(", oldPos=");
            b.append(this.f760d);
            b.append(", pLpos:");
            b.append(this.f763g);
            StringBuilder sb = new StringBuilder(b.toString());
            if (mo1160k()) {
                sb.append(" scrap ");
                sb.append(this.f771o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo1157h()) {
                sb.append(" invalid");
            }
            if (!mo1156g()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.f766j & 2) != 0) {
                sb.append(" update");
            }
            if (mo1159j()) {
                sb.append(" removed");
            }
            if (mo1164o()) {
                sb.append(" ignored");
            }
            if (mo1161l()) {
                sb.append(" tmpDetached");
            }
            if (!mo1158i()) {
                StringBuilder a = C1965a.m4756a(" not recyclable(");
                a.append(this.f769m);
                a.append(")");
                sb.append(a.toString());
            }
            if ((this.f766j & 512) == 0 && !mo1157h()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f757a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append(Objects.ARRAY_END);
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0106e implements C1578b {
        public C0106e() {
        }

        /* renamed from: a */
        public int mo1167a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: a */
        public View mo1168a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo1169b(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0107f implements C1571a {
        public C0107f() {
        }

        /* renamed from: a */
        public C0105d0 mo1170a(int i) {
            C0105d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo6289c(findViewHolderForPosition.f757a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: a */
        public void mo1171a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: a */
        public void mo1172a(C1572b bVar) {
            int i = bVar.f4592a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo859a(recyclerView, bVar.f4593b, bVar.f4595d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo869b(recyclerView2, bVar.f4593b, bVar.f4595d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo861a(recyclerView3, bVar.f4593b, bVar.f4595d, bVar.f4594c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo860a(recyclerView4, bVar.f4593b, bVar.f4595d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0108g<VH extends C0105d0> {

        /* renamed from: a */
        public final C0110h f778a = new C0110h();

        /* renamed from: b */
        public boolean f779b = false;

        /* renamed from: c */
        public C0109a f780c = C0109a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$g$a */
        public enum C0109a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* renamed from: a */
        public long mo1173a(int i) {
            return -1;
        }

        /* renamed from: a */
        public abstract VH mo1174a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        public abstract void mo1175a(VH vh, int i);

        /* renamed from: a */
        public void mo1176a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public boolean mo1177a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public abstract int mo1178b();

        /* renamed from: b */
        public void mo1179b(VH vh) {
        }

        /* renamed from: b */
        public void mo1180b(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo1181c(VH vh) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0110h extends Observable<C0111i> {
        /* renamed from: a */
        public boolean mo1182a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo1183b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0111i) this.mObservers.get(size)).mo1184a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0111i {
        /* renamed from: a */
        public void mo1184a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0112j {
        /* renamed from: a */
        int mo1185a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0113k {
        /* renamed from: a */
        public EdgeEffect mo1186a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0114l {

        /* renamed from: a */
        public C0116b f785a = null;

        /* renamed from: b */
        public ArrayList<C0115a> f786b = new ArrayList<>();

        /* renamed from: c */
        public long f787c = 120;

        /* renamed from: d */
        public long f788d = 120;

        /* renamed from: e */
        public long f789e = 250;

        /* renamed from: f */
        public long f790f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0115a {
            /* renamed from: a */
            void mo1195a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C0116b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0117c {

            /* renamed from: a */
            public int f791a;

            /* renamed from: b */
            public int f792b;
        }

        /* renamed from: d */
        public static int m487d(C0105d0 d0Var) {
            int i = d0Var.f766j & 14;
            if (d0Var.mo1157h()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int i2 = d0Var.f760d;
                int c = d0Var.mo1152c();
                if (!(i2 == -1 || c == -1 || i2 == c)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public final void mo1187a() {
            int size = this.f786b.size();
            for (int i = 0; i < size; i++) {
                ((C0115a) this.f786b.get(i)).mo1195a();
            }
            this.f786b.clear();
        }

        /* renamed from: a */
        public abstract boolean mo1189a(C0105d0 d0Var, C0105d0 d0Var2, C0117c cVar, C0117c cVar2);

        /* renamed from: a */
        public boolean mo1190a(C0105d0 d0Var, List<Object> list) {
            return !((C1611w) this).f4739g || d0Var.mo1157h();
        }

        /* renamed from: b */
        public abstract void mo1191b();

        /* renamed from: b */
        public abstract void mo1192b(C0105d0 d0Var);

        /* renamed from: c */
        public C0117c mo1193c(C0105d0 d0Var) {
            C0117c cVar = new C0117c();
            View view = d0Var.f757a;
            cVar.f791a = view.getLeft();
            cVar.f792b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        /* renamed from: c */
        public abstract boolean mo1194c();

        /* renamed from: a */
        public final void mo1188a(C0105d0 d0Var) {
            C0116b bVar = this.f785a;
            if (bVar != null) {
                C0118m mVar = (C0118m) bVar;
                if (mVar != null) {
                    boolean z = true;
                    d0Var.mo1149a(true);
                    if (d0Var.f764h != null && d0Var.f765i == null) {
                        d0Var.f764h = null;
                    }
                    d0Var.f765i = null;
                    if ((d0Var.f766j & 16) == 0) {
                        z = false;
                    }
                    if (!z && !RecyclerView.this.removeAnimatingView(d0Var.f757a) && d0Var.mo1161l()) {
                        RecyclerView.this.removeDetachedView(d0Var.f757a, false);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C0118m implements C0116b {
        public C0118m() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0119n {
        /* renamed from: a */
        public void mo1196a(Canvas canvas, RecyclerView recyclerView, C0099a0 a0Var) {
        }

        /* renamed from: b */
        public void mo1197b(Canvas canvas, RecyclerView recyclerView, C0099a0 a0Var) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0120o {

        /* renamed from: a */
        public C1576b f794a;

        /* renamed from: b */
        public RecyclerView f795b;

        /* renamed from: c */
        public final C1617b f796c = new C0121a();

        /* renamed from: d */
        public final C1617b f797d = new C0122b();

        /* renamed from: e */
        public C1615z f798e = new C1615z(this.f796c);

        /* renamed from: f */
        public C1615z f799f = new C1615z(this.f797d);

        /* renamed from: g */
        public C0137z f800g;

        /* renamed from: h */
        public boolean f801h = false;

        /* renamed from: i */
        public boolean f802i = false;

        /* renamed from: j */
        public boolean f803j = false;

        /* renamed from: k */
        public boolean f804k = true;

        /* renamed from: l */
        public boolean f805l = true;

        /* renamed from: m */
        public int f806m;

        /* renamed from: n */
        public boolean f807n;

        /* renamed from: o */
        public int f808o;

        /* renamed from: p */
        public int f809p;

        /* renamed from: q */
        public int f810q;

        /* renamed from: r */
        public int f811r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class C0121a implements C1617b {
            public C0121a() {
            }

            /* renamed from: a */
            public int mo1243a() {
                C0120o oVar = C0120o.this;
                return oVar.f810q - oVar.mo1240l();
            }

            /* renamed from: a */
            public int mo1244a(View view) {
                return C0120o.this.mo1223d(view) - ((C0125p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public View mo1245a(int i) {
                return C0120o.this.mo1219c(i);
            }

            /* renamed from: b */
            public int mo1246b() {
                return C0120o.this.mo1239k();
            }

            /* renamed from: b */
            public int mo1247b(View view) {
                return C0120o.this.mo1232g(view) + ((C0125p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class C0122b implements C1617b {
            public C0122b() {
            }

            /* renamed from: a */
            public int mo1243a() {
                C0120o oVar = C0120o.this;
                return oVar.f811r - oVar.mo1238j();
            }

            /* renamed from: a */
            public int mo1244a(View view) {
                return C0120o.this.mo1235h(view) - ((C0125p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public View mo1245a(int i) {
                return C0120o.this.mo1219c(i);
            }

            /* renamed from: b */
            public int mo1246b() {
                return C0120o.this.mo1241m();
            }

            /* renamed from: b */
            public int mo1247b(View view) {
                return C0120o.this.mo1218c(view) + ((C0125p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0123c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0124d {

            /* renamed from: a */
            public int f814a;

            /* renamed from: b */
            public int f815b;

            /* renamed from: c */
            public boolean f816c;

            /* renamed from: d */
            public boolean f817d;
        }

        /* renamed from: a */
        public static int m499a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m500a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0120o.m500a(int, int, int, int, boolean):int");
        }

        /* renamed from: a */
        public static C0124d m501a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0124d dVar = new C0124d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1569c.RecyclerView, i, i2);
            dVar.f814a = obtainStyledAttributes.getInt(C1569c.RecyclerView_android_orientation, 1);
            dVar.f815b = obtainStyledAttributes.getInt(C1569c.RecyclerView_spanCount, 1);
            dVar.f816c = obtainStyledAttributes.getBoolean(C1569c.RecyclerView_reverseLayout, false);
            dVar.f817d = obtainStyledAttributes.getBoolean(C1569c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: b */
        public static boolean m502b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: a */
        public int mo845a(int i, C0132v vVar, C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo885a(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo846a(C0132v vVar, C0099a0 a0Var) {
            return -1;
        }

        /* renamed from: a */
        public View mo848a(View view, int i, C0132v vVar, C0099a0 a0Var) {
            return null;
        }

        /* renamed from: a */
        public C0125p mo850a(Context context, AttributeSet attributeSet) {
            return new C0125p(context, attributeSet);
        }

        /* renamed from: a */
        public C0125p mo851a(LayoutParams layoutParams) {
            return layoutParams instanceof C0125p ? new C0125p((C0125p) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0125p((MarginLayoutParams) layoutParams) : new C0125p(layoutParams);
        }

        /* renamed from: a */
        public void mo1198a(int i, int i2) {
            this.f810q = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            this.f808o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f810q = 0;
            }
            this.f811r = MeasureSpec.getSize(i2);
            int mode2 = MeasureSpec.getMode(i2);
            this.f809p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f811r = 0;
            }
        }

        /* renamed from: a */
        public void mo890a(int i, int i2, C0099a0 a0Var, C0123c cVar) {
        }

        /* renamed from: a */
        public void mo892a(int i, C0123c cVar) {
        }

        /* renamed from: a */
        public void mo1199a(int i, C0132v vVar) {
            View c = mo1219c(i);
            mo1233g(i);
            vVar.mo1263a(c);
        }

        /* renamed from: a */
        public void mo893a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo1200a(View view) {
            mo1202a(view, -1, false);
        }

        /* renamed from: a */
        public void mo1201a(View view, int i, int i2, int i3, int i4) {
            C0125p pVar = (C0125p) view.getLayoutParams();
            Rect rect = pVar.f819b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo1204a(View view, C1429b bVar) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo1159j() && !this.f794a.mo6289c(childViewHolderInt.f757a)) {
                RecyclerView recyclerView = this.f795b;
                mo855a(recyclerView.mRecycler, recyclerView.mState, view, bVar);
            }
        }

        /* renamed from: a */
        public void mo1205a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((C0125p) view.getLayoutParams()).f819b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f795b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f795b.mTempRectF;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo1206a(C0108g gVar, C0108g gVar2) {
        }

        /* renamed from: a */
        public void mo855a(C0132v vVar, C0099a0 a0Var, View view, C1429b bVar) {
        }

        /* renamed from: a */
        public void mo858a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo859a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo860a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo861a(RecyclerView recyclerView, int i, int i2, Object obj) {
        }

        /* renamed from: a */
        public void mo898a(RecyclerView recyclerView, C0099a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: a */
        public void mo899a(RecyclerView recyclerView, C0132v vVar) {
        }

        /* renamed from: a */
        public void mo900a(String str) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: a */
        public boolean mo901a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo1210a(View view, int i, int i2, C0125p pVar) {
            return view.isLayoutRequested() || !this.f804k || !m502b(view.getWidth(), i, pVar.width) || !m502b(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: a */
        public boolean mo863a(C0125p pVar) {
            return pVar != null;
        }

        /* renamed from: b */
        public int mo864b(int i, C0132v vVar, C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo865b(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo866b(C0132v vVar, C0099a0 a0Var) {
            return -1;
        }

        /* renamed from: b */
        public View mo1213b(View view) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView == null) {
                return null;
            }
            View findContainingItemView = recyclerView.findContainingItemView(view);
            if (findContainingItemView != null && !this.f794a.f4604c.contains(findContainingItemView)) {
                return findContainingItemView;
            }
            return null;
        }

        /* renamed from: b */
        public void mo1215b(C0132v vVar) {
            for (int d = mo1222d() - 1; d >= 0; d--) {
                if (!RecyclerView.getChildViewHolderInt(mo1219c(d)).mo1164o()) {
                    mo1199a(d, vVar);
                }
            }
        }

        /* renamed from: b */
        public void mo1216b(RecyclerView recyclerView) {
            mo1198a(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: b */
        public void mo869b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo905b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1217b(View view, int i, int i2, C0125p pVar) {
            return !this.f804k || !m502b(view.getMeasuredWidth(), i, pVar.width) || !m502b(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: c */
        public int mo870c(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public View mo1219c(int i) {
            C1576b bVar = this.f794a;
            if (bVar == null) {
                return null;
            }
            return ((C0106e) bVar.f4602a).mo1168a(bVar.mo6288c(i));
        }

        /* renamed from: c */
        public abstract C0125p mo872c();

        /* renamed from: c */
        public void mo873c(C0132v vVar, C0099a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: c */
        public void mo1221c(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f795b = null;
                this.f794a = null;
                i = 0;
                this.f810q = 0;
            } else {
                this.f795b = recyclerView;
                this.f794a = recyclerView.mChildHelper;
                this.f810q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f811r = i;
            this.f808o = 1073741824;
            this.f809p = 1073741824;
        }

        /* renamed from: d */
        public int mo1222d() {
            C1576b bVar = this.f794a;
            if (bVar != null) {
                return bVar.mo6280a();
            }
            return 0;
        }

        /* renamed from: d */
        public int mo1223d(View view) {
            return view.getLeft() - ((C0125p) view.getLayoutParams()).f819b.left;
        }

        /* renamed from: d */
        public int mo908d(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: d */
        public void mo1224d(int i) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: e */
        public int mo1225e(View view) {
            Rect rect = ((C0125p) view.getLayoutParams()).f819b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: e */
        public int mo874e(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: e */
        public View mo1226e() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f794a.f4604c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: e */
        public void mo1227e(int i) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: f */
        public int mo1228f() {
            RecyclerView recyclerView = this.f795b;
            C0108g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo1178b();
            }
            return 0;
        }

        /* renamed from: f */
        public int mo1229f(View view) {
            Rect rect = ((C0125p) view.getLayoutParams()).f819b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: f */
        public int mo876f(C0099a0 a0Var) {
            return 0;
        }

        /* renamed from: f */
        public void mo1230f(int i) {
        }

        /* renamed from: g */
        public int mo1231g() {
            return C1404o.m3551l(this.f795b);
        }

        /* renamed from: g */
        public int mo1232g(View view) {
            return view.getRight() + ((C0125p) view.getLayoutParams()).f819b.right;
        }

        /* renamed from: g */
        public void mo877g(C0099a0 a0Var) {
        }

        /* renamed from: h */
        public int mo1234h() {
            return C1404o.m3552m(this.f795b);
        }

        /* renamed from: h */
        public int mo1235h(View view) {
            return view.getTop() - ((C0125p) view.getLayoutParams()).f819b.top;
        }

        /* renamed from: h */
        public void mo914h(int i) {
        }

        /* renamed from: i */
        public int mo1236i() {
            return C1404o.m3553n(this.f795b);
        }

        /* renamed from: i */
        public int mo1237i(View view) {
            return ((C0125p) view.getLayoutParams()).mo1248a();
        }

        /* renamed from: j */
        public int mo1238j() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: k */
        public int mo1239k() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: l */
        public int mo1240l() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: m */
        public int mo1241m() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: n */
        public boolean mo919n() {
            return this.f803j;
        }

        /* renamed from: o */
        public Parcelable mo920o() {
            return null;
        }

        /* renamed from: p */
        public void mo1242p() {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: q */
        public boolean mo921q() {
            return false;
        }

        /* renamed from: r */
        public boolean mo880r() {
            return false;
        }

        /* renamed from: a */
        public final void mo1202a(View view, int i, boolean z) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo1159j()) {
                this.f795b.mViewInfoStore.mo6274a(childViewHolderInt);
            } else {
                this.f795b.mViewInfoStore.mo6278c(childViewHolderInt);
            }
            C0125p pVar = (C0125p) view.getLayoutParams();
            if (childViewHolderInt.mo1165p() || childViewHolderInt.mo1160k()) {
                if (childViewHolderInt.mo1160k()) {
                    childViewHolderInt.f770n.mo1270b(childViewHolderInt);
                } else {
                    childViewHolderInt.mo1150b();
                }
                this.f794a.mo6283a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f795b) {
                int b = this.f794a.mo6286b(view);
                if (i == -1) {
                    i = this.f794a.mo6280a();
                }
                if (b == -1) {
                    StringBuilder a = C1965a.m4756a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    a.append(this.f795b.indexOfChild(view));
                    throw new IllegalStateException(C1965a.m4746a(this.f795b, a));
                } else if (b != i) {
                    C0120o oVar = this.f795b.mLayout;
                    View c = oVar.mo1219c(b);
                    if (c != null) {
                        oVar.mo1219c(b);
                        oVar.f794a.mo6281a(b);
                        C0125p pVar2 = (C0125p) c.getLayoutParams();
                        C0105d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(c);
                        if (childViewHolderInt2.mo1159j()) {
                            oVar.f795b.mViewInfoStore.mo6274a(childViewHolderInt2);
                        } else {
                            oVar.f795b.mViewInfoStore.mo6278c(childViewHolderInt2);
                        }
                        oVar.f794a.mo6283a(c, i, pVar2, childViewHolderInt2.mo1159j());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot move a child from non-existing index:");
                        sb.append(b);
                        sb.append(oVar.f795b.toString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else {
                this.f794a.mo6284a(view, i, false);
                pVar.f820c = true;
                C0137z zVar = this.f800g;
                if (zVar != null && zVar.f842e && zVar.f839b.getChildLayoutPosition(view) == zVar.f838a) {
                    zVar.f843f = view;
                }
            }
            if (pVar.f821d) {
                childViewHolderInt.f757a.invalidate();
                pVar.f821d = false;
            }
        }

        /* renamed from: b */
        public View mo903b(int i) {
            int d = mo1222d();
            for (int i2 = 0; i2 < d; i2++) {
                View c = mo1219c(i2);
                C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                if (childViewHolderInt != null && childViewHolderInt.mo1153d() == i && !childViewHolderInt.mo1164o() && (this.f795b.mState.f738g || !childViewHolderInt.mo1159j())) {
                    return c;
                }
            }
            return null;
        }

        /* renamed from: c */
        public int mo1218c(View view) {
            return view.getBottom() + ((C0125p) view.getLayoutParams()).f819b.bottom;
        }

        /* renamed from: g */
        public void mo1233g(int i) {
            if (mo1219c(i) != null) {
                C1576b bVar = this.f794a;
                int c = bVar.mo6288c(i);
                View a = ((C0106e) bVar.f4602a).mo1168a(c);
                if (a != null) {
                    if (bVar.f4603b.mo6299d(c)) {
                        bVar.mo6291d(a);
                    }
                    ((C0106e) bVar.f4602a).mo1169b(c);
                }
            }
        }

        /* renamed from: c */
        public void mo1220c(C0132v vVar) {
            int size = vVar.f828a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = ((C0105d0) vVar.f828a.get(i)).f757a;
                C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.mo1164o()) {
                    childViewHolderInt.mo1149a(false);
                    if (childViewHolderInt.mo1161l()) {
                        this.f795b.removeDetachedView(view, false);
                    }
                    C0114l lVar = this.f795b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo1192b(childViewHolderInt);
                    }
                    childViewHolderInt.mo1149a(true);
                    C0105d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.f770n = null;
                    childViewHolderInt2.f771o = false;
                    childViewHolderInt2.mo1150b();
                    vVar.mo1265a(childViewHolderInt2);
                }
            }
            vVar.f828a.clear();
            ArrayList<C0105d0> arrayList = vVar.f829b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f795b.invalidate();
            }
        }

        /* renamed from: b */
        public void mo1214b(int i, int i2) {
            int d = mo1222d();
            if (d == 0) {
                this.f795b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < d; i7++) {
                View c = mo1219c(i7);
                Rect rect = this.f795b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(c, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f795b.mTempRect.set(i4, i5, i3, i6);
            mo852a(this.f795b.mTempRect, i, i2);
        }

        /* renamed from: a */
        public void mo1207a(C0132v vVar) {
            for (int d = mo1222d() - 1; d >= 0; d--) {
                View c = mo1219c(d);
                C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                if (!childViewHolderInt.mo1164o()) {
                    if (!childViewHolderInt.mo1157h() || childViewHolderInt.mo1159j() || this.f795b.mAdapter.f779b) {
                        mo1219c(d);
                        this.f794a.mo6281a(d);
                        vVar.mo1269b(c);
                        this.f795b.mViewInfoStore.mo6278c(childViewHolderInt);
                    } else {
                        mo1233g(d);
                        vVar.mo1265a(childViewHolderInt);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo894a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f795b;
            C0132v vVar = recyclerView.mRecycler;
            C0099a0 a0Var = recyclerView.mState;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f795b.canScrollVertically(-1) && !this.f795b.canScrollHorizontally(-1) && !this.f795b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0108g gVar = this.f795b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo1178b());
                }
            }
        }

        /* renamed from: a */
        public void mo1208a(C0132v vVar, C0099a0 a0Var, C1429b bVar) {
            if (this.f795b.canScrollVertically(-1) || this.f795b.canScrollHorizontally(-1)) {
                bVar.f4203a.addAction(8192);
                bVar.f4203a.setScrollable(true);
            }
            if (this.f795b.canScrollVertically(1) || this.f795b.canScrollHorizontally(1)) {
                bVar.f4203a.addAction(4096);
                bVar.f4203a.setScrollable(true);
            }
            bVar.mo5946a((Object) new C1431b(CollectionInfo.obtain(mo866b(vVar, a0Var), mo846a(vVar, a0Var), false, 0)));
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1211a(androidx.recyclerview.widget.RecyclerView.C0132v r8, androidx.recyclerview.widget.RecyclerView.C0099a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f795b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x003e
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x006b
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0027
                int r8 = r7.f811r
                int r11 = r7.mo1241m()
                int r8 = r8 - r11
                int r11 = r7.mo1238j()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0028
            L_0x0027:
                r8 = r9
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f795b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f810q
                int r11 = r7.mo1239k()
                int r10 = r10 - r11
                int r11 = r7.mo1240l()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0066
            L_0x003e:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0051
                int r8 = r7.f811r
                int r10 = r7.mo1241m()
                int r8 = r8 - r10
                int r10 = r7.mo1238j()
                int r8 = r8 - r10
                goto L_0x0052
            L_0x0051:
                r8 = r9
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f795b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f810q
                int r11 = r7.mo1239k()
                int r10 = r10 - r11
                int r11 = r7.mo1240l()
                int r10 = r10 - r11
            L_0x0066:
                r3 = r8
                r2 = r10
                goto L_0x006b
            L_0x0069:
                r3 = r8
                r2 = r9
            L_0x006b:
                if (r3 != 0) goto L_0x0070
                if (r2 != 0) goto L_0x0070
                return r9
            L_0x0070:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f795b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0120o.mo1211a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public void mo1203a(View view, C0132v vVar) {
            C1576b bVar = this.f794a;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f4603b.mo6299d(indexOfChild)) {
                    bVar.mo6291d(view);
                }
                ((C0106e) bVar.f4602a).mo1169b(indexOfChild);
            }
            vVar.mo1263a(view);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
            if (r14 == false) goto L_0x00ba;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1212a(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.mo1239k()
                int r2 = r9.mo1241m()
                int r3 = r9.f810q
                int r4 = r9.mo1240l()
                int r3 = r3 - r4
                int r4 = r9.f811r
                int r5 = r9.mo1238j()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.mo1231g()
                r8 = 1
                if (r4 != r8) goto L_0x005f
                if (r3 == 0) goto L_0x005a
                goto L_0x0067
            L_0x005a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L_0x0067
            L_0x005f:
                if (r7 == 0) goto L_0x0062
                goto L_0x0066
            L_0x0062:
                int r7 = java.lang.Math.min(r5, r3)
            L_0x0066:
                r3 = r7
            L_0x0067:
                if (r2 == 0) goto L_0x006a
                goto L_0x006e
            L_0x006a:
                int r2 = java.lang.Math.min(r6, r12)
            L_0x006e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00b5
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x0080
            L_0x007e:
                r14 = r1
                goto L_0x00b3
            L_0x0080:
                int r0 = r9.mo1239k()
                int r2 = r9.mo1241m()
                int r3 = r9.f810q
                int r4 = r9.mo1240l()
                int r3 = r3 - r4
                int r4 = r9.f811r
                int r5 = r9.mo1238j()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f795b
                android.graphics.Rect r5 = r5.mTempRect
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x007e
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x007e
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x007e
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto L_0x00b2
                goto L_0x007e
            L_0x00b2:
                r14 = r8
            L_0x00b3:
                if (r14 == 0) goto L_0x00ba
            L_0x00b5:
                if (r11 != 0) goto L_0x00bb
                if (r12 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                return r1
            L_0x00bb:
                if (r13 == 0) goto L_0x00c1
                r10.scrollBy(r11, r12)
                goto L_0x00c4
            L_0x00c1:
                r10.smoothScrollBy(r11, r12)
            L_0x00c4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0120o.mo1212a(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: a */
        public void mo852a(Rect rect, int i, int i2) {
            int l = mo1240l() + mo1239k() + rect.width();
            int j = mo1238j() + mo1241m() + rect.height();
            this.f795b.setMeasuredDimension(m499a(i, l, mo1236i()), m499a(i2, j, mo1234h()));
        }

        /* renamed from: a */
        public void mo1209a(C0137z zVar) {
            C0137z zVar2 = this.f800g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.f842e)) {
                zVar2.mo1278a();
            }
            this.f800g = zVar;
            RecyclerView recyclerView = this.f795b;
            if (zVar != null) {
                recyclerView.mViewFlinger.mo1142b();
                if (zVar.f845h) {
                    StringBuilder a = C1965a.m4756a("An instance of ");
                    a.append(zVar.getClass().getSimpleName());
                    a.append(" was started more than once. Each instance of");
                    a.append(zVar.getClass().getSimpleName());
                    a.append(" is intended to only be used once. You should create a new instance for each use.");
                    Log.w(RecyclerView.TAG, a.toString());
                }
                zVar.f839b = recyclerView;
                zVar.f840c = this;
                int i = zVar.f838a;
                if (i != -1) {
                    recyclerView.mState.f732a = i;
                    zVar.f842e = true;
                    zVar.f841d = true;
                    zVar.f843f = recyclerView.mLayout.mo903b(i);
                    zVar.f839b.mViewFlinger.mo1140a();
                    zVar.f845h = true;
                    return;
                }
                throw new IllegalArgumentException("Invalid target position");
            }
            throw null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0125p extends MarginLayoutParams {

        /* renamed from: a */
        public C0105d0 f818a;

        /* renamed from: b */
        public final Rect f819b = new Rect();

        /* renamed from: c */
        public boolean f820c = true;

        /* renamed from: d */
        public boolean f821d = false;

        public C0125p(int i, int i2) {
            super(i, i2);
        }

        public C0125p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0125p(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0125p(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0125p(C0125p pVar) {
            super(pVar);
        }

        /* renamed from: a */
        public int mo1248a() {
            return this.f818a.mo1153d();
        }

        /* renamed from: b */
        public boolean mo1249b() {
            return this.f818a.mo1162m();
        }

        /* renamed from: c */
        public boolean mo1250c() {
            return this.f818a.mo1159j();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0126q {
        /* renamed from: a */
        void mo1251a(View view);

        /* renamed from: b */
        void mo1252b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0127r {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0128s {
        /* renamed from: a */
        void mo1253a(boolean z);

        /* renamed from: a */
        boolean mo1254a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo1255b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0129t {
        /* renamed from: a */
        public void mo1256a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo1257a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0130u {

        /* renamed from: a */
        public SparseArray<C0131a> f822a = new SparseArray<>();

        /* renamed from: b */
        public int f823b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class C0131a {

            /* renamed from: a */
            public final ArrayList<C0105d0> f824a = new ArrayList<>();

            /* renamed from: b */
            public int f825b = 5;

            /* renamed from: c */
            public long f826c = 0;

            /* renamed from: d */
            public long f827d = 0;
        }

        /* renamed from: a */
        public long mo1258a(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        /* renamed from: a */
        public final C0131a mo1259a(int i) {
            C0131a aVar = (C0131a) this.f822a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0131a aVar2 = new C0131a();
            this.f822a.put(i, aVar2);
            return aVar2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0132v {

        /* renamed from: a */
        public final ArrayList<C0105d0> f828a = new ArrayList<>();

        /* renamed from: b */
        public ArrayList<C0105d0> f829b = null;

        /* renamed from: c */
        public final ArrayList<C0105d0> f830c = new ArrayList<>();

        /* renamed from: d */
        public final List<C0105d0> f831d = Collections.unmodifiableList(this.f828a);

        /* renamed from: e */
        public int f832e = 2;

        /* renamed from: f */
        public int f833f = 2;

        /* renamed from: g */
        public C0130u f834g;

        public C0132v() {
        }

        /* renamed from: a */
        public void mo1262a() {
            this.f828a.clear();
            mo1271c();
        }

        /* renamed from: a */
        public final void mo1264a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    mo1264a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: a */
        public void mo1266a(C0105d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f757a;
            C1609v vVar = RecyclerView.this.mAccessibilityDelegate;
            if (vVar != null) {
                C1610a aVar = vVar.f4736e;
                C1404o.m3526a(view, aVar instanceof C1610a ? (C1387a) aVar.f4738e.remove(view) : null);
            }
            if (z) {
                C0133w wVar = RecyclerView.this.mRecyclerListener;
                if (wVar != null) {
                    wVar.mo1273a(d0Var);
                }
                C0108g gVar = RecyclerView.this.mAdapter;
                if (gVar != null) {
                    gVar.mo1181c(d0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.mo6279d(d0Var);
                }
            }
            d0Var.f775s = null;
            d0Var.f774r = null;
            C0130u b = mo1267b();
            if (b != null) {
                int i = d0Var.f762f;
                ArrayList<C0105d0> arrayList = b.mo1259a(i).f824a;
                if (((C0131a) b.f822a.get(i)).f825b > arrayList.size()) {
                    d0Var.mo1163n();
                    arrayList.add(d0Var);
                    return;
                }
                return;
            }
            throw null;
        }

        /* renamed from: b */
        public C0130u mo1267b() {
            if (this.f834g == null) {
                this.f834g = new C0130u();
            }
            return this.f834g;
        }

        /* renamed from: b */
        public void mo1268b(int i) {
            mo1266a((C0105d0) this.f830c.get(i), true);
            this.f830c.remove(i);
        }

        /* renamed from: b */
        public void mo1269b(View view) {
            ArrayList<C0105d0> arrayList;
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo1151b(12) && childViewHolderInt.mo1162m() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f829b == null) {
                    this.f829b = new ArrayList<>();
                }
                childViewHolderInt.f770n = this;
                childViewHolderInt.f771o = true;
                arrayList = this.f829b;
            } else if (!childViewHolderInt.mo1157h() || childViewHolderInt.mo1159j() || RecyclerView.this.mAdapter.f779b) {
                childViewHolderInt.f770n = this;
                childViewHolderInt.f771o = false;
                arrayList = this.f828a;
            } else {
                throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, C1965a.m4756a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            arrayList.add(childViewHolderInt);
        }

        /* renamed from: b */
        public void mo1270b(C0105d0 d0Var) {
            (d0Var.f771o ? this.f829b : this.f828a).remove(d0Var);
            d0Var.f770n = null;
            d0Var.f771o = false;
            d0Var.mo1150b();
        }

        /* renamed from: c */
        public void mo1271c() {
            for (int size = this.f830c.size() - 1; size >= 0; size--) {
                mo1268b(size);
            }
            this.f830c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                C1597b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f4702c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f4703d = 0;
            }
        }

        /* renamed from: d */
        public void mo1272d() {
            C0120o oVar = RecyclerView.this.mLayout;
            this.f833f = this.f832e + (oVar != null ? oVar.f806m : 0);
            for (int size = this.f830c.size() - 1; size >= 0 && this.f830c.size() > this.f833f; size--) {
                mo1268b(size);
            }
        }

        /* renamed from: a */
        public int mo1260a(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.mo1135a()) {
                StringBuilder a = C1965a.m4757a("invalid position ", i, ". State item count is ");
                a.append(RecyclerView.this.mState.mo1135a());
                throw new IndexOutOfBoundsException(C1965a.m4746a(RecyclerView.this, a));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mState.f738g) {
                return i;
            }
            return recyclerView.mAdapterHelper.mo6257a(i, 0);
        }

        /* renamed from: a */
        public void mo1263a(View view) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo1161l()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo1160k()) {
                childViewHolderInt.f770n.mo1270b(childViewHolderInt);
            } else if (childViewHolderInt.mo1165p()) {
                childViewHolderInt.mo1150b();
            }
            mo1265a(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo1158i()) {
                RecyclerView.this.mItemAnimator.mo1192b(childViewHolderInt);
            }
        }

        /* renamed from: a */
        public void mo1265a(C0105d0 d0Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (d0Var.mo1160k() || d0Var.f757a.getParent() != null) {
                StringBuilder a = C1965a.m4756a("Scrapped or attached views may not be recycled. isScrap:");
                a.append(d0Var.mo1160k());
                a.append(" isAttached:");
                if (d0Var.f757a.getParent() != null) {
                    z3 = true;
                }
                a.append(z3);
                throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, a));
            } else if (d0Var.mo1161l()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(d0Var);
                throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, sb));
            } else if (!d0Var.mo1164o()) {
                boolean z4 = (d0Var.f766j & 16) == 0 && C1404o.m3561v(d0Var.f757a);
                C0108g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && z4 && gVar.mo1177a(d0Var)) || d0Var.mo1158i()) {
                    if (this.f833f <= 0 || d0Var.mo1151b(526)) {
                        z2 = false;
                    } else {
                        int size = this.f830c.size();
                        if (size >= this.f833f && size > 0) {
                            mo1268b(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo6341a(d0Var.f759c)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (RecyclerView.this.mPrefetchRegistry.mo6341a(((C0105d0) this.f830c.get(size)).f759c));
                            size++;
                        }
                        this.f830c.add(size, d0Var);
                        z2 = true;
                    }
                    if (!z2) {
                        mo1266a(d0Var, true);
                        z3 = true;
                    }
                    z = z3;
                    z3 = z2;
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.mo6279d(d0Var);
                if (!z3 && !z && z4) {
                    d0Var.f775s = null;
                    d0Var.f774r = null;
                }
            } else {
                throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, C1965a.m4756a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e4, code lost:
            if (r7.f762f != 0) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x044e, code lost:
            if (r7.mo1157h() == false) goto L_0x0486;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x0484, code lost:
            if ((r11 == 0 || r11 + r9 < r18) == false) goto L_0x0486;
         */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0416  */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x0440  */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x046d  */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x0490  */
        /* JADX WARNING: Removed duplicated region for block: B:300:0x053b  */
        /* JADX WARNING: Removed duplicated region for block: B:301:0x0542  */
        /* JADX WARNING: Removed duplicated region for block: B:312:0x0564  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0105d0 mo1261a(int r16, boolean r17, long r18) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                if (r0 < 0) goto L_0x0565
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo1135a()
                if (r0 >= r2) goto L_0x0565
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                boolean r2 = r2.f738g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r2 = r1.f829b
                if (r2 == 0) goto L_0x0085
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0026
                goto L_0x0085
            L_0x0026:
                r6 = r5
            L_0x0027:
                if (r6 >= r2) goto L_0x0044
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f829b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$d0 r7 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r7
                boolean r8 = r7.mo1165p()
                if (r8 != 0) goto L_0x0041
                int r8 = r7.mo1153d()
                if (r8 != r0) goto L_0x0041
                r7.mo1145a(r3)
                goto L_0x0086
            L_0x0041:
                int r6 = r6 + 1
                goto L_0x0027
            L_0x0044:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r6.mAdapter
                boolean r7 = r7.f779b
                if (r7 == 0) goto L_0x0085
                p.p.d.a r6 = r6.mAdapterHelper
                int r6 = r6.mo6257a(r0, r5)
                if (r6 <= 0) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r7.mAdapter
                int r7 = r7.mo1178b()
                if (r6 >= r7) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r7.mAdapter
                long r6 = r7.mo1173a(r6)
                r8 = r5
            L_0x0067:
                if (r8 >= r2) goto L_0x0085
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f829b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r9
                boolean r10 = r9.mo1165p()
                if (r10 != 0) goto L_0x0082
                long r10 = r9.f761e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0082
                r9.mo1145a(r3)
                r7 = r9
                goto L_0x0086
            L_0x0082:
                int r8 = r8 + 1
                goto L_0x0067
            L_0x0085:
                r7 = r4
            L_0x0086:
                if (r7 == 0) goto L_0x008b
                r2 = 1
                goto L_0x008c
            L_0x008a:
                r7 = r4
            L_0x008b:
                r2 = r5
            L_0x008c:
                r6 = -1
                if (r7 != 0) goto L_0x0244
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f828a
                int r7 = r7.size()
                r8 = r5
            L_0x0096:
                if (r8 >= r7) goto L_0x00c8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f828a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r9
                boolean r10 = r9.mo1165p()
                if (r10 != 0) goto L_0x00c5
                int r10 = r9.mo1153d()
                if (r10 != r0) goto L_0x00c5
                boolean r10 = r9.mo1157h()
                if (r10 != 0) goto L_0x00c5
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r10 = r10.mState
                boolean r10 = r10.f738g
                if (r10 != 0) goto L_0x00c0
                boolean r10 = r9.mo1159j()
                if (r10 != 0) goto L_0x00c5
            L_0x00c0:
                r9.mo1145a(r3)
                goto L_0x01b3
            L_0x00c5:
                int r8 = r8 + 1
                goto L_0x0096
            L_0x00c8:
                if (r17 != 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.b r7 = r7.mChildHelper
                java.util.List<android.view.View> r8 = r7.f4604c
                int r8 = r8.size()
                r9 = r5
            L_0x00d5:
                if (r9 >= r8) goto L_0x0100
                java.util.List<android.view.View> r10 = r7.f4604c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                p.p.d.b$b r11 = r7.f4602a
                androidx.recyclerview.widget.RecyclerView$e r11 = (androidx.recyclerview.widget.RecyclerView.C0106e) r11
                if (r11 == 0) goto L_0x00ff
                androidx.recyclerview.widget.RecyclerView$d0 r11 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
                int r12 = r11.mo1153d()
                if (r12 != r0) goto L_0x00fc
                boolean r12 = r11.mo1157h()
                if (r12 != 0) goto L_0x00fc
                boolean r11 = r11.mo1159j()
                if (r11 != 0) goto L_0x00fc
                goto L_0x0101
            L_0x00fc:
                int r9 = r9 + 1
                goto L_0x00d5
            L_0x00ff:
                throw r4
            L_0x0100:
                r10 = r4
            L_0x0101:
                if (r10 == 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView$d0 r7 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.b r8 = r8.mChildHelper
                p.p.d.b$b r9 = r8.f4602a
                androidx.recyclerview.widget.RecyclerView$e r9 = (androidx.recyclerview.widget.RecyclerView.C0106e) r9
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0172
                p.p.d.b$a r11 = r8.f4603b
                boolean r11 = r11.mo6298c(r9)
                if (r11 == 0) goto L_0x015b
                p.p.d.b$a r11 = r8.f4603b
                r11.mo6294a(r9)
                r8.mo6291d(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.b r8 = r8.mChildHelper
                int r8 = r8.mo6286b(r10)
                if (r8 == r6) goto L_0x0142
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.b r9 = r9.mChildHelper
                r9.mo6281a(r8)
                r15.mo1269b(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.mo1145a(r8)
                goto L_0x01b9
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4746a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0172:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0189:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f830c
                int r7 = r7.size()
                r8 = r5
            L_0x0190:
                if (r8 >= r7) goto L_0x01b8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f830c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r9
                boolean r10 = r9.mo1157h()
                if (r10 != 0) goto L_0x01b5
                int r10 = r9.mo1153d()
                if (r10 != r0) goto L_0x01b5
                boolean r10 = r9.mo1155f()
                if (r10 != 0) goto L_0x01b5
                if (r17 != 0) goto L_0x01b3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f830c
                r7.remove(r8)
            L_0x01b3:
                r7 = r9
                goto L_0x01b9
            L_0x01b5:
                int r8 = r8 + 1
                goto L_0x0190
            L_0x01b8:
                r7 = r4
            L_0x01b9:
                if (r7 == 0) goto L_0x0244
                boolean r8 = r7.mo1159j()
                if (r8 == 0) goto L_0x01c8
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r8 = r8.mState
                boolean r8 = r8.f738g
                goto L_0x0200
            L_0x01c8:
                int r8 = r7.f759c
                if (r8 < 0) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo1178b()
                if (r8 >= r9) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r8.mState
                boolean r9 = r9.f738g
                if (r9 != 0) goto L_0x01e8
                androidx.recyclerview.widget.RecyclerView$g r8 = r8.mAdapter
                if (r8 == 0) goto L_0x01e7
                int r8 = r7.f762f
                if (r8 == 0) goto L_0x01e8
                goto L_0x01fd
            L_0x01e7:
                throw r4
            L_0x01e8:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r8 = r8.mAdapter
                boolean r9 = r8.f779b
                if (r9 == 0) goto L_0x01ff
                long r9 = r7.f761e
                int r11 = r7.f759c
                long r11 = r8.mo1173a(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fd
                goto L_0x01ff
            L_0x01fd:
                r8 = r5
                goto L_0x0200
            L_0x01ff:
                r8 = 1
            L_0x0200:
                if (r8 != 0) goto L_0x0229
                if (r17 != 0) goto L_0x0227
                r8 = 4
                r7.mo1145a(r8)
                boolean r8 = r7.mo1160k()
                if (r8 == 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f757a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$v r8 = r7.f770n
                r8.mo1270b(r7)
                goto L_0x0224
            L_0x021b:
                boolean r8 = r7.mo1165p()
                if (r8 == 0) goto L_0x0224
                r7.mo1150b()
            L_0x0224:
                r15.mo1265a(r7)
            L_0x0227:
                r7 = r4
                goto L_0x0244
            L_0x0229:
                r2 = 1
                goto L_0x0244
            L_0x022b:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4746a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0244:
                r8 = 2
                if (r7 != 0) goto L_0x03f9
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.a r11 = r11.mAdapterHelper
                int r11 = r11.mo6257a(r0, r5)
                if (r11 < 0) goto L_0x03c8
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r12 = r12.mAdapter
                int r12 = r12.mo1178b()
                if (r11 >= r12) goto L_0x03c8
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r12 = r12.mAdapter
                if (r12 == 0) goto L_0x03c7
                boolean r13 = r12.f779b
                if (r13 == 0) goto L_0x02fb
                long r12 = r12.mo1173a(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f828a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0270:
                if (r7 < 0) goto L_0x02c3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r14 = r1.f828a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r14 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r14
                long r9 = r14.f761e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02c0
                boolean r9 = r14.mo1165p()
                if (r9 != 0) goto L_0x02c0
                int r9 = r14.f762f
                if (r9 != 0) goto L_0x02a2
                r14.mo1145a(r3)
                boolean r3 = r14.mo1159j()
                if (r3 == 0) goto L_0x02a0
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f738g
                if (r3 != 0) goto L_0x02a0
                r3 = 14
                r14.mo1146a(r8, r3)
            L_0x02a0:
                r7 = r14
                goto L_0x02f6
            L_0x02a2:
                if (r17 != 0) goto L_0x02c0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f828a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r14.f757a
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r14.f757a
                androidx.recyclerview.widget.RecyclerView$d0 r9 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r9)
                r9.f770n = r4
                r9.f771o = r5
                r9.mo1150b()
                r15.mo1265a(r9)
            L_0x02c0:
                int r7 = r7 + -1
                goto L_0x0270
            L_0x02c3:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r3 = r1.f830c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02ca:
                if (r3 < 0) goto L_0x02f5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f830c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$d0 r7 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r7
                long r9 = r7.f761e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02f2
                boolean r9 = r7.mo1155f()
                if (r9 != 0) goto L_0x02f2
                int r9 = r7.f762f
                if (r9 != 0) goto L_0x02ec
                if (r17 != 0) goto L_0x02f6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f830c
                r9.remove(r3)
                goto L_0x02f6
            L_0x02ec:
                if (r17 != 0) goto L_0x02f2
                r15.mo1268b(r3)
                goto L_0x02f5
            L_0x02f2:
                int r3 = r3 + -1
                goto L_0x02ca
            L_0x02f5:
                r7 = r4
            L_0x02f6:
                if (r7 == 0) goto L_0x02fb
                r7.f759c = r11
                r2 = 1
            L_0x02fb:
                if (r7 != 0) goto L_0x0348
                androidx.recyclerview.widget.RecyclerView$u r3 = r15.mo1267b()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$u$a> r3 = r3.f822a
                java.lang.Object r3 = r3.get(r5)
                androidx.recyclerview.widget.RecyclerView$u$a r3 = (androidx.recyclerview.widget.RecyclerView.C0130u.C0131a) r3
                if (r3 == 0) goto L_0x0332
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r3.f824a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0332
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r3 = r3.f824a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x031a:
                if (r7 < 0) goto L_0x0332
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r6 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r6
                boolean r6 = r6.mo1155f()
                if (r6 != 0) goto L_0x032f
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r3 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r3
                goto L_0x0333
            L_0x032f:
                int r7 = r7 + -1
                goto L_0x031a
            L_0x0332:
                r3 = r4
            L_0x0333:
                if (r3 == 0) goto L_0x0347
                r3.mo1163n()
                boolean r6 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r6 == 0) goto L_0x0347
                android.view.View r6 = r3.f757a
                boolean r7 = r6 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x0347
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r15.mo1264a(r6, r5)
            L_0x0347:
                r7 = r3
            L_0x0348:
                if (r7 != 0) goto L_0x03f9
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x0373
                androidx.recyclerview.widget.RecyclerView$u r3 = r1.f834g
                androidx.recyclerview.widget.RecyclerView$u$a r3 = r3.mo1259a(r5)
                long r9 = r3.f826c
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x036f
                long r9 = r9 + r6
                int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                if (r3 >= 0) goto L_0x036d
                goto L_0x036f
            L_0x036d:
                r3 = r5
                goto L_0x0370
            L_0x036f:
                r3 = 1
            L_0x0370:
                if (r3 != 0) goto L_0x0373
                return r4
            L_0x0373:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r3.mAdapter
                if (r9 == 0) goto L_0x03c6
                java.lang.String r10 = "RV CreateView"
                p124p.p150h.p158h.C1353e.m3438a(r10)     // Catch:{ all -> 0x03c1 }
                androidx.recyclerview.widget.RecyclerView$d0 r3 = r9.mo1174a(r3, r5)     // Catch:{ all -> 0x03c1 }
                android.view.View r9 = r3.f757a     // Catch:{ all -> 0x03c1 }
                android.view.ViewParent r9 = r9.getParent()     // Catch:{ all -> 0x03c1 }
                if (r9 != 0) goto L_0x03b9
                r3.f762f = r5     // Catch:{ all -> 0x03c1 }
                android.os.Trace.endSection()
                boolean r9 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r9 == 0) goto L_0x03a2
                android.view.View r9 = r3.f757a
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r9)
                if (r9 == 0) goto L_0x03a2
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r9)
                r3.f758b = r10
            L_0x03a2:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r9.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r11 = r1.f834g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r11.mo1259a(r5)
                long r12 = r6.f826c
                long r9 = r11.mo1258a(r12, r9)
                r6.f826c = r9
                r7 = r3
                goto L_0x03f9
            L_0x03b9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03c1 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03c1 }
                throw r0     // Catch:{ all -> 0x03c1 }
            L_0x03c1:
                r0 = move-exception
                p124p.p150h.p158h.C1353e.m3437a()
                throw r0
            L_0x03c6:
                throw r4
            L_0x03c7:
                throw r4
            L_0x03c8:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                int r0 = r0.mo1135a()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4746a(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03f9:
                if (r2 == 0) goto L_0x0429
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f738g
                if (r3 != 0) goto L_0x0429
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r7.mo1151b(r3)
                if (r6 == 0) goto L_0x0429
                r7.mo1146a(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f741j
                if (r3 == 0) goto L_0x0429
                androidx.recyclerview.widget.RecyclerView.C0114l.m487d(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r3 = r3.mItemAnimator
                r7.mo1154e()
                androidx.recyclerview.widget.RecyclerView$l$c r3 = r3.mo1193c(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.recordAnimationInfoIfBouncedHiddenView(r7, r3)
            L_0x0429:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f738g
                if (r3 == 0) goto L_0x043a
                boolean r3 = r7.mo1156g()
                if (r3 == 0) goto L_0x043a
                r7.f763g = r0
                goto L_0x0486
            L_0x043a:
                boolean r3 = r7.mo1156g()
                if (r3 == 0) goto L_0x0450
                int r3 = r7.f766j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0447
                r3 = 1
                goto L_0x0448
            L_0x0447:
                r3 = r5
            L_0x0448:
                if (r3 != 0) goto L_0x0450
                boolean r3 = r7.mo1157h()
                if (r3 == 0) goto L_0x0486
            L_0x0450:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.a r3 = r3.mAdapterHelper
                int r3 = r3.mo6257a(r0, r5)
                r7.f775s = r4
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r7.f774r = r6
                int r8 = r7.f762f
                long r9 = r6.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x048a
                androidx.recyclerview.widget.RecyclerView$u r6 = r1.f834g
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r6.mo1259a(r8)
                long r11 = r6.f827d
                r13 = 0
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 == 0) goto L_0x0483
                long r11 = r11 + r9
                int r6 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
                if (r6 >= 0) goto L_0x0481
                goto L_0x0483
            L_0x0481:
                r6 = r5
                goto L_0x0484
            L_0x0483:
                r6 = 1
            L_0x0484:
                if (r6 != 0) goto L_0x048a
            L_0x0486:
                r0 = 1
                r3 = r5
                goto L_0x0533
            L_0x048a:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r6 = r6.mAdapter
                if (r6 == 0) goto L_0x0564
                androidx.recyclerview.widget.RecyclerView$g<? extends androidx.recyclerview.widget.RecyclerView$d0> r8 = r7.f775s
                if (r8 != 0) goto L_0x0496
                r8 = 1
                goto L_0x0497
            L_0x0496:
                r8 = r5
            L_0x0497:
                if (r8 == 0) goto L_0x04b0
                r7.f759c = r3
                boolean r11 = r6.f779b
                if (r11 == 0) goto L_0x04a5
                long r11 = r6.mo1173a(r3)
                r7.f761e = r11
            L_0x04a5:
                r11 = 519(0x207, float:7.27E-43)
                r12 = 1
                r7.mo1146a(r12, r11)
                java.lang.String r11 = "RV OnBindView"
                p124p.p150h.p158h.C1353e.m3438a(r11)
            L_0x04b0:
                r7.f775s = r6
                r7.mo1154e()
                r6.mo1175a(r7, r3)
                if (r8 == 0) goto L_0x04d9
                java.util.List<java.lang.Object> r3 = r7.f767k
                if (r3 == 0) goto L_0x04c1
                r3.clear()
            L_0x04c1:
                int r3 = r7.f766j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f766j = r3
                android.view.View r3 = r7.f757a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r6 = r3 instanceof androidx.recyclerview.widget.RecyclerView.C0125p
                if (r6 == 0) goto L_0x04d6
                androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.C0125p) r3
                r6 = 1
                r3.f820c = r6
            L_0x04d6:
                p124p.p150h.p158h.C1353e.m3437a()
            L_0x04d9:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r3 = r1.f834g
                int r6 = r7.f762f
                long r11 = r11 - r9
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r3.mo1259a(r6)
                long r8 = r6.f827d
                long r8 = r3.mo1258a(r8, r11)
                r6.f827d = r8
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                boolean r3 = r3.isAccessibilityEnabled()
                if (r3 == 0) goto L_0x0527
                android.view.View r3 = r7.f757a
                int r6 = p124p.p150h.p162l.C1404o.m3549j(r3)
                r8 = 1
                if (r6 != 0) goto L_0x0504
                r3.setImportantForAccessibility(r8)
            L_0x0504:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                p.p.d.v r6 = r6.mAccessibilityDelegate
                if (r6 != 0) goto L_0x050b
                goto L_0x0525
            L_0x050b:
                p.p.d.v$a r6 = r6.f4736e
                boolean r9 = r6 instanceof p124p.p180p.p181d.C1609v.C1610a
                if (r9 == 0) goto L_0x0522
                if (r6 == 0) goto L_0x0521
                p.h.l.a r4 = p124p.p150h.p162l.C1404o.m3534b(r3)
                if (r4 == 0) goto L_0x0522
                if (r4 == r6) goto L_0x0522
                java.util.Map<android.view.View, p.h.l.a> r9 = r6.f4738e
                r9.put(r3, r4)
                goto L_0x0522
            L_0x0521:
                throw r4
            L_0x0522:
                p124p.p150h.p162l.C1404o.m3526a(r3, r6)
            L_0x0525:
                r3 = r8
                goto L_0x0528
            L_0x0527:
                r3 = 1
            L_0x0528:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r4 = r4.mState
                boolean r4 = r4.f738g
                if (r4 == 0) goto L_0x0532
                r7.f763g = r0
            L_0x0532:
                r0 = r3
            L_0x0533:
                android.view.View r4 = r7.f757a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x0542
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                goto L_0x0550
            L_0x0542:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x0558
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams(r4)
            L_0x0550:
                androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.C0125p) r4
                android.view.View r6 = r7.f757a
                r6.setLayoutParams(r4)
                goto L_0x055a
            L_0x0558:
                androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.C0125p) r4
            L_0x055a:
                r4.f818a = r7
                if (r2 == 0) goto L_0x0561
                if (r3 == 0) goto L_0x0561
                r5 = r0
            L_0x0561:
                r4.f821d = r5
                return r7
            L_0x0564:
                throw r4
            L_0x0565:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                int r0 = r0.mo1135a()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4746a(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0132v.mo1261a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0133w {
        /* renamed from: a */
        void mo1273a(C0105d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C0134x extends C0111i {
        public C0134x() {
        }

        /* renamed from: a */
        public void mo1184a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f737f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo6268c()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0135y extends C1458a {
        public static final Creator<C0135y> CREATOR = new C0136a();

        /* renamed from: g */
        public Parcelable f837g;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public class C0136a implements ClassLoaderCreator<C0135y> {
            public Object createFromParcel(Parcel parcel) {
                return new C0135y(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0135y[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0135y(parcel, classLoader);
            }
        }

        public C0135y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0120o.class.getClassLoader();
            }
            this.f837g = parcel.readParcelable(classLoader);
        }

        public C0135y(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeParcelable(this.f837g, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0137z {

        /* renamed from: a */
        public int f838a = -1;

        /* renamed from: b */
        public RecyclerView f839b;

        /* renamed from: c */
        public C0120o f840c;

        /* renamed from: d */
        public boolean f841d;

        /* renamed from: e */
        public boolean f842e;

        /* renamed from: f */
        public View f843f;

        /* renamed from: g */
        public final C0138a f844g = new C0138a(0, 0);

        /* renamed from: h */
        public boolean f845h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0138a {

            /* renamed from: a */
            public int f846a;

            /* renamed from: b */
            public int f847b;

            /* renamed from: c */
            public int f848c;

            /* renamed from: d */
            public int f849d = -1;

            /* renamed from: e */
            public Interpolator f850e;

            /* renamed from: f */
            public boolean f851f = false;

            /* renamed from: g */
            public int f852g = 0;

            public C0138a(int i, int i2) {
                this.f846a = i;
                this.f847b = i2;
                this.f848c = RecyclerView.UNDEFINED_DURATION;
                this.f850e = null;
            }

            /* renamed from: a */
            public void mo1281a(int i, int i2, int i3, Interpolator interpolator) {
                this.f846a = i;
                this.f847b = i2;
                this.f848c = i3;
                this.f850e = interpolator;
                this.f851f = true;
            }

            /* renamed from: a */
            public void mo1282a(RecyclerView recyclerView) {
                int i = this.f849d;
                if (i >= 0) {
                    this.f849d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f851f = false;
                    return;
                }
                if (!this.f851f) {
                    this.f852g = 0;
                } else if (this.f850e == null || this.f848c >= 1) {
                    int i2 = this.f848c;
                    if (i2 >= 1) {
                        recyclerView.mViewFlinger.mo1141a(this.f846a, this.f847b, i2, this.f850e);
                        int i3 = this.f852g + 1;
                        this.f852g = i3;
                        if (i3 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f851f = false;
                    } else {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                } else {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0139b {
            /* renamed from: a */
            PointF mo887a(int i);
        }

        /* renamed from: a */
        public PointF mo1277a(int i) {
            C0120o oVar = this.f840c;
            if (oVar instanceof C0139b) {
                return ((C0139b) oVar).mo887a(i);
            }
            StringBuilder a = C1965a.m4756a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a.append(C0139b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, a.toString());
            return null;
        }

        /* renamed from: a */
        public abstract void mo1280a(View view, C0099a0 a0Var, C0138a aVar);

        /* renamed from: a */
        public void mo1279a(int i, int i2) {
            RecyclerView recyclerView = this.f839b;
            if (this.f838a == -1 || recyclerView == null) {
                mo1278a();
            }
            if (this.f841d && this.f843f == null && this.f840c != null) {
                PointF a = mo1277a(this.f838a);
                if (!(a == null || (a.x == 0.0f && a.y == 0.0f))) {
                    recyclerView.scrollStep((int) Math.signum(a.x), (int) Math.signum(a.y), null);
                }
            }
            boolean z = false;
            this.f841d = false;
            View view = this.f843f;
            if (view != null) {
                if (this.f839b.getChildLayoutPosition(view) == this.f838a) {
                    mo1280a(this.f843f, recyclerView.mState, this.f844g);
                    this.f844g.mo1282a(recyclerView);
                    mo1278a();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f843f = null;
                }
            }
            if (this.f842e) {
                C0099a0 a0Var = recyclerView.mState;
                C0138a aVar = this.f844g;
                C1600o oVar = (C1600o) this;
                if (oVar.f839b.mLayout.mo1222d() == 0) {
                    oVar.mo1278a();
                } else {
                    int i3 = oVar.f4724o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    oVar.f4724o = i4;
                    int i5 = oVar.f4725p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    oVar.f4725p = i6;
                    if (oVar.f4724o == 0 && i6 == 0) {
                        PointF a2 = oVar.mo1277a(oVar.f838a);
                        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                            aVar.f849d = oVar.f838a;
                            oVar.mo1278a();
                        } else {
                            float f = a2.x;
                            float f2 = f * f;
                            float f3 = a2.y;
                            float sqrt = (float) Math.sqrt((double) ((f3 * f3) + f2));
                            float f4 = a2.x / sqrt;
                            a2.x = f4;
                            float f5 = a2.y / sqrt;
                            a2.y = f5;
                            oVar.f4720k = a2;
                            oVar.f4724o = (int) (f4 * 10000.0f);
                            oVar.f4725p = (int) (f5 * 10000.0f);
                            aVar.mo1281a((int) (((float) oVar.f4724o) * 1.2f), (int) (((float) oVar.f4725p) * 1.2f), (int) (((float) oVar.mo6346c(10000)) * 1.2f), oVar.f4718i);
                        }
                    }
                }
                if (this.f844g.f849d >= 0) {
                    z = true;
                }
                this.f844g.mo1282a(recyclerView);
                if (z && this.f842e) {
                    this.f841d = true;
                    recyclerView.mViewFlinger.mo1140a();
                }
            }
        }

        /* renamed from: a */
        public final void mo1278a() {
            if (this.f842e) {
                this.f842e = false;
                C1600o oVar = (C1600o) this;
                oVar.f4725p = 0;
                oVar.f4724o = 0;
                oVar.f4720k = null;
                this.f839b.mState.f732a = -1;
                this.f843f = null;
                this.f838a = -1;
                this.f841d = false;
                C0120o oVar2 = this.f840c;
                if (oVar2.f800g == this) {
                    oVar2.f800g = null;
                }
                this.f840c = null;
                this.f839b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1567a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0134x();
        this.mRecycler = new C0132v();
        this.mViewInfoStore = new C1573a0();
        this.mUpdateChildViewsRunnable = new C0098a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0113k();
        this.mItemAnimator = new C1587k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0103c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1597b() : null;
        this.mState = new C0099a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0118m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C0100b();
        this.mViewInfoProcessCallback = new C0104d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C1412s.m3587b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C1412s.m3585a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f785a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C1404o.m3549j(this) == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1609v(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1569c.RecyclerView, i, 0);
        C1404o.m3518a(this, context, C1569c.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C1569c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C1569c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C1569c.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(C1569c.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C1569c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C1569c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C1569c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C1569c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
        C1404o.m3518a(this, context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    private void addAnimatingView(C0105d0 d0Var) {
        View view = d0Var.f757a;
        boolean z = view.getParent() == this;
        this.mRecycler.mo1270b(getChildViewHolder(view));
        if (d0Var.mo1161l()) {
            this.mChildHelper.mo6283a(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1576b bVar = this.mChildHelper;
        if (!z) {
            bVar.mo6284a(view, -1, true);
            return;
        }
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f4603b.mo6300e(indexOfChild);
            bVar.mo6282a(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    private void animateChange(C0105d0 d0Var, C0105d0 d0Var2, C0117c cVar, C0117c cVar2, boolean z, boolean z2) {
        d0Var.mo1149a(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f764h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo1270b(d0Var);
            d0Var2.mo1149a(false);
            d0Var2.f765i = d0Var;
        }
        if (this.mItemAnimator.mo1189a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(C0105d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f758b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            loop0:
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f758b = null;
                        break loop0;
                    } else if (view != d0Var.f757a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0120o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0120o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.mo1136a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f740i = false;
        startInterceptRequestLayout();
        C1573a0 a0Var = this.mViewInfoStore;
        a0Var.f4596a.clear();
        a0Var.f4597b.mo5517b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0099a0 a0Var2 = this.mState;
        a0Var2.f739h = a0Var2.f741j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        C0099a0 a0Var3 = this.mState;
        a0Var3.f738g = a0Var3.f742k;
        a0Var3.f736e = this.mAdapter.mo1178b();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f741j) {
            int a = this.mChildHelper.mo6280a();
            for (int i = 0; i < a; i++) {
                C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6287b(i));
                if (!childViewHolderInt.mo1164o() && (!childViewHolderInt.mo1157h() || this.mAdapter.f779b)) {
                    C0114l lVar = this.mItemAnimator;
                    C0114l.m487d(childViewHolderInt);
                    childViewHolderInt.mo1154e();
                    this.mViewInfoStore.mo6276b(childViewHolderInt, lVar.mo1193c(childViewHolderInt));
                    if (this.mState.f739h && childViewHolderInt.mo1162m() && !childViewHolderInt.mo1159j() && !childViewHolderInt.mo1164o() && !childViewHolderInt.mo1157h()) {
                        this.mViewInfoStore.f4597b.mo5520c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f742k) {
            saveOldPositions();
            C0099a0 a0Var4 = this.mState;
            boolean z = a0Var4.f737f;
            a0Var4.f737f = false;
            this.mLayout.mo873c(this.mRecycler, a0Var4);
            this.mState.f737f = z;
            for (int i2 = 0; i2 < this.mChildHelper.mo6280a(); i2++) {
                C0105d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo6287b(i2));
                if (!childViewHolderInt2.mo1164o()) {
                    C1574a aVar = (C1574a) this.mViewInfoStore.f4596a.getOrDefault(childViewHolderInt2, null);
                    if (!((aVar == null || (aVar.f4599a & 4) == 0) ? false : true)) {
                        C0114l.m487d(childViewHolderInt2);
                        boolean b = childViewHolderInt2.mo1151b(8192);
                        C0114l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.mo1154e();
                        C0117c c = lVar2.mo1193c(childViewHolderInt2);
                        if (b) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c);
                        } else {
                            C1573a0 a0Var5 = this.mViewInfoStore;
                            C1574a aVar2 = (C1574a) a0Var5.f4596a.getOrDefault(childViewHolderInt2, null);
                            if (aVar2 == null) {
                                aVar2 = C1574a.m3989a();
                                a0Var5.f4596a.put(childViewHolderInt2, aVar2);
                            }
                            aVar2.f4599a |= 2;
                            aVar2.f4600b = c;
                        }
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f735d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo1136a(6);
        this.mAdapterHelper.mo6265b();
        this.mState.f736e = this.mAdapter.mo1178b();
        this.mState.f734c = 0;
        boolean z = true;
        if (this.mPendingSavedState != null) {
            C0108g gVar = this.mAdapter;
            int ordinal = gVar.f780c.ordinal();
            if (ordinal == 1 ? gVar.mo1178b() > 0 : ordinal != 2) {
                Parcelable parcelable = this.mPendingSavedState.f837g;
                if (parcelable != null) {
                    this.mLayout.mo893a(parcelable);
                }
                this.mPendingSavedState = null;
            }
        }
        C0099a0 a0Var = this.mState;
        a0Var.f738g = false;
        this.mLayout.mo873c(this.mRecycler, a0Var);
        C0099a0 a0Var2 = this.mState;
        a0Var2.f737f = false;
        if (!a0Var2.f741j || this.mItemAnimator == null) {
            z = false;
        }
        a0Var2.f741j = z;
        this.mState.f735d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        boolean z;
        this.mState.mo1136a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0099a0 a0Var = this.mState;
        a0Var.f735d = 1;
        if (a0Var.f741j) {
            for (int a = this.mChildHelper.mo6280a() - 1; a >= 0; a--) {
                C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6287b(a));
                if (!childViewHolderInt.mo1164o()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    if (this.mItemAnimator != null) {
                        C0117c cVar = new C0117c();
                        View view = childViewHolderInt.f757a;
                        cVar.f791a = view.getLeft();
                        cVar.f792b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        C0105d0 d0Var = (C0105d0) this.mViewInfoStore.f4597b.mo5516b(changedHolderKey, null);
                        if (d0Var != null && !d0Var.mo1164o()) {
                            boolean b = this.mViewInfoStore.mo6277b(d0Var);
                            boolean b2 = this.mViewInfoStore.mo6277b(childViewHolderInt);
                            if (!b || d0Var != childViewHolderInt) {
                                C0117c a2 = this.mViewInfoStore.mo6273a(d0Var, 4);
                                this.mViewInfoStore.mo6275a(childViewHolderInt, cVar);
                                C0117c a3 = this.mViewInfoStore.mo6273a(childViewHolderInt, 8);
                                if (a2 == null) {
                                    handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, d0Var);
                                } else {
                                    animateChange(d0Var, childViewHolderInt, a2, a3, b, b2);
                                }
                            }
                        }
                        this.mViewInfoStore.mo6275a(childViewHolderInt, cVar);
                    } else {
                        throw null;
                    }
                }
            }
            C1573a0 a0Var2 = this.mViewInfoStore;
            C1575b bVar = this.mViewInfoProcessCallback;
            int i = a0Var2.f4596a.f3589g;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                C0105d0 d0Var2 = (C0105d0) a0Var2.f4596a.mo5593c(i);
                C1574a aVar = (C1574a) a0Var2.f4596a.mo5597d(i);
                int i2 = aVar.f4599a;
                if ((i2 & 3) != 3) {
                    if ((i2 & 1) != 0) {
                        C0117c cVar2 = aVar.f4600b;
                        if (cVar2 != null) {
                            C0117c cVar3 = aVar.f4601c;
                            C0104d dVar = (C0104d) bVar;
                            RecyclerView.this.mRecycler.mo1270b(d0Var2);
                            RecyclerView.this.animateDisappearance(d0Var2, cVar2, cVar3);
                        }
                    } else {
                        if ((i2 & 14) != 14) {
                            if ((i2 & 12) == 12) {
                                C0117c cVar4 = aVar.f4600b;
                                C0117c cVar5 = aVar.f4601c;
                                C0104d dVar2 = (C0104d) bVar;
                                if (dVar2 != null) {
                                    d0Var2.mo1149a(false);
                                    RecyclerView recyclerView = RecyclerView.this;
                                    boolean z2 = recyclerView.mDataSetHasChangedAfterLayout;
                                    C0114l lVar = recyclerView.mItemAnimator;
                                    if (!z2) {
                                        C1611w wVar = (C1611w) lVar;
                                        if (wVar != null) {
                                            if (cVar4.f791a == cVar5.f791a && cVar4.f792b == cVar5.f792b) {
                                                wVar.mo1188a(d0Var2);
                                                z = false;
                                            } else {
                                                z = wVar.mo6319a(d0Var2, cVar4.f791a, cVar4.f792b, cVar5.f791a, cVar5.f792b);
                                            }
                                            if (!z) {
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else if (!lVar.mo1189a(d0Var2, d0Var2, cVar4, cVar5)) {
                                    }
                                    RecyclerView.this.postAnimationRunner();
                                } else {
                                    throw null;
                                }
                            } else if ((i2 & 4) != 0) {
                                C0117c cVar6 = aVar.f4600b;
                                C0104d dVar3 = (C0104d) bVar;
                                RecyclerView.this.mRecycler.mo1270b(d0Var2);
                                RecyclerView.this.animateDisappearance(d0Var2, cVar6, null);
                            } else if ((i2 & 8) == 0) {
                            }
                        }
                        RecyclerView.this.animateAppearance(d0Var2, aVar.f4600b, aVar.f4601c);
                    }
                    C1574a.m3990a(aVar);
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo1203a(d0Var2.f757a, recyclerView2.mRecycler);
                C1574a.m3990a(aVar);
            }
        }
        this.mLayout.mo1220c(this.mRecycler);
        C0099a0 a0Var3 = this.mState;
        a0Var3.f733b = a0Var3.f736e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var3.f741j = false;
        a0Var3.f742k = false;
        this.mLayout.f801h = false;
        ArrayList<C0105d0> arrayList = this.mRecycler.f829b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0120o oVar = this.mLayout;
        if (oVar.f807n) {
            oVar.f806m = 0;
            oVar.f807n = false;
            this.mRecycler.mo1272d();
        }
        this.mLayout.mo877g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C1573a0 a0Var4 = this.mViewInfoStore;
        a0Var4.f4596a.clear();
        a0Var4.f4597b.mo5517b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C0128s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo1255b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C0128s sVar = (C0128s) this.mOnItemTouchListeners.get(i);
            if (!sVar.mo1254a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo6280a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < a; i3++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6287b(i3));
            if (!childViewHolderInt.mo1164o()) {
                int d = childViewHolderInt.mo1153d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        int i = this.mState.f743l;
        if (i == -1) {
            i = 0;
        }
        int a = this.mState.mo1135a();
        int i2 = i;
        while (i2 < a) {
            C0105d0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition == null) {
                break;
            } else if (findViewHolderForAdapterPosition.f757a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f757a;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0105d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition2 == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition2.f757a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f757a;
            }
        }
    }

    public static C0105d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0125p) view.getLayoutParams()).f818a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        Rect rect2 = pVar.f819b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(Strings.CURRENT_PATH)) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private C1397h getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1397h(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C0105d0 d0Var, C0105d0 d0Var2) {
        int a = this.mChildHelper.mo6280a();
        for (int i = 0; i < a; i++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6287b(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C0108g gVar = this.mAdapter;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.f779b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(str);
                    sb.append(d0Var);
                    throw new IllegalStateException(C1965a.m4746a(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(str);
                sb2.append(d0Var);
                throw new IllegalStateException(C1965a.m4746a(this, sb2));
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(d0Var2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(d0Var);
        sb3.append(exceptionLabel());
        Log.e(TAG, sb3.toString());
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.mo6280a();
        for (int i = 0; i < a; i++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6287b(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo1164o() && childViewHolderInt.mo1162m()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C1404o.m3550k(this) == 0 && VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1576b(new C0106e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (findContainingItemView(view2) == null) {
                return false;
            }
            if (view == null || findContainingItemView(view) == null) {
                return true;
            }
            this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
            this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            offsetDescendantRectToMyCoords(view2, this.mTempRect2);
            char c = 65535;
            int i3 = this.mLayout.mo1231g() == 1 ? -1 : 1;
            Rect rect = this.mTempRect;
            int i4 = rect.left;
            int i5 = this.mTempRect2.left;
            if ((i4 < i5 || rect.right <= i5) && this.mTempRect.right < this.mTempRect2.right) {
                i2 = 1;
            } else {
                Rect rect2 = this.mTempRect;
                int i6 = rect2.right;
                int i7 = this.mTempRect2.right;
                i2 = ((i6 > i7 || rect2.left >= i7) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
            }
            Rect rect3 = this.mTempRect;
            int i8 = rect3.top;
            int i9 = this.mTempRect2.top;
            if ((i8 < i9 || rect3.bottom <= i9) && this.mTempRect.bottom < this.mTempRect2.bottom) {
                c = 1;
            } else {
                Rect rect4 = this.mTempRect;
                int i10 = rect4.bottom;
                int i11 = this.mTempRect2.bottom;
                if ((i10 <= i11 && rect4.top < i11) || this.mTempRect.top <= this.mTempRect2.top) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    throw new IllegalArgumentException(C1965a.m4746a(this, sb));
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo880r();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C1570a aVar = this.mAdapterHelper;
            aVar.mo6260a((List<C1572b>) aVar.f4586b);
            aVar.mo6260a((List<C1572b>) aVar.f4587c);
            aVar.f4591g = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo858a(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo6269d();
        } else {
            this.mAdapterHelper.mo6265b();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f741j = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f801h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.f779b);
        C0099a0 a0Var = this.mState;
        if (a0Var.f741j && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        a0Var.f742k = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L_0x001c:
            r1.onPull(r4, r9)
            r9 = r3
            goto L_0x0039
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0038
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0053
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            r9.onPull(r1, r7)
            goto L_0x006f
        L_0x0053:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            r9.onPull(r1, r2)
            goto L_0x006f
        L_0x006e:
            r3 = r9
        L_0x006f:
            if (r3 != 0) goto L_0x0079
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p124p.p150h.p162l.C1404o.m3507B(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (!this.mChildHelper.mo6289c(focusedChild)) {
                        return;
                    }
                } else if (this.mChildHelper.mo6280a() == 0) {
                    requestFocus();
                    return;
                }
            }
            long j = this.mState.f744m;
            View view = null;
            C0105d0 findViewHolderForItemId = (j == -1 || !this.mAdapter.f779b) ? null : findViewHolderForItemId(j);
            if (findViewHolderForItemId != null && !this.mChildHelper.mo6289c(findViewHolderForItemId.f757a) && findViewHolderForItemId.f757a.hasFocusable()) {
                view = findViewHolderForItemId.f757a;
            } else if (this.mChildHelper.mo6280a() > 0) {
                view = findNextViewToFocus();
            }
            if (view != null) {
                int i = this.mState.f745n;
                if (((long) i) != -1) {
                    View findViewById = view.findViewById(i);
                    if (findViewById != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                }
                view.requestFocus();
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1404o.m3507B(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0125p) {
            C0125p pVar = (C0125p) layoutParams;
            if (!pVar.f820c) {
                Rect rect = pVar.f819b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo1212a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0099a0 a0Var = this.mState;
        a0Var.f744m = -1;
        a0Var.f743l = -1;
        a0Var.f745n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        C0105d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f744m = this.mAdapter.f779b ? d0Var.f761e : -1;
        C0099a0 a0Var = this.mState;
        int i = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.mo1159j() ? d0Var.f760d : d0Var.mo1152c();
        a0Var.f743l = i;
        this.mState.f745n = getDeepestFocusedViewWithId(d0Var.f757a);
    }

    private void setAdapterInternal(C0108g gVar, boolean z, boolean z2) {
        C0108g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.f778a.unregisterObserver(this.mObserver);
            this.mAdapter.mo1180b(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        C1570a aVar = this.mAdapterHelper;
        aVar.mo6260a((List<C1572b>) aVar.f4586b);
        aVar.mo6260a((List<C1572b>) aVar.f4587c);
        aVar.f4591g = 0;
        C0108g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.f778a.registerObserver(this.mObserver);
            gVar.mo1176a(this);
        }
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo1206a(gVar3, this.mAdapter);
        }
        C0132v vVar = this.mRecycler;
        C0108g gVar4 = this.mAdapter;
        vVar.mo1262a();
        C0130u b = vVar.mo1267b();
        if (b != null) {
            if (gVar3 != null) {
                b.f823b--;
            }
            if (!z && b.f823b == 0) {
                for (int i = 0; i < b.f822a.size(); i++) {
                    ((C0131a) b.f822a.valueAt(i)).f824a.clear();
                }
            }
            if (gVar4 != null) {
                b.f823b++;
            }
            this.mState.f737f = true;
            return;
        }
        throw null;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo1142b();
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            C0137z zVar = oVar.f800g;
            if (zVar != null) {
                zVar.mo1278a();
            }
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C1404o.m3507B(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0120o oVar = this.mLayout;
        if (oVar == null || oVar != null) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        throw null;
    }

    public void addItemDecoration(C0119n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(C0119n nVar, int i) {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo900a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C0126q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(C0128s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(C0129t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(C0105d0 d0Var, C0117c cVar, C0117c cVar2) {
        boolean z;
        d0Var.mo1149a(false);
        C1611w wVar = (C1611w) this.mItemAnimator;
        if (wVar != null) {
            if (cVar == null || (cVar.f791a == cVar2.f791a && cVar.f792b == cVar2.f792b)) {
                C1587k kVar = (C1587k) wVar;
                kVar.mo6322e(d0Var);
                d0Var.f757a.setAlpha(0.0f);
                kVar.f4637i.add(d0Var);
                z = true;
            } else {
                z = wVar.mo6319a(d0Var, cVar.f791a, cVar.f792b, cVar2.f791a, cVar2.f792b);
            }
            if (z) {
                postAnimationRunner();
                return;
            }
            return;
        }
        throw null;
    }

    public void animateDisappearance(C0105d0 d0Var, C0117c cVar, C0117c cVar2) {
        boolean z;
        addAnimatingView(d0Var);
        d0Var.mo1149a(false);
        C1611w wVar = (C1611w) this.mItemAnimator;
        if (wVar != null) {
            int i = cVar.f791a;
            int i2 = cVar.f792b;
            View view = d0Var.f757a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f791a;
            int top = cVar2 == null ? view.getTop() : cVar2.f792b;
            if (d0Var.mo1159j() || (i == left && i2 == top)) {
                C1587k kVar = (C1587k) wVar;
                kVar.mo6322e(d0Var);
                kVar.f4636h.add(d0Var);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = wVar.mo6319a(d0Var, i, i2, left, top);
            }
            if (z) {
                postAnimationRunner();
                return;
            }
            return;
        }
        throw null;
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a(str)));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a(Objects.EMPTY_STRING))));
        }
    }

    public boolean canReuseUpdatedViewHolder(C0105d0 d0Var) {
        C0114l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo1190a(d0Var, d0Var.mo1154e());
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0125p) && this.mLayout.mo863a((C0125p) layoutParams);
    }

    public void clearOldPositions() {
        int b = this.mChildHelper.mo6285b();
        for (int i = 0; i < b; i++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i));
            if (!childViewHolderInt.mo1164o()) {
                childViewHolderInt.mo1144a();
            }
        }
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0105d0) vVar.f830c.get(i2)).mo1144a();
        }
        int size2 = vVar.f828a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C0105d0) vVar.f828a.get(i3)).mo1144a();
        }
        ArrayList<C0105d0> arrayList = vVar.f829b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C0105d0) vVar.f829b.get(i4)).mo1144a();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C0126q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C0129t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo901a()) {
            i = this.mLayout.mo885a(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo901a()) {
            i = this.mLayout.mo865b(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo901a()) {
            i = this.mLayout.mo870c(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo905b()) {
            i = this.mLayout.mo908d(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo905b()) {
            i = this.mLayout.mo874e(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        C0120o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo905b()) {
            i = this.mLayout.mo876f(this.mState);
        }
        return i;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1404o.m3507B(this);
        }
    }

    public void consumePendingUpdateOperations() {
        boolean z = this.mFirstLayoutComplete;
        String str = TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG;
        if (!z || this.mDataSetHasChangedAfterLayout) {
            C1353e.m3438a(str);
            dispatchLayout();
            Trace.endSection();
        } else if (this.mAdapterHelper.mo6268c()) {
            boolean z2 = false;
            if ((this.mAdapterHelper.f4591g & 4) != 0) {
                if ((this.mAdapterHelper.f4591g & 11) != 0) {
                    z2 = true;
                }
                if (!z2) {
                    C1353e.m3438a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.mo6269d();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.mo6259a();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                }
            }
            if (this.mAdapterHelper.mo6268c()) {
                C1353e.m3438a(str);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C0120o.m499a(i, getPaddingRight() + getPaddingLeft(), C1404o.m3553n(this)), C0120o.m499a(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C0108g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo1179b(childViewHolderInt);
        }
        List<C0126q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0126q) this.mOnChildAttachStateListeners.get(size)).mo1251a(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C0108g gVar = this.mAdapter;
        if (gVar == null || childViewHolderInt == null || gVar != null) {
            List<C0126q> list = this.mOnChildAttachStateListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0126q) this.mOnChildAttachStateListeners.get(size)).mo1252b(view);
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void dispatchLayout() {
        String str;
        C0108g gVar = this.mAdapter;
        String str2 = TAG;
        if (gVar == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0099a0 a0Var = this.mState;
            boolean z = false;
            a0Var.f740i = false;
            if (a0Var.f735d == 1) {
                dispatchLayoutStep1();
            } else {
                C1570a aVar = this.mAdapterHelper;
                if (!aVar.f4587c.isEmpty() && !aVar.f4586b.isEmpty()) {
                    z = true;
                }
                if (!z && this.mLayout.f810q == getWidth() && this.mLayout.f811r == getHeight()) {
                    this.mLayout.mo1216b(this);
                    dispatchLayoutStep3();
                    return;
                }
            }
            this.mLayout.mo1216b(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(str2, str);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo5888a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo5887a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo5891a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo5891a(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo5893b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo5890a(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo1230f(i);
        }
        onScrollStateChanged(i);
        C0129t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo1256a(this, i);
        }
        List<C0129t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0129t) this.mScrollListeners.get(size)).mo1256a(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C0129t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo1257a(this, i, i2);
        }
        List<C0129t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0129t) this.mScrollListeners.get(size)).mo1257a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C0105d0 d0Var = (C0105d0) this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f757a.getParent() == this && !d0Var.mo1164o()) {
                int i = d0Var.f773q;
                if (i != -1) {
                    C1404o.m3545f(d0Var.f757a, i);
                    d0Var.f773q = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((C0119n) this.mItemDecorations.get(i)).mo1197b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f2 = (float) (getPaddingRight() + (-getWidth()));
                f = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f2 = (float) (-getWidth());
                f = (float) (-getHeight());
            }
            canvas.translate(f2, f);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo1194c()) {
            z3 = z;
        }
        if (z3) {
            C1404o.m3507B(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        int i;
        int i2;
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo1186a(this);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    public void ensureLeftGlow() {
        int i;
        int i2;
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo1186a(this);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    public void ensureRightGlow() {
        int i;
        int i2;
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo1186a(this);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    public void ensureTopGlow() {
        int i;
        int i2;
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo1186a(this);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    public String exceptionLabel() {
        StringBuilder a = C1965a.m4756a(" ");
        a.append(super.toString());
        a.append(", adapter:");
        a.append(this.mAdapter);
        a.append(", layout:");
        a.append(this.mLayout);
        a.append(", context:");
        a.append(getContext());
        return a.toString();
    }

    public final void fillRemainingScrollValues(C0099a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f750g;
            a0Var.f746o = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        a0Var.f746o = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.mo6280a() - 1; a >= 0; a--) {
            View b = this.mChildHelper.mo6287b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY && f2 <= ((float) b.getBottom()) + translationY) {
                return b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public C0105d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C0105d0 findViewHolderForAdapterPosition(int i) {
        C0105d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b = this.mChildHelper.mo6285b();
        for (int i2 = 0; i2 < b; i2++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo1159j() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo6289c(childViewHolderInt.f757a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C0105d0 findViewHolderForItemId(long j) {
        C0108g gVar = this.mAdapter;
        C0105d0 d0Var = null;
        if (gVar != null && gVar.f779b) {
            int b = this.mChildHelper.mo6285b();
            for (int i = 0; i < b; i++) {
                C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo1159j() && childViewHolderInt.f761e == j) {
                    if (!this.mChildHelper.mo6289c(childViewHolderInt.f757a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public C0105d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C0105d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public C0105d0 findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo6285b();
        C0105d0 d0Var = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo1159j()) {
                if (z) {
                    if (childViewHolderInt.f759c != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo1153d() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo6289c(childViewHolderInt.f757a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$o r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 == 0) goto L_0x0014
            return r2
        L_0x0014:
            boolean r1 = r1.mo901a()
            androidx.recyclerview.widget.RecyclerView$o r3 = r0.mLayout
            boolean r3 = r3.mo905b()
            if (r1 == 0) goto L_0x002c
            int r4 = java.lang.Math.abs(r19)
            int r5 = r0.mMinFlingVelocity
            if (r4 >= r5) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r4 = r19
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            int r5 = java.lang.Math.abs(r20)
            int r6 = r0.mMinFlingVelocity
            if (r5 >= r6) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r5 = r20
            goto L_0x003c
        L_0x003b:
            r5 = r2
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            return r2
        L_0x0041:
            float r6 = (float) r4
            float r7 = (float) r5
            boolean r8 = r0.dispatchNestedPreFling(r6, r7)
            if (r8 != 0) goto L_0x00fe
            r8 = 1
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r9 = r2
            goto L_0x0052
        L_0x0051:
            r9 = r8
        L_0x0052:
            r0.dispatchNestedFling(r6, r7, r9)
            androidx.recyclerview.widget.RecyclerView$r r6 = r0.mOnFlingListener
            if (r6 == 0) goto L_0x00a2
            p.p.d.x r6 = (p124p.p180p.p181d.C1612x) r6
            androidx.recyclerview.widget.RecyclerView r7 = r6.f4740a
            androidx.recyclerview.widget.RecyclerView$o r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0064
            goto L_0x009e
        L_0x0064:
            androidx.recyclerview.widget.RecyclerView r10 = r6.f4740a
            androidx.recyclerview.widget.RecyclerView$g r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x006d
            goto L_0x009e
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r6.f4740a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r5)
            if (r11 > r10) goto L_0x007f
            int r11 = java.lang.Math.abs(r4)
            if (r11 <= r10) goto L_0x009e
        L_0x007f:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.C0137z.C0139b
            if (r10 != 0) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            androidx.recyclerview.widget.RecyclerView$z r10 = r6.mo6371a(r7)
            if (r10 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            int r6 = r6.mo6348a(r7, r4, r5)
            r11 = -1
            if (r6 != r11) goto L_0x0094
        L_0x0092:
            r6 = r2
            goto L_0x009a
        L_0x0094:
            r10.f838a = r6
            r7.mo1209a(r10)
            r6 = r8
        L_0x009a:
            if (r6 == 0) goto L_0x009e
            r6 = r8
            goto L_0x009f
        L_0x009e:
            r6 = r2
        L_0x009f:
            if (r6 == 0) goto L_0x00a2
            return r8
        L_0x00a2:
            if (r9 == 0) goto L_0x00fe
            if (r1 == 0) goto L_0x00a8
            r1 = r8
            goto L_0x00a9
        L_0x00a8:
            r1 = r2
        L_0x00a9:
            if (r3 == 0) goto L_0x00ad
            r1 = r1 | 2
        L_0x00ad:
            r0.startNestedScroll(r1, r8)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r12 = java.lang.Math.max(r3, r1)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r13 = java.lang.Math.max(r3, r1)
            androidx.recyclerview.widget.RecyclerView$c0 r1 = r0.mViewFlinger
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            r4 = 2
            r3.setScrollState(r4)
            r1.f749f = r2
            r1.f748e = r2
            android.view.animation.Interpolator r2 = r1.f751h
            android.view.animation.Interpolator r3 = sQuinticInterpolator
            if (r2 == r3) goto L_0x00e9
            r1.f751h = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            android.view.animation.Interpolator r4 = sQuinticInterpolator
            r2.<init>(r3, r4)
            r1.f750g = r2
        L_0x00e9:
            android.widget.OverScroller r9 = r1.f750g
            r10 = 0
            r11 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.mo1140a()
            return r8
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            boolean z2 = true;
            boolean z3 = this.mAdapter != null && oVar != null && !isComputingLayout() && !this.mLayoutSuppressed;
            FocusFinder instance = FocusFinder.getInstance();
            if (!z3 || !(i == 2 || i == 1)) {
                View findNextFocus = instance.findNextFocus(this, view, i);
                if (findNextFocus != null || !z3) {
                    view2 = findNextFocus;
                } else {
                    consumePendingUpdateOperations();
                    if (findContainingItemView(view) == null) {
                        return null;
                    }
                    startInterceptRequestLayout();
                    view2 = this.mLayout.mo848a(view, i, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
            } else {
                if (this.mLayout.mo905b()) {
                    int i2 = i == 2 ? 130 : 33;
                    z = instance.findNextFocus(this, view, i2) == null;
                    if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                        i = i2;
                    }
                } else {
                    z = false;
                }
                if (!z && this.mLayout.mo901a()) {
                    int i3 = (this.mLayout.mo1231g() == 1) ^ (i == 2) ? 66 : 17;
                    if (instance.findNextFocus(this, view, i3) != null) {
                        z2 = false;
                    }
                    if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                        i = i3;
                    }
                    z = z2;
                }
                if (z) {
                    consumePendingUpdateOperations();
                    if (findContainingItemView(view) == null) {
                        return null;
                    }
                    startInterceptRequestLayout();
                    this.mLayout.mo848a(view, i, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                view2 = instance.findNextFocus(this, view, i);
            }
            if (view2 == null || view2.hasFocusable()) {
                if (!isPreferredNextFocus(view, view2, i)) {
                    view2 = super.focusSearch(view, i);
                }
                return view2;
            } else if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            } else {
                requestChildOnScreen(view2, null);
                return view;
            }
        } else {
            throw null;
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo872c();
        }
        throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a("RecyclerView has no LayoutManager")));
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo850a(getContext(), attributeSet);
        }
        throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a("RecyclerView has no LayoutManager")));
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo851a(layoutParams);
        }
        throw new IllegalStateException(C1965a.m4746a(this, C1965a.m4756a("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0108g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(C0105d0 d0Var) {
        if (d0Var.mo1151b(524) || !d0Var.mo1156g()) {
            return -1;
        }
        C1570a aVar = this.mAdapterHelper;
        int i = d0Var.f759c;
        int size = aVar.f4586b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1572b bVar = (C1572b) aVar.f4586b.get(i2);
            int i3 = bVar.f4592a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4593b;
                    if (i4 <= i) {
                        int i5 = bVar.f4595d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4593b;
                    if (i6 == i) {
                        i = bVar.f4595d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4595d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4593b <= i) {
                i += bVar.f4595d;
            }
        }
        return i;
    }

    public int getBaseline() {
        C0120o oVar = this.mLayout;
        if (oVar == null) {
            return super.getBaseline();
        }
        if (oVar != null) {
            return -1;
        }
        throw null;
    }

    public long getChangedHolderKey(C0105d0 d0Var) {
        if (this.mAdapter.f779b) {
            return d0Var.f761e;
        }
        return (long) d0Var.f759c;
    }

    public int getChildAdapterPosition(View view) {
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo1152c();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i, int i2) {
        C0112j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo1185a(i, i2);
    }

    public long getChildItemId(View view) {
        C0108g gVar = this.mAdapter;
        if (gVar == null || !gVar.f779b) {
            return -1;
        }
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.f761e;
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo1153d();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C0105d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1609v getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0113k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C0114l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        if (!pVar.f820c) {
            return pVar.f819b;
        }
        if (this.mState.f738g && (pVar.mo1249b() || pVar.f818a.mo1157h())) {
            return pVar.f819b;
        }
        Rect rect = pVar.f819b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        int i = 0;
        while (i < size) {
            this.mTempRect.set(0, 0, 0, 0);
            C0119n nVar = (C0119n) this.mItemDecorations.get(i);
            Rect rect2 = this.mTempRect;
            if (nVar != null) {
                ((C0125p) view.getLayoutParams()).mo1248a();
                rect2.set(0, 0, 0, 0);
                int i2 = rect.left;
                Rect rect3 = this.mTempRect;
                rect.left = i2 + rect3.left;
                rect.top += rect3.top;
                rect.right += rect3.right;
                rect.bottom += rect3.bottom;
                i++;
            } else {
                throw null;
            }
        }
        pVar.f820c = false;
        return rect;
    }

    public C0119n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C0119n) this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C0120o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0127r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0130u getRecycledViewPool() {
        return this.mRecycler.mo1267b();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo5892b(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo6268c();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1570a(new C0107f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(C1965a.m4746a(this, C1965a.m4756a("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C1590l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1568b.fastscroll_default_thickness), resources.getDimensionPixelSize(C1568b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1568b.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C0120o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo900a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C0114l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo1194c();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4158d;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo914h(i);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo6285b();
        for (int i = 0; i < b; i++) {
            ((C0125p) this.mChildHelper.mo6290d(i).getLayoutParams()).f820c = true;
        }
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0125p pVar = (C0125p) ((C0105d0) vVar.f830c.get(i2)).f757a.getLayoutParams();
            if (pVar != null) {
                pVar.f820c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.mo6285b();
        for (int i = 0; i < b; i++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo1164o()) {
                childViewHolderInt.mo1145a(6);
            }
        }
        markItemDecorInsetsDirty();
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0105d0 d0Var = (C0105d0) vVar.f830c.get(i2);
            if (d0Var != null) {
                d0Var.mo1145a(6);
                d0Var.mo1148a((Object) null);
            }
        }
        C0108g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.f779b) {
            vVar.mo1271c();
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int a = this.mChildHelper.mo6280a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo6287b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int a = this.mChildHelper.mo6280a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo6287b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.mo6285b();
        for (int i3 = 0; i3 < b; i3++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo1164o() && childViewHolderInt.f759c >= i) {
                childViewHolderInt.mo1147a(i2, false);
                this.mState.f737f = true;
            }
        }
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0105d0 d0Var = (C0105d0) vVar.f830c.get(i4);
            if (d0Var != null && d0Var.f759c >= i) {
                d0Var.mo1147a(i2, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = this.mChildHelper.mo6285b();
        int i8 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i9 = 0; i9 < b; i9++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i9));
            if (childViewHolderInt != null) {
                int i10 = childViewHolderInt.f759c;
                if (i10 >= i5 && i10 <= i4) {
                    if (i10 == i) {
                        childViewHolderInt.mo1147a(i2 - i, false);
                    } else {
                        childViewHolderInt.mo1147a(i3, false);
                    }
                    this.mState.f737f = true;
                }
            }
        }
        C0132v vVar = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i8 = 1;
            i7 = i2;
        }
        int size = vVar.f830c.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0105d0 d0Var = (C0105d0) vVar.f830c.get(i11);
            if (d0Var != null) {
                int i12 = d0Var.f759c;
                if (i12 >= i7 && i12 <= i6) {
                    if (i12 == i) {
                        d0Var.mo1147a(i2 - i, false);
                    } else {
                        d0Var.mo1147a(i8, false);
                    }
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo6285b();
        for (int i4 = 0; i4 < b; i4++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo1164o()) {
                int i5 = childViewHolderInt.f759c;
                if (i5 >= i3) {
                    childViewHolderInt.mo1147a(-i2, z);
                } else if (i5 >= i) {
                    int i6 = i - 1;
                    int i7 = -i2;
                    childViewHolderInt.mo1145a(8);
                    childViewHolderInt.mo1147a(i7, z);
                    childViewHolderInt.f759c = i6;
                }
                this.mState.f737f = true;
            }
        }
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0105d0 d0Var = (C0105d0) vVar.f830c.get(size);
                if (d0Var != null) {
                    int i8 = d0Var.f759c;
                    if (i8 >= i3) {
                        d0Var.mo1147a(-i2, z);
                    } else if (i8 >= i) {
                        d0Var.mo1145a(8);
                        vVar.mo1268b(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f802i = true;
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            C1595m mVar = (C1595m) C1595m.f4694i.get();
            this.mGapWorker = mVar;
            if (mVar == null) {
                this.mGapWorker = new C1595m();
                Display g = C1404o.m3546g(this);
                float f = 60.0f;
                if (!isInEditMode() && g != null) {
                    float refreshRate = g.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1595m mVar2 = this.mGapWorker;
                mVar2.f4698g = (long) (1.0E9f / f);
                C1595m.f4694i.set(mVar2);
            }
            this.mGapWorker.f4696e.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0114l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo1191b();
        }
        stopScroll();
        this.mIsAttached = false;
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            C0132v vVar = this.mRecycler;
            oVar.f802i = false;
            oVar.mo899a(this, vVar);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        if (this.mViewInfoStore != null) {
            do {
            } while (C1574a.f4598d.mo5864a() != null);
            if (ALLOW_THREAD_GAP_WORK) {
                C1595m mVar = this.mGapWorker;
                if (mVar != null) {
                    mVar.f4696e.remove(this);
                    this.mGapWorker = null;
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C0119n) this.mItemDecorations.get(i)).mo1196a(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo905b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo901a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo905b()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo901a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C0120o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a = oVar.mo901a();
        boolean b = this.mLayout.mo905b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder a2 = C1965a.m4756a("Error processing scroll; pointer index for id ");
                a2.append(this.mScrollPointerId);
                a2.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, a2.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!a || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            z2 = true;
        }
        return z2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1353e.m3438a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i, int i2) {
        C0120o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo919n()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.mLayout.f795b.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f735d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo1198a(i, i2);
                this.mState.f740i = true;
                dispatchLayoutStep2();
                this.mLayout.mo1214b(i, i2);
                if (this.mLayout.mo921q()) {
                    this.mLayout.mo1198a(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f740i = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo1214b(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.f795b.defaultOnMeasure(i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C0099a0 a0Var = this.mState;
                if (a0Var.f742k) {
                    a0Var.f738g = true;
                } else {
                    this.mAdapterHelper.mo6265b();
                    this.mState.f738g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f742k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0108g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f736e = gVar.mo1178b();
            } else {
                this.mState.f736e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.f795b.defaultOnMeasure(i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f738g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0135y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0135y yVar = (C0135y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.f4274e);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0135y yVar = new C0135y(super.onSaveInstanceState());
        C0135y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.f837g = yVar2.f837g;
        } else {
            C0120o oVar = this.mLayout;
            yVar.f837g = oVar != null ? oVar.mo920o() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01e1
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01e1
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo901a()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo905b()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b0
            if (r0 == r9) goto L_0x016e
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d6
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d6
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d6
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d6
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ae
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00ae:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f3
            if (r10 == 0) goto L_0x00d9
            int r2 = r6.mTouchSlop
            if (r0 <= 0) goto L_0x00d0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d5
        L_0x00d0:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d5:
            if (r0 == 0) goto L_0x00d9
            r2 = r9
            goto L_0x00da
        L_0x00d9:
            r2 = r8
        L_0x00da:
            if (r11 == 0) goto L_0x00ee
            int r3 = r6.mTouchSlop
            if (r1 <= 0) goto L_0x00e6
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00eb
        L_0x00e6:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00eb:
            if (r1 == 0) goto L_0x00ee
            r2 = r9
        L_0x00ee:
            if (r2 == 0) goto L_0x00f3
            r6.setScrollState(r9)
        L_0x00f3:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d6
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0104
            r1 = r15
            goto L_0x0105
        L_0x0104:
            r1 = r8
        L_0x0105:
            if (r11 == 0) goto L_0x010a
            r2 = r16
            goto L_0x010b
        L_0x010a:
            r2 = r8
        L_0x010b:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013a
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013a:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x014c
            r1 = r15
            goto L_0x014d
        L_0x014c:
            r1 = r8
        L_0x014d:
            if (r11 == 0) goto L_0x0151
            r2 = r0
            goto L_0x0152
        L_0x0151:
            r2 = r8
        L_0x0152:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x015f
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x015f:
            p.p.d.m r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d6
            if (r15 != 0) goto L_0x0167
            if (r0 == 0) goto L_0x01d6
        L_0x0167:
            p.p.d.m r1 = r6.mGapWorker
            r1.mo6336a(r6, r15, r0)
            goto L_0x01d6
        L_0x016e:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018a
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018b
        L_0x018a:
            r1 = r0
        L_0x018b:
            if (r11 == 0) goto L_0x0197
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0198
        L_0x0197:
            r2 = r0
        L_0x0198:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a8
        L_0x01a0:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01ab
        L_0x01a8:
            r6.setScrollState(r8)
        L_0x01ab:
            r17.resetScroll()
            r8 = r9
            goto L_0x01d6
        L_0x01b0:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r10 == 0) goto L_0x01ce
            r0 = r9
            goto L_0x01cf
        L_0x01ce:
            r0 = r8
        L_0x01cf:
            if (r11 == 0) goto L_0x01d3
            r0 = r0 | 2
        L_0x01d3:
            r6.startNestedScroll(r0, r8)
        L_0x01d6:
            if (r8 != 0) goto L_0x01dd
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01dd:
            r12.recycle()
            return r9
        L_0x01e1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C1404o.m3523a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(C0105d0 d0Var, C0117c cVar) {
        d0Var.mo1146a(0, 8192);
        if (this.mState.f739h && d0Var.mo1162m() && !d0Var.mo1159j() && !d0Var.mo1164o()) {
            this.mViewInfoStore.f4597b.mo5520c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo6276b(d0Var, cVar);
    }

    public void removeAndRecycleViews() {
        C0114l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo1191b();
        }
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo1215b(this.mRecycler);
            this.mLayout.mo1220c(this.mRecycler);
        }
        this.mRecycler.mo1262a();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C1576b bVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z = true;
        if (indexOfChild == -1) {
            bVar.mo6291d(view);
        } else if (bVar.f4603b.mo6298c(indexOfChild)) {
            bVar.f4603b.mo6299d(indexOfChild);
            bVar.mo6291d(view);
            ((C0106e) bVar.f4602a).mo1169b(indexOfChild);
        } else {
            z = false;
        }
        if (z) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo1270b(childViewHolderInt);
            this.mRecycler.mo1265a(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    public void removeDetachedView(View view, boolean z) {
        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo1161l()) {
                childViewHolderInt.f766j &= -257;
            } else if (!childViewHolderInt.mo1164o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(C1965a.m4746a(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C0119n nVar) {
        C0120o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo900a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C0126q qVar) {
        List<C0126q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(C0128s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C0129t tVar) {
        List<C0129t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        int a = this.mChildHelper.mo6280a();
        for (int i = 0; i < a; i++) {
            View b = this.mChildHelper.mo6287b(i);
            C0105d0 childViewHolder = getChildViewHolder(b);
            if (childViewHolder != null) {
                C0105d0 d0Var = childViewHolder.f765i;
                if (d0Var != null) {
                    View view = d0Var.f757a;
                    int left = b.getLeft();
                    int top = b.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        C0137z zVar = this.mLayout.f800g;
        boolean z = true;
        if (!(zVar != null && zVar.f842e) && !isComputingLayout()) {
            z = false;
        }
        if (!z && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo1212a(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((C0128s) this.mOnItemTouchListeners.get(i)).mo1253a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int b = this.mChildHelper.mo6285b();
        for (int i = 0; i < b; i++) {
            C0105d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6290d(i));
            if (!childViewHolderInt.mo1164o() && childViewHolderInt.f760d == -1) {
                childViewHolderInt.f760d = childViewHolderInt.f759c;
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C0120o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean a = oVar.mo901a();
            boolean b = this.mLayout.mo905b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i5 == 0 && i6 == 0) {
            return false;
        }
        return true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1353e.m3438a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a = i != 0 ? this.mLayout.mo845a(i, this.mRecycler, this.mState) : 0;
        int b = i2 != 0 ? this.mLayout.mo864b(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C0120o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo914h(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1609v vVar) {
        this.mAccessibilityDelegate = vVar;
        C1404o.m3526a((View) this, (C1387a) vVar);
    }

    public void setAdapter(C0108g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0112j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(C0105d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f773q = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C1404o.m3545f(d0Var.f757a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0113k kVar) {
        if (kVar != null) {
            this.mEdgeEffectFactory = kVar;
            invalidateGlows();
            return;
        }
        throw null;
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C0114l lVar) {
        C0114l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo1191b();
            this.mItemAnimator.f785a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.f785a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0132v vVar = this.mRecycler;
        vVar.f832e = i;
        vVar.mo1272d();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0120o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C0114l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo1191b();
                }
                this.mLayout.mo1215b(this.mRecycler);
                this.mLayout.mo1220c(this.mRecycler);
                this.mRecycler.mo1262a();
                if (this.mIsAttached) {
                    C0120o oVar2 = this.mLayout;
                    C0132v vVar = this.mRecycler;
                    oVar2.f802i = false;
                    oVar2.mo899a(this, vVar);
                }
                this.mLayout.mo1221c((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo1262a();
            }
            C1576b bVar = this.mChildHelper;
            C1577a aVar = bVar.f4603b;
            aVar.f4605a = 0;
            C1577a aVar2 = aVar.f4606b;
            if (aVar2 != null) {
                aVar2.mo6297b();
            }
            int size = bVar.f4604c.size();
            while (true) {
                size--;
                if (size >= 0) {
                    View view = (View) bVar.f4604c.get(size);
                    C0106e eVar = (C0106e) bVar.f4602a;
                    if (eVar != null) {
                        C0105d0 childViewHolderInt = getChildViewHolderInt(view);
                        if (childViewHolderInt != null) {
                            RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f772p);
                            childViewHolderInt.f772p = 0;
                        }
                        bVar.f4604c.remove(size);
                    } else {
                        throw null;
                    }
                } else {
                    C0106e eVar2 = (C0106e) bVar.f4602a;
                    int a = eVar2.mo1167a();
                    for (int i = 0; i < a; i++) {
                        View a2 = eVar2.mo1168a(i);
                        RecyclerView.this.dispatchChildDetached(a2);
                        a2.clearAnimation();
                    }
                    RecyclerView.this.removeAllViews();
                    this.mLayout = oVar;
                    if (oVar != null) {
                        if (oVar.f795b == null) {
                            oVar.mo1221c(this);
                            if (this.mIsAttached) {
                                this.mLayout.f802i = true;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("LayoutManager ");
                            sb.append(oVar);
                            sb.append(" is already attached to a RecyclerView:");
                            throw new IllegalArgumentException(C1965a.m4746a(oVar.f795b, sb));
                        }
                    }
                    this.mRecycler.mo1272d();
                    requestLayout();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1397h scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4158d) {
            C1404o.m3509D(scrollingChildHelper.f4157c);
        }
        scrollingChildHelper.f4158d = z;
    }

    public void setOnFlingListener(C0127r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0129t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0130u uVar) {
        C0132v vVar = this.mRecycler;
        C0130u uVar2 = vVar.f834g;
        if (uVar2 != null) {
            uVar2.f823b--;
        }
        vVar.f834g = uVar;
        if (uVar != null && RecyclerView.this.getAdapter() != null) {
            vVar.f834g.f823b++;
        }
    }

    public void setRecyclerListener(C0133w wVar) {
        this.mRecyclerListener = wVar;
    }

    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w(TAG, sb.toString());
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = i2;
    }

    public void setViewCacheExtension(C0101b0 b0Var) {
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        if (contentChangeTypes != 0) {
            i = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0120o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo901a()) {
                i = 0;
            }
            if (!this.mLayout.mo905b()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo1141a(i, i2, i3, interpolator);
                } else {
                    scrollBy(i, i2);
                }
            }
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C0120o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo898a(this, this.mState, i);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo5889a(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo5889a(i, i2);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo5894c(0);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo5894c(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(C0108g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int b = this.mChildHelper.mo6285b();
        int i3 = i2 + i;
        for (int i4 = 0; i4 < b; i4++) {
            View d = this.mChildHelper.mo6290d(i4);
            C0105d0 childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.mo1164o()) {
                int i5 = childViewHolderInt.f759c;
                if (i5 >= i && i5 < i3) {
                    childViewHolderInt.mo1145a(2);
                    childViewHolderInt.mo1148a(obj);
                    ((C0125p) d.getLayoutParams()).f820c = true;
                }
            }
        }
        C0132v vVar = this.mRecycler;
        int size = vVar.f830c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0105d0 d0Var = (C0105d0) vVar.f830c.get(size);
                if (d0Var != null) {
                    int i6 = d0Var.f759c;
                    if (i6 >= i && i6 < i3) {
                        d0Var.mo1145a(2);
                        vVar.mo1268b(size);
                    }
                }
            } else {
                return;
            }
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo5893b(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo5885a(i) != null;
    }
}
