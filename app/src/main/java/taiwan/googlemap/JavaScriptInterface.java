package taiwan.googlemap;

import android.webkit.JavascriptInterface;

/**
 * Created by TenWang on 2016/5/13.
 */
public class JavaScriptInterface {
    double latitude;
    double longitude;

    public JavaScriptInterface(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @JavascriptInterface
    public double getLatitude() {
        return latitude;
    }
    @JavascriptInterface
    public double getLongitude() {
        return longitude;
    }
}
