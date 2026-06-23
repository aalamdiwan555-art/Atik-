package S.h.e.l.l;

import defpackage.C0003;
import defpackage.C0004;
import ijiami.C0001;
import ijiami.C0002;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: S.h.e.l.l.۟ۥۣۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0000 {

    /* JADX INFO: renamed from: ۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int f12 = -54;

    /* JADX INFO: renamed from: ۟ۢۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m23(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static int m24() {
        return (-1751801) ^ C0001.m60((Object) "ۤۦۣ");
    }

    /* JADX INFO: renamed from: ۦۨۨۦ, reason: contains not printable characters */
    public static String m25(String str) {
        String strM619 = C0004.m619();
        String strM6192 = C0004.m619();
        for (int i = 0; i < 15; i++) {
            strM619 = C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), strM619), C0003.m474(i)));
            strM6192 = C0002.m279(C0002.m329(C0001.m111(new StringBuffer(), strM6192), ((int) (C0002.m181() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0002.m312(str) / 2);
        for (int i2 = 0; i2 < C0002.m312(str); i2 += 2) {
            C0002.m250(byteArrayOutputStream, (C0002.m330(strM619, C0003.m466(str, i2)) << 4) | C0002.m330(strM619, C0003.m466(str, i2 + 1)));
        }
        byte[] bArrM417 = C0003.m417(byteArrayOutputStream);
        int length = bArrM417.length;
        int iM312 = C0002.m312(strM6192);
        while (length > 0) {
            bArrM417[-1] = (byte) (bArrM417[-1] ^ C0003.m466(strM6192, (-1) % iM312));
        }
        for (int iM3122 = 0; iM3122 < bArrM417.length; iM3122 = C0002.m312(C0004.m619()) + 1) {
        }
        return new String(bArrM417);
    }
}
