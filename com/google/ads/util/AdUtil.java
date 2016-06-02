package com.google.ads.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.android.gms.C0338e;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AdUtil {
    public static final int f1234a;
    private static Boolean f1235b;
    private static String f1236c;
    private static String f1237d;
    private static String f1238e;
    private static AudioManager f1239f;
    private static boolean f1240g;
    private static boolean f1241h;
    private static String f1242i;

    public class UserActivityReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                AdUtil.m1795a(true);
            } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                AdUtil.m1795a(false);
            }
        }
    }

    static {
        f1234a = m1786a(VERSION.SDK);
        f1235b = null;
        f1236c = null;
        f1238e = null;
        f1240g = true;
        f1241h = false;
        f1242i = null;
    }

    public static int m1783a() {
        return f1234a >= 9 ? 6 : 0;
    }

    public static int m1784a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static int m1785a(Context context, DisplayMetrics displayMetrics) {
        return f1234a >= 4 ? C0236n.m1850a(context, displayMetrics) : displayMetrics.heightPixels;
    }

    public static int m1786a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C0229g.m1842e("The Android SDK version couldn't be parsed to an int: " + VERSION.SDK);
            C0229g.m1842e("Defaulting to Android SDK version 3.");
            return 3;
        }
    }

    public static DisplayMetrics m1787a(Activity activity) {
        if (activity.getWindowManager() == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String m1788a(Context context) {
        if (f1236c == null) {
            String string = Secure.getString(context.getContentResolver(), "android_id");
            string = (string == null || m1807c()) ? m1803b("emulator") : m1803b(string);
            if (string == null) {
                return null;
            }
            f1236c = string.toUpperCase(Locale.US);
        }
        return f1236c;
    }

    public static String m1789a(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence allocate = CharBuffer.allocate(2048);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return stringBuilder.toString();
            }
            allocate.flip();
            stringBuilder.append(allocate, 0, read);
        }
    }

    public static String m1790a(Map map) {
        String str = null;
        try {
            str = m1805b(map).toString();
        } catch (Throwable e) {
            C0229g.m1841d("JsonException in serialization: ", e);
        }
        return str;
    }

    public static HashMap m1791a(Location location) {
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(location.getTime() * 1000));
        hashMap.put("lat", Long.valueOf((long) (location.getLatitude() * 1.0E7d)));
        hashMap.put("long", Long.valueOf((long) (location.getLongitude() * 1.0E7d)));
        hashMap.put("radius", Long.valueOf((long) (location.getAccuracy() * 1000.0f)));
        return hashMap;
    }

    public static JSONArray m1792a(Set set) {
        JSONArray jSONArray = new JSONArray();
        if (set == null || set.isEmpty()) {
            return jSONArray;
        }
        for (Object next : set) {
            if ((next instanceof String) || (next instanceof Integer) || (next instanceof Double) || (next instanceof Long) || (next instanceof Float)) {
                jSONArray.put(next);
            } else if (next instanceof Map) {
                try {
                    jSONArray.put(m1805b((Map) next));
                } catch (Throwable e) {
                    C0229g.m1841d("Unknown map type in json serialization: ", e);
                }
            } else if (next instanceof Set) {
                try {
                    jSONArray.put(m1792a((Set) next));
                } catch (Throwable e2) {
                    C0229g.m1841d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0229g.m1842e("Unknown value in json serialization: " + next);
            }
        }
        return jSONArray;
    }

    public static void m1793a(WebView webView) {
        webView.getSettings().setUserAgentString(m1815i(webView.getContext().getApplicationContext()));
    }

    public static void m1794a(HttpURLConnection httpURLConnection, Context context) {
        httpURLConnection.setRequestProperty("User-Agent", m1815i(context));
    }

    public static void m1795a(boolean z) {
        f1240g = z;
    }

    public static boolean m1796a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            return true;
        }
        C0229g.m1836b("The android:configChanges value of the com.google.ads.AdActivity must include " + str + ".");
        return false;
    }

    public static boolean m1797a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean m1798a(Intent intent, Context context) {
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }

    public static boolean m1799a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    static boolean m1800a(C0235m c0235m) {
        if (c0235m == null) {
            c0235m = C0235m.f1276d;
        }
        return c0235m.equals(C0235m.f1277e) || c0235m.equals(C0235m.f1278f);
    }

    public static int m1801b() {
        return f1234a >= 9 ? 7 : 1;
    }

    public static int m1802b(Context context, DisplayMetrics displayMetrics) {
        return f1234a >= 4 ? C0236n.m1852b(context, displayMetrics) : displayMetrics.widthPixels;
    }

    public static String m1803b(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            MessageDigest.getInstance("MD5").update(str.getBytes(), 0, str.length());
            return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r0.digest())});
        } catch (NoSuchAlgorithmException e) {
            return str.substring(0, 32);
        }
    }

    public static HashMap m1804b(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            for (String str : encodedQuery.split("&")) {
                int indexOf = str.indexOf("=");
                if (indexOf < 0) {
                    hashMap.put(Uri.decode(str), null);
                } else {
                    hashMap.put(Uri.decode(str.substring(0, indexOf)), Uri.decode(str.substring(indexOf + 1, str.length())));
                }
            }
        }
        return hashMap;
    }

    public static JSONObject m1805b(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONObject.put(str, obj);
            } else if (obj instanceof Map) {
                try {
                    jSONObject.put(str, m1805b((Map) obj));
                } catch (Throwable e) {
                    C0229g.m1841d("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONObject.put(str, m1792a((Set) obj));
                } catch (Throwable e2) {
                    C0229g.m1841d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0229g.m1842e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONObject;
    }

    public static boolean m1806b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager.checkPermission("android.permission.INTERNET", packageName) == -1) {
            C0229g.m1836b("INTERNET permissions must be enabled in AndroidManifest.xml.");
            return false;
        } else if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", packageName) != -1) {
            return true;
        } else {
            C0229g.m1836b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
    }

    public static boolean m1807c() {
        return m1800a(null);
    }

    public static boolean m1808c(Context context) {
        if (f1235b != null) {
            return f1235b.booleanValue();
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent(context, AdActivity.class), 65536);
        f1235b = Boolean.valueOf(true);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            C0229g.m1836b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
            f1235b = Boolean.valueOf(false);
        } else {
            if (!m1796a(resolveActivity.activityInfo.configChanges, 16, "keyboard")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 32, "keyboardHidden")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 128, "orientation")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 256, "screenLayout")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 512, "uiMode")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 1024, "screenSize")) {
                f1235b = Boolean.valueOf(false);
            }
            if (!m1796a(resolveActivity.activityInfo.configChanges, 2048, "smallestScreenSize")) {
                f1235b = Boolean.valueOf(false);
            }
        }
        return f1235b.booleanValue();
    }

    public static String m1809d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        switch (activeNetworkInfo.getType()) {
            case C0338e.MapAttrs_mapType /*0*/:
                return "ed";
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "wi";
            default:
                return "unknown";
        }
    }

    public static boolean m1810d() {
        return f1240g;
    }

    public static String m1811e(Context context) {
        if (f1237d == null) {
            StringBuilder stringBuilder = new StringBuilder();
            PackageManager packageManager = context.getPackageManager();
            List queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                stringBuilder.append("m");
            }
            List queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 65536);
            if (queryIntentActivities2 == null || queryIntentActivities2.isEmpty()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append("a");
            }
            f1237d = stringBuilder.toString();
        }
        return f1237d;
    }

    public static String m1812f(Context context) {
        if (f1238e != null) {
            return f1238e;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads")), 65536);
            if (resolveActivity == null) {
                return null;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            if (activityInfo == null) {
                return null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            f1238e = packageInfo.versionCode + "." + activityInfo.packageName;
            return f1238e;
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static C0222a m1813g(Context context) {
        if (f1239f == null) {
            f1239f = (AudioManager) context.getSystemService("audio");
        }
        C0222a c0222a = C0222a.OTHER;
        int mode = f1239f.getMode();
        if (m1807c()) {
            return C0222a.EMULATOR;
        }
        if (f1239f.isMusicActive() || f1239f.isSpeakerphoneOn() || mode == 2 || mode == 1) {
            return C0222a.VIBRATE;
        }
        mode = f1239f.getRingerMode();
        return (mode == 0 || mode == 1) ? C0222a.VIBRATE : C0222a.SPEAKER;
    }

    public static void m1814h(Context context) {
        if (!f1241h) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(new UserActivityReceiver(), intentFilter);
            f1241h = true;
        }
    }

    public static String m1815i(Context context) {
        if (f1242i == null) {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            if (userAgentString == null || userAgentString.length() == 0 || userAgentString.equals("Java0")) {
                String property = System.getProperty("os.name", "Linux");
                String str = "Android " + VERSION.RELEASE;
                Locale locale = Locale.getDefault();
                userAgentString = locale.getLanguage().toLowerCase(Locale.US);
                if (userAgentString.length() == 0) {
                    userAgentString = "en";
                }
                String toLowerCase = locale.getCountry().toLowerCase(Locale.US);
                if (toLowerCase.length() > 0) {
                    userAgentString = userAgentString + "-" + toLowerCase;
                }
                userAgentString = "Mozilla/5.0 (" + property + "; U; " + str + "; " + userAgentString + "; " + (Build.MODEL + " Build/" + Build.ID) + ") AppleWebKit/0.0 (KHTML, like " + "Gecko) Version/0.0 Mobile Safari/0.0";
            }
            f1242i = userAgentString + " (Mobile; " + "afma-sdk-a-v" + "6.4.1" + ")";
        }
        return f1242i;
    }
}
