package p054c.p083e.p104c;

import java.io.IOException;
import java.io.StringWriter;
import p054c.p083e.p104c.p106w.C1338l;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.j */
public abstract class C1282j {
    /* renamed from: a */
    public C1279g mo5658a() {
        if (mo5661d()) {
            return (C1279g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: b */
    public C1285m mo5659b() {
        if (mo5663f()) {
            return (C1285m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public C1287o mo5660c() {
        if (mo5664g()) {
            return (C1287o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: d */
    public boolean mo5661d() {
        return this instanceof C1279g;
    }

    /* renamed from: e */
    public boolean mo5662e() {
        return this instanceof C1284l;
    }

    /* renamed from: f */
    public boolean mo5663f() {
        return this instanceof C1285m;
    }

    /* renamed from: g */
    public boolean mo5664g() {
        return this instanceof C1287o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C1421c cVar = new C1421c(stringWriter);
            cVar.mo5866b(true);
            C1338l.m6287a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
