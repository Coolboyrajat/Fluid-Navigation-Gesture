package p190io.objectbox.query;

import java.util.concurrent.Callable;
import p190io.objectbox.Property;
import p190io.objectbox.query.QueryBuilder;

/* renamed from: io.objectbox.query.PropertyQuery */
public class PropertyQuery {
    boolean distinct;
    boolean enableNull;
    boolean noCaseIfDistinct = true;
    double nullValueDouble;
    float nullValueFloat;
    long nullValueLong;
    String nullValueString;
    final Property property;
    final int propertyId;
    final Query query;
    final long queryHandle;
    boolean unique;

    PropertyQuery(Query query2, Property property2) {
        this.query = query2;
        this.queryHandle = query2.handle;
        this.property = property2;
        this.propertyId = property2.f7909id;
    }

    private Object findNumber() {
        return this.query.callInReadTx(new Callable<Object>() {
            public Object call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindNumber(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.unique, propertyQuery2.distinct, propertyQuery2.enableNull, propertyQuery2.nullValueLong, propertyQuery2.nullValueFloat, propertyQuery2.nullValueDouble);
            }
        });
    }

    public double avg() {
        return ((Double) this.query.callInReadTx(new Callable<Double>() {
            public Double call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Double.valueOf(propertyQuery.nativeAvg(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).doubleValue();
    }

    public long count() {
        return ((Long) this.query.callInReadTx(new Callable<Long>() {
            public Long call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return Long.valueOf(propertyQuery.nativeCount(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct));
            }
        })).longValue();
    }

    public PropertyQuery distinct() {
        this.distinct = true;
        return this;
    }

    public PropertyQuery distinct(QueryBuilder.StringOrder stringOrder) {
        if (this.property.type == String.class) {
            boolean z = true;
            this.distinct = true;
            if (stringOrder != QueryBuilder.StringOrder.CASE_INSENSITIVE) {
                z = false;
            }
            this.noCaseIfDistinct = z;
            return this;
        }
        throw new RuntimeException("Reserved for string properties, but got " + this.property);
    }

    public Boolean findBoolean() {
        return (Boolean) findNumber();
    }

    public Byte findByte() {
        return (Byte) findNumber();
    }

    public byte[] findBytes() {
        return (byte[]) this.query.callInReadTx(new Callable<byte[]>() {
            public byte[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindBytes(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, (byte) ((int) propertyQuery2.nullValueLong));
            }
        });
    }

    public Character findChar() {
        return (Character) findNumber();
    }

    public char[] findChars() {
        return (char[]) this.query.callInReadTx(new Callable<char[]>() {
            public char[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindChars(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, (char) ((int) propertyQuery2.nullValueLong));
            }
        });
    }

    public Double findDouble() {
        return (Double) findNumber();
    }

    public double[] findDoubles() {
        return (double[]) this.query.callInReadTx(new Callable<double[]>() {
            public double[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindDoubles(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, propertyQuery2.nullValueDouble);
            }
        });
    }

    public Float findFloat() {
        return (Float) findNumber();
    }

    public float[] findFloats() {
        return (float[]) this.query.callInReadTx(new Callable<float[]>() {
            public float[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindFloats(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, propertyQuery2.nullValueFloat);
            }
        });
    }

    public Integer findInt() {
        return (Integer) findNumber();
    }

    public int[] findInts() {
        return (int[]) this.query.callInReadTx(new Callable<int[]>() {
            public int[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindInts(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, (int) propertyQuery2.nullValueLong);
            }
        });
    }

    public Long findLong() {
        return (Long) findNumber();
    }

    public long[] findLongs() {
        return (long[]) this.query.callInReadTx(new Callable<long[]>() {
            public long[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindLongs(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, propertyQuery2.nullValueLong);
            }
        });
    }

    public Short findShort() {
        return (Short) findNumber();
    }

    public short[] findShorts() {
        return (short[]) this.query.callInReadTx(new Callable<short[]>() {
            public short[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                long j = propertyQuery.queryHandle;
                long cursorHandle = propertyQuery.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery.nativeFindShorts(j, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, propertyQuery2.enableNull, (short) ((int) propertyQuery2.nullValueLong));
            }
        });
    }

    public String findString() {
        return (String) this.query.callInReadTx(new Callable<String>() {
            public String call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                boolean z = propertyQuery.distinct && !propertyQuery.noCaseIfDistinct;
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                long j = propertyQuery2.queryHandle;
                long cursorHandle = propertyQuery2.query.cursorHandle();
                PropertyQuery propertyQuery3 = PropertyQuery.this;
                return propertyQuery2.nativeFindString(j, cursorHandle, propertyQuery3.propertyId, propertyQuery3.unique, propertyQuery3.distinct, z, propertyQuery3.enableNull, propertyQuery3.nullValueString);
            }
        });
    }

    public String[] findStrings() {
        return (String[]) this.query.callInReadTx(new Callable<String[]>() {
            public String[] call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                boolean z = propertyQuery.distinct && propertyQuery.noCaseIfDistinct;
                long cursorHandle = PropertyQuery.this.query.cursorHandle();
                PropertyQuery propertyQuery2 = PropertyQuery.this;
                return propertyQuery2.nativeFindStrings(propertyQuery2.queryHandle, cursorHandle, propertyQuery2.propertyId, propertyQuery2.distinct, z, propertyQuery2.enableNull, propertyQuery2.nullValueString);
            }
        });
    }

    public long max() {
        return ((Long) this.query.callInReadTx(new Callable<Long>() {
            public Long call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Long.valueOf(propertyQuery.nativeMax(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).longValue();
    }

    public double maxDouble() {
        return ((Double) this.query.callInReadTx(new Callable<Double>() {
            public Double call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Double.valueOf(propertyQuery.nativeMaxDouble(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).doubleValue();
    }

    public long min() {
        return ((Long) this.query.callInReadTx(new Callable<Long>() {
            public Long call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Long.valueOf(propertyQuery.nativeMin(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).longValue();
    }

    public double minDouble() {
        return ((Double) this.query.callInReadTx(new Callable<Double>() {
            public Double call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Double.valueOf(propertyQuery.nativeMinDouble(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).doubleValue();
    }

    /* access modifiers changed from: package-private */
    public native double nativeAvg(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native long nativeCount(long j, long j2, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native byte[] nativeFindBytes(long j, long j2, int i, boolean z, boolean z2, byte b);

    /* access modifiers changed from: package-private */
    public native char[] nativeFindChars(long j, long j2, int i, boolean z, boolean z2, char c);

    /* access modifiers changed from: package-private */
    public native double[] nativeFindDoubles(long j, long j2, int i, boolean z, boolean z2, double d);

    /* access modifiers changed from: package-private */
    public native float[] nativeFindFloats(long j, long j2, int i, boolean z, boolean z2, float f);

    /* access modifiers changed from: package-private */
    public native int[] nativeFindInts(long j, long j2, int i, boolean z, boolean z2, int i2);

    /* access modifiers changed from: package-private */
    public native long[] nativeFindLongs(long j, long j2, int i, boolean z, boolean z2, long j3);

    /* access modifiers changed from: package-private */
    public native Object nativeFindNumber(long j, long j2, int i, boolean z, boolean z2, boolean z3, long j3, float f, double d);

    /* access modifiers changed from: package-private */
    public native short[] nativeFindShorts(long j, long j2, int i, boolean z, boolean z2, short s);

    /* access modifiers changed from: package-private */
    public native String nativeFindString(long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, String str);

    /* access modifiers changed from: package-private */
    public native String[] nativeFindStrings(long j, long j2, int i, boolean z, boolean z2, boolean z3, String str);

    /* access modifiers changed from: package-private */
    public native long nativeMax(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native double nativeMaxDouble(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native long nativeMin(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native double nativeMinDouble(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native long nativeSum(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native double nativeSumDouble(long j, long j2, int i);

    public PropertyQuery nullValue(Object obj) {
        if (obj != null) {
            boolean z = obj instanceof String;
            boolean z2 = obj instanceof Number;
            if (z || z2) {
                this.enableNull = true;
                this.nullValueString = z ? (String) obj : null;
                boolean z3 = obj instanceof Float;
                this.nullValueFloat = z3 ? ((Float) obj).floatValue() : 0.0f;
                boolean z4 = obj instanceof Double;
                this.nullValueDouble = z4 ? ((Double) obj).doubleValue() : 0.0d;
                this.nullValueLong = (!z2 || z3 || z4) ? 0 : ((Number) obj).longValue();
                return this;
            }
            throw new IllegalArgumentException("Unsupported value class: " + obj.getClass());
        }
        throw new IllegalArgumentException("Null values are not allowed");
    }

    public PropertyQuery reset() {
        this.distinct = false;
        this.noCaseIfDistinct = true;
        this.unique = false;
        this.enableNull = false;
        this.nullValueDouble = 0.0d;
        this.nullValueFloat = 0.0f;
        this.nullValueString = null;
        this.nullValueLong = 0;
        return this;
    }

    public long sum() {
        return ((Long) this.query.callInReadTx(new Callable<Long>() {
            public Long call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Long.valueOf(propertyQuery.nativeSum(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).longValue();
    }

    public double sumDouble() {
        return ((Double) this.query.callInReadTx(new Callable<Double>() {
            public Double call() {
                PropertyQuery propertyQuery = PropertyQuery.this;
                return Double.valueOf(propertyQuery.nativeSumDouble(propertyQuery.queryHandle, propertyQuery.query.cursorHandle(), PropertyQuery.this.propertyId));
            }
        })).doubleValue();
    }

    public PropertyQuery unique() {
        this.unique = true;
        return this;
    }
}
