package net.dinglisch.android.tasker;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import java.net.URISyntaxException;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: net.dinglisch.android.tasker.a */
public class C3559a {

    /* renamed from: net.dinglisch.android.tasker.a$a */
    static /* synthetic */ class C3560a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8272a = new int[C3562c.values().length];

        static {
            try {
                f8272a[C3562c.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: net.dinglisch.android.tasker.a$b */
    public static class C3561b {
        /* renamed from: a */
        public static ResultReceiver m12851a(Intent intent) {
            if (intent == null) {
                return null;
            }
            return (ResultReceiver) C3559a.m12847b(intent, "net.dinglisch.android.tasker.EXTRA_RESULT_RECEIVER", (Class<?>) ResultReceiver.class, "getResultReceiver");
        }

        /* renamed from: a */
        public static boolean m12852a(Bundle bundle) {
            return C3559a.m12850b(bundle, 4);
        }
    }

    /* renamed from: net.dinglisch.android.tasker.a$c */
    public enum C3562c {
        JSON
    }

    /* renamed from: net.dinglisch.android.tasker.a$d */
    public static class C3563d {
        /* renamed from: a */
        public static Bundle m12853a(Intent intent) {
            return (Bundle) C3559a.m12847b(intent, "net.dinglisch.android.tasker.extras.PASS_THROUGH_DATA", (Class<?>) Bundle.class, "retrievePassThroughData");
        }

        /* renamed from: a */
        public static boolean m12854a(Bundle bundle) {
            return C3559a.m12850b(bundle, 64);
        }

        /* renamed from: b */
        public static int m12855b(Intent intent) {
            Integer num;
            Bundle a = m12853a(intent);
            if (a == null || (num = (Integer) C3559a.m12848b(a, "net.dinglisch.android.tasker.MESSAGE_ID", (Class<?>) Integer.class, "retrievePassThroughMessageID")) == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    /* renamed from: net.dinglisch.android.tasker.a$e */
    public static class C3564e {
        /* renamed from: a */
        public static void m12856a(Intent intent, int i) {
            if (i < 0) {
                Log.w("TaskerPlugin", "requestTimeoutMS: ignoring negative timeout (" + i + ")");
                return;
            }
            if (i > 3599000 && i != 3600000) {
                Log.w("TaskerPlugin", "requestTimeoutMS: requested timeout " + i + " exceeds maximum, setting to max (" + 3599000 + ")");
                i = 3599000;
            }
            intent.putExtra("net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT", i);
        }

        @TargetApi(26)
        /* renamed from: a */
        public static boolean m12857a(Context context, Intent intent, int i, Bundle bundle) {
            String str = (String) C3559a.m12847b(intent, "net.dinglisch.android.tasker.extras.COMPLETION_INTENT", (Class<?>) String.class, "signalFinish");
            if (str != null) {
                Uri uri = null;
                try {
                    uri = Uri.parse(str);
                } catch (Exception unused) {
                    Log.w("TaskerPlugin", "signalFinish: " + "couldn't parse " + str);
                }
                if (uri != null) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        parseUri.putExtra("net.dinglisch.android.tasker.extras.RESULT_CODE", i);
                        if (bundle != null) {
                            parseUri.putExtra("net.dinglisch.android.tasker.extras.VARIABLES", bundle);
                        }
                        String str2 = (String) C3559a.m12847b(parseUri, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE_PACKAGE", (Class<?>) String.class, "signalFinish");
                        String str3 = (String) C3559a.m12847b(parseUri, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE", (Class<?>) String.class, "signalFinish");
                        Boolean bool = (Boolean) C3559a.m12847b(parseUri, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE_FOREGROUND", (Class<?>) Boolean.class, "signalFinish");
                        if (str2 == null || str3 == null || bool == null) {
                            context.sendBroadcast(parseUri);
                            return true;
                        }
                        parseUri.setComponent(new ComponentName(str2, str3));
                        if (!bool.booleanValue() || Build.VERSION.SDK_INT < 26) {
                            context.startService(parseUri);
                            return true;
                        }
                        context.startForegroundService(parseUri);
                        return true;
                    } catch (URISyntaxException unused2) {
                        Log.w("TaskerPlugin", "signalFinish: " + "bad URI: " + uri);
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m12858a(Bundle bundle) {
            return C3559a.m12850b(bundle, 8);
        }

        /* renamed from: b */
        public static boolean m12859b(Bundle bundle) {
            return C3559a.m12850b(bundle, 32);
        }

        /* renamed from: c */
        public static boolean m12860c(Bundle bundle) {
            return C3559a.m12850b(bundle, 2);
        }
    }

    /* renamed from: a */
    public static void m12843a(Intent intent, String[] strArr) {
        intent.putExtra("net.dinglisch.android.tasker.RELEVANT_VARIABLES", strArr);
    }

    /* renamed from: a */
    public static boolean m12845a(Bundle bundle, C3562c cVar) {
        if (C3560a.f8272a[cVar.ordinal()] != 1) {
            return false;
        }
        return m12850b(bundle, PropertyFlags.ID_SELF_ASSIGNABLE);
    }

    /* renamed from: a */
    public static String[] m12846a(Bundle bundle) {
        String[] strArr = (String[]) m12848b(bundle, "net.dinglisch.android.tasker.RELEVANT_VARIABLES", (Class<?>) String[].class, "getRelevantVariableList");
        return strArr == null ? new String[0] : strArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Object m12847b(Intent intent, String str, Class<?> cls, String str2) {
        if (intent.hasExtra(str)) {
            return m12848b(intent.getExtras(), str, cls, str2);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Object m12848b(Bundle bundle, String str, Class<?> cls, String str2) {
        String str3;
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                str3 = str2 + ": " + str + ": null value";
            } else if (obj.getClass() == cls) {
                return obj;
            } else {
                str3 = str2 + ": " + str + ": expected " + cls.getClass().getName() + ", got " + obj.getClass().getName();
            }
            Log.w("TaskerPlugin", str3);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m12849b(Bundle bundle) {
        return m12850b(bundle, 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m12850b(Bundle bundle, int i) {
        Integer num = (Integer) m12848b(bundle, "net.dinglisch.android.tasker.extras.HOST_CAPABILITIES", (Class<?>) Integer.class, "hostSupports");
        return num != null && (num.intValue() & i) > 0;
    }
}
