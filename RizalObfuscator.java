package ijiami;

import S.h.e.l.l.C0000;
import android.app.Application;
import android.content.Context;
import defpackage.C0003;
import defpackage.C0004;
import defpackage.C0019;
import java.io.IOException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class RizalObfuscator extends Application {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f13short = {2990, 3004, 3004, 2986, 3003, 3004, 3040, 645, 660, 660, 648, 653, 647, 645, 656, 653, 651, 650};

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    static Context f14;

    /* JADX INFO: renamed from: ۟ۤۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int m26(Object obj) {
        if (C0003.m429() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m27(Object obj, int i, int i2, int i3) {
        if (C0000.m24() < 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۧ, reason: contains not printable characters */
    public static short[] m28() {
        if (C0003.m429() >= 0) {
            return f13short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static String m29(Object obj, int i, int i2, int i3) {
        if (C0001.m58() > 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        try {
            ZipFile zipFile = new ZipFile(C0003.m411(this, context));
            if (C0003.m369(zipFile, C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m27(m28(), 1751649 ^ m26(C0001.m56()), 1753536 ^ m26(C0001.m57()), m26(C0004.m584()) ^ 1749262)), C0003.m481(m29(m28(), 1750663 ^ m26(C0004.m605()), 1751701 ^ m26(C0004.m506()), m26(C0002.m211()) ^ 1747427))))) == null) {
            }
            C0001.m129(zipFile);
        } catch (IOException e) {
            C0001.m76(e);
        }
        super.attachBaseContext(context);
        f14 = context;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0002.m310(new C0019(), C0003.m377(this));
        f14 = C0003.m377(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        C0004.m544(0);
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public String m30(Context context) {
        return C0003.m450(context);
    }
}
