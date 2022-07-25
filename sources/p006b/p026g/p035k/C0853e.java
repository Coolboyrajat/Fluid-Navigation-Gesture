package p006b.p026g.p035k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.k.e */
public class C0853e {

    /* renamed from: a */
    private static boolean f3283a;

    /* renamed from: b */
    private static Method f3284b;

    /* renamed from: c */
    private static boolean f3285c;

    /* renamed from: d */
    private static Field f3286d;

    /* renamed from: b.g.k.e$a */
    public interface C0854a {
        /* renamed from: a */
        boolean mo254a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m4590a(Dialog dialog) {
        if (!f3285c) {
            try {
                f3286d = Dialog.class.getDeclaredField("mOnKeyListener");
                f3286d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3285c = true;
        }
        Field field = f3286d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m4591a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3283a) {
            try {
                f3284b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f3283a = true;
        }
        Method method = f3284b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4592a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m4591a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0890v.m4762a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m4593a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a = m4590a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0890v.m4762a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m4594a(View view, KeyEvent keyEvent) {
        return C0890v.m4768b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m4595a(C0854a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo254a(keyEvent) : callback instanceof Activity ? m4592a((Activity) callback, keyEvent) : callback instanceof Dialog ? m4593a((Dialog) callback, keyEvent) : (view != null && C0890v.m4762a(view, keyEvent)) || aVar.mo254a(keyEvent);
    }
}
