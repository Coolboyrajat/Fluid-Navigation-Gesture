package p054c.p083e.p104c.p106w.p107n.p108o;

import java.util.TimeZone;

/* renamed from: c.e.c.w.n.o.a */
public class C1413a {

    /* renamed from: a */
    private static final TimeZone f4346a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static int m6518a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: a */
    private static int m6519a(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        }
        return -i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m6520a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r3 = r0 + 4
            int r0 = m6519a((java.lang.String) r1, (int) r0, (int) r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r4 = 45
            boolean r5 = m6521a((java.lang.String) r1, (int) r3, (char) r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m6519a((java.lang.String) r1, (int) r3, (int) r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            boolean r6 = m6521a((java.lang.String) r1, (int) r5, (char) r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m6519a((java.lang.String) r1, (int) r5, (int) r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r7 = 84
            boolean r7 = m6521a((java.lang.String) r1, (int) r6, (char) r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00bf
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m6519a((java.lang.String) r1, (int) r6, (int) r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r13 = 58
            boolean r14 = m6521a((java.lang.String) r1, (int) r7, (char) r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = m6519a((java.lang.String) r1, (int) r7, (int) r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            boolean r13 = m6521a((java.lang.String) r1, (int) r14, (char) r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r13 <= r14) goto L_0x00c2
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r13 == r10) goto L_0x00c2
            if (r13 == r9) goto L_0x00c2
            if (r13 == r4) goto L_0x00c2
            int r13 = r14 + 2
            int r14 = m6519a((java.lang.String) r1, (int) r14, (int) r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = m6521a((java.lang.String) r1, (int) r13, (char) r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r15 == 0) goto L_0x00bc
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = m6518a((java.lang.String) r1, (int) r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r16 = m6519a((java.lang.String) r1, (int) r13, (int) r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r11 = r11 - r13
            if (r11 == r8) goto L_0x00b5
            if (r11 == r12) goto L_0x00b2
        L_0x00af:
            r11 = r16
            goto L_0x00b8
        L_0x00b2:
            int r16 = r16 * 10
            goto L_0x00af
        L_0x00b5:
            int r16 = r16 * 100
            goto L_0x00af
        L_0x00b8:
            r13 = r11
            r11 = r14
            r14 = r15
            goto L_0x00c4
        L_0x00bc:
            r11 = r14
            r14 = r13
            goto L_0x00c3
        L_0x00bf:
            r14 = r6
            r6 = 0
            r7 = 0
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r15 <= r14) goto L_0x01af
            char r15 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r12 = 5
            if (r15 != r10) goto L_0x00d6
            java.util.TimeZone r4 = f4346a     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r14 = r14 + r8
            goto L_0x017e
        L_0x00d6:
            if (r15 == r9) goto L_0x00f7
            if (r15 != r4) goto L_0x00db
            goto L_0x00f7
        L_0x00db:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r3.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
        L_0x00f7:
            java.lang.String r4 = r1.substring(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r9 < r12) goto L_0x0102
            goto L_0x0113
        L_0x0102:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
        L_0x0113:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r14 = r14 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r9 != 0) goto L_0x017c
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r9 == 0) goto L_0x0129
            goto L_0x017c
        L_0x0129:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            boolean r15 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r15 != 0) goto L_0x017a
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            if (r10 == 0) goto L_0x0157
            goto L_0x017a
        L_0x0157:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
        L_0x017a:
            r4 = r9
            goto L_0x017e
        L_0x017c:
            java.util.TimeZone r4 = f4346a     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
        L_0x017e:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0 = 13
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r0 = 14
            r9.set(r0, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            r2.setIndex(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            return r0
        L_0x01af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException -> 0x01b7 }
        L_0x01b7:
            r0 = move-exception
            goto L_0x01bc
        L_0x01b9:
            r0 = move-exception
            goto L_0x01bc
        L_0x01bb:
            r0 = move-exception
        L_0x01bc:
            if (r1 != 0) goto L_0x01c0
            r1 = 0
            goto L_0x01d4
        L_0x01c0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01d4:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01e0
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01fe
        L_0x01e0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01fe:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p106w.p107n.p108o.C1413a.m6520a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: a */
    private static boolean m6521a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
