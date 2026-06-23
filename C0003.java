package defpackage;

import S.h.e.l.l.C0000;
import S.h.e.l.l.RizalProtection;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Proxy;
import android.os.Build;
import android.telephony.TelephonyManager;
import ijiami.C0001;
import ijiami.C0002;
import ijiami.RizalObfuscator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟ۦۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0003 {

    /* JADX INFO: renamed from: ۟ۢۤۢۧ, reason: not valid java name and contains not printable characters */
    public static int f18 = 24;

    /* JADX INFO: renamed from: ۟۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m350() {
        if (C0002.m341() >= 0) {
            return "ۥۨۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m351() {
        if (C0000.m24() <= 0) {
            return "ۨۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m352() {
        if (C0001.m58() > 0) {
            return "۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m353() {
        if (m429() > 0) {
            return "۟ۦۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Class m354(Object obj) {
        if (m429() >= 0) {
            return ((Class) obj).getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m355() {
        if (C0001.m58() >= 0) {
            return "ۧ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m356() {
        if (C0001.m58() > 0) {
            return "ۥۣۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m357() {
        if (m429() > 0) {
            return "ۡۦۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m358(Object obj, int i) {
        if (m429() > 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m359() {
        if (C0001.m58() >= 0) {
            return "۟ۥۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m360(Object obj) {
        if (C0002.m341() >= 0) {
            return C0022.m758((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m361(Object obj) {
        if (C0001.m58() >= 0) {
            return ((Field) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m362() {
        if (C0002.m341() > 0) {
            return "ۣۢ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static void m363(Object obj) {
        if (C0001.m58() >= 0) {
            C0021.m756((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m364() {
        if (C0002.m341() >= 0) {
            return "ۦۨۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m365() {
        if (C0001.m58() >= 0) {
            return "ۥۥۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m366() {
        if (m429() >= 0) {
            return "ۤۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m367(Object obj) {
        if (C0001.m58() > 0) {
            return C0023.m763((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m368(Object obj, Object obj2) {
        if (C0001.m58() >= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۡ, reason: not valid java name and contains not printable characters */
    public static ZipEntry m369(Object obj, Object obj2) {
        if (C0002.m341() > 0) {
            return ((ZipFile) obj).getEntry((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۥ, reason: not valid java name and contains not printable characters */
    public static String m370() {
        if (m429() >= 0) {
            return "۠ۧۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m371() {
        if (C0002.m341() > 0) {
            return "ۨۧۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m372() {
        if (C0001.m58() >= 0) {
            return "ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m373(Object obj) {
        if (C0002.m341() >= 0) {
            return ((TelephonyManager) obj).getDeviceId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m374() {
        if (m429() > 0) {
            return "ۡۤۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m375(Object obj) {
        if (C0001.m58() >= 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m376() {
        if (m429() > 0) {
            return "ۦ۠۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Context m377(Object obj) {
        if (m429() >= 0) {
            return ((RizalObfuscator) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m378() {
        if (C0001.m58() > 0) {
            return "ۣ۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m379(Object obj, Object obj2) {
        if (C0000.m24() < 0) {
            return ((StringBuffer) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m380(Object obj, int i) {
        if (C0001.m58() > 0) {
            return Integer.parseInt((String) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m381() {
        if (C0002.m341() >= 0) {
            return "ۤۡۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Application m382(Object obj) {
        if (C0000.m24() < 0) {
            return ((RizalProtection) obj).f7;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m383() {
        if (C0002.m341() >= 0) {
            return "ۣۣ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m384(Object obj, boolean z) {
        if (C0000.m24() <= 0) {
            ((Field) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m385() {
        if (C0000.m24() < 0) {
            return "ۣ۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m386(Object obj, Object obj2) {
        if (C0001.m58() >= 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m387() {
        if (C0001.m58() > 0) {
            return "ۦۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m388() {
        if (C0002.m341() >= 0) {
            return "ۥ۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m389() {
        if (m429() > 0) {
            return "ۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m390() {
        if (m429() > 0) {
            return "ۣ۟ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m391() {
        if (C0002.m341() >= 0) {
            return Build.MANUFACTURER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m392() {
        if (C0002.m341() > 0) {
            return "۟ۥۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m393(String str) {
        String strM619 = C0004.m619();
        String strM6192 = C0004.m619();
        for (int i = 0; i < 15; i++) {
            strM619 = C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), strM619), m474(i)));
            strM6192 = C0002.m279(C0002.m329(C0001.m111(new StringBuffer(), strM6192), ((int) (C0002.m181() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0002.m312(str) / 2);
        while (C0002.m312(str) > 0) {
            C0002.m250(byteArrayOutputStream, (C0002.m330(strM619, m466(str, -2)) << 4) | C0002.m330(strM619, m466(str, -1)));
        }
        byte[] bArrM417 = m417(byteArrayOutputStream);
        int length = bArrM417.length;
        int iM312 = C0002.m312(strM6192);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM417[i2] = (byte) (bArrM417[i2] ^ m466(strM6192, i2 % iM312));
        }
        return new String(bArrM417);
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m394() {
        if (C0001.m58() >= 0) {
            return "ۢۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Process m395(Object obj, Object obj2) {
        if (C0001.m58() > 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m396() {
        if (C0002.m341() > 0) {
            return "ۧۢ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static String m397() {
        if (C0000.m24() < 0) {
            return "ۡ۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static Process m398(Object obj, Object obj2) {
        if (m429() >= 0) {
            return ((Runtime) obj).exec((String[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m399() {
        if (C0000.m24() <= 0) {
            return "ۤۡ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m400(Object obj, Object obj2) throws IOException {
        if (C0000.m24() <= 0) {
            return ((ZipFile) obj).getInputStream((ZipEntry) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۥ, reason: not valid java name and contains not printable characters */
    public static void m401(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0001.m58() > 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m402() {
        if (m429() >= 0) {
            return "ۦۦۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static String m403() {
        if (m429() >= 0) {
            return "ۢۧ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m404() {
        if (C0002.m341() >= 0) {
            return "ۦ۠ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static Throwable m405(Object obj) {
        if (C0002.m341() > 0) {
            return ((Throwable) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m406(Object obj) {
        if (C0000.m24() < 0) {
            C0013.m686((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m407() {
        if (C0000.m24() < 0) {
            return "۟۠ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m408() {
        if (m429() > 0) {
            return "۠ۢۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m409() {
        if (C0002.m341() > 0) {
            return "ۤۥۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m410() {
        if (C0001.m58() > 0) {
            return "ۣ۟۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m411(Object obj, Object obj2) {
        if (C0001.m58() >= 0) {
            return ((RizalObfuscator) obj).m30((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m412() {
        if (C0001.m58() >= 0) {
            return "ۥۣۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m413(Object obj) {
        if (m429() > 0) {
            return ((PackageInfo) obj).versionCode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m414() {
        if (m429() > 0) {
            return "ۣۤ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m415() {
        if (m429() >= 0) {
            return "ۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟۟, reason: not valid java name and contains not printable characters */
    public static void m416(Object obj) {
        if (C0000.m24() < 0) {
            ((C0016) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m417(Object obj) {
        if (m429() > 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m418(Object obj) {
        if (C0001.m58() >= 0) {
            ((Process) obj).destroy();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m419() {
        if (C0001.m58() > 0) {
            return "ۥۨ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m420() {
        if (C0002.m341() > 0) {
            return "ۦۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static String m421() {
        if (m429() >= 0) {
            return "ۢۦۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m422() {
        if (C0002.m341() >= 0) {
            return "ۧۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m423() {
        if (C0001.m58() > 0) {
            return "ۨ۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m424() {
        if (C0002.m341() > 0) {
            return "ۢۡۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m425() {
        if (m429() > 0) {
            return "۠ۢۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m426() {
        if (m429() > 0) {
            return "۠ۨۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m427(Object obj) {
        if (m429() >= 0) {
            ((Application) obj).onCreate();
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m428() {
        if (C0002.m341() > 0) {
            return "ۥۡۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m429() {
        return 1752514 ^ C0001.m60((Object) "ۥ۟ۥ");
    }

    /* JADX INFO: renamed from: ۠ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m430() {
        if (m429() > 0) {
            return "ۣ۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m431() {
        if (C0001.m58() >= 0) {
            return C0015.m707();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m432(Object obj) {
        if (m429() >= 0) {
            return ((String) obj).toLowerCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m433() {
        if (C0001.m58() >= 0) {
            return "ۣ۠۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static String m434() {
        if (m429() > 0) {
            return "ۢۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static String m435() {
        if (C0001.m58() >= 0) {
            return "۟ۦ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m436() {
        if (C0000.m24() < 0) {
            return "ۣ۟۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Set m437(Object obj) {
        if (C0002.m341() >= 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String m438() {
        if (C0000.m24() <= 0) {
            return "۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m439() {
        if (C0001.m58() >= 0) {
            return "ۥۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m440(Object obj, Object obj2, int i, int i2) {
        if (C0001.m58() >= 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m441(Object obj, Object obj2, Object obj3) {
        if (C0002.m341() >= 0) {
            return C0006.m651(obj, (ArrayList) obj2, (File) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m442() {
        if (C0000.m24() < 0) {
            return C0014.m695();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m443() {
        if (m429() > 0) {
            return "ۣۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m444() {
        if (C0000.m24() < 0) {
            return "ۣۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m445(Object obj) {
        if (C0001.m58() > 0) {
            return ((StackTraceElement) obj).getClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m446() {
        if (C0002.m341() >= 0) {
            return "ۢ۟ۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m447(Object obj, Object obj2) {
        if (C0002.m341() > 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۦۨ, reason: not valid java name and contains not printable characters */
    public static Class m448(Object obj) {
        if (C0000.m24() < 0) {
            return ((Class) obj).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m449() {
        if (C0002.m341() > 0) {
            return "ۡۥ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m450(Object obj) {
        if (C0002.m341() >= 0) {
            return ((Context) obj).getPackageResourcePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m451() {
        if (m429() > 0) {
            return "ۡۥ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m452(Object obj) {
        if (C0001.m58() >= 0) {
            return Proxy.getPort((Context) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m453() {
        if (C0000.m24() < 0) {
            return "ۢۤۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m454(Object obj, Object obj2) {
        if (m429() >= 0) {
            ((Throwable) obj).printStackTrace((PrintWriter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۦ۠, reason: not valid java name and contains not printable characters */
    public static String m455() {
        if (C0002.m341() > 0) {
            return "۟۠ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m456() {
        if (C0001.m58() > 0) {
            return "۠ۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static String m457(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static String m458() {
        if (C0000.m24() <= 0) {
            return "ۧۡۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m459() {
        if (C0002.m341() > 0) {
            return "ۤۥۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m460(Object obj, Object obj2) {
        if (C0000.m24() <= 0) {
            return ((JSONObject) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۡ۠, reason: not valid java name and contains not printable characters */
    public static Field m461(Object obj, Object obj2) {
        if (C0000.m24() < 0) {
            return C0005.m640(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m462(Object obj, char c) {
        if (C0000.m24() < 0) {
            return ((StringBuffer) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m463(Object obj, Object obj2, Object obj3) throws IllegalAccessException {
        if (m429() > 0) {
            ((Field) obj).set(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۨۢۧ, reason: not valid java name and contains not printable characters */
    public static String m464() {
        if (C0001.m58() >= 0) {
            return "۠ۥۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static String m465() {
        if (C0002.m341() >= 0) {
            return "ۦ۟ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧ۟, reason: contains not printable characters */
    public static char m466(Object obj, int i) {
        if (C0001.m58() >= 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۨ, reason: contains not printable characters */
    public static String m467() {
        if (C0001.m58() > 0) {
            return "ۨ۠ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۤ, reason: contains not printable characters */
    public static String m468() {
        if (C0000.m24() < 0) {
            return "ۤۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۢ, reason: contains not printable characters */
    public static String m469() {
        if (C0002.m341() > 0) {
            return "ۣۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static String m470() {
        if (C0002.m341() >= 0) {
            return "ۣ۠ۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static String m471() {
        if (C0002.m341() > 0) {
            return "ۢۢۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡ, reason: contains not printable characters */
    public static String m472() {
        if (C0002.m341() > 0) {
            return "ۢۡۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static boolean m473(Object obj) {
        if (m429() >= 0) {
            return ((RizalProtection) obj).f5;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۧ۠, reason: contains not printable characters */
    public static String m474(int i) {
        if (m429() > 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m475(int i) {
        if (C0002.m341() >= 0) {
            return RizalProtection.m15(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m476() {
        if (C0002.m341() > 0) {
            return "ۣۢۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m477(Object obj) {
        if (C0001.m58() > 0) {
            return Collections.list((Enumeration) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m478() {
        if (C0000.m24() <= 0) {
            return "ۣۧ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m479() {
        if (C0001.m58() > 0) {
            return "ۧۦۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m480() {
        if (m429() >= 0) {
            return "ۡۥۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static String m481(Object obj) {
        if (C0001.m58() > 0) {
            return C0010.m667((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static String m482() {
        if (m429() > 0) {
            return "ۣۤۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static String m483() {
        if (m429() > 0) {
            return "۟ۤۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static String m484() {
        if (C0002.m341() >= 0) {
            return "ۥۧۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۨ, reason: not valid java name and contains not printable characters */
    public static String m485() {
        if (C0002.m341() >= 0) {
            return "ۣ۠ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m486() {
        if (C0002.m341() > 0) {
            return "ۨۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m487() {
        if (C0001.m58() > 0) {
            return "ۦۡ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m488() {
        if (C0001.m58() >= 0) {
            return "ۧ۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m489() {
        if (C0000.m24() < 0) {
            return "ۣۣۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m490() {
        if (m429() >= 0) {
            return "ۥۢۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m491() {
        if (C0001.m58() > 0) {
            return "ۡۡ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m492(Object obj) {
        if (m429() > 0) {
            C0022.m761((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m493() {
        if (C0001.m58() >= 0) {
            return "ۥۣۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m494() {
        if (C0001.m58() >= 0) {
            return "ۨ۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m495() {
        if (m429() >= 0) {
            return Build.PRODUCT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۢ, reason: not valid java name and contains not printable characters */
    public static PackageManager m496(Object obj) {
        if (C0000.m24() < 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m497() {
        if (m429() > 0) {
            return "ۣۤ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۢ, reason: not valid java name and contains not printable characters */
    public static String m498() {
        if (C0000.m24() < 0) {
            return "ۧۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m499() {
        if (C0001.m58() > 0) {
            return C0015.m708();
        }
        return false;
    }
}
