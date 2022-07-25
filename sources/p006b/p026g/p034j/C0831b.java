package p006b.p026g.p034j;

import android.util.Log;
import java.io.Writer;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.g.j.b */
public class C0831b extends Writer {

    /* renamed from: f */
    private final String f3243f;

    /* renamed from: g */
    private StringBuilder f3244g = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);

    public C0831b(String str) {
        this.f3243f = str;
    }

    /* renamed from: a */
    private void m4523a() {
        if (this.f3244g.length() > 0) {
            Log.d(this.f3243f, this.f3244g.toString());
            StringBuilder sb = this.f3244g;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4523a();
    }

    public void flush() {
        m4523a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4523a();
            } else {
                this.f3244g.append(c);
            }
        }
    }
}
