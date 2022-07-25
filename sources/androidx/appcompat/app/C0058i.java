package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.i */
class C0058i {

    /* renamed from: a */
    private static Field f248a;

    /* renamed from: b */
    private static boolean f249b;

    /* renamed from: c */
    private static Class<?> f250c;

    /* renamed from: d */
    private static boolean f251d;

    /* renamed from: e */
    private static Field f252e;

    /* renamed from: f */
    private static boolean f253f;

    /* renamed from: g */
    private static Field f254g;

    /* renamed from: h */
    private static boolean f255h;

    /* renamed from: a */
    static void m264a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m268d(resources);
            } else if (i >= 23) {
                m267c(resources);
            } else if (i >= 21) {
                m266b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m265a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f251d) {
            try {
                f250c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f251d = true;
        }
        Class<?> cls = f250c;
        if (cls != null) {
            if (!f253f) {
                try {
                    f252e = cls.getDeclaredField("mUnthemedEntries");
                    f252e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f253f = true;
            }
            Field field = f252e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m266b(Resources resources) {
        Map map;
        if (!f249b) {
            try {
                f248a = Resources.class.getDeclaredField("mDrawableCache");
                f248a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f249b = true;
        }
        Field field = f248a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m267c(Resources resources) {
        if (!f249b) {
            try {
                f248a = Resources.class.getDeclaredField("mDrawableCache");
                f248a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f249b = true;
        }
        Object obj = null;
        Field field = f248a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m265a(obj);
        }
    }

    /* renamed from: d */
    private static void m268d(Resources resources) {
        Object obj;
        if (!f255h) {
            try {
                f254g = Resources.class.getDeclaredField("mResourcesImpl");
                f254g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f255h = true;
        }
        Field field = f254g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f249b) {
                    try {
                        f248a = obj.getClass().getDeclaredField("mDrawableCache");
                        f248a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f249b = true;
                }
                Field field2 = f248a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m265a(obj2);
                }
            }
        }
    }
}
