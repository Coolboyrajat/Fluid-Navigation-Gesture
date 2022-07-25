package com.p131fb.fluid.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.p135l.C1755l;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p190io.objectbox.BoxStore;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;
import p190io.objectbox.annotation.C3153Id;
import p190io.objectbox.annotation.Entity;
import p190io.objectbox.annotation.Uid;
import p190io.objectbox.relation.ToOne;

@Entity
@Uid(5422541327152352967L)
/* renamed from: com.fb.fluid.data.TriggerButton */
public final class TriggerButton {
    public static final int ACTION_APP = 14;
    public static final int ACTION_ASSISTANT = 9;
    public static final int ACTION_BACK = 2;
    public static final int ACTION_DOUBLE_TAP_RECENTS = 21;
    public static final int ACTION_GOOGLE_SEARCH_OVERLAY = 13;
    public static final int ACTION_HOME = 1;
    public static final int ACTION_KEYBOARD_SELECTOR = 8;
    public static final int ACTION_KEYCODE = 28;
    public static final int ACTION_KILL_APP = 25;
    public static final int ACTION_MENU = 27;
    public static final int ACTION_NEXT_APP = 26;
    public static final int ACTION_NOTIFICATIONS = 5;
    public static final int ACTION_ONE_HAND_MODE = 22;
    public static final int ACTION_POWER_DIALOG = 4;
    public static final int ACTION_PREVIOUS_APP = 11;
    public static final int ACTION_QUICK_SETTINGS = 6;
    public static final int ACTION_RECENTS = 3;
    public static final int ACTION_ROTATION_APP = 20;
    public static final int ACTION_ROTATION_FORCED = 24;
    public static final int ACTION_ROTATION_TOGGLE = 19;
    public static final int ACTION_SCREENSHOT = 18;
    public static final int ACTION_SCREEN_LOCK = 17;
    public static final int ACTION_SHORTCUT = 15;
    public static final int ACTION_SPLIT_SCREEN = 7;
    public static final int ACTION_TOGGLE_NAVBAR = 29;
    public static final int ACTION_VOICE_ASSISTANT = 12;
    public static final int ACTION_VOICE_SEARCH = 16;
    public static final int ACTION_VOLUME_DIALOG = 23;
    public static final C1698a Companion = new C1698a((C3366g) null);
    public static final int ERROR = -2;
    public static final int NONE = -1;
    transient BoxStore __boxStore;
    @Uid(4395904680013121128L)
    private String actionData = BuildConfig.FLAVOR;
    @Uid(7982839136384498356L)
    private String actionSecData = BuildConfig.FLAVOR;
    @Uid(6011685244552253234L)
    private int actionSecType = -1;
    @Uid(6298873913216100416L)
    private int actionType = -1;
    private boolean enabled = true;
    @C3153Id

    /* renamed from: id */
    private long f4921id;
    private int layoutIndex = -1;
    public ToOne<Trigger> trigger = new ToOne<>(this, C1709d.f4964u);
    private boolean waitForUp = true;

    /* renamed from: com.fb.fluid.data.TriggerButton$a */
    public static final class C1698a {

        /* renamed from: com.fb.fluid.data.TriggerButton$a$a */
        static final class C1699a extends C3371l implements C3350b<Integer, Drawable> {

            /* renamed from: g */
            final /* synthetic */ Context f4922g;

            /* renamed from: h */
            final /* synthetic */ int f4923h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1699a(Context context, int i) {
                super(1);
                this.f4922g = context;
                this.f4923h = i;
            }

            /* renamed from: a */
            public final Drawable mo6424a(int i) {
                Drawable drawable = this.f4922g.getDrawable(i);
                if (drawable == null) {
                    return null;
                }
                drawable.setTint(this.f4923h);
                return drawable;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return mo6424a(((Number) obj).intValue());
            }
        }

        private C1698a() {
        }

