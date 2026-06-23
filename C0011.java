package defpackage;

import S.h.e.l.l.C0000;
import ijiami.C0001;
import ijiami.C0002;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0011 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f24short = {2842, 2846, 2824, 1088, 1092, 1106, 1070, 1092, 1090, 1091, 1070, 1105, 1098, 1090, 1106, 1076, 1105, 1120, 1125, 1125, 1128, 1135, 1126};

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m669() {
        if (C0000.m24() <= 0) {
            return f24short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static Key m670(Object obj) {
        if (C0000.m24() < 0) {
            return m673((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۦ, reason: contains not printable characters */
    public static int m671(Object obj) {
        if (C0001.m58() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۡ۠, reason: contains not printable characters */
    public static String m672(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    private static Key m673(String str) throws Exception {
        try {
            return new SecretKeySpec(C0001.m162(str), m672(m669(), 1750656 ^ m671(C0004.m605()), 1748647 ^ m671(C0003.m469()), m671(C0004.m547()) ^ 1752453));
        } catch (Exception e) {
            C0001.m135(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static byte[] m674(byte[] bArr, String str) {
        byte[] bArr2 = (byte[]) null;
        try {
            Key keyM670 = m670(C0004.m539(str));
            Cipher cipherM542 = C0004.m542(m672(m669(), 1755499 ^ m671(C0004.m592()), 1752630 ^ m671(C0004.m633()), m671(C0004.m504()) ^ 55421));
            C0004.m609(cipherM542, 2, keyM670);
            return C0002.m204(cipherM542, bArr);
        } catch (Exception e) {
            C0001.m135(e);
            return bArr2;
        }
    }
}
