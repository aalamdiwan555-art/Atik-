package ijiami;

import S.h.e.l.l.C0000;
import S.h.e.l.l.RizalProtection;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import defpackage.C0003;
import defpackage.C0004;
import defpackage.C0013;
import defpackage.C0014;
import defpackage.C0015;
import defpackage.C0019;
import defpackage.C0022;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: ijiami.۟ۦۨۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0001 {

    /* JADX INFO: renamed from: ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean f15;

    /* JADX INFO: renamed from: ۟۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m31(Object obj, Object obj2, int i) {
        if (C0002.m341() >= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m32() {
        if (m58() > 0) {
            return "ۣۢۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m33() {
        if (C0000.m24() < 0) {
            return "ۦۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static File[] m34(Object obj) {
        if (C0002.m341() >= 0) {
            return ((File) obj).listFiles();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m35() {
        if (C0002.m341() >= 0) {
            return "ۢۥ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m36() {
        if (C0000.m24() <= 0) {
            return "ۣۡۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m37() {
        if (m58() >= 0) {
            return "ۣۧۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m38() {
        if (C0000.m24() <= 0) {
            return Build.BRAND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m39() {
        if (C0000.m24() < 0) {
            return "ۣۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m40(Object obj, int i, int i2) {
        if (m58() >= 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m41() {
        if (C0000.m24() <= 0) {
            return "ۦۣۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m42(Object obj) {
        if (C0000.m24() <= 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m43() {
        if (C0002.m341() > 0) {
            return "ۣۨ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m44(String str) {
        String strM619 = C0004.m619();
        String strM6192 = C0004.m619();
        for (int i = 0; i < 15; i++) {
            strM619 = C0002.m279(m111(m111(new StringBuffer(), strM619), C0003.m474(i)));
            strM6192 = C0002.m279(C0002.m329(m111(new StringBuffer(), strM6192), ((int) (C0002.m181() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0002.m312(str) / 2);
        for (int i2 = 0; i2 < C0002.m312(str); i2 += 2) {
            C0002.m250(byteArrayOutputStream, (C0002.m330(strM619, C0003.m466(str, i2)) << 4) | C0002.m330(strM619, C0003.m466(str, i2 + 1)));
        }
        byte[] bArrM417 = C0003.m417(byteArrayOutputStream);
        int length = bArrM417.length;
        int iM312 = C0002.m312(strM6192);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM417[i3] = (byte) (bArrM417[i3] ^ C0003.m466(strM6192, i3 % iM312));
        }
        for (int iM3122 = 0; iM3122 < bArrM417.length; iM3122 = C0002.m312(C0004.m619()) + 1) {
        }
        return new String(bArrM417);
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m45() {
        if (C0003.m429() >= 0) {
            return C0013.m684();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m46(Object obj, Object obj2, Object obj3) {
        if (C0003.m429() >= 0) {
            ((Thread.UncaughtExceptionHandler) obj).uncaughtException((Thread) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m47() {
        if (C0003.m429() >= 0) {
            return "ۨۤ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m48() {
        if (C0003.m429() > 0) {
            return "ۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m49(Object obj, Object obj2) {
        if (C0003.m429() >= 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static String m50() {
        if (C0000.m24() <= 0) {
            return Build.FINGERPRINT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Class m51(Object obj) {
        if (C0003.m429() >= 0) {
            return ((Object[]) obj).getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m52() {
        if (m58() >= 0) {
            return "ۣۤۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m53() {
        if (m58() >= 0) {
            return "ۢ۠ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m54(Object obj) {
        if (C0002.m341() > 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m55() {
        if (C0002.m341() > 0) {
            return "ۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m56() {
        if (C0003.m429() >= 0) {
            return "ۤۤۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m57() {
        if (C0003.m429() >= 0) {
            return "ۦۣۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m58() {
        return 1746746 ^ m60((Object) "۟۠ۥ");
    }

    /* JADX INFO: renamed from: ۟ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m59() {
        if (C0003.m429() > 0) {
            return "ۢۥ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m60(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Class<?> m61(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m62(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m63() {
        if (C0000.m24() < 0) {
            return "ۦۣۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۧ, reason: not valid java name and contains not printable characters */
    public static String m64() {
        if (C0002.m341() >= 0) {
            return "ۥۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String[] m65(Object obj, Object obj2) {
        if (C0002.m341() >= 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m66() {
        if (C0002.m341() > 0) {
            return ClassLoader.getSystemClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m67(Object obj) {
        if (C0003.m429() > 0) {
            C0014.m696((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m68() {
        if (C0003.m429() > 0) {
            return "ۢ۠ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m69(Object obj) {
        if (C0000.m24() <= 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m70() {
        if (C0003.m429() > 0) {
            return "ۤۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m71() {
        if (m58() >= 0) {
            return "ۥۣۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m72() {
        if (m58() >= 0) {
            return "۟ۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m73(Object obj) {
        if (m58() > 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m74(Object obj) {
        if (C0002.m341() >= 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m75() {
        if (C0002.m341() >= 0) {
            return "۠ۤۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m76(Object obj) {
        if (C0003.m429() > 0) {
            ((IOException) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m77() {
        if (C0003.m429() > 0) {
            return "۟ۢۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢ۟, reason: not valid java name and contains not printable characters */
    public static StringBuffer m78(Object obj, long j) {
        if (C0000.m24() <= 0) {
            return ((StringBuffer) obj).append(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m79(Object obj) {
        if (C0003.m429() >= 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m80() {
        if (C0000.m24() < 0) {
            return "ۣۥۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m81() {
        if (m58() >= 0) {
            return "ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m82() {
        if (m58() > 0) {
            return "ۤ۟ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m83() {
        if (C0003.m429() >= 0) {
            return "ۣۧۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m84() {
        if (C0000.m24() < 0) {
            return "ۡۡۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m85() {
        if (C0002.m341() > 0) {
            return "ۨ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m86() {
        if (C0003.m429() >= 0) {
            return "ۥ۠ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m87() {
        if (m58() > 0) {
            return "ۡۦۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Context m88(Object obj) {
        if (C0002.m341() > 0) {
            return ((RizalProtection) obj).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m89() {
        if (C0002.m341() >= 0) {
            return "ۨۢ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m90() {
        if (C0003.m429() > 0) {
            return "ۥۡ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m91() {
        if (m58() > 0) {
            return "ۨۨۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m92() {
        if (C0000.m24() <= 0) {
            return Environment.getExternalStorageState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static String m93() {
        if (C0002.m341() > 0) {
            return "ۤ۟ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m94() {
        if (C0002.m341() >= 0) {
            return "ۣۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m95() {
        if (C0003.m429() > 0) {
            return "ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m96() {
        if (C0003.m429() > 0) {
            return "۠ۢ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Class m97(Object obj, Object obj2) {
        if (m58() >= 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠۠, reason: not valid java name and contains not printable characters */
    public static PackageInfo m98(Object obj, Object obj2, int i) {
        if (C0000.m24() <= 0) {
            return ((PackageManager) obj).getPackageArchiveInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m99() {
        if (C0000.m24() < 0) {
            return "۟۟ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m100() {
        if (C0002.m341() > 0) {
            return "ۦۣ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m101() {
        if (m58() > 0) {
            return "ۢۦۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m102() {
        if (m58() > 0) {
            return "ۡۡۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m103(Object obj, Object obj2) {
        if (m58() >= 0) {
            C0022.m759((byte[]) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m104() {
        if (C0002.m341() > 0) {
            return "ۤ۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m105() {
        if (m58() >= 0) {
            Looper.prepare();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m106() {
        if (C0000.m24() <= 0) {
            return "ۦۢۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m107() {
        if (m58() > 0) {
            return "۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m108() {
        if (C0002.m341() >= 0) {
            return "ۤۥ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m109() {
        if (C0003.m429() > 0) {
            return Build.MODEL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m110() {
        if (C0003.m429() > 0) {
            return "ۡۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m111(Object obj, Object obj2) {
        if (C0003.m429() > 0) {
            return ((StringBuffer) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m112() {
        if (m58() > 0) {
            return "ۧۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m113() {
        if (C0002.m341() > 0) {
            return "ۣ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m114() {
        if (C0000.m24() <= 0) {
            return "ۧۧ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m115() {
        if (C0003.m429() > 0) {
            return "ۨۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨ۠, reason: not valid java name and contains not printable characters */
    public static String m116() {
        if (C0000.m24() <= 0) {
            return "ۤۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m117(Object obj, Object obj2) {
        if (m58() >= 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m118() {
        if (C0003.m429() >= 0) {
            return "ۣۧۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m119(Object obj, Object obj2) {
        if (m58() > 0) {
            ((C0019) obj).m746((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m120(Object obj) {
        if (C0002.m341() >= 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m121() {
        if (C0002.m341() >= 0) {
            return "ۤۧۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m122() {
        if (C0002.m341() >= 0) {
            return "ۦ۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m123(Object obj) {
        if (C0000.m24() <= 0) {
            return ((File) obj).isFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۡۧ, reason: not valid java name and contains not printable characters */
    public static String m124() {
        if (C0002.m341() > 0) {
            return "۠ۨۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m125() {
        if (C0003.m429() >= 0) {
            return "ۣۡۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m126() {
        if (C0002.m341() > 0) {
            return "ۨۡۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m127() {
        if (C0000.m24() < 0) {
            return "۠ۥۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m128() {
        if (m58() >= 0) {
            return "ۣۣۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m129(Object obj) throws IOException {
        if (C0003.m429() >= 0) {
            ((ZipFile) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m130() {
        if (C0002.m341() >= 0) {
            return "ۣۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۡ, reason: not valid java name and contains not printable characters */
    public static String m131() {
        if (C0003.m429() >= 0) {
            return "ۣۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean m132(Object obj) {
        if (C0000.m24() < 0) {
            return ((RizalProtection) obj).f3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m133() {
        if (m58() >= 0) {
            return "ۣۡۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m134() {
        if (m58() > 0) {
            return "ۡۨۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦۦ, reason: not valid java name and contains not printable characters */
    public static void m135(Object obj) {
        if (m58() > 0) {
            ((Exception) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m136() {
        if (C0000.m24() < 0) {
            return "ۡۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m137() {
        if (C0000.m24() <= 0) {
            return "ۧۧۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m138() {
        if (C0002.m341() > 0) {
            return "ۣۧ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m139() {
        if (m58() >= 0) {
            return "۠۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static String m140() {
        if (C0002.m341() > 0) {
            return "ۤ۟۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static File m141(Object obj) {
        if (C0003.m429() > 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static String m142() {
        if (m58() >= 0) {
            return "ۣۣۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۢ, reason: contains not printable characters */
    public static String m143() {
        if (C0002.m341() > 0) {
            return "ۤ۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۧ, reason: contains not printable characters */
    public static boolean m144(Object obj, Object obj2) {
        if (m58() > 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۧۦ, reason: contains not printable characters */
    public static String m145() {
        if (m58() >= 0) {
            return "ۣۢ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۡ, reason: contains not printable characters */
    public static String m146() {
        if (C0002.m341() >= 0) {
            return "ۧۥۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟۠, reason: contains not printable characters */
    public static String m147() {
        if (C0000.m24() <= 0) {
            return "ۣۥۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۧ, reason: contains not printable characters */
    public static void m148(Object obj, boolean z) {
        if (C0000.m24() < 0) {
            ((Method) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static String m149() {
        if (m58() > 0) {
            return "ۧۡۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static String m150() {
        if (C0000.m24() <= 0) {
            return "ۥ۠ۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۟, reason: contains not printable characters */
    public static String m151() {
        if (C0000.m24() < 0) {
            return "ۦۧ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static String m152() {
        if (C0003.m429() > 0) {
            return "ۥ۟ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦ۠, reason: contains not printable characters */
    public static List m153(Object obj) {
        if (C0002.m341() > 0) {
            return ((NetworkInterface) obj).getInterfaceAddresses();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۥ, reason: contains not printable characters */
    public static String m154() {
        if (C0000.m24() <= 0) {
            return "ۥۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m155() {
        if (C0000.m24() < 0) {
            return "ۡۤۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m156() {
        if (C0003.m429() >= 0) {
            return "ۣۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m157() {
        if (m58() >= 0) {
            return "ۣۤ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m158() {
        if (C0002.m341() > 0) {
            return "ۥۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m159(Object obj) {
        if (m58() > 0) {
            return ((RizalProtection) obj).f6;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۨۦ, reason: not valid java name and contains not printable characters */
    public static int m160() {
        if (C0003.m429() >= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m161() {
        if (C0002.m341() > 0) {
            return "ۡ۠ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m162(Object obj) {
        if (m58() >= 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m163() {
        if (C0003.m429() > 0) {
            return "ۦۣۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Context m164(Object obj) {
        if (C0003.m429() >= 0) {
            return ((Application) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m165() {
        if (C0003.m429() > 0) {
            return "۟ۢۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m166() {
        if (C0003.m429() >= 0) {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m167() {
        if (C0003.m429() >= 0) {
            return "۠ۡۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static void m168(Object obj, Object obj2) {
        if (m58() >= 0) {
            ((BufferedOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m169() {
        if (m58() >= 0) {
            return "ۣۧۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m170(Object obj) {
        if (C0000.m24() < 0) {
            return ((Method) obj).isAccessible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m171(Object obj, Object obj2) {
        if (C0000.m24() <= 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m172() {
        if (C0002.m341() > 0) {
            return "۟ۡۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m173() {
        if (C0000.m24() <= 0) {
            return "ۥ۟ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m174() {
        if (m58() >= 0) {
            return "۟۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m175(Object obj) {
        if (C0003.m429() >= 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m176(Object obj) {
        if (m58() >= 0) {
            C0015.m709((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m177() {
        if (C0002.m341() >= 0) {
            return "ۡۦۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m178() {
        if (C0002.m341() > 0) {
            return "۟ۨۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m179(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