        public /* synthetic */ C1698a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Drawable m7286a(C1698a aVar, Context context, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i2 = -1;
            }
            return aVar.mo6420a(context, i, i2);
        }

        /* renamed from: a */
        public static /* synthetic */ Drawable m7287a(C1698a aVar, Context context, int i, String str, Object obj, int i2, boolean z, int i3, Object obj2) {
            if ((i3 & 8) != 0) {
                obj = null;
            }
            return aVar.mo6421a(context, i, str, obj, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? false : z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
            return (android.graphics.drawable.Drawable) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            r2 = java.lang.Integer.valueOf(r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.drawable.Drawable mo6420a(android.content.Context r2, int r3, int r4) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.p205x.p207d.C3370k.m12227b(r2, r0)
                com.fb.fluid.data.TriggerButton$a$a r0 = new com.fb.fluid.data.TriggerButton$a$a
                r0.<init>(r2, r4)
                r2 = 2131230864(0x7f080090, float:1.8077793E38)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 2131230859(0x7f08008b, float:1.8077783E38)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                switch(r3) {
                    case 1: goto L_0x0087;
                    case 2: goto L_0x0083;
                    case 3: goto L_0x007f;
                    case 4: goto L_0x007b;
                    case 5: goto L_0x0077;
                    case 6: goto L_0x0073;
                    case 7: goto L_0x006f;
                    case 8: goto L_0x006b;
                    case 9: goto L_0x0067;
                    case 10: goto L_0x001b;
                    case 11: goto L_0x0063;
                    case 12: goto L_0x0022;
                    case 13: goto L_0x005f;
                    case 14: goto L_0x005b;
                    case 15: goto L_0x0057;
                    case 16: goto L_0x0022;
                    case 17: goto L_0x0053;
                    case 18: goto L_0x004f;
                    case 19: goto L_0x004a;
                    case 20: goto L_0x004a;
                    case 21: goto L_0x0046;
                    case 22: goto L_0x0042;
                    case 23: goto L_0x003e;
                    case 24: goto L_0x004a;
                    case 25: goto L_0x003a;
                    case 26: goto L_0x0036;
                    case 27: goto L_0x0032;
                    case 28: goto L_0x002e;
                    case 29: goto L_0x002a;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r2 = 2131230847(0x7f08007f, float:1.8077758E38)
            L_0x001e:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x0022:
                java.lang.Object r2 = r0.mo5146a(r2)
            L_0x0026:
                android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
                goto L_0x008b
            L_0x002a:
                r2 = 2131230863(0x7f08008f, float:1.807779E38)
                goto L_0x001e
            L_0x002e:
                r2 = 2131230842(0x7f08007a, float:1.8077748E38)
                goto L_0x001e
            L_0x0032:
                r2 = 2131230845(0x7f08007d, float:1.8077754E38)
                goto L_0x001e
            L_0x0036:
                r2 = 2131230846(0x7f08007e, float:1.8077756E38)
                goto L_0x001e
            L_0x003a:
                r2 = 2131230843(0x7f08007b, float:1.807775E38)
                goto L_0x001e
            L_0x003e:
                r2 = 2131230865(0x7f080091, float:1.8077795E38)
                goto L_0x001e
            L_0x0042:
                r2 = 2131230849(0x7f080081, float:1.8077762E38)
                goto L_0x001e
            L_0x0046:
                r2 = 2131230852(0x7f080084, float:1.8077768E38)
                goto L_0x001e
            L_0x004a:
                java.lang.Object r2 = r0.mo5146a(r4)
                goto L_0x0026
            L_0x004f:
                r2 = 2131230860(0x7f08008c, float:1.8077785E38)
                goto L_0x001e
            L_0x0053:
                r2 = 2131230844(0x7f08007c, float:1.8077752E38)
                goto L_0x001e
            L_0x0057:
                r2 = 2131230861(0x7f08008d, float:1.8077787E38)
                goto L_0x001e
            L_0x005b:
                r2 = 2131230836(0x7f080074, float:1.8077736E38)
                goto L_0x001e
            L_0x005f:
                r2 = 2131230839(0x7f080077, float:1.8077742E38)
                goto L_0x001e
            L_0x0063:
                r2 = 2131230851(0x7f080083, float:1.8077766E38)
                goto L_0x001e
            L_0x0067:
                r2 = 2131230837(0x7f080075, float:1.8077738E38)
                goto L_0x001e
            L_0x006b:
                r2 = 2131230841(0x7f080079, float:1.8077746E38)
                goto L_0x001e
            L_0x006f:
                r2 = 2131230862(0x7f08008e, float:1.8077789E38)
                goto L_0x001e
            L_0x0073:
                r2 = 2131230853(0x7f080085, float:1.807777E38)
                goto L_0x001e
            L_0x0077:
                r2 = 2131230848(0x7f080080, float:1.807776E38)
                goto L_0x001e
            L_0x007b:
                r2 = 2131230850(0x7f080082, float:1.8077764E38)
                goto L_0x001e
            L_0x007f:
                r2 = 2131230854(0x7f080086, float:1.8077773E38)
                goto L_0x001e
            L_0x0083:
                r2 = 2131230838(0x7f080076, float:1.807774E38)
                goto L_0x001e
            L_0x0087:
                r2 = 2131230840(0x7f080078, float:1.8077744E38)
                goto L_0x001e
            L_0x008b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.data.TriggerButton.C1698a.mo6420a(android.content.Context, int, int):android.graphics.drawable.Drawable");
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ Exception -> 0x004b }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0094=Splitter:B:50:0x0094, B:7:0x0015=Splitter:B:7:0x0015} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.drawable.Drawable mo6421a(android.content.Context r10, int r11, java.lang.String r12, java.lang.Object r13, int r14, boolean r15) {
            /*
                r9 = this;
                java.lang.String r0 = "context"
                kotlin.p205x.p207d.C3370k.m12227b(r10, r0)
                r0 = 0
                java.lang.String r1 = ""
                r2 = 0
                if (r15 != 0) goto L_0x000f
                r3 = 26
                if (r11 == r3) goto L_0x0015
            L_0x000f:
                if (r15 != 0) goto L_0x004e
                r3 = 11
                if (r11 != r3) goto L_0x004e
            L_0x0015:
                boolean r12 = r13 instanceof android.content.Intent     // Catch:{ Exception -> 0x004b }
                if (r12 != 0) goto L_0x001a
                r13 = r2
            L_0x001a:
                android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x004b }
                if (r13 == 0) goto L_0x0045
                android.content.pm.PackageManager r12 = r10.getPackageManager()     // Catch:{ Exception -> 0x004b }
                if (r12 == 0) goto L_0x003f
                android.content.ComponentName r13 = r13.getComponent()     // Catch:{ Exception -> 0x004b }
                if (r13 == 0) goto L_0x002b
                goto L_0x0030
            L_0x002b:
                android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ Exception -> 0x004b }
                r13.<init>(r1, r1)     // Catch:{ Exception -> 0x004b }
            L_0x0030:
                android.content.pm.ActivityInfo r12 = r12.getActivityInfo(r13, r0)     // Catch:{ Exception -> 0x004b }
                if (r12 == 0) goto L_0x003f
                android.content.pm.PackageManager r13 = r10.getPackageManager()     // Catch:{ Exception -> 0x004b }
                android.graphics.drawable.Drawable r12 = r12.loadIcon(r13)     // Catch:{ Exception -> 0x004b }
                goto L_0x0040
            L_0x003f:
                r12 = r2
            L_0x0040:
                if (r12 == 0) goto L_0x0045
                r2 = r12
                goto L_0x0128
            L_0x0045:
                android.graphics.drawable.Drawable r10 = r9.mo6420a((android.content.Context) r10, (int) r11, (int) r14)     // Catch:{ Exception -> 0x004b }
                goto L_0x010d
            L_0x004b:
                r10 = move-exception
                goto L_0x010f
            L_0x004e:
                if (r15 != 0) goto L_0x007f
                r13 = 14
                if (r11 != r13) goto L_0x007f
                android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ Exception -> 0x0128 }
                if (r10 == 0) goto L_0x0128
                if (r12 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r12 = r1
            L_0x005e:
                android.content.Intent r11 = r10.getLaunchIntentForPackage(r12)     // Catch:{ Exception -> 0x0128 }
                if (r11 == 0) goto L_0x0128
                java.lang.String r12 = "result"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x0128 }
                android.content.ComponentName r11 = r11.getComponent()     // Catch:{ Exception -> 0x0128 }
                if (r11 == 0) goto L_0x0070
                goto L_0x0075
            L_0x0070:
                android.content.ComponentName r11 = new android.content.ComponentName     // Catch:{ Exception -> 0x0128 }
                r11.<init>(r1, r1)     // Catch:{ Exception -> 0x0128 }
            L_0x0075:
                android.content.pm.ActivityInfo r11 = r10.getActivityInfo(r11, r0)     // Catch:{ Exception -> 0x0128 }
                android.graphics.drawable.Drawable r2 = r11.loadIcon(r10)     // Catch:{ Exception -> 0x0128 }
                goto L_0x0128
            L_0x007f:
                if (r15 != 0) goto L_0x00e0
                r13 = 15
                if (r11 != r13) goto L_0x00e0
                c.e.c.e r11 = new c.e.c.e     // Catch:{ Exception -> 0x0093 }
                r11.<init>()     // Catch:{ Exception -> 0x0093 }
                java.lang.Class<com.fb.fluid.data.a> r13 = com.p131fb.fluid.data.C1702a.class
                java.lang.Object r11 = r11.mo5634a((java.lang.String) r12, r13)     // Catch:{ Exception -> 0x0093 }
                com.fb.fluid.data.a r11 = (com.p131fb.fluid.data.C1702a) r11     // Catch:{ Exception -> 0x0093 }
                goto L_0x0094
            L_0x0093:
                r11 = r2
            L_0x0094:
                android.content.pm.PackageManager r12 = r10.getPackageManager()     // Catch:{ Exception -> 0x004b }
                if (r12 == 0) goto L_0x0128
                if (r11 == 0) goto L_0x0128
                java.lang.String r13 = r11.mo6434r()     // Catch:{ Exception -> 0x004b }
                if (r13 == 0) goto L_0x0128
                com.fb.fluid.l.a$a r14 = com.p131fb.fluid.p135l.C1729a.f5027a     // Catch:{ Exception -> 0x004b }
                java.lang.String r15 = "shortcuts"
                android.graphics.drawable.BitmapDrawable r13 = r14.mo6469b(r10, r15, r13)     // Catch:{ Exception -> 0x004b }
                if (r13 == 0) goto L_0x00af
                r2 = r13
                goto L_0x0128
            L_0x00af:
                java.lang.String r3 = r11.mo6433q()     // Catch:{ Exception -> 0x004b }
                java.lang.String r13 = ":"
                java.lang.String[] r4 = new java.lang.String[]{r13}     // Catch:{ Exception -> 0x004b }
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.util.List r13 = kotlin.p194d0.C3251o.m11947a((java.lang.CharSequence) r3, (java.lang.String[]) r4, (boolean) r5, (int) r6, (int) r7, (java.lang.Object) r8)     // Catch:{ Exception -> 0x004b }
                java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x004b }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x004b }
                android.content.res.Resources r12 = r12.getResourcesForApplication(r13)     // Catch:{ Exception -> 0x004b }
                if (r12 == 0) goto L_0x0128
                java.lang.String r11 = r11.mo6433q()     // Catch:{ Exception -> 0x004b }
                java.lang.String r13 = "drawable"
                int r11 = r12.getIdentifier(r11, r13, r2)     // Catch:{ Exception -> 0x004b }
                android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ Exception -> 0x004b }
                android.graphics.drawable.Drawable r2 = r12.getDrawable(r11, r10)     // Catch:{ Exception -> 0x004b }
                goto L_0x0128
            L_0x00e0:
                if (r15 != 0) goto L_0x0107
                r12 = 19
                if (r11 != r12) goto L_0x0107
                android.content.res.Resources r11 = r10.getResources()     // Catch:{ Exception -> 0x004b }
                com.fb.fluid.l.q.b$a r12 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x004b }
                boolean r12 = r12.mo6550a(r10)     // Catch:{ Exception -> 0x004b }
                if (r12 != 0) goto L_0x00f6
                r12 = 2131230859(0x7f08008b, float:1.8077783E38)
                goto L_0x00f9
            L_0x00f6:
                r12 = 2131230858(0x7f08008a, float:1.807778E38)
            L_0x00f9:
                android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ Exception -> 0x004b }
                android.graphics.drawable.Drawable r10 = r11.getDrawable(r12, r10)     // Catch:{ Exception -> 0x004b }
                if (r10 == 0) goto L_0x0128
                r10.setTint(r14)     // Catch:{ Exception -> 0x004b }
                goto L_0x010d
            L_0x0107:
                if (r15 != 0) goto L_0x0045
                r12 = -1
                if (r11 != r12) goto L_0x0045
                goto L_0x0128
            L_0x010d:
                r2 = r10
                goto L_0x0128
            L_0x010f:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "tb.lic.e: "
                r11.append(r12)
                java.lang.String r10 = r10.getMessage()
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r11 = 1
                com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r10, r2, r11, r2)
            L_0x0128:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.data.TriggerButton.C1698a.mo6421a(android.content.Context, int, java.lang.String, java.lang.Object, int, boolean):android.graphics.drawable.Drawable");
        }

        /* renamed from: a */
        public final String mo6422a(Context context, int i) {
            String string;
            String str;
            C3370k.m12227b(context, "context");
            switch (i) {
                case 1:
                    string = context.getString(C3148R.string.action_home);
                    str = "context.getString(R.string.action_home)";
                    break;
                case 2:
                    string = context.getString(C3148R.string.action_back);
                    str = "context.getString(R.string.action_back)";
                    break;
                case 3:
                    string = context.getString(C3148R.string.action_recents);
                    str = "context.getString(R.string.action_recents)";
                    break;
                case 4:
                    string = context.getString(C3148R.string.action_power_dialog);
                    str = "context.getString(R.string.action_power_dialog)";
                    break;
                case 5:
                    string = context.getString(C3148R.string.action_notifications);
                    str = "context.getString(R.string.action_notifications)";
                    break;
                case 6:
                    string = context.getString(C3148R.string.action_quick_set);
                    str = "context.getString(R.string.action_quick_set)";
                    break;
                case 7:
                    string = context.getString(C3148R.string.action_split_screen);
                    str = "context.getString(R.string.action_split_screen)";
                    break;
                case 8:
                    string = context.getString(C3148R.string.action_keyboard_selector);
                    str = "context.getString(R.stri…action_keyboard_selector)";
                    break;
                case 9:
                    string = context.getString(C3148R.string.action_assistant);
                    str = "context.getString(R.string.action_assistant)";
                    break;
                case 11:
                    string = context.getString(C3148R.string.action_previous_app);
                    str = "context.getString(R.string.action_previous_app)";
                    break;
                case 12:
                    string = context.getString(C3148R.string.action_voice_assistant);
                    str = "context.getString(R.string.action_voice_assistant)";
                    break;
                case 13:
                    string = context.getString(C3148R.string.action_google_overlay);
                    str = "context.getString(R.string.action_google_overlay)";
                    break;
                case 14:
                    string = context.getString(C3148R.string.action_app);
                    str = "context.getString(R.string.action_app)";
                    break;
                case 15:
                    string = context.getString(C3148R.string.action_shortcut);
                    str = "context.getString(R.string.action_shortcut)";
                    break;
                case 16:
                    string = context.getString(C3148R.string.action_voice_search);
                    str = "context.getString(R.string.action_voice_search)";
                    break;
                case 17:
                    string = context.getString(C3148R.string.action_screen_off);
                    str = "context.getString(R.string.action_screen_off)";
                    break;
                case 18:
                    string = context.getString(C3148R.string.action_screenshot);
                    str = "context.getString(R.string.action_screenshot)";
                    break;
                case 19:
                    string = context.getString(C3148R.string.action_rotation_lock);
                    str = "context.getString(R.string.action_rotation_lock)";
                    break;
                case 20:
                    string = context.getString(C3148R.string.action_rotation_app);
                    str = "context.getString(R.string.action_rotation_app)";
                    break;
                case 21:
                    string = context.getString(C3148R.string.action_previous_app_native);
                    str = "context.getString(R.stri…tion_previous_app_native)";
                    break;
                case 22:
                    string = context.getString(C3148R.string.action_one_hand_mode);
                    str = "context.getString(R.string.action_one_hand_mode)";
                    break;
                case 23:
                    string = context.getString(C3148R.string.action_volume_dialog);
                    str = "context.getString(R.string.action_volume_dialog)";
                    break;
                case 24:
                    string = context.getString(C3148R.string.action_rotation_pie);
                    str = "context.getString(R.string.action_rotation_pie)";
                    break;
                case 25:
                    string = context.getString(C3148R.string.action_kill_app);
                    str = "context.getString(R.string.action_kill_app)";
                    break;
                case 26:
                    string = context.getString(C3148R.string.action_next_app);
                    str = "context.getString(R.string.action_next_app)";
                    break;
                case 27:
                    string = context.getString(C3148R.string.action_menu);
                    str = "context.getString(R.string.action_menu)";
                    break;
                case 28:
                    string = context.getString(C3148R.string.action_keycode);
                    str = "context.getString(R.string.action_keycode)";
                    break;
                case 29:
                    string = context.getString(C3148R.string.action_toggle_navbar);
                    str = "context.getString(R.string.action_toggle_navbar)";
                    break;
                default:
                    string = context.getString(C3148R.string.action_none);
                    str = "context.getString(R.string.action_none)";
                    break;
            }
            C3370k.m12223a((Object) string, str);
            return string;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            r4 = r4.mo6435s();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo6423a(android.content.Context r4, int r5, java.lang.String r6) {
            /*
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
                r0 = 14
                r1 = 0
                java.lang.String r2 = ""
                if (r5 == r0) goto L_0x002e
                r0 = 15
                if (r5 == r0) goto L_0x0015
                java.lang.String r2 = r3.mo6422a(r4, r5)
                goto L_0x0053
            L_0x0015:
                c.e.c.e r4 = new c.e.c.e     // Catch:{ Exception -> 0x0023 }
                r4.<init>()     // Catch:{ Exception -> 0x0023 }
                java.lang.Class<com.fb.fluid.data.a> r5 = com.p131fb.fluid.data.C1702a.class
                java.lang.Object r4 = r4.mo5634a((java.lang.String) r6, r5)     // Catch:{ Exception -> 0x0023 }
                com.fb.fluid.data.a r4 = (com.p131fb.fluid.data.C1702a) r4     // Catch:{ Exception -> 0x0023 }
                goto L_0x0024
            L_0x0023:
                r4 = r1
            L_0x0024:
                if (r4 == 0) goto L_0x0053
                java.lang.String r4 = r4.mo6435s()
                if (r4 == 0) goto L_0x0053
                r2 = r4
                goto L_0x0053
            L_0x002e:
                android.content.pm.PackageManager r4 = r4.getPackageManager()
                if (r4 == 0) goto L_0x0053
                if (r6 == 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r6 = r2
            L_0x0038:
                android.content.Intent r5 = r4.getLaunchIntentForPackage(r6)
                if (r5 == 0) goto L_0x0050
                r6 = 0
                android.content.pm.ResolveInfo r5 = r4.resolveActivity(r5, r6)
                if (r5 == 0) goto L_0x0050
                java.lang.CharSequence r4 = r5.loadLabel(r4)
                if (r4 == 0) goto L_0x0050
                java.lang.String r4 = r4.toString()
                r1 = r4
            L_0x0050:
                if (r1 == 0) goto L_0x0053
                r2 = r1
            L_0x0053:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.data.TriggerButton.C1698a.mo6423a(android.content.Context, int, java.lang.String):java.lang.String");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m7263a(TriggerButton triggerButton, Context context, boolean z, Object obj, int i, boolean z2, int i2, Object obj2) {
        boolean z3 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return triggerButton.mo6399a(context, z3, obj, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    public static /* synthetic */ String m7264a(TriggerButton triggerButton, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return triggerButton.mo6401a(context, z);
    }

    /* renamed from: a */
    public final Drawable mo6399a(Context context, boolean z, Object obj, int i, boolean z2) {
        C3370k.m12227b(context, "context");
        return Companion.mo6421a(context, z ? this.actionSecType : this.actionType, z ? this.actionSecData : this.actionData, obj, i, z2);
    }

    /* renamed from: a */
    public final String mo6400a() {
        return this.actionData;
    }

    /* renamed from: a */
    public final String mo6401a(Context context, boolean z) {
        C3370k.m12227b(context, "context");
        return Companion.mo6423a(context, z ? this.actionSecType : this.actionType, z ? this.actionSecData : this.actionData);
    }

    /* renamed from: a */
    public final void mo6402a(int i) {
        this.actionSecType = i;
    }

    /* renamed from: a */
    public final void mo6403a(long j) {
        this.f4921id = j;
    }

    /* renamed from: a */
    public final void mo6404a(String str) {
        this.actionData = str;
    }

    /* renamed from: a */
    public final void mo6405a(boolean z) {
        this.enabled = z;
    }

    /* renamed from: b */
    public final String mo6406b() {
        return this.actionSecData;
    }

    /* renamed from: b */
    public final void mo6407b(int i) {
        this.actionType = i;
    }

    /* renamed from: b */
    public final void mo6408b(String str) {
        this.actionSecData = str;
    }

    /* renamed from: b */
    public final void mo6409b(boolean z) {
        this.waitForUp = z;
    }

    /* renamed from: c */
    public final int mo6410c() {
        return this.actionSecType;
    }

    /* renamed from: c */
    public final void mo6411c(int i) {
        this.layoutIndex = i;
    }

    /* renamed from: d */
    public final int mo6412d() {
        return this.actionType;
    }

    /* renamed from: e */
    public final boolean mo6413e() {
        return this.enabled;
    }

    /* renamed from: f */
    public final long mo6414f() {
        return this.f4921id;
    }

    /* renamed from: g */
    public final int mo6415g() {
        return this.layoutIndex;
    }

    /* renamed from: h */
    public final ToOne<Trigger> mo6416h() {
        ToOne<Trigger> toOne = this.trigger;
        if (toOne != null) {
            return toOne;
        }
        C3370k.m12230d("trigger");
        throw null;
    }

    /* renamed from: i */
    public final boolean mo6417i() {
        return this.waitForUp;
    }

    /* renamed from: j */
    public final boolean mo6418j() {
        return this.actionType != -1 && C1755l.f5077b.mo6524a().contains(Integer.valueOf(this.actionType));
    }

    /* renamed from: k */
    public final boolean mo6419k() {
        return this.actionSecType != -1 && C1755l.f5077b.mo6524a().contains(Integer.valueOf(this.actionSecType));
    }
}
