package defpackage;

import ijiami.C0001;
import ijiami.C0002;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0024 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f44short = {1462, 1471, 1486, 810};

    /* JADX INFO: renamed from: ۟۠ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int m766(Object obj) {
        if (C0001.m58() >= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m767(Object obj, int i, int i2, int i3) {
        if (C0002.m341() >= 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m768() {
        if (C0002.m341() > 0) {
            return f44short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ, reason: contains not printable characters */
    public static String m769(String str) {
        if (C0004.m582(str)) {
            return C0004.m619();
        }
        try {
            byte[] bArrM514 = C0004.m514(C0001.m73(m767(m768(), 1748835 ^ m766(C0004.m540()), 1750568 ^ m766(C0003.m485()), m766(C0001.m128()) ^ 1749880)), C0001.m162(str));
            String strM619 = C0004.m619();
            for (byte b : bArrM514) {
                String strM474 = C0003.m474(b & 255);
                if (C0002.m312(strM474) == 1) {
                    strM474 = C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m767(m768(), 1747750 ^ m766(C0003.m425()), 1746754 ^ m766(C0002.m202()), m766(C0001.m152()) ^ 1752726)), strM474));
                }
                strM619 = C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), strM619), strM474));
            }
            return C0002.m305(strM619);
        } catch (NoSuchAlgorithmException e) {
            C0002.m224(e);
            return C0004.m619();
        }
    }

    /* JADX INFO: renamed from: ۥۦ, reason: contains not printable characters */
    public static String m770(String str) {
        return C0002.m305(C0001.m40(C0004.m613(str), 8, 24));
    }
}
