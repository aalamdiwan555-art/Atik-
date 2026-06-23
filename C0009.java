package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import ijiami.C0001;
import ijiami.C0002;

/* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0009 {
    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static String m663(Context context, String str) {
        PackageInfo packageInfoM98 = C0001.m98(C0003.m496(context), str, 1);
        if (packageInfoM98 != null) {
            ApplicationInfo applicationInfoM233 = C0002.m233(packageInfoM98);
            applicationInfoM233.sourceDir = str;
            applicationInfoM233.publicSourceDir = str;
            try {
                return C0002.m283(C0002.m332(applicationInfoM233));
            } catch (OutOfMemoryError e) {
            }
        }
        return (String) null;
    }
}
