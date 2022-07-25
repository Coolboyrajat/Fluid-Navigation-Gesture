package p006b.p026g.p035k;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: b.g.k.c */
public final class C0845c {

    /* renamed from: a */
    private final C0846a f3255a;

    /* renamed from: b.g.k.c$a */
    interface C0846a {
        /* renamed from: a */
        void mo4565a(boolean z);

        /* renamed from: a */
        boolean mo4566a(MotionEvent motionEvent);
    }

    /* renamed from: b.g.k.c$b */
    static class C0847b implements C0846a {

        /* renamed from: v */
        private static final int f3256v = ViewConfiguration.getLongPressTimeout();

        /* renamed from: w */
        private static final int f3257w = ViewConfiguration.getTapTimeout();

        /* renamed from: x */
        private static final int f3258x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f3259a;

        /* renamed from: b */
        private int f3260b;

        /* renamed from: c */
        private int f3261c;

        /* renamed from: d */
        private int f3262d;

        /* renamed from: e */
        private final Handler f3263e;

        /* renamed from: f */
        final GestureDetector.OnGestureListener f3264f;

        /* renamed from: g */
        GestureDetector.OnDoubleTapListener f3265g;

        /* renamed from: h */
        boolean f3266h;

        /* renamed from: i */
        boolean f3267i;

        /* renamed from: j */
        private boolean f3268j;

        /* renamed from: k */
        private boolean f3269k;

        /* renamed from: l */
        private boolean f3270l;

        /* renamed from: m */
        MotionEvent f3271m;

        /* renamed from: n */
        private MotionEvent f3272n;

        /* renamed from: o */
        private boolean f3273o;

        /* renamed from: p */
        private float f3274p;

        /* renamed from: q */
        private float f3275q;

        /* renamed from: r */
        private float f3276r;

        /* renamed from: s */
        private float f3277s;

        /* renamed from: t */
        private boolean f3278t;

        /* renamed from: u */
        private VelocityTracker f3279u;

        /* renamed from: b.g.k.c$b$a */
        private class C0848a extends Handler {
            C0848a() {
            }

