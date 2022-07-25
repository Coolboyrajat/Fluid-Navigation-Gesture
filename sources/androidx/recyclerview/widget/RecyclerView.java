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
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0567a;
import androidx.recyclerview.widget.C0572d;
import androidx.recyclerview.widget.C0598h;
import androidx.recyclerview.widget.C0619t;
import androidx.recyclerview.widget.C0622u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p006b.p026g.p031g.C0798a;
import p006b.p026g.p034j.C0837h;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0877i;
import p006b.p026g.p035k.C0878j;
import p006b.p026g.p035k.C0879k;
import p006b.p026g.p035k.C0881m;
import p006b.p026g.p035k.C0888t;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0899w;
import p006b.p026g.p035k.p036e0.C0856b;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p039i.p040a.C0912a;
import p006b.p049m.C0942a;
import p006b.p049m.C0943b;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

public class RecyclerView extends ViewGroup implements C0888t, C0878j, C0879k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    private static final int[] CLIP_TO_PADDING_ATTR = {16842987};
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new C0521c();
    C0612p mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C0527g mAdapter;
    C0567a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C0530j mChildDrawingOrderCallback;
    C0572d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0531k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C0598h mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C0546s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C0532l mItemAnimator;
    private C0532l.C0534b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C0537n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    C0538o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0552x mObserver;
    private List<C0544q> mOnChildAttachStateListeners;
    private C0545r mOnFlingListener;
    private final ArrayList<C0546s> mOnItemTouchListeners;
    final List<C0524d0> mPendingAccessibilityImportanceChange;
    private C0553y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C0598h.C0600b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0550v mRecycler;
    C0551w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C0547t mScrollListener;
    private List<C0547t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0881m mScrollingChildHelper;
    final C0518a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C0522c0 mViewFlinger;
    private final C0622u.C0624b mViewInfoProcessCallback;
    final C0622u mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0517a implements Runnable {
        C0517a() {
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
    public static class C0518a0 {

        /* renamed from: a */
        int f2141a = -1;

        /* renamed from: b */
        private SparseArray<Object> f2142b;

        /* renamed from: c */
        int f2143c = 0;

        /* renamed from: d */
        int f2144d = 0;

        /* renamed from: e */
        int f2145e = 1;

        /* renamed from: f */
        int f2146f = 0;

        /* renamed from: g */
        boolean f2147g = false;

        /* renamed from: h */
        boolean f2148h = false;

        /* renamed from: i */
        boolean f2149i = false;

        /* renamed from: j */
        boolean f2150j = false;

        /* renamed from: k */
        boolean f2151k = false;

        /* renamed from: l */
        boolean f2152l = false;

        /* renamed from: m */
        int f2153m;

        /* renamed from: n */
        long f2154n;

        /* renamed from: o */
        int f2155o;

        /* renamed from: p */
        int f2156p;

        /* renamed from: q */
        int f2157q;

        /* renamed from: a */
        public int mo3025a() {
            return this.f2148h ? this.f2143c - this.f2144d : this.f2146f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3026a(int i) {
            if ((this.f2145e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2145e));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3027a(C0527g gVar) {
            this.f2145e = 1;
            this.f2146f = gVar.mo3114b();
            this.f2148h = false;
            this.f2149i = false;
            this.f2150j = false;
        }

        /* renamed from: b */
        public int mo3028b() {
            return this.f2141a;
        }

        /* renamed from: c */
        public boolean mo3029c() {
            return this.f2141a != -1;
        }

        /* renamed from: d */
        public boolean mo3030d() {
            return this.f2148h;
        }

        /* renamed from: e */
        public boolean mo3031e() {
            return this.f2152l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2141a + ", mData=" + this.f2142b + ", mItemCount=" + this.f2146f + ", mIsMeasuring=" + this.f2150j + ", mPreviousLayoutItemCount=" + this.f2143c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2144d + ", mStructureChanged=" + this.f2147g + ", mInPreLayout=" + this.f2148h + ", mRunSimpleAnimations=" + this.f2151k + ", mRunPredictiveAnimations=" + this.f2152l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0519b implements Runnable {
        C0519b() {
        }

        public void run() {
            C0532l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo3164i();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0520b0 {
        /* renamed from: a */
        public abstract View mo3034a(C0550v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C0521c implements Interpolator {
        C0521c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C0522c0 implements Runnable {

        /* renamed from: f */
        private int f2159f;

        /* renamed from: g */
        private int f2160g;

        /* renamed from: h */
        OverScroller f2161h;

        /* renamed from: i */
        Interpolator f2162i = RecyclerView.sQuinticInterpolator;

        /* renamed from: j */
        private boolean f2163j = false;

        /* renamed from: k */
        private boolean f2164k = false;

        C0522c0() {
            this.f2161h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: a */
        private float m2665a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        private int m2666a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m2665a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: c */
        private void m2667c() {
            RecyclerView.this.removeCallbacks(this);
            C0890v.m4757a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3036a() {
            if (this.f2163j) {
                this.f2164k = true;
            } else {
                m2667c();
            }
        }

        /* renamed from: a */
        public void mo3037a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2160g = 0;
            this.f2159f = 0;
            Interpolator interpolator = this.f2162i;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f2162i = interpolator2;
                this.f2161h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f2161h.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            mo3036a();
        }

        /* renamed from: a */
        public void mo3038a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m2666a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2162i != interpolator) {
                this.f2162i = interpolator;
                this.f2161h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2160g = 0;
            this.f2159f = 0;
            RecyclerView.this.setScrollState(2);
            this.f2161h.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2161h.computeScrollOffset();
            }
            mo3036a();
        }

        /* renamed from: b */
        public void mo3039b() {
            RecyclerView.this.removeCallbacks(this);
            this.f2161h.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo3039b();
                return;
            }
            this.f2164k = false;
            this.f2163j = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2161h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f2159f;
                int i4 = currY - this.f2160g;
                this.f2159f = currX;
                this.f2160g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, (int[]) null, 1)) {
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
                    C0555z zVar = recyclerView4.mLayout.f2205l;
                    if (zVar != null && !zVar.mo3356d() && zVar.mo3357e()) {
                        int a = RecyclerView.this.mState.mo3025a();
                        if (a == 0) {
                            zVar.mo3360h();
                        } else {
                            if (zVar.mo3354c() >= a) {
                                zVar.mo3355c(a - 1);
                            }
                            zVar.mo3346a(i, i2);
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
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, (int[]) null, 1, iArr5);
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
                C0555z zVar2 = RecyclerView.this.mLayout.f2205l;
                if ((zVar2 != null && zVar2.mo3356d()) || !z) {
                    mo3036a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C0598h hVar = recyclerView6.mGapWorker;
                    if (hVar != null) {
                        hVar.mo3538a(recyclerView6, i5, i6);
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
                        RecyclerView.this.mPrefetchRegistry.mo3543a();
                    }
                }
            }
            C0555z zVar3 = RecyclerView.this.mLayout.f2205l;
            if (zVar3 != null && zVar3.mo3356d()) {
                zVar3.mo3346a(0, 0);
            }
            this.f2163j = false;
            if (this.f2164k) {
                m2667c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0523d implements C0622u.C0624b {
        C0523d() {
        }

        /* renamed from: a */
        public void mo3041a(C0524d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo3182a(d0Var.f2168f, recyclerView.mRecycler);
        }

        /* renamed from: a */
        public void mo3042a(C0524d0 d0Var, C0532l.C0535c cVar, C0532l.C0535c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        /* renamed from: b */
        public void mo3043b(C0524d0 d0Var, C0532l.C0535c cVar, C0532l.C0535c cVar2) {
            RecyclerView.this.mRecycler.mo3325c(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo3044c(C0524d0 d0Var, C0532l.C0535c cVar, C0532l.C0535c cVar2) {
            d0Var.mo3054a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            C0532l lVar = recyclerView.mItemAnimator;
            if (z) {
                if (!lVar.mo3149a(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo3157c(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0524d0 {

        /* renamed from: x */
        private static final List<Object> f2167x = Collections.emptyList();

        /* renamed from: f */
        public final View f2168f;

        /* renamed from: g */
        WeakReference<RecyclerView> f2169g;

        /* renamed from: h */
        int f2170h = -1;

        /* renamed from: i */
        int f2171i = -1;

        /* renamed from: j */
        long f2172j = -1;

        /* renamed from: k */
        int f2173k = -1;

        /* renamed from: l */
        int f2174l = -1;

        /* renamed from: m */
        C0524d0 f2175m = null;

        /* renamed from: n */
        C0524d0 f2176n = null;

        /* renamed from: o */
        int f2177o;

        /* renamed from: p */
        List<Object> f2178p = null;

        /* renamed from: q */
        List<Object> f2179q = null;

        /* renamed from: r */
        private int f2180r = 0;

        /* renamed from: s */
        C0550v f2181s = null;

        /* renamed from: t */
        boolean f2182t = false;

        /* renamed from: u */
        private int f2183u = 0;

        /* renamed from: v */
        int f2184v = -1;

        /* renamed from: w */
        RecyclerView f2185w;

        public C0524d0(View view) {
            if (view != null) {
                this.f2168f = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: B */
        private void mo3763B() {
            if (this.f2178p == null) {
                this.f2178p = new ArrayList();
                this.f2179q = Collections.unmodifiableList(this.f2178p);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public boolean mo3045A() {
            return (this.f2177o & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3046a() {
            this.f2171i = -1;
            this.f2174l = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3047a(int i) {
            this.f2177o = i | this.f2177o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3048a(int i, int i2) {
            this.f2177o = (i & i2) | (this.f2177o & (~i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3049a(int i, int i2, boolean z) {
            mo3047a(8);
            mo3050a(i2, z);
            this.f2170h = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3050a(int i, boolean z) {
            if (this.f2171i == -1) {
                this.f2171i = this.f2170h;
            }
            if (this.f2174l == -1) {
                this.f2174l = this.f2170h;
            }
            if (z) {
                this.f2174l += i;
            }
            this.f2170h += i;
            if (this.f2168f.getLayoutParams() != null) {
                ((C0543p) this.f2168f.getLayoutParams()).f2225h = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3051a(C0550v vVar, boolean z) {
            this.f2181s = vVar;
            this.f2182t = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3052a(RecyclerView recyclerView) {
            int i = this.f2184v;
            if (i == -1) {
                i = C0890v.m4789m(this.f2168f);
            }
            this.f2183u = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3053a(Object obj) {
            if (obj == null) {
                mo3047a((int) PropertyFlags.VIRTUAL);
            } else if ((1024 & this.f2177o) == 0) {
                mo3763B();
                this.f2178p.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo3054a(boolean z) {
            int i;
            int i2 = this.f2180r;
            this.f2180r = z ? i2 - 1 : i2 + 1;
            int i3 = this.f2180r;
            if (i3 < 0) {
                this.f2180r = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f2177o | 16;
            } else if (z && this.f2180r == 0) {
                i = this.f2177o & -17;
            } else {
                return;
            }
            this.f2177o = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3055b() {
            List<Object> list = this.f2178p;
            if (list != null) {
                list.clear();
            }
            this.f2177o &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3056b(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f2183u);
            this.f2183u = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3057b(int i) {
            return (i & this.f2177o) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3058c() {
            this.f2177o &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3059d() {
            this.f2177o &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3060e() {
            return (this.f2177o & 16) == 0 && C0890v.m4802z(this.f2168f);
        }

        /* renamed from: f */
        public final int mo3061f() {
            RecyclerView recyclerView = this.f2185w;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: g */
        public final long mo3062g() {
            return this.f2172j;
        }

        /* renamed from: h */
        public final int mo3063h() {
            return this.f2173k;
        }

        /* renamed from: i */
        public final int mo3064i() {
            int i = this.f2174l;
            return i == -1 ? this.f2170h : i;
        }

        /* renamed from: j */
        public final int mo3065j() {
            return this.f2171i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public List<Object> mo3066k() {
            if ((this.f2177o & PropertyFlags.VIRTUAL) != 0) {
                return f2167x;
            }
            List<Object> list = this.f2178p;
            return (list == null || list.size() == 0) ? f2167x : this.f2179q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo3067l() {
            return (this.f2177o & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) != 0 || mo3070o();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean mo3068m() {
            return (this.f2168f.getParent() == null || this.f2168f.getParent() == this.f2185w) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo3069n() {
            return (this.f2177o & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo3070o() {
            return (this.f2177o & 4) != 0;
        }

        /* renamed from: p */
        public final boolean mo3071p() {
            return (this.f2177o & 16) == 0 && !C0890v.m4802z(this.f2168f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo3072q() {
            return (this.f2177o & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo3073r() {
            return this.f2181s != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo3074s() {
            return (this.f2177o & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo3075t() {
            return (this.f2177o & 2) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f2170h + " id=" + this.f2172j + ", oldPos=" + this.f2171i + ", pLpos:" + this.f2174l);
            if (mo3073r()) {
                sb.append(" scrap ");
                sb.append(this.f2182t ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo3070o()) {
                sb.append(" invalid");
            }
            if (!mo3069n()) {
                sb.append(" unbound");
            }
            if (mo3077u()) {
                sb.append(" update");
            }
            if (mo3072q()) {
                sb.append(" removed");
            }
            if (mo3081y()) {
                sb.append(" ignored");
            }
            if (mo3074s()) {
                sb.append(" tmpDetached");
            }
            if (!mo3071p()) {
                sb.append(" not recyclable(" + this.f2180r + ")");
            }
            if (mo3067l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f2168f.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public boolean mo3077u() {
            return (this.f2177o & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo3078v() {
            this.f2177o = 0;
            this.f2170h = -1;
            this.f2171i = -1;
            this.f2172j = -1;
            this.f2174l = -1;
            this.f2180r = 0;
            this.f2175m = null;
            this.f2176n = null;
            mo3055b();
            this.f2183u = 0;
            this.f2184v = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo3079w() {
            if (this.f2171i == -1) {
                this.f2171i = this.f2170h;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo3080x() {
            return (this.f2177o & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo3081y() {
            return (this.f2177o & PropertyFlags.ID_SELF_ASSIGNABLE) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo3082z() {
            this.f2181s.mo3325c(this);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0525e implements C0572d.C0574b {
        C0525e() {
        }

        /* renamed from: a */
        public View mo3083a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: a */
        public void mo3084a() {
            int b = mo3088b();
            for (int i = 0; i < b; i++) {
                View a = mo3083a(i);
                RecyclerView.this.dispatchChildDetached(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: a */
        public void mo3085a(View view) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo3052a(RecyclerView.this);
            }
        }

        /* renamed from: a */
        public void mo3086a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        /* renamed from: a */
        public void mo3087a(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo3074s() || childViewHolderInt.mo3081y()) {
                    childViewHolderInt.mo3059d();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: b */
        public int mo3088b() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: b */
        public C0524d0 mo3089b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: b */
        public void mo3090b(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: c */
        public void mo3091c(int i) {
            C0524d0 childViewHolderInt;
            View a = mo3083a(i);
            if (!(a == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a)) == null)) {
                if (!childViewHolderInt.mo3074s() || childViewHolderInt.mo3081y()) {
                    childViewHolderInt.mo3047a((int) PropertyFlags.INDEX_PARTIAL_SKIP_NULL);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: c */
        public void mo3092c(View view) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo3056b(RecyclerView.this);
            }
        }

        /* renamed from: d */
        public int mo3093d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0526f implements C0567a.C0568a {
        C0526f() {
        }

        /* renamed from: a */
        public C0524d0 mo3094a(int i) {
            C0524d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo3475c(findViewHolderForPosition.f2168f)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: a */
        public void mo3095a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: a */
        public void mo3096a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: a */
        public void mo3097a(C0567a.C0569b bVar) {
            mo3101c(bVar);
        }

        /* renamed from: b */
        public void mo3098b(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f2144d += i2;
        }

        /* renamed from: b */
        public void mo3099b(C0567a.C0569b bVar) {
            mo3101c(bVar);
        }

        /* renamed from: c */
        public void mo3100c(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3101c(C0567a.C0569b bVar) {
            int i = bVar.f2323a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo2752a(recyclerView, bVar.f2324b, bVar.f2326d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo2759b(recyclerView2, bVar.f2324b, bVar.f2326d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo2754a(recyclerView3, bVar.f2324b, bVar.f2326d, bVar.f2325c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo2753a(recyclerView4, bVar.f2324b, bVar.f2326d, 1);
            }
        }

        /* renamed from: d */
        public void mo3102d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0527g<VH extends C0524d0> {

        /* renamed from: a */
        private final C0528h f2188a = new C0528h();

        /* renamed from: b */
        private boolean f2189b = false;

        /* renamed from: a */
        public long mo3103a(int i) {
            return -1;
        }

        /* renamed from: a */
        public final VH mo3104a(ViewGroup viewGroup, int i) {
            try {
                C0798a.m4441a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH b = mo3116b(viewGroup, i);
                if (b.f2168f.getParent() == null) {
                    b.f2173k = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0798a.m4440a();
            }
        }

        /* renamed from: a */
        public final void mo3105a(int i, int i2) {
            this.f2188a.mo3129a(i, i2);
        }

        /* renamed from: a */
        public final void mo3106a(int i, int i2, Object obj) {
            this.f2188a.mo3130a(i, i2, obj);
        }

        /* renamed from: a */
        public final void mo3107a(int i, Object obj) {
            this.f2188a.mo3130a(i, 1, obj);
        }

        /* renamed from: a */
        public final void mo3108a(VH vh, int i) {
            vh.f2170h = i;
            if (mo3127d()) {
                vh.f2172j = mo3103a(i);
            }
            vh.mo3048a(1, 519);
            C0798a.m4441a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo3109a(vh, i, vh.mo3066k());
            vh.mo3055b();
            ViewGroup.LayoutParams layoutParams = vh.f2168f.getLayoutParams();
            if (layoutParams instanceof C0543p) {
                ((C0543p) layoutParams).f2225h = true;
            }
            C0798a.m4440a();
        }

        /* renamed from: a */
        public void mo3109a(VH vh, int i, List<Object> list) {
            mo3119b(vh, i);
        }

        /* renamed from: a */
        public void mo3110a(C0529i iVar) {
            this.f2188a.registerObserver(iVar);
        }

        /* renamed from: a */
        public void mo3111a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo3112a(boolean z) {
            if (!mo3125c()) {
                this.f2189b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: a */
        public boolean mo3113a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public abstract int mo3114b();

        /* renamed from: b */
        public int mo3115b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo3116b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public final void mo3117b(int i, int i2) {
            this.f2188a.mo3134c(i, i2);
        }

        /* renamed from: b */
        public void mo3118b(VH vh) {
        }

        /* renamed from: b */
        public abstract void mo3119b(VH vh, int i);

        /* renamed from: b */
        public void mo3120b(C0529i iVar) {
            this.f2188a.unregisterObserver(iVar);
        }

        /* renamed from: b */
        public void mo3121b(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public final void mo3122c(int i) {
            this.f2188a.mo3133b(i, 1);
        }

        /* renamed from: c */
        public final void mo3123c(int i, int i2) {
            this.f2188a.mo3135d(i, i2);
        }

        /* renamed from: c */
        public void mo3124c(VH vh) {
        }

        /* renamed from: c */
        public final boolean mo3125c() {
            return this.f2188a.mo3131a();
        }

        /* renamed from: d */
        public void mo3126d(VH vh) {
        }

        /* renamed from: d */
        public final boolean mo3127d() {
            return this.f2189b;
        }

        /* renamed from: e */
        public final void mo3128e() {
            this.f2188a.mo3132b();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0528h extends Observable<C0529i> {
        C0528h() {
        }

        /* renamed from: a */
        public void mo3129a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0529i) this.mObservers.get(size)).mo3138a(i, i2, 1);
            }
        }

        /* renamed from: a */
        public void mo3130a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0529i) this.mObservers.get(size)).mo3139a(i, i2, obj);
            }
        }

        /* renamed from: a */
        public boolean mo3131a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo3132b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0529i) this.mObservers.get(size)).mo3136a();
            }
        }

        /* renamed from: b */
        public void mo3133b(int i, int i2) {
            mo3130a(i, i2, (Object) null);
        }

        /* renamed from: c */
        public void mo3134c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0529i) this.mObservers.get(size)).mo3140b(i, i2);
            }
        }

        /* renamed from: d */
        public void mo3135d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0529i) this.mObservers.get(size)).mo3141c(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0529i {
        /* renamed from: a */
        public void mo3136a() {
        }

        /* renamed from: a */
        public void mo3137a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo3138a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3139a(int i, int i2, Object obj) {
            mo3137a(i, i2);
        }

        /* renamed from: b */
        public void mo3140b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo3141c(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0530j {
        /* renamed from: a */
        int mo3142a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0531k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo3143a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0532l {

        /* renamed from: a */
        private C0534b f2190a = null;

        /* renamed from: b */
        private ArrayList<C0533a> f2191b = new ArrayList<>();

        /* renamed from: c */
        private long f2192c = 120;

        /* renamed from: d */
        private long f2193d = 120;

        /* renamed from: e */
        private long f2194e = 250;

        /* renamed from: f */
        private long f2195f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0533a {
            /* renamed from: a */
            void mo3165a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C0534b {
            /* renamed from: a */
            void mo3166a(C0524d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0535c {

            /* renamed from: a */
            public int f2196a;

            /* renamed from: b */
            public int f2197b;

            /* renamed from: a */
            public C0535c mo3167a(C0524d0 d0Var) {
                mo3168a(d0Var, 0);
                return this;
            }

            /* renamed from: a */
            public C0535c mo3168a(C0524d0 d0Var, int i) {
                View view = d0Var.f2168f;
                this.f2196a = view.getLeft();
                this.f2197b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m2775e(C0524d0 d0Var) {
            int i = d0Var.f2177o & 14;
            if (d0Var.mo3070o()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int j = d0Var.mo3065j();
            int f = d0Var.mo3061f();
            return (j == -1 || f == -1 || j == f) ? i : i | PropertyFlags.INDEX_HASH;
        }

        /* renamed from: a */
        public C0535c mo3144a(C0518a0 a0Var, C0524d0 d0Var) {
            C0535c h = mo3163h();
            h.mo3167a(d0Var);
            return h;
        }

        /* renamed from: a */
        public C0535c mo3145a(C0518a0 a0Var, C0524d0 d0Var, int i, List<Object> list) {
            C0535c h = mo3163h();
            h.mo3167a(d0Var);
            return h;
        }

        /* renamed from: a */
        public final void mo3146a() {
            int size = this.f2191b.size();
            for (int i = 0; i < size; i++) {
                this.f2191b.get(i).mo3165a();
            }
            this.f2191b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3147a(C0534b bVar) {
            this.f2190a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo3148a(C0524d0 d0Var);

        /* renamed from: a */
        public abstract boolean mo3149a(C0524d0 d0Var, C0524d0 d0Var2, C0535c cVar, C0535c cVar2);

        /* renamed from: a */
        public abstract boolean mo3150a(C0524d0 d0Var, C0535c cVar, C0535c cVar2);

        /* renamed from: a */
        public boolean mo3151a(C0524d0 d0Var, List<Object> list) {
            return mo3148a(d0Var);
        }

        /* renamed from: b */
        public abstract void mo3152b();

        /* renamed from: b */
        public final void mo3153b(C0524d0 d0Var) {
            mo3159d(d0Var);
            C0534b bVar = this.f2190a;
            if (bVar != null) {
                bVar.mo3166a(d0Var);
            }
        }

        /* renamed from: b */
        public abstract boolean mo3154b(C0524d0 d0Var, C0535c cVar, C0535c cVar2);

        /* renamed from: c */
        public long mo3155c() {
            return this.f2192c;
        }

        /* renamed from: c */
        public abstract void mo3156c(C0524d0 d0Var);

        /* renamed from: c */
        public abstract boolean mo3157c(C0524d0 d0Var, C0535c cVar, C0535c cVar2);

        /* renamed from: d */
        public long mo3158d() {
            return this.f2195f;
        }

        /* renamed from: d */
        public void mo3159d(C0524d0 d0Var) {
        }

        /* renamed from: e */
        public long mo3160e() {
            return this.f2194e;
        }

        /* renamed from: f */
        public long mo3161f() {
            return this.f2193d;
        }

        /* renamed from: g */
        public abstract boolean mo3162g();

        /* renamed from: h */
        public C0535c mo3163h() {
            return new C0535c();
        }

        /* renamed from: i */
        public abstract void mo3164i();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0536m implements C0532l.C0534b {
        C0536m() {
        }

        /* renamed from: a */
        public void mo3166a(C0524d0 d0Var) {
            d0Var.mo3054a(true);
            if (d0Var.f2175m != null && d0Var.f2176n == null) {
                d0Var.f2175m = null;
            }
            d0Var.f2176n = null;
            if (!d0Var.mo3080x() && !RecyclerView.this.removeAnimatingView(d0Var.f2168f) && d0Var.mo3074s()) {
                RecyclerView.this.removeDetachedView(d0Var.f2168f, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0537n {
        @Deprecated
        /* renamed from: a */
        public void mo3169a(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo3170a(Canvas canvas, RecyclerView recyclerView, C0518a0 a0Var) {
            mo3169a(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo3171a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo3172a(Rect rect, View view, RecyclerView recyclerView, C0518a0 a0Var) {
            mo3171a(rect, ((C0543p) view.getLayoutParams()).mo3279n(), recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void mo3173b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3174b(Canvas canvas, RecyclerView recyclerView, C0518a0 a0Var) {
            mo3173b(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0538o {

        /* renamed from: f */
        C0572d f2199f;

        /* renamed from: g */
        RecyclerView f2200g;

        /* renamed from: h */
        private final C0619t.C0621b f2201h = new C0539a();

        /* renamed from: i */
        private final C0619t.C0621b f2202i = new C0540b();

        /* renamed from: j */
        C0619t f2203j = new C0619t(this.f2201h);

        /* renamed from: k */
        C0619t f2204k = new C0619t(this.f2202i);

        /* renamed from: l */
        C0555z f2205l;

        /* renamed from: m */
        boolean f2206m = false;

        /* renamed from: n */
        boolean f2207n = false;

        /* renamed from: o */
        boolean f2208o = false;

        /* renamed from: p */
        private boolean f2209p = true;

        /* renamed from: q */
        private boolean f2210q = true;

        /* renamed from: r */
        int f2211r;

        /* renamed from: s */
        boolean f2212s;

        /* renamed from: t */
        private int f2213t;

        /* renamed from: u */
        private int f2214u;

        /* renamed from: v */
        private int f2215v;

        /* renamed from: w */
        private int f2216w;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0539a implements C0619t.C0621b {
            C0539a() {
            }

            /* renamed from: a */
            public int mo3273a() {
                return C0538o.this.mo3261o() - C0538o.this.getPaddingRight();
            }

            /* renamed from: a */
            public int mo3274a(View view) {
                return C0538o.this.mo3251j(view) + ((C0543p) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public View mo3275a(int i) {
                return C0538o.this.mo3233f(i);
            }

            /* renamed from: b */
            public int mo3276b() {
                return C0538o.this.getPaddingLeft();
            }

            /* renamed from: b */
            public int mo3277b(View view) {
                return C0538o.this.mo3235g(view) - ((C0543p) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0540b implements C0619t.C0621b {
            C0540b() {
            }

            /* renamed from: a */
            public int mo3273a() {
                return C0538o.this.mo3247i() - C0538o.this.getPaddingBottom();
            }

            /* renamed from: a */
            public int mo3274a(View view) {
                return C0538o.this.mo3232f(view) + ((C0543p) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: a */
            public View mo3275a(int i) {
                return C0538o.this.mo3233f(i);
            }

            /* renamed from: b */
            public int mo3276b() {
                return C0538o.this.getPaddingTop();
            }

            /* renamed from: b */
            public int mo3277b(View view) {
                return C0538o.this.mo3254k(view) - ((C0543p) view.getLayoutParams()).topMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0541c {
            /* renamed from: a */
            void mo3278a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0542d {

            /* renamed from: a */
            public int f2219a;

            /* renamed from: b */
            public int f2220b;

            /* renamed from: c */
            public boolean f2221c;

            /* renamed from: d */
            public boolean f2222d;
        }

        /* renamed from: a */
        public static int m2808a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return View.MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return View.MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = RecyclerView.UNDEFINED_DURATION;
                        }
                    }
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public static C0542d m2809a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0542d dVar = new C0542d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0943b.RecyclerView, i, i2);
            dVar.f2219a = obtainStyledAttributes.getInt(C0943b.RecyclerView_android_orientation, 1);
            dVar.f2220b = obtainStyledAttributes.getInt(C0943b.RecyclerView_spanCount, 1);
            dVar.f2221c = obtainStyledAttributes.getBoolean(C0943b.RecyclerView_reverseLayout, false);
            dVar.f2222d = obtainStyledAttributes.getBoolean(C0943b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: a */
        private void m2810a(View view, int i, boolean z) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo3072q()) {
                this.f2200g.mViewInfoStore.mo3615a(childViewHolderInt);
            } else {
                this.f2200g.mViewInfoStore.mo3626g(childViewHolderInt);
            }
            C0543p pVar = (C0543p) view.getLayoutParams();
            if (childViewHolderInt.mo3045A() || childViewHolderInt.mo3073r()) {
                if (childViewHolderInt.mo3073r()) {
                    childViewHolderInt.mo3082z();
                } else {
                    childViewHolderInt.mo3058c();
                }
                this.f2199f.mo3467a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2200g) {
                int b = this.f2199f.mo3471b(view);
                if (i == -1) {
                    i = this.f2199f.mo3464a();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2200g.indexOfChild(view) + this.f2200g.exceptionLabel());
                } else if (b != i) {
                    this.f2200g.mLayout.mo3176a(b, i);
                }
            } else {
                this.f2199f.mo3468a(view, i, false);
                pVar.f2225h = true;
                C0555z zVar = this.f2205l;
                if (zVar != null && zVar.mo3357e()) {
                    this.f2205l.mo3353b(view);
                }
            }
            if (pVar.f2226i) {
                childViewHolderInt.f2168f.invalidate();
                pVar.f2226i = false;
            }
        }

        /* renamed from: a */
        private void m2811a(C0550v vVar, int i, View view) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo3081y()) {
                if (!childViewHolderInt.mo3070o() || childViewHolderInt.mo3072q() || this.f2200g.mAdapter.mo3127d()) {
                    mo3225d(i);
                    vVar.mo3324c(view);
                    this.f2200g.mViewInfoStore.mo3623d(childViewHolderInt);
                    return;
                }
                mo3252j(i);
                vVar.mo3320b(childViewHolderInt);
            }
        }

        /* renamed from: b */
        private void m2812b(int i, View view) {
            this.f2199f.mo3465a(i);
        }

        /* renamed from: c */
        public static int m2813c(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: c */
        private int[] m2814c(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int o = mo3261o() - getPaddingRight();
            int i = mo3247i() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - paddingLeft;
            int min = Math.min(0, i2);
            int i3 = top - paddingTop;
            int min2 = Math.min(0, i3);
            int i4 = width - o;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - i);
            if (mo3255l() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private static boolean m2815d(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: d */
        private boolean m2816d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int o = mo3261o() - getPaddingRight();
            int i3 = mo3247i() - getPaddingBottom();
            Rect rect = this.f2200g.mTempRect;
            mo3211b(focusedChild, rect);
            return rect.left - i < o && rect.right - i > paddingLeft && rect.top - i2 < i3 && rect.bottom - i2 > paddingTop;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public boolean mo2779A() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo3175B() {
            C0555z zVar = this.f2205l;
            if (zVar != null) {
                zVar.mo3360h();
            }
        }

        /* renamed from: C */
        public boolean mo2739C() {
            return false;
        }

        /* renamed from: a */
        public int mo2741a(int i, C0550v vVar, C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo2790a(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo2742a(C0550v vVar, C0518a0 a0Var) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo2804b()) {
                return 1;
            }
            return this.f2200g.mAdapter.mo3114b();
        }

        /* renamed from: a */
        public View mo2743a(View view, int i, C0550v vVar, C0518a0 a0Var) {
            return null;
        }

        /* renamed from: a */
        public C0543p mo2745a(Context context, AttributeSet attributeSet) {
            return new C0543p(context, attributeSet);
        }

        /* renamed from: a */
        public C0543p mo2746a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0543p ? new C0543p((C0543p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0543p((ViewGroup.MarginLayoutParams) layoutParams) : new C0543p(layoutParams);
        }

        /* renamed from: a */
        public void mo3176a(int i, int i2) {
            View f = mo3233f(i);
            if (f != null) {
                mo3225d(i);
                mo3219c(f, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f2200g.toString());
        }

        /* renamed from: a */
        public void mo2794a(int i, int i2, C0518a0 a0Var, C0541c cVar) {
        }

        /* renamed from: a */
        public void mo2795a(int i, C0541c cVar) {
        }

        /* renamed from: a */
        public void mo3177a(int i, C0550v vVar) {
            View f = mo3233f(i);
            mo3252j(i);
            vVar.mo3319b(f);
        }

        /* renamed from: a */
        public void mo2747a(Rect rect, int i, int i2) {
            mo3217c(m2813c(i, rect.width() + getPaddingLeft() + getPaddingRight(), mo3259n()), m2813c(i2, rect.height() + getPaddingTop() + getPaddingBottom(), mo3257m()));
        }

        /* renamed from: a */
        public void mo2796a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo3178a(View view, int i) {
            m2810a(view, i, true);
        }

        /* renamed from: a */
        public void mo3179a(View view, int i, int i2, int i3, int i4) {
            C0543p pVar = (C0543p) view.getLayoutParams();
            Rect rect = pVar.f2224g;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo3180a(View view, int i, C0543p pVar) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo3072q()) {
                this.f2200g.mViewInfoStore.mo3615a(childViewHolderInt);
            } else {
                this.f2200g.mViewInfoStore.mo3626g(childViewHolderInt);
            }
            this.f2199f.mo3467a(view, i, pVar, childViewHolderInt.mo3072q());
        }

        /* renamed from: a */
        public void mo3181a(View view, Rect rect) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: a */
        public void mo3182a(View view, C0550v vVar) {
            mo3264p(view);
            vVar.mo3319b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3183a(View view, C0857c cVar) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo3072q() && !this.f2199f.mo3475c(childViewHolderInt.f2168f)) {
                RecyclerView recyclerView = this.f2200g;
                mo2749a(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo3184a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0543p) view.getLayoutParams()).f2224g;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f2200g == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f2200g.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo2797a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2200g;
            mo3188a(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo3185a(C0527g gVar, C0527g gVar2) {
        }

        /* renamed from: a */
        public void mo3186a(C0550v vVar) {
            for (int f = mo3231f() - 1; f >= 0; f--) {
                m2811a(vVar, f, mo3233f(f));
            }
        }

        /* renamed from: a */
        public void mo3187a(C0550v vVar, C0518a0 a0Var, int i, int i2) {
            this.f2200g.defaultOnMeasure(i, i2);
        }

        /* renamed from: a */
        public void mo2749a(C0550v vVar, C0518a0 a0Var, View view, C0857c cVar) {
            cVar.mo4594b((Object) C0857c.C0860c.m4675a(mo2807c() ? mo3258m(view) : 0, 1, mo2804b() ? mo3258m(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void mo3188a(C0550v vVar, C0518a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2200g.canScrollVertically(-1) && !this.f2200g.canScrollHorizontally(-1) && !this.f2200g.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0527g gVar = this.f2200g.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo3114b());
                }
            }
        }

        /* renamed from: a */
        public void mo3189a(C0550v vVar, C0518a0 a0Var, C0857c cVar) {
            if (this.f2200g.canScrollVertically(-1) || this.f2200g.canScrollHorizontally(-1)) {
                cVar.mo4580a(8192);
                cVar.mo4624l(true);
            }
            if (this.f2200g.canScrollVertically(1) || this.f2200g.canScrollHorizontally(1)) {
                cVar.mo4580a((int) PropertyFlags.INDEX_HASH64);
                cVar.mo4624l(true);
            }
            cVar.mo4587a((Object) C0857c.C0859b.m4674a(mo2758b(vVar, a0Var), mo2742a(vVar, a0Var), mo3227d(vVar, a0Var), mo3216c(vVar, a0Var)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3190a(C0555z zVar) {
            if (this.f2205l == zVar) {
                this.f2205l = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3191a(RecyclerView recyclerView) {
            this.f2207n = true;
            mo3214b(recyclerView);
        }

        /* renamed from: a */
        public void mo2752a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo2753a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo2754a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3222c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo2799a(RecyclerView recyclerView, C0518a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3192a(RecyclerView recyclerView, C0550v vVar) {
            this.f2207n = false;
            mo2802b(recyclerView, vVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3193a(C0857c cVar) {
            RecyclerView recyclerView = this.f2200g;
            mo3189a(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* renamed from: a */
        public void mo2800a(String str) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo3194a(boolean z) {
            this.f2208o = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3195a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2200g;
            return mo3199a(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3196a(View view, int i, int i2, C0543p pVar) {
            return view.isLayoutRequested() || !this.f2209p || !m2815d(view.getWidth(), i, pVar.width) || !m2815d(view.getHeight(), i2, pVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3197a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2200g;
            return mo3200a(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3198a(View view, boolean z, boolean z2) {
            boolean z3 = this.f2203j.mo3606a(view, 24579) && this.f2204k.mo3606a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo2755a(C0543p pVar) {
            return pVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3199a(androidx.recyclerview.widget.RecyclerView.C0550v r8, androidx.recyclerview.widget.RecyclerView.C0518a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f2200g
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo3247i()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f2200g
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3261o()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo3247i()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f2200g
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3261o()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f2200g
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0538o.mo3199a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo3200a(C0550v vVar, C0518a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3201a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo3202a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo3202a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c = m2814c(view, rect);
            int i = c[0];
            int i2 = c[1];
            if ((z2 && !m2816d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo3203a(RecyclerView recyclerView, View view, View view2) {
            return mo3269v() || recyclerView.isComputingLayout();
        }

        /* renamed from: a */
        public boolean mo3204a(RecyclerView recyclerView, C0518a0 a0Var, View view, View view2) {
            return mo3203a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public boolean mo3205a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3206a(Runnable runnable) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo2756b(int i, C0550v vVar, C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo2757b(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo2758b(C0550v vVar, C0518a0 a0Var) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo2807c()) {
                return 1;
            }
            return this.f2200g.mAdapter.mo3114b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3207b(int i, int i2) {
            this.f2215v = View.MeasureSpec.getSize(i);
            this.f2213t = View.MeasureSpec.getMode(i);
            if (this.f2213t == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f2215v = 0;
            }
            this.f2216w = View.MeasureSpec.getSize(i2);
            this.f2214u = View.MeasureSpec.getMode(i2);
            if (this.f2214u == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f2216w = 0;
            }
        }

        /* renamed from: b */
        public void mo3208b(View view) {
            mo3178a(view, -1);
        }

        /* renamed from: b */
        public void mo3209b(View view, int i) {
            m2810a(view, i, false);
        }

        /* renamed from: b */
        public void mo3210b(View view, int i, int i2) {
            C0543p pVar = (C0543p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f2200g.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a = m2808a(mo3261o(), mo3263p(), getPaddingLeft() + getPaddingRight() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo2804b());
            int a2 = m2808a(mo3247i(), mo3250j(), getPaddingTop() + getPaddingBottom() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo2807c());
            if (mo3196a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: b */
        public void mo3211b(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: b */
        public void mo3212b(C0550v vVar) {
            for (int f = mo3231f() - 1; f >= 0; f--) {
                if (!RecyclerView.getChildViewHolderInt(mo3233f(f)).mo3081y()) {
                    mo3177a(f, vVar);
                }
            }
        }

        /* renamed from: b */
        public void mo3213b(C0555z zVar) {
            C0555z zVar2 = this.f2205l;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo3357e())) {
                this.f2205l.mo3360h();
            }
            this.f2205l = zVar;
            this.f2205l.mo3350a(this.f2200g, this);
        }

        /* renamed from: b */
        public void mo3214b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo2759b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public void mo2802b(RecyclerView recyclerView, C0550v vVar) {
            mo3221c(recyclerView);
        }

        /* renamed from: b */
        public boolean mo2804b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3215b(View view, int i, int i2, C0543p pVar) {
            return !this.f2209p || !m2815d(view.getMeasuredWidth(), i, pVar.width) || !m2815d(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: c */
        public int mo2760c(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public int mo3216c(C0550v vVar, C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public void mo3217c(int i, int i2) {
            this.f2200g.setMeasuredDimension(i, i2);
        }

        /* renamed from: c */
        public void mo3218c(View view) {
            mo3209b(view, -1);
        }

        /* renamed from: c */
        public void mo3219c(View view, int i) {
            mo3180a(view, i, (C0543p) view.getLayoutParams());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3220c(C0550v vVar) {
            int e = vVar.mo3329e();
            for (int i = e - 1; i >= 0; i--) {
                View c = vVar.mo3321c(i);
                C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                if (!childViewHolderInt.mo3081y()) {
                    childViewHolderInt.mo3054a(false);
                    if (childViewHolderInt.mo3074s()) {
                        this.f2200g.removeDetachedView(c, false);
                    }
                    C0532l lVar = this.f2200g.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo3156c(childViewHolderInt);
                    }
                    childViewHolderInt.mo3054a(true);
                    vVar.mo3309a(c);
                }
            }
            vVar.mo3322c();
            if (e > 0) {
                this.f2200g.invalidate();
            }
        }

        @Deprecated
        /* renamed from: c */
        public void mo3221c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo3222c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c */
        public boolean mo2807c() {
            return false;
        }

        /* renamed from: d */
        public int mo2808d(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: d */
        public View mo3223d(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f2199f.mo3475c(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: d */
        public View mo3224d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public abstract C0543p mo2762d();

        /* renamed from: d */
        public void mo3225d(int i) {
            m2812b(i, mo3233f(i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3226d(int i, int i2) {
            int f = mo3231f();
            if (f == 0) {
                this.f2200g.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            for (int i7 = 0; i7 < f; i7++) {
                View f2 = mo3233f(i7);
                Rect rect = this.f2200g.mTempRect;
                mo3211b(f2, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f2200g.mTempRect.set(i3, i4, i5, i6);
            mo2747a(this.f2200g.mTempRect, i, i2);
        }

        /* renamed from: d */
        public void mo2763d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo3227d(C0550v vVar, C0518a0 a0Var) {
            return false;
        }

        /* renamed from: e */
        public int mo3228e() {
            return -1;
        }

        /* renamed from: e */
        public int mo3229e(View view) {
            return ((C0543p) view.getLayoutParams()).f2224g.bottom;
        }

        /* renamed from: e */
        public int mo2764e(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: e */
        public View mo2809e(int i) {
            int f = mo3231f();
            for (int i2 = 0; i2 < f; i2++) {
                View f2 = mo3233f(i2);
                C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(f2);
                if (childViewHolderInt != null && childViewHolderInt.mo3064i() == i && !childViewHolderInt.mo3081y() && (this.f2200g.mState.mo3030d() || !childViewHolderInt.mo3072q())) {
                    return f2;
                }
            }
            return null;
        }

        /* renamed from: e */
        public void mo2765e(C0550v vVar, C0518a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3230e(RecyclerView recyclerView) {
            mo3207b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public int mo3231f() {
            C0572d dVar = this.f2199f;
            if (dVar != null) {
                return dVar.mo3464a();
            }
            return 0;
        }

        /* renamed from: f */
        public int mo3232f(View view) {
            return view.getBottom() + mo3229e(view);
        }

        /* renamed from: f */
        public int mo2767f(C0518a0 a0Var) {
            return 0;
        }

        /* renamed from: f */
        public View mo3233f(int i) {
            C0572d dVar = this.f2199f;
            if (dVar != null) {
                return dVar.mo3473c(i);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3234f(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f2200g = null;
                this.f2199f = null;
                i = 0;
                this.f2215v = 0;
            } else {
                this.f2200g = recyclerView;
                this.f2199f = recyclerView.mChildHelper;
                this.f2215v = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f2216w = i;
            this.f2213t = 1073741824;
            this.f2214u = 1073741824;
        }

        /* renamed from: g */
        public int mo3235g(View view) {
            return view.getLeft() - mo3256l(view);
        }

        /* renamed from: g */
        public void mo3236g(int i) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: g */
        public void mo2768g(C0518a0 a0Var) {
        }

        /* renamed from: g */
        public boolean mo3237g() {
            RecyclerView recyclerView = this.f2200g;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return C0890v.m4795s(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return C0890v.m4796t(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h */
        public int mo3244h(View view) {
            Rect rect = ((C0543p) view.getLayoutParams()).f2224g;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: h */
        public View mo3245h() {
            View focusedChild;
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2199f.mo3475c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: h */
        public void mo3246h(int i) {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: i */
        public int mo3247i() {
            return this.f2216w;
        }

        /* renamed from: i */
        public int mo3248i(View view) {
            Rect rect = ((C0543p) view.getLayoutParams()).f2224g;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: i */
        public void mo3249i(int i) {
        }

        /* renamed from: j */
        public int mo3250j() {
            return this.f2214u;
        }

        /* renamed from: j */
        public int mo3251j(View view) {
            return view.getRight() + mo3260n(view);
        }

        /* renamed from: j */
        public void mo3252j(int i) {
            if (mo3233f(i) != null) {
                this.f2199f.mo3478e(i);
            }
        }

        /* renamed from: k */
        public int mo3253k() {
            RecyclerView recyclerView = this.f2200g;
            C0527g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo3114b();
            }
            return 0;
        }

        /* renamed from: k */
        public int mo3254k(View view) {
            return view.getTop() - mo3262o(view);
        }

        /* renamed from: k */
        public void mo2812k(int i) {
        }

        /* renamed from: l */
        public int mo3255l() {
            return C0890v.m4791o(this.f2200g);
        }

        /* renamed from: l */
        public int mo3256l(View view) {
            return ((C0543p) view.getLayoutParams()).f2224g.left;
        }

        /* renamed from: m */
        public int mo3257m() {
            return C0890v.m4792p(this.f2200g);
        }

        /* renamed from: m */
        public int mo3258m(View view) {
            return ((C0543p) view.getLayoutParams()).mo3279n();
        }

        /* renamed from: n */
        public int mo3259n() {
            return C0890v.m4793q(this.f2200g);
        }

        /* renamed from: n */
        public int mo3260n(View view) {
            return ((C0543p) view.getLayoutParams()).f2224g.right;
        }

        /* renamed from: o */
        public int mo3261o() {
            return this.f2215v;
        }

        /* renamed from: o */
        public int mo3262o(View view) {
            return ((C0543p) view.getLayoutParams()).f2224g.top;
        }

        /* renamed from: p */
        public int mo3263p() {
            return this.f2213t;
        }

        /* renamed from: p */
        public void mo3264p(View view) {
            this.f2199f.mo3477d(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo3265q() {
            int f = mo3231f();
            for (int i = 0; i < f; i++) {
                ViewGroup.LayoutParams layoutParams = mo3233f(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r */
        public boolean mo3266r() {
            return this.f2207n;
        }

        /* renamed from: s */
        public boolean mo2815s() {
            return this.f2208o;
        }

        /* renamed from: t */
        public final boolean mo3267t() {
            return this.f2210q;
        }

        /* renamed from: u */
        public boolean mo3268u() {
            return this.f2209p;
        }

        /* renamed from: v */
        public boolean mo3269v() {
            C0555z zVar = this.f2205l;
            return zVar != null && zVar.mo3357e();
        }

        /* renamed from: w */
        public Parcelable mo2816w() {
            return null;
        }

        /* renamed from: x */
        public void mo3270x() {
            for (int f = mo3231f() - 1; f >= 0; f--) {
                this.f2199f.mo3478e(f);
            }
        }

        /* renamed from: y */
        public void mo3271y() {
            RecyclerView recyclerView = this.f2200g;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: z */
        public void mo3272z() {
            this.f2206m = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0543p extends ViewGroup.MarginLayoutParams {

        /* renamed from: f */
        C0524d0 f2223f;

        /* renamed from: g */
        final Rect f2224g = new Rect();

        /* renamed from: h */
        boolean f2225h = true;

        /* renamed from: i */
        boolean f2226i = false;

        public C0543p(int i, int i2) {
            super(i, i2);
        }

        public C0543p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0543p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0543p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0543p(C0543p pVar) {
            super(pVar);
        }

        /* renamed from: n */
        public int mo3279n() {
            return this.f2223f.mo3064i();
        }

        /* renamed from: o */
        public boolean mo3280o() {
            return this.f2223f.mo3075t();
        }

        /* renamed from: p */
        public boolean mo3281p() {
            return this.f2223f.mo3072q();
        }

        /* renamed from: q */
        public boolean mo3282q() {
            return this.f2223f.mo3070o();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0544q {
        /* renamed from: a */
        void mo3283a(View view);

        /* renamed from: b */
        void mo3284b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0545r {
        /* renamed from: a */
        public abstract boolean mo3285a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0546s {
        /* renamed from: a */
        void mo3286a(boolean z);

        /* renamed from: a */
        boolean mo3287a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo3288b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0547t {
        /* renamed from: a */
        public void mo3289a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo3290a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0548u {

        /* renamed from: a */
        SparseArray<C0549a> f2227a = new SparseArray<>();

        /* renamed from: b */
        private int f2228b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0549a {

            /* renamed from: a */
            final ArrayList<C0524d0> f2229a = new ArrayList<>();

            /* renamed from: b */
            int f2230b = 5;

            /* renamed from: c */
            long f2231c = 0;

            /* renamed from: d */
            long f2232d = 0;

            C0549a() {
            }
        }

        /* renamed from: b */
        private C0549a m2971b(int i) {
            C0549a aVar = this.f2227a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0549a aVar2 = new C0549a();
            this.f2227a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3291a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public C0524d0 mo3292a(int i) {
            C0549a aVar = this.f2227a.get(i);
            if (aVar == null || aVar.f2229a.isEmpty()) {
                return null;
            }
            ArrayList<C0524d0> arrayList = aVar.f2229a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo3068m()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3293a() {
            this.f2228b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3294a(int i, long j) {
            C0549a b = m2971b(i);
            b.f2232d = mo3291a(b.f2232d, j);
        }

        /* renamed from: a */
        public void mo3295a(C0524d0 d0Var) {
            int h = d0Var.mo3063h();
            ArrayList<C0524d0> arrayList = m2971b(h).f2229a;
            if (this.f2227a.get(h).f2230b > arrayList.size()) {
                d0Var.mo3078v();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3296a(C0527g gVar, C0527g gVar2, boolean z) {
            if (gVar != null) {
                mo3301c();
            }
            if (!z && this.f2228b == 0) {
                mo3298b();
            }
            if (gVar2 != null) {
                mo3293a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3297a(int i, long j, long j2) {
            long j3 = m2971b(i).f2232d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        public void mo3298b() {
            for (int i = 0; i < this.f2227a.size(); i++) {
                this.f2227a.valueAt(i).f2229a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3299b(int i, long j) {
            C0549a b = m2971b(i);
            b.f2231c = mo3291a(b.f2231c, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3300b(int i, long j, long j2) {
            long j3 = m2971b(i).f2231c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3301c() {
            this.f2228b--;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0550v {

        /* renamed from: a */
        final ArrayList<C0524d0> f2233a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0524d0> f2234b = null;

        /* renamed from: c */
        final ArrayList<C0524d0> f2235c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0524d0> f2236d = Collections.unmodifiableList(this.f2233a);

        /* renamed from: e */
        private int f2237e = 2;

        /* renamed from: f */
        int f2238f = 2;

        /* renamed from: g */
        C0548u f2239g;

        /* renamed from: h */
        private C0520b0 f2240h;

        public C0550v() {
        }

        /* renamed from: a */
        private void m2983a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m2983a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private boolean m2984a(C0524d0 d0Var, int i, int i2, long j) {
            d0Var.f2185w = RecyclerView.this;
            int h = d0Var.mo3063h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f2239g.mo3297a(h, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo3108a(d0Var, i);
            this.f2239g.mo3294a(d0Var.mo3063h(), RecyclerView.this.getNanoTime() - nanoTime);
            m2985e(d0Var);
            if (!RecyclerView.this.mState.mo3030d()) {
                return true;
            }
            d0Var.f2174l = i2;
            return true;
        }

        /* renamed from: e */
        private void m2985e(C0524d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f2168f;
                if (C0890v.m4789m(view) == 0) {
                    C0890v.m4783h(view, 1);
                }
                C0838a b = C0890v.m4764b(view);
                if (b == null || b.getClass().equals(C0838a.class)) {
                    d0Var.mo3047a(16384);
                    C0890v.m4752a(view, RecyclerView.this.mAccessibilityDelegate.mo3582b());
                }
            }
        }

        /* renamed from: f */
        private void m2986f(C0524d0 d0Var) {
            View view = d0Var.f2168f;
            if (view instanceof ViewGroup) {
                m2983a((ViewGroup) view, false);
            }
        }

        /* renamed from: a */
        public int mo3302a(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.mo3025a()) {
                return !RecyclerView.this.mState.mo3030d() ? i : RecyclerView.this.mAdapterHelper.mo3446b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.mo3025a() + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0524d0 mo3303a(int i, boolean z) {
            View b;
            int size = this.f2233a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0524d0 d0Var = this.f2233a.get(i3);
                if (d0Var.mo3045A() || d0Var.mo3064i() != i || d0Var.mo3070o() || (!RecyclerView.this.mState.f2148h && d0Var.mo3072q())) {
                    i3++;
                } else {
                    d0Var.mo3047a(32);
                    return d0Var;
                }
            }
            if (z || (b = RecyclerView.this.mChildHelper.mo3472b(i)) == null) {
                int size2 = this.f2235c.size();
                while (i2 < size2) {
                    C0524d0 d0Var2 = this.f2235c.get(i2);
                    if (d0Var2.mo3070o() || d0Var2.mo3064i() != i || d0Var2.mo3068m()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f2235c.remove(i2);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(b);
            RecyclerView.this.mChildHelper.mo3480f(b);
            int b2 = RecyclerView.this.mChildHelper.mo3471b(b);
            if (b2 != -1) {
                RecyclerView.this.mChildHelper.mo3465a(b2);
                mo3324c(b);
                childViewHolderInt.mo3047a(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0524d0 mo3304a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0227
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.mo3025a()
                if (r3 >= r1) goto L_0x0227
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.mo3030d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3316b((int) r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3303a((int) r17, (boolean) r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo3328d((androidx.recyclerview.widget.RecyclerView.C0524d0) r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo3047a((int) r5)
                boolean r5 = r1.mo3073r()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f2168f
                r5.removeDetachedView(r9, r8)
                r1.mo3082z()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo3045A()
                if (r5 == 0) goto L_0x0057
                r1.mo3058c()
            L_0x0057:
                r6.mo3320b((androidx.recyclerview.widget.RecyclerView.C0524d0) r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.mo3446b((int) r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo3114b()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo3115b((int) r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.mo3127d()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.mo3103a((int) r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo3305a((long) r10, (int) r9, (boolean) r0)
                if (r1 == 0) goto L_0x0096
                r1.f2170h = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f2240h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo3034a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.getChildViewHolder(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo3081y()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo3327d()
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.mo3292a((int) r9)
                if (r1 == 0) goto L_0x0101
                r1.mo3078v()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r0 == 0) goto L_0x0101
                r6.m2986f((androidx.recyclerview.widget.RecyclerView.C0524d0) r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f2239g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo3300b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo3104a((android.view.ViewGroup) r2, (int) r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.f2168f
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f2169g = r10
            L_0x013a:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f2239g
                long r10 = r10 - r0
                r5.mo3299b(r9, r10)
                r10 = r2
                goto L_0x0181
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo3025a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0180:
                r10 = r1
            L_0x0181:
                r9 = r4
                if (r9 == 0) goto L_0x01ba
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo3030d()
                if (r0 != 0) goto L_0x01ba
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo3057b((int) r0)
                if (r1 == 0) goto L_0x01ba
                r10.mo3048a((int) r8, (int) r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f2151k
                if (r0 == 0) goto L_0x01ba
                int r0 = androidx.recyclerview.widget.RecyclerView.C0532l.m2775e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r10.mo3066k()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo3145a((androidx.recyclerview.widget.RecyclerView.C0518a0) r1, (androidx.recyclerview.widget.RecyclerView.C0524d0) r10, (int) r0, (java.util.List<java.lang.Object>) r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x01ba:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo3030d()
                if (r0 == 0) goto L_0x01cd
                boolean r0 = r10.mo3069n()
                if (r0 == 0) goto L_0x01cd
                r10.f2174l = r3
                goto L_0x01e0
            L_0x01cd:
                boolean r0 = r10.mo3069n()
                if (r0 == 0) goto L_0x01e2
                boolean r0 = r10.mo3077u()
                if (r0 != 0) goto L_0x01e2
                boolean r0 = r10.mo3070o()
                if (r0 == 0) goto L_0x01e0
                goto L_0x01e2
            L_0x01e0:
                r0 = 0
                goto L_0x01f5
            L_0x01e2:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo3446b((int) r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m2984a(r1, r2, r3, r4)
            L_0x01f5:
                android.view.View r1 = r10.f2168f
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0203:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0543p) r1
                android.view.View r2 = r10.f2168f
                r2.setLayoutParams(r1)
                goto L_0x021c
            L_0x020b:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0203
            L_0x021a:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0543p) r1
            L_0x021c:
                r1.f2223f = r10
                if (r9 == 0) goto L_0x0223
                if (r0 == 0) goto L_0x0223
                goto L_0x0224
            L_0x0223:
                r7 = 0
            L_0x0224:
                r1.f2226i = r7
                return r10
            L_0x0227:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo3025a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0550v.mo3304a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0524d0 mo3305a(long j, int i, boolean z) {
            for (int size = this.f2233a.size() - 1; size >= 0; size--) {
                C0524d0 d0Var = this.f2233a.get(size);
                if (d0Var.mo3062g() == j && !d0Var.mo3045A()) {
                    if (i == d0Var.mo3063h()) {
                        d0Var.mo3047a(32);
                        if (d0Var.mo3072q() && !RecyclerView.this.mState.mo3030d()) {
                            d0Var.mo3048a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f2233a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f2168f, false);
                        mo3309a(d0Var.f2168f);
                    }
                }
            }
            int size2 = this.f2235c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0524d0 d0Var2 = this.f2235c.get(size2);
                if (d0Var2.mo3062g() == j && !d0Var2.mo3068m()) {
                    if (i == d0Var2.mo3063h()) {
                        if (!z) {
                            this.f2235c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo3330e(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo3306a() {
            this.f2233a.clear();
            mo3335i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3307a(int i, int i2) {
            int size = this.f2235c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0524d0 d0Var = this.f2235c.get(i3);
                if (d0Var != null && d0Var.f2170h >= i) {
                    d0Var.mo3050a(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3308a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2235c.size() - 1; size >= 0; size--) {
                C0524d0 d0Var = this.f2235c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f2170h;
                    if (i4 >= i3) {
                        d0Var.mo3050a(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo3047a(8);
                        mo3330e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3309a(View view) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f2181s = null;
            childViewHolderInt.f2182t = false;
            childViewHolderInt.mo3058c();
            mo3320b(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3310a(C0520b0 b0Var) {
            this.f2240h = b0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3311a(C0524d0 d0Var) {
            C0551w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.mo3337a(d0Var);
            }
            C0527g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo3126d(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo3627h(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3312a(C0524d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            if (d0Var.mo3057b(16384)) {
                d0Var.mo3048a(0, 16384);
                C0890v.m4752a(d0Var.f2168f, (C0838a) null);
            }
            if (z) {
                mo3311a(d0Var);
            }
            d0Var.f2185w = null;
            mo3327d().mo3295a(d0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3313a(C0527g gVar, C0527g gVar2, boolean z) {
            mo3306a();
            mo3327d().mo3296a(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3314a(C0548u uVar) {
            C0548u uVar2 = this.f2239g;
            if (uVar2 != null) {
                uVar2.mo3301c();
            }
            this.f2239g = uVar;
            if (this.f2239g != null && RecyclerView.this.getAdapter() != null) {
                this.f2239g.mo3293a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public View mo3315b(int i, boolean z) {
            return mo3304a(i, z, (long) RecyclerView.FOREVER_NS).f2168f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0524d0 mo3316b(int i) {
            int size;
            int b;
            ArrayList<C0524d0> arrayList = this.f2234b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0524d0 d0Var = this.f2234b.get(i3);
                    if (d0Var.mo3045A() || d0Var.mo3064i() != i) {
                        i3++;
                    } else {
                        d0Var.mo3047a(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.mo3127d() && (b = RecyclerView.this.mAdapterHelper.mo3446b(i)) > 0 && b < RecyclerView.this.mAdapter.mo3114b()) {
                    long a = RecyclerView.this.mAdapter.mo3103a(b);
                    while (i2 < size) {
                        C0524d0 d0Var2 = this.f2234b.get(i2);
                        if (d0Var2.mo3045A() || d0Var2.mo3062g() != a) {
                            i2++;
                        } else {
                            d0Var2.mo3047a(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3317b() {
            int size = this.f2235c.size();
            for (int i = 0; i < size; i++) {
                this.f2235c.get(i).mo3046a();
            }
            int size2 = this.f2233a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2233a.get(i2).mo3046a();
            }
            ArrayList<C0524d0> arrayList = this.f2234b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2234b.get(i3).mo3046a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3318b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f2235c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0524d0 d0Var = this.f2235c.get(i7);
                if (d0Var != null && (i6 = d0Var.f2170h) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d0Var.mo3050a(i2 - i, false);
                    } else {
                        d0Var.mo3050a(i3, false);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo3319b(View view) {
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo3074s()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo3073r()) {
                childViewHolderInt.mo3082z();
            } else if (childViewHolderInt.mo3045A()) {
                childViewHolderInt.mo3058c();
            }
            mo3320b(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo3071p()) {
                RecyclerView.this.mItemAnimator.mo3156c(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3320b(C0524d0 d0Var) {
            boolean z;
            boolean z2 = false;
            if (d0Var.mo3073r() || d0Var.f2168f.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo3073r());
                sb.append(" isAttached:");
                if (d0Var.f2168f.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo3074s()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.mo3081y()) {
                boolean e = d0Var.mo3060e();
                C0527g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && e && gVar.mo3113a(d0Var)) || d0Var.mo3071p()) {
                    if (this.f2238f <= 0 || d0Var.mo3057b(526)) {
                        z = false;
                    } else {
                        int size = this.f2235c.size();
                        if (size >= this.f2238f && size > 0) {
                            mo3330e(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo3545a(d0Var.f2170h)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo3545a(this.f2235c.get(i).f2170h)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2235c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo3312a(d0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.mo3627h(d0Var);
                if (!z && !z2 && e) {
                    d0Var.f2185w = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo3321c(int i) {
            return this.f2233a.get(i).f2168f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3322c() {
            this.f2233a.clear();
            ArrayList<C0524d0> arrayList = this.f2234b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3323c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2235c.size() - 1; size >= 0; size--) {
                C0524d0 d0Var = this.f2235c.get(size);
                if (d0Var != null && (i3 = d0Var.f2170h) >= i && i3 < i4) {
                    d0Var.mo3047a(2);
                    mo3330e(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3324c(View view) {
            ArrayList<C0524d0> arrayList;
            C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo3057b(12) && childViewHolderInt.mo3075t() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2234b == null) {
                    this.f2234b = new ArrayList<>();
                }
                childViewHolderInt.mo3051a(this, true);
                arrayList = this.f2234b;
            } else if (!childViewHolderInt.mo3070o() || childViewHolderInt.mo3072q() || RecyclerView.this.mAdapter.mo3127d()) {
                childViewHolderInt.mo3051a(this, false);
                arrayList = this.f2233a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            arrayList.add(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3325c(C0524d0 d0Var) {
            (d0Var.f2182t ? this.f2234b : this.f2233a).remove(d0Var);
            d0Var.f2181s = null;
            d0Var.f2182t = false;
            d0Var.mo3058c();
        }

        /* renamed from: d */
        public View mo3326d(int i) {
            return mo3315b(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0548u mo3327d() {
            if (this.f2239g == null) {
                this.f2239g = new C0548u();
            }
            return this.f2239g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3328d(C0524d0 d0Var) {
            if (d0Var.mo3072q()) {
                return RecyclerView.this.mState.mo3030d();
            }
            int i = d0Var.f2170h;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo3114b()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (RecyclerView.this.mState.mo3030d() || RecyclerView.this.mAdapter.mo3115b(d0Var.f2170h) == d0Var.mo3063h()) {
                return !RecyclerView.this.mAdapter.mo3127d() || d0Var.mo3062g() == RecyclerView.this.mAdapter.mo3103a(d0Var.f2170h);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3329e() {
            return this.f2233a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3330e(int i) {
            mo3312a(this.f2235c.get(i), true);
            this.f2235c.remove(i);
        }

        /* renamed from: f */
        public List<C0524d0> mo3331f() {
            return this.f2236d;
        }

        /* renamed from: f */
        public void mo3332f(int i) {
            this.f2237e = i;
            mo3336j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3333g() {
            int size = this.f2235c.size();
            for (int i = 0; i < size; i++) {
                C0543p pVar = (C0543p) this.f2235c.get(i).f2168f.getLayoutParams();
                if (pVar != null) {
                    pVar.f2225h = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3334h() {
            int size = this.f2235c.size();
            for (int i = 0; i < size; i++) {
                C0524d0 d0Var = this.f2235c.get(i);
                if (d0Var != null) {
                    d0Var.mo3047a(6);
                    d0Var.mo3053a((Object) null);
                }
            }
            C0527g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo3127d()) {
                mo3335i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3335i() {
            for (int size = this.f2235c.size() - 1; size >= 0; size--) {
                mo3330e(size);
            }
            this.f2235c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo3543a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3336j() {
            C0538o oVar = RecyclerView.this.mLayout;
            this.f2238f = this.f2237e + (oVar != null ? oVar.f2211r : 0);
            for (int size = this.f2235c.size() - 1; size >= 0 && this.f2235c.size() > this.f2238f; size--) {
                mo3330e(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0551w {
        /* renamed from: a */
        void mo3337a(C0524d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0552x extends C0529i {
        C0552x() {
        }

        /* renamed from: a */
        public void mo3136a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f2147g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo3449c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo3138a(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.mo3444a(i, i2, i3)) {
                mo3338b();
            }
        }

        /* renamed from: a */
        public void mo3139a(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.mo3445a(i, i2, obj)) {
                mo3338b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3338b() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C0890v.m4757a((View) recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: b */
        public void mo3140b(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.mo3448b(i, i2)) {
                mo3338b();
            }
        }

        /* renamed from: c */
        public void mo3141c(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.mo3451c(i, i2)) {
                mo3338b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0553y extends C0912a {
        public static final Parcelable.Creator<C0553y> CREATOR = new C0554a();

        /* renamed from: h */
        Parcelable f2243h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0554a implements Parcelable.ClassLoaderCreator<C0553y> {
            C0554a() {
            }

            public C0553y createFromParcel(Parcel parcel) {
                return new C0553y(parcel, (ClassLoader) null);
            }

            public C0553y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0553y(parcel, classLoader);
            }

            public C0553y[] newArray(int i) {
                return new C0553y[i];
            }
        }

        C0553y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2243h = parcel.readParcelable(classLoader == null ? C0538o.class.getClassLoader() : classLoader);
        }

        C0553y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3339a(C0553y yVar) {
            this.f2243h = yVar.f2243h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2243h, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0555z {

        /* renamed from: a */
        private int f2244a = -1;

        /* renamed from: b */
        private RecyclerView f2245b;

        /* renamed from: c */
        private C0538o f2246c;

        /* renamed from: d */
        private boolean f2247d;

        /* renamed from: e */
        private boolean f2248e;

        /* renamed from: f */
        private View f2249f;

        /* renamed from: g */
        private final C0556a f2250g = new C0556a(0, 0);

        /* renamed from: h */
        private boolean f2251h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0556a {

            /* renamed from: a */
            private int f2252a;

            /* renamed from: b */
            private int f2253b;

            /* renamed from: c */
            private int f2254c;

            /* renamed from: d */
            private int f2255d;

            /* renamed from: e */
            private Interpolator f2256e;

            /* renamed from: f */
            private boolean f2257f;

            /* renamed from: g */
            private int f2258g;

            public C0556a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            public C0556a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2255d = -1;
                this.f2257f = false;
                this.f2258g = 0;
                this.f2252a = i;
                this.f2253b = i2;
                this.f2254c = i3;
                this.f2256e = interpolator;
            }

            /* renamed from: b */
            private void m3048b() {
                if (this.f2256e != null && this.f2254c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f2254c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo3361a(int i) {
                this.f2255d = i;
            }

            /* renamed from: a */
            public void mo3362a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2252a = i;
                this.f2253b = i2;
                this.f2254c = i3;
                this.f2256e = interpolator;
                this.f2257f = true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo3363a(RecyclerView recyclerView) {
                int i = this.f2255d;
                if (i >= 0) {
                    this.f2255d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f2257f = false;
                } else if (this.f2257f) {
                    m3048b();
                    recyclerView.mViewFlinger.mo3038a(this.f2252a, this.f2253b, this.f2254c, this.f2256e);
                    this.f2258g++;
                    if (this.f2258g > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2257f = false;
                } else {
                    this.f2258g = 0;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo3364a() {
                return this.f2255d >= 0;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0557b {
            /* renamed from: c */
            PointF mo2806c(int i);
        }

        /* renamed from: a */
        public int mo3343a() {
            return this.f2245b.mLayout.mo3231f();
        }

        /* renamed from: a */
        public int mo3344a(View view) {
            return this.f2245b.getChildLayoutPosition(view);
        }

        /* renamed from: a */
        public PointF mo3345a(int i) {
            C0538o b = mo3352b();
            if (b instanceof C0557b) {
                return ((C0557b) b).mo2806c(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0557b.class.getCanonicalName());
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3346a(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f2245b;
            if (this.f2244a == -1 || recyclerView == null) {
                mo3360h();
            }
            if (!(!this.f2247d || this.f2249f != null || this.f2246c == null || (a = mo3345a(this.f2244a)) == null || (a.x == 0.0f && a.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(a.x), (int) Math.signum(a.y), (int[]) null);
            }
            this.f2247d = false;
            View view = this.f2249f;
            if (view != null) {
                if (mo3344a(view) == this.f2244a) {
                    mo3349a(this.f2249f, recyclerView.mState, this.f2250g);
                    this.f2250g.mo3363a(recyclerView);
                    mo3360h();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f2249f = null;
                }
            }
            if (this.f2248e) {
                mo3347a(i, i2, recyclerView.mState, this.f2250g);
                boolean a2 = this.f2250g.mo3364a();
                this.f2250g.mo3363a(recyclerView);
                if (a2 && this.f2248e) {
                    this.f2247d = true;
                    recyclerView.mViewFlinger.mo3036a();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3347a(int i, int i2, C0518a0 a0Var, C0556a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3348a(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3349a(View view, C0518a0 a0Var, C0556a aVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3350a(RecyclerView recyclerView, C0538o oVar) {
            recyclerView.mViewFlinger.mo3039b();
            if (this.f2251h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f2245b = recyclerView;
            this.f2246c = oVar;
            int i = this.f2244a;
            if (i != -1) {
                this.f2245b.mState.f2141a = i;
                this.f2248e = true;
                this.f2247d = true;
                this.f2249f = mo3351b(mo3354c());
                mo3358f();
                this.f2245b.mViewFlinger.mo3036a();
                this.f2251h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: b */
        public View mo3351b(int i) {
            return this.f2245b.mLayout.mo2809e(i);
        }

        /* renamed from: b */
        public C0538o mo3352b() {
            return this.f2246c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo3353b(View view) {
            if (mo3344a(view) == mo3354c()) {
                this.f2249f = view;
            }
        }

        /* renamed from: c */
        public int mo3354c() {
            return this.f2244a;
        }

        /* renamed from: c */
        public void mo3355c(int i) {
            this.f2244a = i;
        }

        /* renamed from: d */
        public boolean mo3356d() {
            return this.f2247d;
        }

        /* renamed from: e */
        public boolean mo3357e() {
            return this.f2248e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo3358f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo3359g();

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo3360h() {
            if (this.f2248e) {
                this.f2248e = false;
                mo3359g();
                this.f2245b.mState.f2141a = -1;
                this.f2249f = null;
                this.f2244a = -1;
                this.f2247d = false;
                this.f2246c.mo3190a(this);
                this.f2246c = null;
                this.f2245b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            NESTED_SCROLLING_ATTRS = r1
            int[] r1 = new int[r0]
            r3 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r2] = r3
            CLIP_TO_PADDING_ATTR = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 == r3) goto L_0x0025
            r3 = 19
            if (r1 == r3) goto L_0x0025
            r3 = 20
            if (r1 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            FORCE_INVALIDATE_DISPLAY_LIST = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            POST_UPDATES_ON_ANIMATION = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            ALLOW_THREAD_GAP_WORK = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 15
            if (r1 > r3) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r3) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        this.mObserver = new C0552x();
        this.mRecycler = new C0550v();
        this.mViewInfoStore = new C0622u();
        this.mUpdateChildViewsRunnable = new C0517a();
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
        this.mEdgeEffectFactory = new C0531k();
        this.mItemAnimator = new C0575e();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0522c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0598h.C0600b() : null;
        this.mState = new C0518a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0536m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C0519b();
        this.mViewInfoProcessCallback = new C0523d();
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, CLIP_TO_PADDING_ATTR, i3, 0);
            this.mClipToPadding = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.mClipToPadding = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0899w.m4841b(viewConfiguration, context2);
        this.mScaledVerticalScrollFactor = C0899w.m4842c(viewConfiguration, context2);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo3147a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0890v.m4789m(this) == 0) {
            C0890v.m4783h(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0612p(this));
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, C0943b.RecyclerView, i3, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                i2 = 29;
                saveAttributeDataForStyleable(context, C0943b.RecyclerView, attributeSet, obtainStyledAttributes2, i, 0);
            } else {
                i2 = 29;
            }
            String string = obtainStyledAttributes2.getString(C0943b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0943b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.mEnableFastScroller = obtainStyledAttributes2.getBoolean(C0943b.RecyclerView_fastScrollEnabled, false);
            if (this.mEnableFastScroller) {
                initFastScroller((StateListDrawable) obtainStyledAttributes2.getDrawable(C0943b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0943b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0943b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0943b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            createLayoutManager(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, NESTED_SCROLLING_ATTRS, i3, 0);
                if (Build.VERSION.SDK_INT >= i2) {
                    saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes3, i, 0);
                }
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
                setNestedScrollingEnabled(z);
            }
        } else {
            setDescendantFocusability(262144);
        }
        z = true;
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(C0524d0 d0Var) {
        View view = d0Var.f2168f;
        boolean z = view.getParent() == this;
        this.mRecycler.mo3325c(getChildViewHolder(view));
        if (d0Var.mo3074s()) {
            this.mChildHelper.mo3467a(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0572d dVar = this.mChildHelper;
        if (!z) {
            dVar.mo3469a(view, true);
        } else {
            dVar.mo3466a(view);
        }
    }

    private void animateChange(C0524d0 d0Var, C0524d0 d0Var2, C0532l.C0535c cVar, C0532l.C0535c cVar2, boolean z, boolean z2) {
        d0Var.mo3054a(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f2175m = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo3325c(d0Var);
            d0Var2.mo3054a(false);
            d0Var2.f2176n = d0Var;
        }
        if (this.mItemAnimator.mo3149a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(C0524d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f2169g;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f2169g = null;
                        return;
                    } else if (view != d0Var.f2168f) {
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
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0538o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0538o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
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
            obtain.setEventType(PropertyFlags.INDEX_HASH);
            C0856b.m4598a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo3026a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2150j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo3613a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0518a0 a0Var = this.mState;
        if (!a0Var.f2151k || !this.mItemsChanged) {
            z = false;
        }
        a0Var.f2149i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        C0518a0 a0Var2 = this.mState;
        a0Var2.f2148h = a0Var2.f2152l;
        a0Var2.f2146f = this.mAdapter.mo3114b();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2151k) {
            int a = this.mChildHelper.mo3464a();
            for (int i = 0; i < a; i++) {
                C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3473c(i));
                if (!childViewHolderInt.mo3081y() && (!childViewHolderInt.mo3070o() || this.mAdapter.mo3127d())) {
                    this.mViewInfoStore.mo3621c(childViewHolderInt, this.mItemAnimator.mo3145a(this.mState, childViewHolderInt, C0532l.m2775e(childViewHolderInt), childViewHolderInt.mo3066k()));
                    if (this.mState.f2149i && childViewHolderInt.mo3075t() && !childViewHolderInt.mo3072q() && !childViewHolderInt.mo3081y() && !childViewHolderInt.mo3070o()) {
                        this.mViewInfoStore.mo3614a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2152l) {
            saveOldPositions();
            C0518a0 a0Var3 = this.mState;
            boolean z2 = a0Var3.f2147g;
            a0Var3.f2147g = false;
            this.mLayout.mo2765e(this.mRecycler, a0Var3);
            this.mState.f2147g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo3464a(); i2++) {
                C0524d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo3473c(i2));
                if (!childViewHolderInt2.mo3081y() && !this.mViewInfoStore.mo3622c(childViewHolderInt2)) {
                    int e = C0532l.m2775e(childViewHolderInt2);
                    boolean b = childViewHolderInt2.mo3057b(8192);
                    if (!b) {
                        e |= PropertyFlags.INDEX_HASH64;
                    }
                    C0532l.C0535c a2 = this.mItemAnimator.mo3145a(this.mState, childViewHolderInt2, e, childViewHolderInt2.mo3066k());
                    if (b) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a2);
                    } else {
                        this.mViewInfoStore.mo3616a(childViewHolderInt2, a2);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2145e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo3026a(6);
        this.mAdapterHelper.mo3447b();
        this.mState.f2146f = this.mAdapter.mo3114b();
        C0518a0 a0Var = this.mState;
        a0Var.f2144d = 0;
        a0Var.f2148h = false;
        this.mLayout.mo2765e(this.mRecycler, a0Var);
        C0518a0 a0Var2 = this.mState;
        a0Var2.f2147g = false;
        this.mPendingSavedState = null;
        a0Var2.f2151k = a0Var2.f2151k && this.mItemAnimator != null;
        this.mState.f2145e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo3026a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0518a0 a0Var = this.mState;
        a0Var.f2145e = 1;
        if (a0Var.f2151k) {
            for (int a = this.mChildHelper.mo3464a() - 1; a >= 0; a--) {
                C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3473c(a));
                if (!childViewHolderInt.mo3081y()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C0532l.C0535c a2 = this.mItemAnimator.mo3144a(this.mState, childViewHolderInt);
                    C0524d0 a3 = this.mViewInfoStore.mo3612a(changedHolderKey);
                    if (a3 != null && !a3.mo3081y()) {
                        boolean b = this.mViewInfoStore.mo3620b(a3);
                        boolean b2 = this.mViewInfoStore.mo3620b(childViewHolderInt);
                        if (!b || a3 != childViewHolderInt) {
                            C0532l.C0535c f = this.mViewInfoStore.mo3625f(a3);
                            this.mViewInfoStore.mo3619b(childViewHolderInt, a2);
                            C0532l.C0535c e = this.mViewInfoStore.mo3624e(childViewHolderInt);
                            if (f == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a3);
                            } else {
                                animateChange(a3, childViewHolderInt, f, e, b, b2);
                            }
                        }
                    }
                    this.mViewInfoStore.mo3619b(childViewHolderInt, a2);
                }
            }
            this.mViewInfoStore.mo3617a(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo3220c(this.mRecycler);
        C0518a0 a0Var2 = this.mState;
        a0Var2.f2143c = a0Var2.f2146f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f2151k = false;
        a0Var2.f2152l = false;
        this.mLayout.f2206m = false;
        ArrayList<C0524d0> arrayList = this.mRecycler.f2234b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0538o oVar = this.mLayout;
        if (oVar.f2212s) {
            oVar.f2211r = 0;
            oVar.f2212s = false;
            this.mRecycler.mo3336j();
        }
        this.mLayout.mo2768g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo3613a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C0546s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo3288b(this, motionEvent);
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
            C0546s sVar = this.mOnItemTouchListeners.get(i);
            if (!sVar.mo3287a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo3464a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < a; i3++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3473c(i3));
            if (!childViewHolderInt.mo3081y()) {
                int i4 = childViewHolderInt.mo3064i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
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
        C0524d0 findViewHolderForAdapterPosition;
        int i = this.mState.f2153m;
        if (i == -1) {
            i = 0;
        }
        int a = this.mState.mo3025a();
        int i2 = i;
        while (i2 < a) {
            C0524d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f2168f.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f2168f;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f2168f.hasFocusable()) {
                return findViewHolderForAdapterPosition.f2168f;
            }
        }
    }

    static C0524d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0543p) view.getLayoutParams()).f2223f;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0543p pVar = (C0543p) view.getLayoutParams();
        Rect rect2 = pVar.f2224g;
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
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private C0881m getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0881m(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C0524d0 d0Var, C0524d0 d0Var2) {
        int a = this.mChildHelper.mo3464a();
        for (int i = 0; i < a; i++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3473c(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C0527g gVar = this.mAdapter;
                if (gVar == null || !gVar.mo3127d()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.mo3464a();
        for (int i = 0; i < a; i++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3473c(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo3081y() && childViewHolderInt.mo3075t()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0890v.m4790n(this) == 0) {
            C0890v.m4785i(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0572d(new C0525e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
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
        int i3 = this.mLayout.mo3255l() == 1 ? -1 : 1;
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
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
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
        return this.mItemAnimator != null && this.mLayout.mo2739C();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo3454f();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo2763d(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo3453e();
        } else {
            this.mAdapterHelper.mo3447b();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2151k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f2206m) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.mo3127d());
        C0518a0 a0Var = this.mState;
        if (a0Var.f2151k && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        a0Var.f2152l = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0343d.m1722a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
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
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0343d.m1722a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0343d.m1722a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p006b.p026g.p035k.C0890v.m4736G(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View view;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo3475c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo3464a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                C0524d0 findViewHolderForItemId = (this.mState.f2154n == -1 || !this.mAdapter.mo3127d()) ? null : findViewHolderForItemId(this.mState.f2154n);
                if (findViewHolderForItemId != null && !this.mChildHelper.mo3475c(findViewHolderForItemId.f2168f) && findViewHolderForItemId.f2168f.hasFocusable()) {
                    view2 = findViewHolderForItemId.f2168f;
                } else if (this.mChildHelper.mo3464a() > 0) {
                    view2 = findNextViewToFocus();
                }
                if (view2 != null) {
                    int i = this.mState.f2155o;
                    if (((long) i) == -1 || (view = view2.findViewById(i)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
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
            C0890v.m4736G(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0543p) {
            C0543p pVar = (C0543p) layoutParams;
            if (!pVar.f2225h) {
                Rect rect = pVar.f2224g;
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
        this.mLayout.mo3202a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0518a0 a0Var = this.mState;
        a0Var.f2154n = -1;
        a0Var.f2153m = -1;
        a0Var.f2155o = -1;
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
        C0524d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f2154n = this.mAdapter.mo3127d() ? d0Var.mo3062g() : -1;
        this.mState.f2153m = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.mo3072q() ? d0Var.f2171i : d0Var.mo3061f();
        this.mState.f2155o = getDeepestFocusedViewWithId(d0Var.f2168f);
    }

    private void setAdapterInternal(C0527g gVar, boolean z, boolean z2) {
        C0527g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.mo3120b((C0529i) this.mObserver);
            this.mAdapter.mo3121b(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo3454f();
        C0527g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.mo3110a((C0529i) this.mObserver);
            gVar.mo3111a(this);
        }
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3185a(gVar3, this.mAdapter);
        }
        this.mRecycler.mo3313a(gVar3, this.mAdapter, z);
        this.mState.f2147g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo3039b();
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3175B();
        }
    }

    /* access modifiers changed from: package-private */
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
            C0890v.m4736G(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0538o oVar = this.mLayout;
        if (oVar == null || !oVar.mo3205a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(C0537n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(C0537n nVar, int i) {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo2800a("Cannot add item decoration during a scroll  or layout");
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

    public void addOnChildAttachStateChangeListener(C0544q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(C0546s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(C0547t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(C0524d0 d0Var, C0532l.C0535c cVar, C0532l.C0535c cVar2) {
        d0Var.mo3054a(false);
        if (this.mItemAnimator.mo3150a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(C0524d0 d0Var, C0532l.C0535c cVar, C0532l.C0535c cVar2) {
        addAnimatingView(d0Var);
        d0Var.mo3054a(false);
        if (this.mItemAnimator.mo3154b(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(C0524d0 d0Var) {
        C0532l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo3151a(d0Var, d0Var.mo3066k());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0543p) && this.mLayout.mo2755a((C0543p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int b = this.mChildHelper.mo3470b();
        for (int i = 0; i < b; i++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i));
            if (!childViewHolderInt.mo3081y()) {
                childViewHolderInt.mo3046a();
            }
        }
        this.mRecycler.mo3317b();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C0544q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C0547t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2804b()) {
            return this.mLayout.mo2790a(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2804b()) {
            return this.mLayout.mo2757b(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2804b()) {
            return this.mLayout.mo2760c(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2807c()) {
            return this.mLayout.mo2808d(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2807c()) {
            return this.mLayout.mo2764e(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0538o oVar = this.mLayout;
        if (oVar != null && oVar.mo2807c()) {
            return this.mLayout.mo2767f(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
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
            C0890v.m4736G(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0798a.m4441a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0798a.m4440a();
        } else if (this.mAdapterHelper.mo3449c()) {
            if (this.mAdapterHelper.mo3450c(4) && !this.mAdapterHelper.mo3450c(11)) {
                C0798a.m4441a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo3453e();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo3440a();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (this.mAdapterHelper.mo3449c()) {
                C0798a.m4441a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            } else {
                return;
            }
            C0798a.m4440a();
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C0538o.m2813c(i, getPaddingLeft() + getPaddingRight(), C0890v.m4793q(this)), C0538o.m2813c(i2, getPaddingTop() + getPaddingBottom(), C0890v.m4792p(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        C0524d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C0527g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo3118b(childViewHolderInt);
        }
        List<C0544q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3283a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        C0524d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C0527g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo3124c(childViewHolderInt);
        }
        List<C0544q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3284b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0518a0 a0Var = this.mState;
            a0Var.f2150j = false;
            if (a0Var.f2145e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.mo3452d() && this.mLayout.mo3261o() == getWidth() && this.mLayout.mo3247i() == getHeight()) {
                this.mLayout.mo3230e(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.mo3230e(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(TAG, str);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo4656a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo4655a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo4661a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo4662a(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo4652a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo4659a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo4660a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3249i(i);
        }
        onScrollStateChanged(i);
        C0547t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3289a(this, i);
        }
        List<C0547t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3289a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i, i2);
        C0547t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3290a(this, i, i2);
        }
        List<C0547t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3290a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C0524d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f2168f.getParent() == this && !d0Var.mo3081y() && (i = d0Var.f2184v) != -1) {
                C0890v.m4783h(d0Var.f2168f, i);
                d0Var.f2184v = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).mo3174b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
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
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo3162g()) {
            z2 = true;
        }
        if (z2) {
            C0890v.m4736G(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.mBottomGlow == null) {
            this.mBottomGlow = this.mEdgeEffectFactory.mo3143a(this, 3);
            if (this.mClipToPadding) {
                edgeEffect = this.mBottomGlow;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.mBottomGlow;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.mLeftGlow == null) {
            this.mLeftGlow = this.mEdgeEffectFactory.mo3143a(this, 0);
            if (this.mClipToPadding) {
                edgeEffect = this.mLeftGlow;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.mLeftGlow;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.mRightGlow == null) {
            this.mRightGlow = this.mEdgeEffectFactory.mo3143a(this, 2);
            if (this.mClipToPadding) {
                edgeEffect = this.mRightGlow;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.mRightGlow;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.mTopGlow == null) {
            this.mTopGlow = this.mEdgeEffectFactory.mo3143a(this, 1);
            if (this.mClipToPadding) {
                edgeEffect = this.mTopGlow;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.mTopGlow;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(C0518a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f2161h;
            a0Var.f2156p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f2157q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f2156p = 0;
        a0Var.f2157q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.mo3464a() - 1; a >= 0; a--) {
            View c = this.mChildHelper.mo3473c(a);
            float translationX = c.getTranslationX();
            float translationY = c.getTranslationY();
            if (f >= ((float) c.getLeft()) + translationX && f <= ((float) c.getRight()) + translationX && f2 >= ((float) c.getTop()) + translationY && f2 <= ((float) c.getBottom()) + translationY) {
                return c;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
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

    public C0524d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C0524d0 findViewHolderForAdapterPosition(int i) {
        C0524d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b = this.mChildHelper.mo3470b();
        for (int i2 = 0; i2 < b; i2++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo3072q() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo3475c(childViewHolderInt.f2168f)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C0524d0 findViewHolderForItemId(long j) {
        C0527g gVar = this.mAdapter;
        C0524d0 d0Var = null;
        if (gVar != null && gVar.mo3127d()) {
            int b = this.mChildHelper.mo3470b();
            for (int i = 0; i < b; i++) {
                C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo3072q() && childViewHolderInt.mo3062g() == j) {
                    if (!this.mChildHelper.mo3475c(childViewHolderInt.f2168f)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public C0524d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C0524d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* access modifiers changed from: package-private */
    public C0524d0 findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo3470b();
        C0524d0 d0Var = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo3072q()) {
                if (z) {
                    if (childViewHolderInt.f2170h != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo3064i() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo3475c(childViewHolderInt.f2168f)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean fling(int i, int i2) {
        C0538o oVar = this.mLayout;
        int i3 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean b = oVar.mo2804b();
            boolean c = this.mLayout.mo2807c();
            if (!b || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!c || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = b || c;
                dispatchNestedFling(f, f2, z);
                C0545r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.mo3285a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (b) {
                        i3 = 1;
                    }
                    if (c) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    int i4 = this.mMaxFlingVelocity;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.mMaxFlingVelocity;
                    this.mViewFlinger.mo3037a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.mLayout.mo3224d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo2743a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo2807c()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo2804b()) {
                int i3 = (this.mLayout.mo3255l() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo2743a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo2762d();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo2745a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo2746a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0527g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(C0524d0 d0Var) {
        if (d0Var.mo3057b(524) || !d0Var.mo3069n()) {
            return -1;
        }
        return this.mAdapterHelper.mo3437a(d0Var.f2170h);
    }

    public int getBaseline() {
        C0538o oVar = this.mLayout;
        return oVar != null ? oVar.mo3228e() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(C0524d0 d0Var) {
        return this.mAdapter.mo3127d() ? d0Var.mo3062g() : (long) d0Var.f2170h;
    }

    public int getChildAdapterPosition(View view) {
        C0524d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo3061f();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0530j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo3142a(i, i2);
    }

    public long getChildItemId(View view) {
        C0524d0 childViewHolderInt;
        C0527g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo3127d() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.mo3062g();
    }

    public int getChildLayoutPosition(View view) {
        C0524d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo3064i();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C0524d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0612p getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0531k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C0532l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        C0543p pVar = (C0543p) view.getLayoutParams();
        if (!pVar.f2225h) {
            return pVar.f2224g;
        }
        if (this.mState.mo3030d() && (pVar.mo3280o() || pVar.mo3282q())) {
            return pVar.f2224g;
        }
        Rect rect = pVar.f2224g;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).mo3172a(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f2225h = false;
        return rect;
    }

    public C0537n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C0538o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0545r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0548u getRecycledViewPool() {
        return this.mRecycler.mo3327d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo4654a();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo4657a(i);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo3449c();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new C0567a(new C0526f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C0593g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0942a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0942a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0942a.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C0538o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo2800a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C0532l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo3162g();
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
        return getScrollingChildHelper().mo4663b();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo2812k(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo3470b();
        for (int i = 0; i < b; i++) {
            ((C0543p) this.mChildHelper.mo3476d(i).getLayoutParams()).f2225h = true;
        }
        this.mRecycler.mo3333g();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.mo3470b();
        for (int i = 0; i < b; i++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo3081y()) {
                childViewHolderInt.mo3047a(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo3334h();
    }

    public void offsetChildrenHorizontal(int i) {
        int a = this.mChildHelper.mo3464a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo3473c(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int a = this.mChildHelper.mo3464a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo3473c(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.mo3470b();
        for (int i3 = 0; i3 < b; i3++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo3081y() && childViewHolderInt.f2170h >= i) {
                childViewHolderInt.mo3050a(i2, false);
                this.mState.f2147g = true;
            }
        }
        this.mRecycler.mo3307a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int b = this.mChildHelper.mo3470b();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i7 = 0; i7 < b; i7++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.f2170h) >= i5 && i6 <= i4) {
                if (i6 == i) {
                    childViewHolderInt.mo3050a(i2 - i, false);
                } else {
                    childViewHolderInt.mo3050a(i3, false);
                }
                this.mState.f2147g = true;
            }
        }
        this.mRecycler.mo3318b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo3470b();
        for (int i4 = 0; i4 < b; i4++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo3081y()) {
                int i5 = childViewHolderInt.f2170h;
                if (i5 >= i3) {
                    childViewHolderInt.mo3050a(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.mo3049a(i - 1, -i2, z);
                }
                this.mState.f2147g = true;
            }
        }
        this.mRecycler.mo3308a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r4.mLayout
            if (r1 == 0) goto L_0x001e
            r1.mo3191a((androidx.recyclerview.widget.RecyclerView) r4)
        L_0x001e:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.h> r0 = androidx.recyclerview.widget.C0598h.f2445j
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.h r0 = (androidx.recyclerview.widget.C0598h) r0
            r4.mGapWorker = r0
            androidx.recyclerview.widget.h r0 = r4.mGapWorker
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.h r0 = new androidx.recyclerview.widget.h
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = p006b.p026g.p035k.C0890v.m4786j(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.h r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f2449h = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.h> r0 = androidx.recyclerview.widget.C0598h.f2445j
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.h r0 = r4.mGapWorker
            r0.mo3537a((androidx.recyclerview.widget.RecyclerView) r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0598h hVar;
        super.onDetachedFromWindow();
        C0532l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3152b();
        }
        stopScroll();
        this.mIsAttached = false;
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3192a(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo3618b();
        if (ALLOW_THREAD_GAP_WORK && (hVar = this.mGapWorker) != null) {
            hVar.mo3539b(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo3170a(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter < 1) {
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
                f2 = this.mLayout.mo2807c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo2804b()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo2807c()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo2804b()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C0538o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean b = oVar.mo2804b();
        boolean c = this.mLayout.mo2807c();
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
            int i = b ? 1 : 0;
            if (c) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!b || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (c && Math.abs(i3) > this.mTouchSlop) {
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
        return this.mScrollState == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0798a.m4441a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0798a.m4440a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0538o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo2815s()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.mo3187a(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f2145e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo3207b(i, i2);
                this.mState.f2150j = true;
                dispatchLayoutStep2();
                this.mLayout.mo3226d(i, i2);
                if (this.mLayout.mo2779A()) {
                    this.mLayout.mo3207b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f2150j = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo3226d(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo3187a(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C0518a0 a0Var = this.mState;
                if (a0Var.f2152l) {
                    a0Var.f2148h = true;
                } else {
                    this.mAdapterHelper.mo3447b();
                    this.mState.f2148h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f2152l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0527g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f2146f = gVar.mo3114b();
            } else {
                this.mState.f2146f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo3187a(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f2148h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0553y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (C0553y) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.mo4725q());
        C0538o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f2243h) != null) {
            oVar.mo2796a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0553y yVar = new C0553y(super.onSaveInstanceState());
        C0553y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.mo3339a(yVar2);
        } else {
            C0538o oVar = this.mLayout;
            yVar.f2243h = oVar != null ? oVar.mo2816w() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        C0538o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean b = oVar.mo2804b();
        boolean c = this.mLayout.mo2807c();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent2.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            int i5 = b ? 1 : 0;
            if (c) {
                i5 |= 2;
            }
            startNestedScroll(i5, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(obtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, (float) this.mMaxFlingVelocity);
            float f = b ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f2 = c ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent2.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
            int i6 = this.mLastTouchX - x2;
            int i7 = this.mLastTouchY - y2;
            int[] iArr3 = this.mReusableIntPair;
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (dispatchNestedPreScroll(i6, i7, iArr3, this.mScrollOffset, 0)) {
                int[] iArr4 = this.mReusableIntPair;
                i6 -= iArr4[0];
                i7 -= iArr4[1];
                int[] iArr5 = this.mNestedOffsets;
                int i8 = iArr5[0];
                int[] iArr6 = this.mScrollOffset;
                iArr5[0] = i8 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.mScrollState != 1) {
                if (!b || Math.abs(i2) <= (i4 = this.mTouchSlop)) {
                    z = false;
                } else {
                    i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                    z = true;
                }
                if (c && Math.abs(i) > (i3 = this.mTouchSlop)) {
                    i = i > 0 ? i - i3 : i + i3;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
            int i9 = i;
            if (this.mScrollState == 1) {
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr7[0];
                this.mLastTouchY = y2 - iArr7[1];
                if (scrollByInternal(b ? i2 : 0, c ? i9 : 0, motionEvent2)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.mGapWorker == null || (i2 == 0 && i9 == 0))) {
                    this.mGapWorker.mo3538a(this, i2, i9);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent2.getPointerId(actionIndex);
            int x3 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2) {
            this.mVelocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0890v.m4757a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(C0524d0 d0Var, C0532l.C0535c cVar) {
        d0Var.mo3048a(0, 8192);
        if (this.mState.f2149i && d0Var.mo3075t() && !d0Var.mo3072q() && !d0Var.mo3081y()) {
            this.mViewInfoStore.mo3614a(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo3621c(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        C0532l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3152b();
        }
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3212b(this.mRecycler);
            this.mLayout.mo3220c(this.mRecycler);
        }
        this.mRecycler.mo3306a();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean e = this.mChildHelper.mo3479e(view);
        if (e) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo3325c(childViewHolderInt);
            this.mRecycler.mo3320b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!e);
        return e;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0524d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo3074s()) {
                childViewHolderInt.mo3059d();
            } else if (!childViewHolderInt.mo3081y()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C0537n nVar) {
        C0538o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo2800a("Cannot remove item decoration during a scroll  or layout");
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
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C0544q qVar) {
        List<C0544q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(C0546s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C0547t tVar) {
        List<C0547t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        C0524d0 d0Var;
        int a = this.mChildHelper.mo3464a();
        for (int i = 0; i < a; i++) {
            View c = this.mChildHelper.mo3473c(i);
            C0524d0 childViewHolder = getChildViewHolder(c);
            if (!(childViewHolder == null || (d0Var = childViewHolder.f2176n) == null)) {
                View view = d0Var.f2168f;
                int left = c.getLeft();
                int top = c.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo3204a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo3201a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo3286a(z);
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

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int b = this.mChildHelper.mo3470b();
        for (int i = 0; i < b; i++) {
            C0524d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3476d(i));
            if (!childViewHolderInt.mo3081y()) {
                childViewHolderInt.mo3079w();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C0538o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean b = oVar.mo2804b();
            boolean c = this.mLayout.mo2807c();
            if (b || c) {
                if (!b) {
                    i = 0;
                }
                if (!c) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
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
        int i11 = i6;
        int i12 = i5;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i13 = i4 - iArr4[0];
        int i14 = i3 - iArr4[1];
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i15 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0877i.m4697a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i14);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        int i16 = i12;
        int i17 = i11;
        if (!(i16 == 0 && i17 == 0)) {
            dispatchOnScrolled(i16, i17);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i16 == 0 && i17 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0798a.m4441a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a = i != 0 ? this.mLayout.mo2741a(i, this.mRecycler, this.mState) : 0;
        int b = i2 != 0 ? this.mLayout.mo2756b(i2, this.mRecycler, this.mState) : 0;
        C0798a.m4440a();
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
            C0538o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo2812k(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0612p pVar) {
        this.mAccessibilityDelegate = pVar;
        C0890v.m4752a((View) this, (C0838a) this.mAccessibilityDelegate);
    }

    public void setAdapter(C0527g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0530j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(C0524d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f2184v = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C0890v.m4783h(d0Var.f2168f, i);
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

    public void setEdgeEffectFactory(C0531k kVar) {
        C0837h.m4534a(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C0532l lVar) {
        C0532l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo3152b();
            this.mItemAnimator.mo3147a((C0532l.C0534b) null);
        }
        this.mItemAnimator = lVar;
        C0532l lVar3 = this.mItemAnimator;
        if (lVar3 != null) {
            lVar3.mo3147a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo3332f(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0538o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C0532l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo3152b();
                }
                this.mLayout.mo3212b(this.mRecycler);
                this.mLayout.mo3220c(this.mRecycler);
                this.mRecycler.mo3306a();
                if (this.mIsAttached) {
                    this.mLayout.mo3192a(this, this.mRecycler);
                }
                this.mLayout.mo3234f((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo3306a();
            }
            this.mChildHelper.mo3474c();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f2200g == null) {
                    this.mLayout.mo3234f(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo3191a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f2200g.exceptionLabel());
                }
            }
            this.mRecycler.mo3336j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo4653a(z);
    }

    public void setOnFlingListener(C0545r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0547t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0548u uVar) {
        this.mRecycler.mo3314a(uVar);
    }

    public void setRecyclerListener(C0551w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
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
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = i2;
    }

    public void setViewCacheExtension(C0520b0 b0Var) {
        this.mRecycler.mo3310a(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0856b.m4597a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.mEatenAccessibilityChangeFlags = a | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null, UNDEFINED_DURATION, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0538o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo2804b()) {
                i = 0;
            }
            if (!this.mLayout.mo2807c()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
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
                    this.mViewFlinger.mo3038a(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C0538o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo2799a(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo4664b(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo4658a(i, i2);
    }

    /* access modifiers changed from: package-private */
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
        getScrollingChildHelper().mo4665c();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo4666c(i);
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

    public void swapAdapter(C0527g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int b = this.mChildHelper.mo3470b();
        int i4 = i + i2;
        for (int i5 = 0; i5 < b; i5++) {
            View d = this.mChildHelper.mo3476d(i5);
            C0524d0 childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.mo3081y() && (i3 = childViewHolderInt.f2170h) >= i && i3 < i4) {
                childViewHolderInt.mo3047a(2);
                childViewHolderInt.mo3053a(obj);
                ((C0543p) d.getLayoutParams()).f2225h = true;
            }
        }
        this.mRecycler.mo3323c(i, i2);
    }
}