            C0848a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0847b bVar = C0847b.this;
                    bVar.f3264f.onShowPress(bVar.f3271m);
                } else if (i == 2) {
                    C0847b.this.mo4567a();
                } else if (i == 3) {
                    C0847b bVar2 = C0847b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f3265g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f3266h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f3271m);
                    } else {
                        bVar2.f3267i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        C0847b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3263e = new C0848a(handler);
            } else {
                this.f3263e = new C0848a();
            }
            this.f3264f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo4568a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m4569a(context);
        }

        /* renamed from: a */
        private void m4569a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f3264f != null) {
                this.f3278t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f3261c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3262d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3259a = scaledTouchSlop * scaledTouchSlop;
                this.f3260b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: a */
        private boolean m4570a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f3270l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f3258x)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f3260b;
        }

        /* renamed from: b */
        private void m4571b() {
            this.f3263e.removeMessages(1);
            this.f3263e.removeMessages(2);
            this.f3263e.removeMessages(3);
            this.f3279u.recycle();
            this.f3279u = null;
            this.f3273o = false;
            this.f3266h = false;
            this.f3269k = false;
            this.f3270l = false;
            this.f3267i = false;
            if (this.f3268j) {
                this.f3268j = false;
            }
        }

        /* renamed from: c */
        private void m4572c() {
            this.f3263e.removeMessages(1);
            this.f3263e.removeMessages(2);
            this.f3263e.removeMessages(3);
            this.f3273o = false;
            this.f3269k = false;
            this.f3270l = false;
            this.f3267i = false;
            if (this.f3268j) {
                this.f3268j = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4567a() {
            this.f3263e.removeMessages(3);
            this.f3267i = false;
            this.f3268j = true;
            this.f3264f.onLongPress(this.f3271m);
        }

        /* renamed from: a */
        public void mo4568a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3265g = onDoubleTapListener;
        }

        /* renamed from: a */
        public void mo4565a(boolean z) {
            this.f3278t = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4566a(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f3279u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f3279u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f3279u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x024e
            L_0x005b:
                r12.f3274p = r9
                r12.f3276r = r9
                r12.f3275q = r10
                r12.f3277s = r10
                android.view.VelocityTracker r0 = r12.f3279u
                int r1 = r12.f3262d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f3279u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f3279u
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x024e
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f3279u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f3279u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f3279u
                r13.clear()
                goto L_0x024e
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f3274p = r9
                r12.f3276r = r9
                r12.f3275q = r10
                r12.f3277s = r10
                r12.m4572c()
                goto L_0x024e
            L_0x00b5:
                r12.m4571b()
                goto L_0x024e
            L_0x00ba:
                boolean r0 = r12.f3268j
                if (r0 == 0) goto L_0x00c0
                goto L_0x024e
            L_0x00c0:
                float r0 = r12.f3274p
                float r0 = r0 - r9
                float r1 = r12.f3275q
                float r1 = r1 - r10
                boolean r6 = r12.f3273o
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f3265g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024e
            L_0x00d3:
                boolean r6 = r12.f3269k
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f3276r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f3277s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f3259a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f3264f
                android.view.MotionEvent r8 = r12.f3271m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f3274p = r9
                r12.f3275q = r10
                r12.f3269k = r3
                android.os.Handler r0 = r12.f3263e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f3263e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f3263e
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f3259a
                if (r6 <= r0) goto L_0x01bc
                r12.f3270l = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024e
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f3264f
                android.view.MotionEvent r3 = r12.f3271m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f3274p = r9
                r12.f3275q = r10
                goto L_0x024e
            L_0x0131:
                r12.f3266h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f3273o
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f3265g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f3268j
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f3263e
                r13.removeMessages(r5)
                r12.f3268j = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f3269k
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f3264f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f3267i
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f3265g
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f3279u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f3262d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f3261c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f3261c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f3264f
                android.view.MotionEvent r7 = r12.f3271m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f3272n
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f3272n = r0
                android.view.VelocityTracker r0 = r12.f3279u
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f3279u = r0
            L_0x01ae:
                r12.f3273o = r3
                r12.f3267i = r3
                android.os.Handler r0 = r12.f3263e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f3263e
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x024e
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f3265g
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f3263e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f3263e
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f3271m
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f3272n
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.m4570a(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f3273o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f3265g
                android.view.MotionEvent r1 = r12.f3271m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f3265g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f3263e
                int r1 = f3258x
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f3274p = r9
                r12.f3276r = r9
                r12.f3275q = r10
                r12.f3277s = r10
                android.view.MotionEvent r1 = r12.f3271m
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f3271m = r1
                r12.f3269k = r2
                r12.f3270l = r2
                r12.f3266h = r2
                r12.f3268j = r3
                r12.f3267i = r3
                boolean r1 = r12.f3278t
                if (r1 == 0) goto L_0x0237
                android.os.Handler r1 = r12.f3263e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f3263e
                android.view.MotionEvent r3 = r12.f3271m
                long r5 = r3.getDownTime()
                int r3 = f3257w
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f3256v
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0237:
                android.os.Handler r1 = r12.f3263e
                android.view.MotionEvent r3 = r12.f3271m
                long r3 = r3.getDownTime()
                int r5 = f3257w
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f3264f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p035k.C0845c.C0847b.mo4566a(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: b.g.k.c$c */
    static class C0849c implements C0846a {

        /* renamed from: a */
        private final GestureDetector f3281a;

        C0849c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3281a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public void mo4565a(boolean z) {
            this.f3281a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public boolean mo4566a(MotionEvent motionEvent) {
            return this.f3281a.onTouchEvent(motionEvent);
        }
    }

    public C0845c(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public C0845c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f3255a = Build.VERSION.SDK_INT > 17 ? new C0849c(context, onGestureListener, handler) : new C0847b(context, onGestureListener, handler);
    }

    /* renamed from: a */
    public void mo4563a(boolean z) {
        this.f3255a.mo4565a(z);
    }

    /* renamed from: a */
    public boolean mo4564a(MotionEvent motionEvent) {
        return this.f3255a.mo4566a(motionEvent);
    }
}
